package de.unisiegen.informatik.bs.alvis.extensionpoints;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

public interface IRunPreferences {
	public ArrayList<PCObject> getRunPreferences(String InputFilePath);
}
