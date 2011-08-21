/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.editors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.PlatformUI;

/**
 * Default handler for decreasing the font size of the AlgorithmEditor.
 * 
 * @author Eduard Boos
 *
 */
public class DecreaseFontSizeHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		AlgorithmEditor editor = (AlgorithmEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		return editor.decreaseFont();
	}

}
