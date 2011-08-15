package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCBoolean;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

public class PCActor extends PCObject {
	
	protected static final String TYPENAME = "Actor";
	private boolean doStep;
	private boolean isBlocked;
	private String name;
	
	public PCActor() {
		name = "";
		doStep = false;
		isBlocked = false;
	}
	
	public PCActor(String name, GraphicalRepresentationActor gr) {
		allGr.add(gr);
		this.name = name;
		doStep = false;
		isBlocked = false;
	}
	
	public PCActor(String name) {
		this.name = name;
		doStep = false;
		isBlocked = false;
	}
	
	public PCActor(String name, GraphicalRepresentationActor gr, boolean doStep, boolean isBlocked) {
		allGr.add(gr);
		this.name = name;
		this.isBlocked = isBlocked;
		this.doStep = doStep;
	}
	
	public synchronized void step() {
		if (!doStep && !isBlocked) {
			doStep = true;
			notify();
		}
	}
	
	public synchronized void showline(PCInteger line) {
		doStep = false;
		//vis.setLine(line);
		while (!doStep) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
	}

	@Override
	public String toString() {
		return TYPENAME + name + ": " + (isBlocked ? "" : "not") + " blocked.";
	}

	public static String getTypeName() {
		return TYPENAME;
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		if (memberName.equals("doStep")) {
			PCBoolean b = (PCBoolean) value;
			doStep = b.getLiteralValue();
			return this;
		} else if (memberName.equals("isBlocked")) {
			PCBoolean b = (PCBoolean) value;
			isBlocked = b.getLiteralValue();
			return this;
		}
		return null;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		try {
			PCActor a = (PCActor) toCheckAgainst;
			if (a.get("doStep").equals(this.doStep) && a.get("isBlocked").equals(this.isBlocked)) {
				return true;
			} else {
				return false;
			}
		} catch (ClassCastException e) {
			return false;
		}
	}

	public void setBlocked(boolean newState, boolean bySemaphore) {
		isBlocked = newState;
		//TODO: Visualization
	}
	
	@Override
	public void updateGR(GraphicalRepresentation gr) {
		
	}

}
