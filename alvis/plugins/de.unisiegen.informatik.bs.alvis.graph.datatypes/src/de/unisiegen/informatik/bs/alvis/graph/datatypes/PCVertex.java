package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCBoolean;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCList;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCString;

/**
 * @author Dominik Dingel
 */

public class PCVertex extends PCObject implements Comparable<PCVertex> {

	protected static final String TYPENAME = "Vertex";

	private PCList<PCEdge> edges;
	private PCList<PCVertex> adjacents;

	private PCInteger distance;
	private PCString color;
	private PCVertex parentId;
	private PCString label;

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

	public PCList<PCVertex> getAdjacents() {
		return this.adjacents;
	}

	public void setParentId(PCVertex parentId) {
		this.parentId = parentId;
	}

	public void setDistance(PCInteger distance) {
		this.distance = distance;
	}

	public void setColor(PCString color) {
		this.color.setLiteralValue(color.getLiteralValue());
		if (this.isInBatchRun) {
			commandsforGr.get(0).push(color);
		} else {
			for (GraphicalRepresentation v : allGr) {
				((GraphicalRepresentationVertex) v).setColor(color
						.getLiteralValue());
			}
		}
	}

	public void addEdge(PCEdge toAdd, PCVertex adjacent) {
		this.edges.add(toAdd);
		this.adjacents.add(adjacent);
	}

	public PCVertex(GraphicalRepresentationVertex graphical) {
		allGr.add(graphical);
		this.adjacents = new PCList<PCVertex>();
		this.edges = new PCList<PCEdge>();
		this.distance = new PCInteger(0);
		this.parentId = (PCVertex) PCObject.localNull;
		if (graphical != null) {
			this.color = new PCString(graphical.getColorText());
			this.label = new PCString(graphical.getLabel());
		}
		commandsforGr = new ArrayList<Stack<Object>>();
		commandsforGr.add(new Stack<Object>());
	}

	public PCVertex() {
		this.adjacents = new PCList<PCVertex>();
		this.edges = new PCList<PCEdge>();
		this.distance = new PCInteger(0);
		this.color = new PCString("");
		this.parentId = (PCVertex) PCObject.localNull;
		this.label = new PCString("");
		commandsforGr = new ArrayList<Stack<Object>>();
		commandsforGr.add(new Stack<Object>());
	}

	@Override
	public String toString() {
		return this.label.getLiteralValue();
	}

	@Override
	public String toConsole() {
		String result;
		result = this.label.getLiteralValue() + ", color: "
				+ this.getColor().toConsole();
		return result;
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		if (memberName.equals("color")) {
			this.setColor((PCString) value);
		}
		if (memberName.equals("pi")) {
			this.setParentId((PCVertex) value);
		}
		if (memberName.equals("distance")) {
			this.setDistance((PCInteger) value);
		}
		if (memberName.equals("label")) {
			this.setLabel((PCString) value);
		}
		return null;
	}

	private void setLabel(PCString value) {
		this.label = value;
	}

	@Override
	public PCObject get(String memberName) {
		if (memberName.equals("color")) {
			return this.getColor();
		}
		if (memberName.equals("distance")) {
			return this.getDistance();
		}
		if (memberName.equals("pi")) {
			return this.getParentId();
		}
		if (memberName.equals("adjacents")) {
			return this.getAdjacents();
		}
		if (memberName.equals("label")) {
			return this.getLabel();
		}
		if(memberName.equals("edges")) {
			return this.getEdges();
		}

		return null;
	}

	public PCList<PCEdge> getEdges() {
		return edges;
	}
	
	public PCObject getLabel() {
		return label;
	}

	public PCVertex getParentId() {
		return parentId;
	}

	public PCInteger getDistance() {
		return distance;
	}

	public PCString getColor() {
		return color;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		if (((PCVertex) toCheckAgainst).label.equals(this.label)) {
			return true;
		}
		return false;
	}

	@Override
	protected void runDelayedCommands() {
		for (GraphicalRepresentation gr : allGr) {
			if (!this.commandsforGr.get(0).isEmpty()) {
				((GraphicalRepresentationVertex) gr)
						.setColor(((PCString) this.commandsforGr.get(0).pop())
								.getLiteralValue());
			}
		}
		this.commandsforGr.get(0).clear();
	}

	public static String getTypeName() {
		return PCVertex.TYPENAME;
	}

	@Override
	public List<String> getMembers() {
		String[] attributes = { "color", "distance", "parentId", "adjacents", "edges" };
		return Arrays.asList(attributes);
	}

	@Override
	public List<String> getMethods() {
		String[] attributes = { "equal", "notEqual" };
		return Arrays.asList(attributes);
	}

	public static PCVertex getNull() {
		return new PCVertex(null);
	}

	@Override
	public int compareTo(PCVertex arg0) {
		// if same label return 0
		if (arg0.label.toString().equals(this.label.toString())) {
			return 0;
		}
		Integer tLabel, aLabel;
		// try making it to numbers
		try {
			tLabel = new Integer(this.label.toString());
			aLabel = new Integer(arg0.label.toString());
			return (tLabel.intValue() - aLabel.intValue());
		} catch (NumberFormatException e) {
		}
		// return string
		return this.label.toString().compareTo(arg0.label.toString());
	}
	
	public PCBoolean equal(PCVertex other) {
		return new PCBoolean(this.equals(other));
	}
	
	public PCBoolean notEqual(PCVertex other) {
		return this.equal(other).not();
	}
}
