/**
 * Command to open the Navigator View
 */
package de.unisiegen.informatik.bs.alvis.ui.navigator.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import de.unisiegen.informatik.bs.alvis.ui.navigator.views.Navigator;


/**
 * @author Eduard Boos
 *
 */
public class OpenViewNavigator extends AbstractHandler {
	public static final String ID 
		= "de.unisiegen.informatik.bs.alvis.navigator.commands.openNavigator"; //$NON-NLS-1$

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().showView(Navigator.ID);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return null;
    }

}
