package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import java.util.Arrays;
import java.util.List;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

/**
 * Pseudo code implementation of a condition
 * 
 * @author Jan Bauerdick
 * 
 */
public class PCCondition extends PCObject {

	protected static final String TYPENAME = "Condition";
	
	/**
	 * Semaphore which locks the monitor & number of waiting threads
	 */
	private PCSemaphore sema;
	private int waiting;

	public PCCondition() {
		sema = new PCSemaphore();
		waiting = 0;
	}

	public PCCondition(int waiting, PCSemaphore sema) {
		this.waiting = waiting;
		this.sema = sema;
	}

	public PCCondition(int waiting, PCSemaphore sema,
			GraphicalRepresentationCondition gr) {
		this(waiting, sema);
		allGr.add(gr);
	}

	public PCSemaphore getSema() {
		return sema;
	}

	public void setSema(PCSemaphore sema) {
		this.sema = sema;
	}

	public int getWaiting() {
		return waiting;
	}

	public void setWaiting(int waiting) {
		this.waiting = waiting;
	}

	public static String getTypename() {
		return TYPENAME;
	}

	/**
	 * Wait for condition
	 * @param a Actor who has to wait
	 */
	public void wait(PCThread a) {
		synchronized (this) {
			sema.V();
			try {
				waiting++;
				a.setBlocked(true);
				wait();
			} catch (InterruptedException e) {

			}
			waiting--;
			a.setBlocked(false);
		}
		sema.P(a);
	}

	/**
	 * Signals that condition is free
	 */
	public synchronized void signal() {
		notify();
	}

	/**
	 * Signals that condtion is free to all waiting threads
	 */
	public void signalAll() {
		notifyAll();
	}

	public PCObject get(String memberName) {
		// TODO remove this method
		if (memberName.equals("semaphore")) {
			return sema;
		} else if (memberName.equals("waiting")) {
			return new PCInteger(waiting);
		} else {
			return null;
		}
	}

	@Override
	public String toString() {
		int i = ((PCInteger) sema.get("counter")).getLiteralValue();
		return TYPENAME + ": " + waiting + " waiting, monitor "
				+ (i <= 0 ? "locked." : "unlocked.");
	}

	public static String getTypeName() {
		return TYPENAME;
	}

	public PCObject set(String memberName, PCObject value) {
		// TODO remove this method
		if (memberName.equals("semaphore")) {
			PCSemaphore s = (PCSemaphore) value;
			sema = s;
			return this;
		} else if (memberName.equals("waiting")) {
			PCInteger i = (PCInteger) value;
			waiting = i.getLiteralValue();
			return this;
		}
		return null;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		if (toCheckAgainst instanceof PCCondition) {
			PCCondition c = (PCCondition) toCheckAgainst;
			if (c.getWaiting() == getWaiting() && c.getSema().equals(sema)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	@Override
	public List<String> getMethods() {
		String[] methods = { "wait", "signal", "signalAll" };
		return Arrays.asList(methods);
	}

	@Override
	public void updateGR(GraphicalRepresentation gr) {

	}

}
