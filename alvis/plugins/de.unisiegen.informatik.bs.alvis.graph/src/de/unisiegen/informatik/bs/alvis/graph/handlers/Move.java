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
 * Set the GraphEditor to the Move modus.
 * @author simon
 *
 */
public class Move extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//TODO Pr�fen, ob dies der Richtige Activator ist.
		IEditorPart editor = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
//		Try to cast the active editor to GraphEditor.
		try {
			GraphEditor grapheditor = (GraphEditor)editor;
				grapheditor.setModus(GraphEditor.MODUS_MOVE);
		}
		catch(ClassCastException e) {
//			TODO Sinnvolle Fehlermeldung.
		}
		return null;

	}

}
