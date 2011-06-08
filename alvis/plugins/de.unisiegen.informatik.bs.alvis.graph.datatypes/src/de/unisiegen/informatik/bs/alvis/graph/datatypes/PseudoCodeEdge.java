package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCBoolean;
import java.io.Serializable;


/**
 * 
 * @author Dominik Dingel
 * 
 * @description implementing the Edge class TODO: add labels and weights
 * 
 */

public class PseudoCodeEdge extends PCObject {

	protected static final String TYPENAME = "Edge";

	// the used members
	private PseudoCodeVertex v1;
	private PseudoCodeVertex v2;
	private PCBoolean isDirected;

	/** 
	 * 
	 */
	public PseudoCodeEdge() {
		v1 = new PseudoCodeVertex();
		v2 = new PseudoCodeVertex();
		isDirected = new PCBoolean(false);
	}
	
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
		isDirected = new PCBoolean(false);
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
		this.isDirected = new PCBoolean(false);
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
	public PCObject set(String memberName, PCObject value) {
		// TODO check possible member access
		return null;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		if (((PseudoCodeEdge) toCheckAgainst).v1.equals(this.v1)
				&& ((PseudoCodeEdge) toCheckAgainst).v2.equals(this.v2)
				&& ((PseudoCodeEdge) toCheckAgainst).isDirected
						.equals(this.isDirected)) {
			return true;
		}

		return false;
	}

	@Override
	public String getTypeName() {
		return PseudoCodeEdge.TYPENAME;
	}
}
