package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCList;

public class PCGraph extends PCObject {
	protected static final String TYPENAME = "Graph";
	private PCList<PCEdge> edges;
	private PCList<PCVertex> vertices;

	
	/**
	 * Creates new Graph from PseudoCodeLists
	 * 
	 * @param vertices
	 * @param edges
	 */
	public PCGraph(PCList<PCVertex> vertices,
			PCList<PCEdge> edges) {
		this.edges = edges;
		this.vertices = vertices;
	}

	/**
	 * Creates new empty Graph
	 */
	public PCGraph() {
		edges = new PCList<PCEdge>();
		vertices = new PCList<PCVertex>();
	}

	/**
	 * Creates new Graph from HashSet GraphicalRepresentation of Nodes and
	 * Vertices
	 * 
	 * @param allgNodes
	 * @param allgConnections
	 */
	public PCGraph(ArrayList<GraphicalRepresentationVertex> allgNodes,
			ArrayList<GraphicalRepresentationEdge> allgConnections) {

		edges = new PCList<PCEdge>();
		vertices = new PCList<PCVertex>();
		for (GraphicalRepresentationVertex node : allgNodes) {
			vertices.add(new PCVertex(node));
		}
		for (GraphicalRepresentationEdge conn : allgConnections) {
			edges.add(new PCEdge(this.getVertexFromGraphic((conn)
					.getSourceVertex()), this.getVertexFromGraphic((conn)
					.getDestinationVertex()), (conn)));
		}
	}

	/**
	 * returns Vertex from its GraphicalRepresentation
	 * 
	 * @param node
	 * @return Vertex
	 */
	public PCVertex getVertexFromGraphic(
			GraphicalRepresentationVertex node) {
		if (node == null) {
			return null;
		}
		for (PCVertex vnode : vertices) {
			if (vnode.isGraphical(node)) {
				return vnode;
			}
		}
		return null;
	}

	/**
	 * returns Edge from its GraphicalRepresentation
	 *
	 * @param edge
	 * @return Edge
	 */
	public PCEdge getEdgeFromGraphic(GraphicalRepresentationEdge edge) {
			if (edge == null) {
				return null;
			}
			for (PCEdge vedge : edges) {
				if (vedge.isGraphical(edge)) {
					return vedge;
				}
			}
			return null;
	}
	/**
	 * 
	 * @return the saved vertices as PseudoCodeList
	 */
	public PCList<PCVertex> getVertices() {
		return this.vertices;
	}

	/**
	 * 
	 * @return the saved edges as PseudoCode
	 */
	public PCList<PCEdge> getEdges() {
		return this.edges;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		// TODO check possible member access
		return null;
	}

	@Override
	public PCObject get(String memberName) {
		// TODO check possible member access
		if (memberName.equals("vertices")) {
			return this.vertices;
		}
		return null;
	}

	@Override
	public Map<String, ? extends PCObject> getMembers() {
		Map<String, PCObject> result = new HashMap<String, PCObject>();
		result.put("vertices", this.vertices);
		return result;
	}

	@Override
	// TODO implement by comparing edges and vertices
	public boolean equals(PCObject toCheckAgainst) {
		return false;
	}

	@Override
	public String getTypeName() {
		return PCGraph.TYPENAME;
	}
	
}
