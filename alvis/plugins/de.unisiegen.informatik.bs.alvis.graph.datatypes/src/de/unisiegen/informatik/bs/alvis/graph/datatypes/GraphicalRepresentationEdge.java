package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

/**
 * GraphicalRepresentation of Edge, should be implemented by every Edge
 * 
 * @author Dominik Dingel
 * 
 */

public interface GraphicalRepresentationEdge extends GraphicalRepresentation {
	/**
	 * Edge connects two Nodes, getSource returns first of them
	 * 
	 * @return source node
	 */
	GraphicalRepresentationVertex getSourceVertex();

	/**
	 * Edge connects two Nodes, getDestination returns second of them
	 * 
	 * @return destination node
	 */
	GraphicalRepresentationVertex getDestinationVertex();
}
