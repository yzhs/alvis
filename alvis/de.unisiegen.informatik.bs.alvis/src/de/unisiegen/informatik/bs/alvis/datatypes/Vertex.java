package de.unisiegen.informatik.bs.alvis.datatypes;

/**
 * @author Dominik Dingel
 * TODO Currently all attributes are on own memberfield, could be changed to use an attribut class
 * TODO change infty behaviour
 */

import java.util.ArrayList;

import org.eclipse.draw2d.Animation;
import org.eclipse.swt.graphics.Color;

import de.unisiegen.informatik.bs.alvis.virtualmachine.AlvisGraphNode;


public class Vertex implements Datatype {
	private AlvisGraphNode graphicalRepresentation;

	private ArrayList<Edge> edges;
	private List<Vertex> adjacants;
	private int distance;
	private boolean isDistanceInfty;
	private String color;
	private Vertex parentId;
	private String label;

	public boolean isGraphical(AlvisGraphNode checkAgainst) {
		if (checkAgainst == this.graphicalRepresentation) {
			return true;
		}
		return false;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Vertex> getAdjacents() {
		return this.adjacants;
	}

	public void setParentId(Vertex parentId) {
		this.parentId = parentId;
	}

	public Vertex getParentId() {
		return this.parentId;
	}

	public void setDistanceToInfty() {
		this.isDistanceInfty = true;
		this.distance = 0;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getDistance() {
		if (this.isDistanceInfty) {
			return Integer.MAX_VALUE;
		} else {
			return this.distance;
		}
	}

	private Color toChange;

	public void setColor(String color) {
		this.color = color;
		if (graphicalRepresentation != null) {
			toChange = null;
			if (color.equals("white")) {
				toChange = new Color(null, 255, 255, 255);
			}
			if (color.equals("grey")) {
				toChange = new Color(null, 150, 150, 150);
			}
			if (color.equals("green")) {
				toChange = new Color(null, 0, 255, 0);
			}
			if(toChange != null) {
			Runnable run = new Runnable() {
				public void run() {
					Animation.markBegin();
					graphicalRepresentation.setBackgroundColor(toChange);
					graphicalRepresentation.setBorderColor(new Color(null, 0,
							0, 0));
					Animation.run(0);
				}
			};
			graphicalRepresentation.getDisplay().asyncExec(run);
			}
		}
	}

	public String getColor() {
		return this.color;
	}

	public void addEdge(Edge toAdd, Vertex adjacent) {
		this.edges.add(toAdd);
		this.adjacants.add(adjacent);
	}

	public Vertex(AlvisGraphNode node) {
		this.graphicalRepresentation = node;
		this.adjacants = new List<Vertex>();
		this.edges = new ArrayList<Edge>();
		this.isDistanceInfty = false;
		this.distance = 0;
		this.parentId = null;
		this.color = node.getBackgroundColor().toString();
		this.label = node.getText();
	}

	public Vertex() {
		this.graphicalRepresentation = null;
		this.adjacants = new List<Vertex>();
		this.edges = new ArrayList<Edge>();
		this.isDistanceInfty = false;
		this.distance = 0;
		this.color = "";
		this.parentId = null;
		this.label = "";
	}

	public String toString() {
		String result = this.label;
		return result;
	}
	
	public boolean equals(Vertex toTest) {
		if(toTest == null) {
			return false;
		}
		
		if(this.graphicalRepresentation == toTest.graphicalRepresentation) {
			return true;
		}
		return false;
	}
}
