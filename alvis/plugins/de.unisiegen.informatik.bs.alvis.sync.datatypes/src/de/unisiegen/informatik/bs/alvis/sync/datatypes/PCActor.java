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
	private int line;
	private String[] lines;
	
	public PCActor() {
		name = "";
		doStep = false;
		isBlocked = false;
	}
	
	public PCActor(String name, String[] lines, GraphicalRepresentationActor gr) {
		allGr.add(gr);
		this.name = name;
		this.lines = lines;
		doStep = false;
		isBlocked = false;
	}
	
	public PCActor(String name, String[] lines) {
		this.name = name;
		doStep = false;
		isBlocked = false;
	}
	
	public PCActor(String name, String[] lines, GraphicalRepresentationActor gr, boolean doStep, boolean isBlocked) {
		allGr.add(gr);
		this.name = name;
		this.lines = lines;
		this.isBlocked = isBlocked;
		this.doStep = doStep;
	}
		
	public boolean isDoStep() {
		return doStep;
	}

	public void setDoStep(boolean doStep) {
		this.doStep = doStep;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public String[] getLines() {
		return lines;
	}

	public void setLines(String[] lines) {
		this.lines = lines;
	}

	public synchronized void step() {
		if (!doStep && !isBlocked) {
			doStep = true;
			notify();
		}
	}
	
	public synchronized void showline(PCInteger line) {
		this.line = line.getLiteralValue();
		doStep = false;
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
	}
	
	@Override
	public void updateGR(GraphicalRepresentation gr) {
		
	}

}
