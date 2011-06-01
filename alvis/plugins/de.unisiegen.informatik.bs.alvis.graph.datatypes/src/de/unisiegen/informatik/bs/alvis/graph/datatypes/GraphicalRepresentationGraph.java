package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

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
	 * @param vertToSet
	 */
	public void setVertices(ArrayList<GraphicalRepresentationVertex> vertToSet);
	
	/**
	 * 
	 * @param edgeToSet
	 */
	public void setEdges(ArrayList<GraphicalRepresentationEdge> edgeToSet);
	
	/**
	 * 
	 * @return a List of the Edges from the graph
	 */
	public ArrayList<GraphicalRepresentationEdge> getEdges();
}
