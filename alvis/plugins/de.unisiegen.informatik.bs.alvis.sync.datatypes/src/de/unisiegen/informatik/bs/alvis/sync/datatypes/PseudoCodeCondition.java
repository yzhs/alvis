package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCBoolean;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCString;

public class PseudoCodeCondition extends PCObject {
	
	protected static final String TYPENAME = "Condition";
	private PseudoCodeSemaphore sema;
	private PCInteger waiting;
	private PCString name;
	
	public void wait(PseudoCodeActor a) {
		synchronized (this) {
			sema.V();
			try {
				waiting.add(new PCInteger(1));
				a.setBlocked(new PCBoolean(true), new PCBoolean(false));
				wait();
			} catch (InterruptedException e) {
				//Abbruch
			}
			waiting.sub(new PCInteger(1));
			a.setBlocked(new PCBoolean(false), new PCBoolean(false));
		}
		sema.P(a);
	}
	
	public synchronized void signal() {
		notify();
	}
	
	public void signalAll() {
		notifyAll();
	}
	
	public PCObject get(String memberName) {
		if (memberName.equals("Semaphore")) {
			return sema;
		} else if (memberName.equals("waiting")) {
			return waiting;
		} else {
			return null;
		}
	}

	@Override
	public String toString() {
		PCInteger i = (PCInteger) sema.get("counter");
		return TYPENAME + name.getLiteralValue() + ": " + waiting.getLiteralValue() + " waiting, monitor "  + (i.lessOrEqual(new PCInteger(0)).getLiteralValue() ? "locked." : "unlocked.");
	}

	@Override
	public String getTypeName() {
		return TYPENAME;
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		if (memberName.equals("Semaphore")) {
			PseudoCodeSemaphore s = (PseudoCodeSemaphore) value;
			sema = s;
			return this;
		} else if (memberName.equals("waiting")) {
			PCInteger i = (PCInteger) value;
			waiting = i;
			return this;
		}
		return null;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		try {
			PseudoCodeCondition c = (PseudoCodeCondition) toCheckAgainst;
			if ((c.get("semaphore").equals(this.sema)) && (c.get("waiting").equals(this.waiting))) {
				return true;
			} else {
				return false;
			}
		} catch (ClassCastException e) {
			return false;
		}
	}

}
