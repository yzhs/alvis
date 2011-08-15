package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCString;

public class PCSemaphore extends PCObject {

	protected static final String TYPENAME = "Semaphore";
	private int counter;
	private String name;
	
	public PCSemaphore() {
		name = "";
		counter = 1;
	}

	public PCSemaphore(int counter, String name) {
		this.counter = counter;
		this.name = name;
	}
	
	public PCSemaphore(int counter, String name, GraphicalRepresentationSemaphore gr) {
		allGr.add(gr);
		this.counter = counter;
		this.name = name;
	}

	public synchronized void P(PCActor a) {
		try {
			counter--;
			// vis.setState(this.counterVis);
			if (counter == 0) {
				a.setBlocked(true, true);
			}
			while (counter <= 0) {
				wait();
			}
			// counter--;
			a.setBlocked(false, true);
		} catch (InterruptedException e) {
			// sollte nicht passieren
		}
	}

	public synchronized void V() {
		counter++;
		// counterVis++;
		// vis.setState(this.counterVis);
		notify();
	}

	@Override
	public String toString() {
		return PCSemaphore.TYPENAME +  name + ": " + counter;
	}

	public static String getTypeName() {
		return PCSemaphore.TYPENAME;
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		if (memberName.equals("name")) {
			name = ((PCString) value).getLiteralValue();
			return this;
		} else if (memberName.equals("counter")) {
			counter = ((PCInteger) value).getLiteralValue();
			return this;
		} else {
			// Exception?
			return null;
		}
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		PCSemaphore s = (PCSemaphore) toCheckAgainst;
		if ((((PCString) s.get("name")).equals((PCString) this.get("name")))
				&& (((PCInteger) s.get("counter")).equals((PCInteger) this
						.get("counter")))) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public PCObject get(String memberName) {
		if (memberName.equals("name")) {
			return new PCString(name);
		} else if (memberName.equals("counter")) {
			return new PCInteger(counter);
		} else {
			// Exception?
			return null;
		}
	}
	
	@Override
	public void updateGR(GraphicalRepresentation gr) {
		
	}

}
