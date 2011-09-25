/*
 * Copyright (c) 2011 Dominik Dingel
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import java.util.ArrayList;
import java.util.List;

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
	public PCGraph(PCList<PCVertex> vertices, PCList<PCEdge> edges) {
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
		for (PCVertex v : vertices) {
			v.setGraph(this);
		}
		for (GraphicalRepresentationEdge conn : allgConnections) {
			edges.add(new PCEdge(this.getVertexFromGraphic((conn)
					.getSourceVertex()), this.getVertexFromGraphic((conn)
					.getDestinationVertex()), (conn)));
		}
		for (PCEdge e : edges) {
			e.setGraph(this);
		}
	}

	public void removeEdge(PCEdge toRemove) {
		edges.remove(toRemove);
	}
	
	/**
	 * returns Vertex from its GraphicalRepresentation
	 * 
	 * @param node
	 * @return Vertex
	 */
	public PCVertex getVertexFromGraphic(GraphicalRepresentationVertex node) {
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
	public PCList<PCVertex> _get_vertices_() {
		return this.vertices;
	}

	/**
	 * 
	 * @return the saved edges as PseudoCode
	 */
	public PCList<PCEdge> _get_edges_() {
		return this.edges;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getMembers() {
		List<String> result = new ArrayList<String>();
		result.add("vertices");
		result.add("edges");
		return result;
	}

	@Override
	// TODO implement by comparing edges and vertices
	public boolean equals(PCObject toCheckAgainst) {
		if (null == toCheckAgainst || !(toCheckAgainst instanceof PCGraph))
			return false;
		PCGraph other = (PCGraph) toCheckAgainst;
		return vertices.equals(other.vertices) && edges.equals(other.edges);
	}

	public static String getTypeName() {
		return PCGraph.TYPENAME;
	}

	/**
	 * Enable/Disable the batch Modification every Change on the
	 * GraphicalRepresentation will be delayed and only the last one will be
	 * really executed
	 * 
	 * @param setBatchModification
	 */
	@Override
	public void batchModification(boolean setBatchModification) {
		// leaving batch mode, run all delayed commands
		if (isInBatchRun == true && setBatchModification == false) {
			runDelayedCommands();
			for (PCVertex v : vertices) {
				v.runDelayedCommands();
			}
			for (PCEdge e : edges) {
				e.runDelayedCommands();
			}
		}
		isInBatchRun = setBatchModification;
		for (PCVertex v : vertices) {
			v.batchModification(setBatchModification);
		}
		for (PCEdge e : edges) {
			e.batchModification(setBatchModification);
		}
	}

	public static PCGraph getNull() {
		return new PCGraph();
	}
}
