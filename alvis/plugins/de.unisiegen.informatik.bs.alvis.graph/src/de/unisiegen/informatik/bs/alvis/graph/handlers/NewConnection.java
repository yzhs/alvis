/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.graph.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IEditorPart;

//import de.unisiegen.informatik.bs.alvis.Activator;
//import de.unisiegen.informatik.bs.alvis.editors.GraphEditor;

/**
 * Set the GraphEditor to the NewConnection Modus
 * @author simon
 *
 */
public class NewConnection extends AbstractHandler {

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
//		//TODO Prüfen, ob dies der Richtige Activator ist.
//		IEditorPart editor = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
////		Try to cast the active editor to GraphEditor.
//		try {
//			GraphEditor grapheditor = (GraphEditor)editor;
////				grapheditor.doTheFunktion();
//		}
//		catch(ClassCastException e) {
////			TODO Sinnvolle Fehlermeldung.
//		}
		return null;
	}

}
