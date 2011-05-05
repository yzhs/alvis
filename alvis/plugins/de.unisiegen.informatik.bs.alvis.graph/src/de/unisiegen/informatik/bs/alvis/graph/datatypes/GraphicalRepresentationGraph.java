package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitives.GraphicalRepresentation;

/**
 * 
 * @author Dominik Dingel
 * 
 */

public interface GraphicalRepresentationGraph extends GraphicalRepresentation {
	/**
	 * 
	 * @return a List of the Vertices from the graph
	 */
	public ArrayList<GraphicalRepresentationVertex> getVertex();

	/**
	 * 
	 * @return a List of the Edges from the graph
	 */
	public ArrayList<GraphicalRepresentationEdge> getEdges();
}
