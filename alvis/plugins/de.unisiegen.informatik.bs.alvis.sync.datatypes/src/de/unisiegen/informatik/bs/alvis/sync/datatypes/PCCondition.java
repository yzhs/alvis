package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCString;

public class PCCondition extends PCObject {
	
	protected static final String TYPENAME = "Condition";
	private PCSemaphore sema;
	private int waiting;
	private String name;
	
	public PCCondition() {
		sema = new PCSemaphore();
		name = "";
		waiting = 0;
	}
	
	public PCCondition(String name, int waiting, PCSemaphore sema) {
		this.name = name;
		this.waiting = waiting;
		this.sema = sema;
	}
	
	public PCCondition(String name, int waiting, PCSemaphore sema, GraphicalRepresentationCondition gr) {
		this(name, waiting, sema);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getTypename() {
		return TYPENAME;
	}

	public void wait(PCActor a) {
		synchronized (this) {
			sema.V();
			try {
				waiting++;
				a.setBlocked(true, false);
				wait();
			} catch (InterruptedException e) {
				//Abbruch
			}
			waiting--;
			a.setBlocked(false, false);
		}
		sema.P(a);
	}
	
	public synchronized void signal() {
		notify();
	}
	
	public void signalAll() {
		notifyAll();
	}
	
	@Override
	public PCObject get(String memberName) {
		if (memberName.equals("Semaphore")) {
			return sema;
		} else if (memberName.equals("waiting")) {
			return new PCInteger(waiting);
		} else if (memberName.equals("name")) {
			return new PCString(name);
		} else {
			return null;
		}
	}

	@Override
	public String toString() {
		int i = ((PCInteger) sema.get("counter")).getLiteralValue();
		return TYPENAME + name + ": " + waiting + " waiting, monitor "  + (i <= 0 ? "locked." : "unlocked.");
	}

	public static String getTypeName() {
		return TYPENAME;
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		if (memberName.equals("Semaphore")) {
			PCSemaphore s = (PCSemaphore) value;
			sema = s;
			return this;
		} else if (memberName.equals("waiting")) {
			PCInteger i = (PCInteger) value;
			waiting = i.getLiteralValue();
			return this;
		} else if (memberName.equals("name")) {
			PCString s = (PCString) value;
			name = s.getLiteralValue();
			return this;
		}
		return null;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		try {
			PCCondition c = (PCCondition) toCheckAgainst;
			if ((c.get("semaphore").equals(this.sema)) && (c.get("waiting").equals(this.waiting))) {
				return true;
			} else {
				return false;
			}
		} catch (ClassCastException e) {
			return false;
		}
	}
	
	@Override
	public void updateGR(GraphicalRepresentation gr) {
		
	}

}
