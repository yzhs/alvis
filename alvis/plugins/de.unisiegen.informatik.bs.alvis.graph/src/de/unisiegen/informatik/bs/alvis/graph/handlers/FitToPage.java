/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.graph.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IEditorPart;

import de.unisiegen.informatik.bs.alvis.graph.Activator;
import de.unisiegen.informatik.bs.alvis.graph.editors.GraphEditor;

//import de.unisiegen.informatik.bs.alvis.Activator;
//import de.unisiegen.informatik.bs.alvis.editors.GraphEditor;

/**
 * makes graph in GraphEditor fit to page
 * 
 * @author Frank Weiler
 */
public class FitToPage extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = Activator.getDefault().getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		// Try to cast the active editor to GraphEditor.
		try {
			GraphEditor grapheditor = (GraphEditor) editor;
			grapheditor.fiToPage();
		} catch (ClassCastException e) {
			// TODO Sinnvolle Fehlermeldung.
		}
		return null;

	}

}
