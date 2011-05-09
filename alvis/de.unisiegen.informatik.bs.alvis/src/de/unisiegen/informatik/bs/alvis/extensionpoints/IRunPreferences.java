package de.unisiegen.informatik.bs.alvis.extensionpoints;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

public interface IRunPreferences {
	public ArrayList<GraphicalRepresentation> getRunPreferences(String InputFilePath);
}
