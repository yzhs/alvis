package de.unisiegen.informatik.bs.alvis.sync.run;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IRunPreferences;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

public class RunPreferences implements IRunPreferences {
	
	private String path;

	@Override
	public ArrayList<PCObject> getRunPreferences(String InputFilePath) {
		path = InputFilePath;
		
		return null;
	}

}
