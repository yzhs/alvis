package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeBoolean;



/**
 * 
 * @author Dominik Dingel
 * 
 * @description implementing the Edge class TODO: add labels and weights
 * 
 */

public class PseudoCodeEdge extends PseudoCodeObject {

	protected static final String TYPENAME = "Edge";

	// the used members
	private PseudoCodeVertex v1;
	private PseudoCodeVertex v2;
	private PseudoCodeBoolean isDirected;

	/**
	 * Constructor to create new Edge (not directed)
	 * 
	 * @param v1
	 * @param v2
	 * @param edge
	 */
	public PseudoCodeEdge(PseudoCodeVertex v1, PseudoCodeVertex v2,
			GraphicalRepresentationEdge edge) {
		this.allGr.add(edge);
		this.v1 = v1;
		this.v2 = v2;
		isDirected.setLiteralValue(false);
		notifyVertices();
	}

	/**
	 * Constructor to create new Edge (not directed)
	 * 
	 * @param v1
	 * @param v2
	 */
	public PseudoCodeEdge(PseudoCodeVertex v1, PseudoCodeVertex v2) {
		this.v1 = v1;
		this.v2 = v2;
		isDirected = new PseudoCodeBoolean(false);
		notifyVertices();
	}

	/**
	 * Constructor to create new Edge
	 * 
	 * @param v1
	 * @param v2
	 * @param isDirected
	 */
	public PseudoCodeEdge(PseudoCodeVertex v1, PseudoCodeVertex v2,
			boolean isDirected) {
		this.v1 = v1;
		this.v2 = v2;
		this.isDirected = new PseudoCodeBoolean(false);
		notifyVertices();
	}

	/**
	 * private method to inform the vertices about the connection
	 */
	private void notifyVertices() {
		if (!isDirected.getLiteralValue()) {
			v2.addEdge(this, v1);
		}
		v1.addEdge(this, v2);
	}

	@Override
	public String toString() {
		String result = v1.toString();
		if (isDirected.getLiteralValue()) {
			result += " -> ";
		} else {
			result += " <-> ";
		}
		result += v2.toString();
		return result;
	}

	@Override
	public PseudoCodeObject set(String memberName, PseudoCodeObject value) {
		// TODO check possible member access
		return null;
	}

	@Override
	public boolean equals(PseudoCodeObject toCheckAgainst) {
		if (((PseudoCodeEdge) toCheckAgainst).v1.equals(this.v1)
				&& ((PseudoCodeEdge) toCheckAgainst).v2.equals(this.v2)
				&& ((PseudoCodeEdge) toCheckAgainst).isDirected
						.equals(this.isDirected)) {
			return true;
		}

		return false;
	}
}
