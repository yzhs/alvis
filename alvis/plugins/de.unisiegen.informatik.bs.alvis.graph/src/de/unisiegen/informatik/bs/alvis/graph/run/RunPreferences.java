/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.graph.run;

import java.util.ArrayList;

import org.eclipse.jface.window.Window;

import de.unisiegen.informatik.bs.alvis.graph.Activator;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IRunPreferences;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
/**
 * @author simon
 *
 */
public class RunPreferences implements IRunPreferences {

	String myInputFilePath;
	
	@Override
	public ArrayList<PCObject> getRunPreferences(String inputFilePath) {
		myInputFilePath = inputFilePath;

		// TODO Abfangen, wenn wir mit myInputFilePath nix tun können.
		// Bug the user to choose what this plugin want.
		StartEndNodeDialog dialog = new StartEndNodeDialog(
				Activator.getDefault().getWorkbench()
					.getActiveWorkbenchWindow().getShell(), myInputFilePath);

		if(dialog.open() == Window.OK)
			return Activator.getDefault().getTempPseudoCodeObjects();
		else 
			return null;
	}
}