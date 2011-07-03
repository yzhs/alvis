package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCBoolean;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCString;

public class PseudoCodeActor extends PCObject {
	
	protected static final String TYPENAME = "Actor";
	private PCBoolean doStep;
	private PCBoolean isBlocked;
	private PCString name;
	
	public synchronized void step() {
		if (!doStep.getLiteralValue() && !isBlocked.getLiteralValue()) {
			doStep = new PCBoolean(true);
			notify();
		}
	}
	
	public synchronized void showline(PCInteger line) {
		doStep = new PCBoolean(false);
		//vis.setLine(line);
		while (!doStep.getLiteralValue()) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
	}

	@Override
	public String toString() {
		return TYPENAME + name.getLiteralValue() + ": " + (isBlocked.getLiteralValue() ? "" : "not") + " blocked.";
	}

	public static String getTypeName() {
		return TYPENAME;
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		if (memberName.equals("doStep")) {
			PCBoolean b = (PCBoolean) value;
			doStep = b;
			return this;
		} else if (memberName.equals("isBlocked")) {
			PCBoolean b = (PCBoolean) value;
			isBlocked = b;
			return this;
		}
		return null;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		try {
			PseudoCodeActor a = (PseudoCodeActor) toCheckAgainst;
			if (a.get("doStep").equals(this.doStep) && a.get("isBlocked").equals(this.isBlocked)) {
				return true;
			} else {
				return false;
			}
		} catch (ClassCastException e) {
			return false;
		}
	}

	public void setBlocked(PCBoolean newState, PCBoolean bySemaphore) {
		isBlocked = newState;
		//TODO: Visualization
	}

}
