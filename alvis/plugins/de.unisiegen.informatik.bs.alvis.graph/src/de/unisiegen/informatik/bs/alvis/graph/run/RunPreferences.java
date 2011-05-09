/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.graph.run;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.graph.Activator;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IRunPreferences;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
/**
 * @author simon
 *
 */
public class RunPreferences implements IRunPreferences {

	String myInputFilePath;
	
	public ArrayList<GraphicalRepresentation> getRunPreferences(String inputFilePath) {
		myInputFilePath = inputFilePath;

		// TODO Abfangen, wenn wir mit myInputFilePath nix tun können.
		// Bug the user to choose what this plugin want.
		StartEndNodeDialog dialog = new StartEndNodeDialog(
				Activator.getDefault().getWorkbench()
					.getActiveWorkbenchWindow().getShell(), myInputFilePath);

		if(dialog.open() == StartEndNodeDialog.OK)
			return Activator.getDefault().getTempGephicalRepresentations();
		else 
			return null;
	}
}