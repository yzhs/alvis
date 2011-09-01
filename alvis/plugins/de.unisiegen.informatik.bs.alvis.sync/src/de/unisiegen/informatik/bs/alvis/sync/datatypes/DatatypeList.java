package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IDatatypeList;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

public class DatatypeList implements IDatatypeList {

	@Override
	public ArrayList<PCObject> getAllDatatypesInThisPlugin() {
		ArrayList<PCObject> usedDatatypes = new ArrayList<PCObject>();
		usedDatatypes.add(new PCSemaphore());
		usedDatatypes.add(new PCCondition());
		usedDatatypes.add(new PCThread());
		usedDatatypes.add(new PCScenario());
		usedDatatypes.add(new PCBuffer());
		return usedDatatypes;
	}

	@Override
	public ArrayList<String> getDatatypePackagesInThisPlugin() {
		ArrayList<String> datatypesInPlugin = new ArrayList<String>();
		datatypesInPlugin.add("de.unisiegen.informatik.bs.alvis.sync.datatypes");
		return datatypesInPlugin;
	}

}
