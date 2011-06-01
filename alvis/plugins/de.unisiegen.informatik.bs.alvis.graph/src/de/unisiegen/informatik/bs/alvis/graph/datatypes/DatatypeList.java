package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IDatatypeList;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

public class DatatypeList implements IDatatypeList {

	/**
	 * Return all datatypes that this Plug-in uses.
	 */
	public ArrayList<PCObject> getAllDatatypesInThisPlugin() {
		ArrayList<PCObject> allDatatypesInThisPlugin = new ArrayList<PCObject>();

		allDatatypesInThisPlugin.add(PseudoCodeEdge.getNull());
		allDatatypesInThisPlugin.add(PseudoCodeGraph.getNull());
		allDatatypesInThisPlugin.add(PseudoCodeVertex.getNull());
		return allDatatypesInThisPlugin;
	}

}
