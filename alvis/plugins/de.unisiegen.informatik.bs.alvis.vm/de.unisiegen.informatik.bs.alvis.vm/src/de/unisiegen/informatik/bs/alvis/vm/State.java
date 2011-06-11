package de.unisiegen.informatik.bs.alvis.vm;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.SortableCollection;

/**
 * 
 * @author Dominik Dingel
 * 
 * Currently unused!
 * 
 * TODO cleanup, let it do something useful or delete it
 *
 */

public class State {
	private boolean decisionPoint;
	private int lastBPIndex;
	private int lastDPIndex;
	private SortableCollection holding;

	public State(SortableCollection toHold, int lastDPIndex, int lastBPIndex,
			boolean isDecisionPoint) {
		this.decisionPoint = isDecisionPoint;
		if (toHold != null) {
		} else {
			this.holding = null;
		}
		this.lastDPIndex = lastDPIndex;
		this.lastBPIndex = lastBPIndex;
	}

	public boolean isDecisionPoint() {
		return this.decisionPoint;
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
