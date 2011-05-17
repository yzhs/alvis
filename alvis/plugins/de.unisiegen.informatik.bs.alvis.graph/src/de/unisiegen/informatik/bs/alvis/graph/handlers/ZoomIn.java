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
 * Set the GraphEditor to the ZoomIn modus.
 * @author simon
 *
 */
public class ZoomIn extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
//		Try to cast the active editor to GraphEditor.
		try {
			GraphEditor grapheditor = (GraphEditor)editor;
				grapheditor.myGraph.zoomIn();
		}
		catch(ClassCastException e) {
//			TODO Sinnvolle Fehlermeldung.
		}
		return null;

	}

}
