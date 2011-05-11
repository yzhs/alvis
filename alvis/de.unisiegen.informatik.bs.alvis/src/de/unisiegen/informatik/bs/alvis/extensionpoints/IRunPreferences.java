package de.unisiegen.informatik.bs.alvis.extensionpoints;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeObject;

public interface IRunPreferences {
	public ArrayList<PseudoCodeObject> getRunPreferences(String InputFilePath);
}
