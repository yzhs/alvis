package de.unisiegen.informatik.bs.alvis.datatypes;

import de.unisiegen.informatik.bs.alvis.virtualmachine.AlvisGraphConnection;


/**
 * 
 * @author Dominik Dingel
 * 
 * @description implementing the Edge class
 * 
 *              TODO: add labels and weights
 * 
 */

public class Edge implements Datatype {
	private Vertex v1;
	private Vertex v2;
	private boolean isDirected;

	AlvisGraphConnection graphicalRepresentation;

	public Edge(Vertex v1, Vertex v2, AlvisGraphConnection graph) {
		graphicalRepresentation = graph;
		this.v1 = v1;
		this.v2 = v2;
		isDirected = false;
		notifyVertices();
	}

	public Edge(Vertex v1, Vertex v2) {
		graphicalRepresentation = null;
		this.v1 = v1;
		this.v2 = v2;
		isDirected = false;
		notifyVertices();
	}

	public Edge(Vertex v1, Vertex v2, boolean isDirected) {
		graphicalRepresentation = null;
		this.v1 = v1;
		this.v2 = v2;
		this.isDirected = isDirected;
		notifyVertices();
	}

	public void notifyVertices() {
		if (!isDirected) {
			v2.addEdge(this, v1);
		}
		v1.addEdge(this, v2);
	}
	
	public String toString() {
		String result = v1.toString() + "<->" + v2.toString();
		return result;
	}
}
