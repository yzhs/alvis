package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCBoolean;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCString;

public class PseudoCodeSemaphore extends PCObject {

	protected static final String TYPENAME = "Semaphore";
	private PCInteger counter;
	private PCString name;

	public PseudoCodeSemaphore(PCInteger counter, PCString name) {
		this.counter = counter;
		this.name = name;
	}

	public synchronized void P(PseudoCodeActor a) {
		try {
			counter.sub(new PCInteger(1));
			// vis.setState(this.counterVis);
			if (counter.equals(new PCInteger(0))) {
				a.setBlocked(new PCBoolean(true), new PCBoolean(true));
			}
			while (counter.lessOrEqual(new PCInteger(0)).getLiteralValue()) {
				wait();
			}
			// counter--;
			a.setBlocked(new PCBoolean(false), new PCBoolean(true));
		} catch (InterruptedException e) {
			// sollte nicht passieren
		}
	}

	public synchronized void V() {
		counter.add(new PCInteger(1));
		// counterVis++;
		// vis.setState(this.counterVis);
		notify();
	}

	@Override
	public String toString() {
		return PseudoCodeSemaphore.TYPENAME +  name.getLiteralValue() + ": " + counter.getLiteralValue();
	}

	@Override
	public String getTypeName() {
		return PseudoCodeSemaphore.TYPENAME;
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		if (memberName.equals("name")) {
			name.setValue((PCString) value);
			return this;
		} else if (memberName.equals("counter")) {
			counter.setValue((PCInteger) value);
			return this;
		} else {
			// Exception?
			return null;
		}
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		PseudoCodeSemaphore s = (PseudoCodeSemaphore) toCheckAgainst;
		if ((((PCString) s.get("name")).equals((PCString) this.get("name")))
				&& (((PCInteger) s.get("counter")).equals((PCInteger) this
						.get("counter")))) {
			return true;
		} else {
			return false;
		}
	}

	public PCObject get(String memberName) {
		if (memberName.equals("name")) {
			return name;
		} else if (memberName.equals("counter")) {
			return counter;
		} else {
			// Exception?
			return null;
		}
	}

}
