package de.unisiegen.informatik.bs.alvis.virtualmachine;

import de.unisiegen.informatik.bs.alvis.datatypes.SortableCollection;

public class State {
	private boolean decisionPoint;
	private int lastBPIndex;
	private int lastDPIndex;
	private SortableCollection holding;

	public State(SortableCollection toHold, int lastDPIndex, int lastBPIndex,
			boolean isDecisionPoint) {
		this.decisionPoint = isDecisionPoint;
		if (toHold != null) {
			//this.holding = (SortableCollection) toHold.fullCopy();
		} else {
			this.holding = null;
		}
		this.lastDPIndex = lastDPIndex;
		this.lastBPIndex = lastBPIndex;
	}

	public boolean isDecisionPoint() {
		if (this.decisionPoint) {
			return true;
		} else {
			return false;
		}
	}

	public SortableCollection getData() {
		return holding;
	}

	public int getLastBPIndex() {
		return this.lastBPIndex;
	}

	public int getLastDPIndex() {
		return this.lastDPIndex;
	}

}
