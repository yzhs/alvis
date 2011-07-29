/**
 * Default handler for changing the font of the AlgorithmEditor.
 */
package de.unisiegen.informatik.bs.alvis.editors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.FontDialog;
import org.eclipse.ui.PlatformUI;

/**
 * @author Eduard Boos
 *
 */
public class EditFontHandler extends AbstractHandler {

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		AlgorithmEditor editor = (AlgorithmEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		FontDialog dialog = new FontDialog(editor.getSite().getShell(), SWT.NONE);
		dialog.setFontList(editor.getTextWidget().getFont().getFontData());
		FontData fd = dialog.open();
		if(fd != null)
		{
			editor.setFont(fd);			
		}
		return fd;
	}

}
