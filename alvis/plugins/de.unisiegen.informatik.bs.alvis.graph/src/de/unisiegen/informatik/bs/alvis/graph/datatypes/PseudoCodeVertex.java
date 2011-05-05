package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import datatypes.Datatype;
import datatypes.GraphicalRepresentation;
import datatypes.GraphicalRepresentationVertex;
import datatypes.PseudoCodeInteger;
import datatypes.PseudoCodeList;
import datatypes.PseudoCodeString;

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
		for (GraphicalRepresentation v : allGr) {
			((GraphicalRepresentationVertex) v).setColor(color.getLiteralValue());
		}/*
		 * if (graphicalRepresentation != null) { toChange = null; if
		 * (color.equals("white")) { toChange = new Color(null, 255, 255, 255);
		 * } if (color.equals("grey")) { toChange = new Color(null, 150, 150,
		 * 150); } Runnable run = new Runnable() { public void run() {
		 * Animation.markBegin();
		 * graphicalRepresentation.setBackgroundColor(toChange);
		 * graphicalRepresentation.setBorderColor(new Color(null, 0, 0, 0));
		 * Animation.run(1); } };
		 * graphicalRepresentation.getDisplay().asyncExec(run); }
		 */
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
	}

	public PseudoCodeVertex() {
		this.adjacants = new PseudoCodeList<PseudoCodeVertex>();
		this.edges = new PseudoCodeList<PseudoCodeEdge>();
		this.distance = new PseudoCodeInteger(0);
		this.color = new PseudoCodeString("");
		this.parentId = (PseudoCodeVertex) PseudoCodeVertex.localNull;
		this.label = new PseudoCodeString("");
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
		if(memberName.equals("color")) {
			return this.getColor();
		}
		if(memberName.equals("distance")) {
			return this.getDistance();
		}
		if(memberName.equals("pi")) {
			return this.getParentID();
		}
		if(memberName.equals("adj")) {
			return this.getAdjacents();
		}
		if(memberName.equals("label")) {
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
		// TODO Auto-generated method stub
		return false;
	}
	
}
