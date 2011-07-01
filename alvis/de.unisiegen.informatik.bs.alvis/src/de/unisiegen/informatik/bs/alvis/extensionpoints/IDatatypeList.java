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
	 * @return ArrayList with datatypes
	 * @see Activator().getDefault().getAllDatatypes()
	 */
	public ArrayList<PCObject> getAllDatatypesInThisPlugin();
	
	/**
	 * Returns the package-name where the datatypes are inside
	 * @return names of packages the datatypes are inside
	 * @see getAllDatatypesInThisPlugin()
	 */
	public ArrayList<String> getDatatypePackagesInThisPlugin();

}