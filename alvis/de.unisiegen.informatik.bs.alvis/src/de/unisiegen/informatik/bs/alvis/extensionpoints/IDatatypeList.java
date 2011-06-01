package de.unisiegen.informatik.bs.alvis.extensionpoints;


import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

/**
 * 
 * @author Simon Groth

 */
public interface IDatatypeList {

	/**
	 * Returns all datatypes that are in this Plugin
	 * @return
	 */
	public ArrayList<PCObject> getAllDatatypesInThisPlugin();

}