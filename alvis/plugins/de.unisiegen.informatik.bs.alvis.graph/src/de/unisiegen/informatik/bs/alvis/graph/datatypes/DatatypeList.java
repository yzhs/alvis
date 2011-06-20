package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IDatatypeList;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

public class DatatypeList implements IDatatypeList {

	/**
	 * Return all datatypes that this Plug-in uses.
	 */
	@Override
	public ArrayList<PCObject> getAllDatatypesInThisPlugin() {
		ArrayList<PCObject> allDatatypesInThisPlugin = new ArrayList<PCObject>();

		allDatatypesInThisPlugin.add(new PCEdge());
		allDatatypesInThisPlugin.add(new PCGraph());
		allDatatypesInThisPlugin.add(new PCVertex());
		return allDatatypesInThisPlugin;
	}

}
