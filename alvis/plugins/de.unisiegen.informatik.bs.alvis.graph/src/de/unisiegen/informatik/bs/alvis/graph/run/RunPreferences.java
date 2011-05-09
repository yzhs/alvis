/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.graph.run;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IRunPreferences;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.GraphicalRepresentationVertex;
import de.unisiegen.informatik.bs.alvis.graph.editors.GraphEditor;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisSave;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisSerialize;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeObject;
/**
 * @author simon
 *
 */
public class RunPreferences implements IRunPreferences {

	String myInputFilePath;
	
	public GraphicalRepresentation[] getRunPreferences(String inputFilePath) {
		myInputFilePath = inputFilePath;

		// TODO Abfangen, wenn wir mit myInputFilePath nix tun können.
		// Bug the user to choose what this plugin want.
		StartEndNodeDialog dialog = new StartEndNodeDialog(
				Activator.getDefault().getWorkbench()
					.getActiveWorkbenchWindow().getShell(), myInputFilePath);

		dialog.open();
		return dialog.getPrefereces();
	}
}