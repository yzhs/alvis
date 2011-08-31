package de.unisiegen.informatik.bs.alvis.pluginname.datatypes;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IDatatypeList;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
// Import all datatypes
import de.unisiegen.informatik.bs.alvis.pluginname.datatypes.*;

public class DatatypeList implements IDatatypeList {

	public DatatypeList() {}

	public ArrayList<PCObject>
		getAllDatatypesInThisPlugin() {
		ArrayList<PCObject> datatypeList = 
			new ArrayList<PCObject>();
		datatypeList.add(
			PseudoCodeDatentypname.getNull());
		// If you have more datatypes add them also.
		return datatypeList;
	}
}
