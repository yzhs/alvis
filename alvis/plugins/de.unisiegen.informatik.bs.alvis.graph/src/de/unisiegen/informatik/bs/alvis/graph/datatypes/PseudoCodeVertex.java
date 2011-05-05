package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import java.util.ArrayList;
import java.util.Stack;

import de.unisiegen.informatik.bs.alvis.primitives.Datatype;
import de.unisiegen.informatik.bs.alvis.primitives.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitives.PseudoCodeInteger;
import de.unisiegen.informatik.bs.alvis.primitives.PseudoCodeList;
import de.unisiegen.informatik.bs.alvis.primitives.PseudoCodeString;

/**
 * @author Dominik Dingel
 */

public class PseudoCodeVertex extends Datatype {
	protected static final String TYPENAME = "Vertex";

	private PseudoCodeList<PseudoCodeEdge> edges;
	private PseudoCodeList<PseudoCodeVertex> adjacants;

	private PseudoCodeInteger distance;
	private PseudoCodeString color;
	private PseudoCodeVertex parentId;
	private PseudoCodeString label;

	/**
	 * 
	 * @param checkAgainst
	 * @return boolean if the Vertex is represented by checkAgainst
	 */
	public boolean isGraphical(GraphicalRepresentationVertex checkAgainst) {
		for (GraphicalRepresentation gr : this.allGr) {
			if (gr == checkAgainst) {
				return true;
			}
		}
		return false;
	}

	public PseudoCodeList<PseudoCodeVertex> getAdjacents() {
		return this.adjacants;
	}

	public void setParentId(PseudoCodeVertex parentId) {
		this.parentId = parentId;
	}

	public void setDistance(PseudoCodeInteger distance) {
		this.distance = distance;
	}

	private void setColor(PseudoCodeString color) {
		this.color = color;
		if(this.isInBatchRun) {
			commandsforGr.get(0).push(color);
		}
		else {
			for (GraphicalRepresentation v : allGr) {
				((GraphicalRepresentationVertex) v).setColor(color
						.getLiteralValue());
			}
		}
	}
	
	public void addEdge(PseudoCodeEdge toAdd, PseudoCodeVertex adjacent) {
		this.edges.add(toAdd);
		this.adjacants.add(adjacent);
	}

	public PseudoCodeVertex(GraphicalRepresentationVertex graphical) {
		allGr.add(graphical);
		this.adjacants = new PseudoCodeList<PseudoCodeVertex>();
		this.edges = new PseudoCodeList<PseudoCodeEdge>();
		this.distance = new PseudoCodeInteger(0);
		this.parentId = (PseudoCodeVertex) PseudoCodeVertex.localNull;
		this.color = new PseudoCodeString(graphical.getColorText());
		this.label = new PseudoCodeString(graphical.getLabel());
		commandsforGr = new ArrayList<Stack<Object>>();
		commandsforGr.add(new Stack<Object>());
	}

	public PseudoCodeVertex() {
		this.adjacants = new PseudoCodeList<PseudoCodeVertex>();
		this.edges = new PseudoCodeList<PseudoCodeEdge>();
		this.distance = new PseudoCodeInteger(0);
		this.color = new PseudoCodeString("");
		this.parentId = (PseudoCodeVertex) PseudoCodeVertex.localNull;
		this.label = new PseudoCodeString("");
		commandsforGr = new ArrayList<Stack<Object>>();
		commandsforGr.add(new Stack<Object>());
	}

	@Override
	public String toString() {
		return this.label.getLiteralValue();
	}

	@Override
	public Datatype set(String memberName, Datatype value) {
		if (memberName.equals("color")) {
			this.setColor((PseudoCodeString) value);
		}
		if (memberName.equals("pi")) {
			this.setParentId((PseudoCodeVertex) value);
		}
		if (memberName.equals("distance")) {
			this.setDistance((PseudoCodeInteger) value);
		}
		if (memberName.equals("label")) {
			this.setLabel((PseudoCodeString) value);
		}
		return null;
	}

	private void setLabel(PseudoCodeString value) {
		this.label = value;
	}

	@Override
	public Datatype get(String memberName) {
		if (memberName.equals("color")) {
			return this.getColor();
		}
		if (memberName.equals("distance")) {
			return this.getDistance();
		}
		if (memberName.equals("pi")) {
			return this.getParentID();
		}
		if (memberName.equals("adj")) {
			return this.getAdjacents();
		}
		if (memberName.equals("label")) {
			return this.getLabel();
		}

		return null;
	}

	private Datatype getLabel() {
		return label;
	}

	private PseudoCodeVertex getParentID() {
		return parentId;
	}

	private PseudoCodeInteger getDistance() {
		return distance;
	}

	private PseudoCodeString getColor() {
		return color;
	}

	@Override
	public boolean equals(Datatype toCheckAgainst) {
		if (((PseudoCodeVertex) toCheckAgainst).label.equals(this.label)) {
			return true;
		}
		return false;
	}

	@Override
	protected void runDelayedCommands() {
		for (GraphicalRepresentation gr : allGr) {
			((GraphicalRepresentationVertex) gr)
					.setColor(((PseudoCodeString) this.commandsforGr.get(0)
							.pop()).getLiteralValue());
		}
		this.commandsforGr.get(0).clear();
	}

}
