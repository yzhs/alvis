package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCList;

public class PseudoCodeGraph extends PCObject {
	protected static final String TYPENAME = "Graph";
	private PCList<PseudoCodeEdge> edges;
	private PCList<PseudoCodeVertex> vertices;

	/**
	 * Creates new Graph from PseudoCodeLists
	 * 
	 * @param vertices
	 * @param edges
	 */
	public PseudoCodeGraph(PCList<PseudoCodeVertex> vertices,
			PCList<PseudoCodeEdge> edges) {
		this.edges = edges;
		this.vertices = vertices;
	}

	/**
	 * Creates new Graph from ArrayLists with PseudoCodeVertex and Edges
	 * 
	 * @param tmpvertices
	 * @param tmpedges
	 */
	public PseudoCodeGraph(ArrayList<PseudoCodeVertex> tmpvertices,
			ArrayList<PseudoCodeEdge> tmpedges) {
		edges = new PCList<PseudoCodeEdge>();
		vertices = new PCList<PseudoCodeVertex>();
		for (PseudoCodeVertex vert : tmpvertices) {
			vertices.add(vert);
		}
		for (PseudoCodeEdge ed : tmpedges) {
			edges.add(ed);
		}
	}

	/**
	 * Creates new empty Graph
	 */
	public PseudoCodeGraph() {
		edges = new PCList<PseudoCodeEdge>();
		vertices = new PCList<PseudoCodeVertex>();
	}

	// TODO DUMMY Constructor
	public PseudoCodeGraph(GraphicalRepresentationGraph gr) {

	}

	/**
	 * Creates new Graph from HashSet GraphicalRepresentation of Nodes and
	 * Vertices
	 * 
	 * @param allgNodes
	 * @param allgConnections
	 */
	public PseudoCodeGraph(HashSet<GraphicalRepresentationVertex> allgNodes,
			HashSet<GraphicalRepresentationEdge> allgConnections) {

		edges = new PCList<PseudoCodeEdge>();
		vertices = new PCList<PseudoCodeVertex>();
		for (GraphicalRepresentationVertex node : allgNodes) {
			vertices.add(new PseudoCodeVertex(node));
		}
		for (GraphicalRepresentationEdge conn : allgConnections) {
			edges.add(new PseudoCodeEdge(this.getVertexFromGraphic((conn)
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
	public PseudoCodeVertex getVertexFromGraphic(
			GraphicalRepresentationVertex node) {
		if (node == null) {
			return null;
		}
		for (PseudoCodeVertex vnode : vertices) {
			if (vnode.isGraphical(node)) {
				return vnode;
			}
		}
		return null;
	}

	/**
	 * 
	 * @return the saved vertices as PseudoCodeList
	 */
	public PCList<PseudoCodeVertex> getVertices() {
		return this.vertices;
	}

	/**
	 * 
	 * @return the saved edges as PseudoCode
	 */
	public PCList<PseudoCodeEdge> getEdges() {
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
			return vertices;
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
	public boolean equals(PCObject toCheckAgainst) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getTypeName() {
		return PseudoCodeGraph.TYPENAME;
	}
	
	@Override
	public void updateGR(GraphicalRepresentation gr) {
		ArrayList<GraphicalRepresentationVertex> vlist = new ArrayList<GraphicalRepresentationVertex>();
		//for()
		//((GraphicalRepresentationGraph) gr).setVertices(vlist);
		//((GraphicalRepresentationGraph) gr).setEdges(null);
		
	}
}
