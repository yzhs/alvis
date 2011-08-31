package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCBoolean;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

/**
 * Pseudo code implementation of an actor
 * 
 * @author Jan Bauerdick
 * 
 */

public class PCActor extends PCObject implements Runnable {

	protected static final String TYPENAME = "Actor";
	
	private boolean doStep;
	private boolean isBlocked;
	private int currentLine;

	public PCActor() {
		doStep = false;
		isBlocked = false;
		currentLine = 0;
	}

	public PCActor(GraphicalRepresentationActor gr) {
		allGr.add(gr);
		doStep = false;
		isBlocked = false;
		currentLine = 0;
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

	public int getCurrentLine() {
		return currentLine;
	}

	public void setCurrentLine(int currentLine) {
		this.currentLine = currentLine;
	}

	/**
	 * Perform a single step
	 */
	public synchronized void step() {
		if (!doStep && !isBlocked) {
			doStep = true;
			notify();
		}
	}

	/**
	 * Highlight a line in source
	 * @param line
	 */
	public synchronized void showline(PCInteger line) {
		currentLine = line.getLiteralValue();
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
		return TYPENAME + ": " + (isBlocked ? "" : "not") + " blocked on line "
				+ currentLine;
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
		} else if (memberName.equals("currentLine")) {
			PCInteger i = (PCInteger) value;
			currentLine = i.getLiteralValue();
			return this;
		}
		return null;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		if (toCheckAgainst instanceof PCActor) {
			PCActor a = (PCActor) toCheckAgainst;
			if (a.isBlocked() == isBlocked() && a.isDoStep() == isDoStep()
					&& a.getCurrentLine() == getCurrentLine()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public void updateGR(GraphicalRepresentation gr) {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
