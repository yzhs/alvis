package de.unisiegen.informatik.bs.alvis.graph.datatypes;

/**
 * GraphicalRepresentation of Vertex, should be implemented by every Vertex
 * 
 * @author Dominik Dingel
 * 
 */

public interface GraphicalRepresentationVertex extends GraphicalRepresentation {

	/**
	 * Vertex body color
	 * 
	 * @return String color, no localisation but case independent
	 */
	public String getColorText();

	/**
	 * Vertex body color
	 * 
	 * @param new color as case independent string
	 */
	public void setColor(String color);

	/**
	 * Vertex label
	 * 
	 * @return String label
	 */
	public String getLabel();

	/**
	 * Vertex label
	 * 
	 * @param new label
	 */
	public void setLabel(String label);
}
