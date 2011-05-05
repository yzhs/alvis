package de.unisiegen.informatik.bs.alvis.primitives;


/**
 * 
 * @author Dominik Dingel
 *
 */

public interface GraphicalRepresentationBoolean extends GraphicalRepresentation {
	/**
	 *
	 * @return current State
	 */
	public boolean isSet();	
	
	/**
	 * 
	 * @param the state of the graphicalRepresentation to set
	 */
	public void set(boolean toSet);
}
