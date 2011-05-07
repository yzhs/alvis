/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.graph.run;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IRunPreferences;
import de.unisiegen.informatik.bs.alvis.graph.editors.GraphEditor;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisSave;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeObject;
/**
 * @author simon
 *
 */
public class RunPreferences implements IRunPreferences {

	String myInputFilePath;
	
	public PseudoCodeObject[] getRunPreferences(String inputFilePath) {
		
		// Bug the user to choose what this plugin want.
		StartEndNodeDialog dialog = new StartEndNodeDialog(
				Activator.getDefault().getWorkbench()
					.getActiveWorkbenchWindow().getShell());

		dialog.open();
		dialog.SaySomething();
		
		myInputFilePath = inputFilePath;
		
		System.out.println("Hallo");
		
		try {	
		AlvisSave input = (AlvisSave)GraphEditor.deserialize(myInputFilePath);
		} catch(ClassCastException e) {
			return null; // TODO Proof it
		}
		

		return null;	
	}
}