package de.unisiegen.informatik.bs.alvis.datatypes;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.zest.core.widgets.GraphNode;

// TODO move stuff from frank to vm/plugin
import de.unisiegen.informatik.bs.alvis.virtualmachine.AlvisGraphConnection;
import de.unisiegen.informatik.bs.alvis.virtualmachine.AlvisGraphNode;
import de.unisiegen.informatik.bs.alvis.virtualmachine.GraphicalRepresentation;


public class Graph implements Datatype {
	private ArrayList<Edge> edges;
	private ArrayList<Vertex> vertices;

	public Graph(ArrayList<Vertex> vertices, ArrayList<Edge> edges) {
		this.edges = edges;
		this.vertices = vertices;
	}

	public Graph() {
		edges = new ArrayList<Edge>();
		vertices = new ArrayList<Vertex>();
	}

	public Graph(HashSet<GraphicalRepresentation> allNodes,
			HashSet<GraphicalRepresentation> allConnections) {
		
		edges = new ArrayList<Edge>();
		vertices = new ArrayList<Vertex>();
		for (GraphicalRepresentation node : allNodes) {
			vertices.add(new Vertex((AlvisGraphNode) node));
		}
		for (GraphicalRepresentation conn : allConnections) {
			edges.add(new Edge(this
					.getVertexFromGraphic(((AlvisGraphConnection) conn)
							.getSource()), this
					.getVertexFromGraphic(((AlvisGraphConnection) conn)
							.getDestination()), ((AlvisGraphConnection) conn)));
		}
}

	public Vertex getVertexFromGraphic(GraphNode node) {
		if (node == null) {
			return null;
		}
		for (Vertex vnode : vertices) {
			if (vnode.isGraphical((AlvisGraphNode) node)) {
				return vnode;
			}
		}
		return null;
	}

	// TODO implement toString methods
	public String toString() {
		return "";
	}

	/**
	 * 
	 * @return the saved vertices as ArrayList TODO rewrite, implement iterator
	 *         TODO implement SortableCollection
	 */
	public ArrayList<Vertex> getVertices() {
		return this.vertices;
	}

	/**
	 * 
	 * @return the saved edges as ArrayList TODO rewrite, implement iterator
	 *         TODO implement SortableCollection
	 */
	public ArrayList<Edge> getEdges() {
		return this.edges;
	}
}
