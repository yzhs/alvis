package de.unisiegen.informatik.bs.alvis.primitive.datatypes;


/**
 * 
 * @author Dominik Dingel
 *
 */

public interface GRBoolean extends GraphicalRepresentation {
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
