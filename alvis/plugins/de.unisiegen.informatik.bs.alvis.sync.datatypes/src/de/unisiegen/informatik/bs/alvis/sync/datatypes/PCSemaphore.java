package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

/**
 * Pseudo code implementation of a semaphore
 * 
 * @author Jan Bauerdick
 * 
 */

public class PCSemaphore extends PCObject {

	protected static final String TYPENAME = "Semaphore";

	/**
	 * Semaphore's counter. Semaphore will lock when 0
	 */
	private int counter;

	public PCSemaphore() {
		counter = 1;
	}

	public PCSemaphore(int counter) {
		this.counter = counter;
	}

	public PCSemaphore(int counter, GraphicalRepresentationSemaphore gr) {
		allGr.add(gr);
		this.counter = counter;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public static String getTypename() {
		return TYPENAME;
	}

	/**
	 * Decrease semaphore, thread will possibly lock
	 * @param a Actor who calls this
	 */
	public synchronized void P(PCThread a) {
		try {
			counter--;
			if (counter == 0) {
				a.setBlocked(true);
			}
			while (counter <= 0) {
				wait();
			}
			// counter--;
			a.setBlocked(false);
		} catch (InterruptedException e) {
		}
	}

	/**
	 * Increase semaphore, if counter > 0 a thread will be unlocked
	 */
	public synchronized void V() {
		counter++;
		notify();
	}

	@Override
	public String toString() {
		return TYPENAME + ": " + counter;
	}

	public static String getTypeName() {
		return TYPENAME;
	}

	public PCObject set(String memberName, PCObject value) {
		// TODO remove this method
		if (memberName.equals("counter")) {
			counter = ((PCInteger) value).getLiteralValue();
			return this;
		} else {
			return null;
		}
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		if (toCheckAgainst instanceof PCSemaphore) {
			PCSemaphore s = (PCSemaphore) toCheckAgainst;
			if (s.getCounter() == getCounter()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public PCObject get(String memberName) {
		// TODO remove this method
		if (memberName.equals("counter")) {
			return new PCInteger(counter);
		} else {
			return null;
		}
	}
	
	@Override
	public List<String> getMethods() {
		String[] methods = { "P", "V" };
		return Arrays.asList(methods);
	}

	@Override
	public void updateGR(GraphicalRepresentation gr) {

	}

	@Override
	public HashMap<String, String> getHelp() {
		// TODO Auto-generated method stub
		return null;
	}

}
