package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import java.util.Arrays;
import java.util.List;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCBoolean;

/**
 * 
 * @author Dominik Dingel
 * 
 * @description implementing the Edge class TODO: add labels and weights
 * 
 */

public class PCEdge extends PCObject implements Comparable<PCEdge> {

	protected static final String TYPENAME = "Edge";

	// the used members
	private PCVertex v1;
	private PCVertex v2;
	private PCBoolean isDirected;
	private PCInteger weight;

	/**
	 * Default Constructor: not directed and 0 weight
	 */
	public PCEdge() {
		v1 = new PCVertex();
		v2 = new PCVertex();
		isDirected = new PCBoolean(false);
		weight = new PCInteger(0);
	}

	/**
	 * Constructor to create new Edge (not directed)
	 * 
	 * @param v1
	 * @param v2
	 * @param edge
	 */
	public PCEdge(PCVertex v1, PCVertex v2, GraphicalRepresentationEdge edge) {
		this.allGr.add(edge);
		this.v1 = v1;
		this.v2 = v2;
		isDirected = new PCBoolean(false);
		notifyVertices();
		weight = new PCInteger(edge.getWeight());
	}

	/**
	 * Constructor to create new Edge (not directed)
	 * 
	 * @param v1
	 * @param v2
	 */
	public PCEdge(PCVertex v1, PCVertex v2) {
		this.v1 = v1;
		this.v2 = v2;
		isDirected = new PCBoolean(false);
		notifyVertices();
		weight = new PCInteger(0);
	}

	/**
	 * Constructor to create new Edge
	 * 
	 * @param v1
	 * @param v2
	 * @param isDirected
	 */
	public PCEdge(PCVertex v1, PCVertex v2, boolean isDirected) {
		this.v1 = v1;
		this.v2 = v2;
		this.isDirected = new PCBoolean(false);
		notifyVertices();
		weight = new PCInteger(0);
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
			result += " - ";
			result += weight.toString();
			result += "> ";
		} else {
			result += " <- ";
			result += weight.toString();
			result += " -> ";
		}
		result += v2.toString();
		return result;
	}

	@Override
	public List<String> getMembers() {
		String[] attributes = { "weight" };
		return Arrays.asList(attributes);
	}

	@Override
	public PCObject get(String memberName) {
		if (memberName.equals("weight"))
			return this.getWeight();
		return null;
	}

	public PCInteger getWeight() {
		return this.weight;
	}
	
	public void setWeight(PCInteger weight) {
		this.weight = weight;
		if (!this.isInBatchRun)
			for (GraphicalRepresentation gredge : allGr) {
				((GraphicalRepresentationEdge) gredge)
						.setWeight(((PCInteger) weight).getLiteralValue());
			}
	}
	
	@Override
	public PCObject set(String memberName, PCObject value) {
		if (memberName.equals("weight")) {
			this.setWeight((PCInteger) value);
		}
		return value;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		if (((PCEdge) toCheckAgainst).v1.equals(this.v1)
				&& ((PCEdge) toCheckAgainst).v2.equals(this.v2)
				&& ((PCEdge) toCheckAgainst).isDirected.equals(this.isDirected)) {
			return true;
		}

		return false;
	}

	public static String getTypeName() {
		return PCEdge.TYPENAME;
	}

	public boolean isGraphical(GraphicalRepresentationEdge edge) {
		for (GraphicalRepresentation gr : this.allGr) {
			if (gr == edge) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected void runDelayedCommands() {
		for (GraphicalRepresentation gr : allGr) {
			if (commandsforGr.get(0) != null && !commandsforGr.get(0).isEmpty()) {
				((GraphicalRepresentationEdge) gr)
						.setWeight(((PCInteger) this.commandsforGr.get(0).pop())
								.getLiteralValue());
			}
		}
		this.commandsforGr.get(0).clear();
	}
	
	public static PCEdge getNull() {
		return new PCEdge();
	}

	@Override
	public int compareTo(PCEdge arg0) {
		// checking just based on cost
		return this.weight.getLiteralValue() - arg0.weight.getLiteralValue();
	}
}
