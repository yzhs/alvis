/**
 * Command to open a new popup showing the new Graph wizard
 */
package de.unisiegen.informatik.bs.alvis.graph.newwizards;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @author Eduard Boos
 *
 */
public class showNewGraphWizard extends AbstractHandler {
	public static final String HANDLING_COMMAND_ID = "de.unisiegen.informatik.bs.alvis.graph.commands.showNewGraphWizard";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		NewGraphWizard graphWizard = new NewGraphWizard();
		WizardDialog dialog = new WizardDialog(HandlerUtil.getActiveShell(event), graphWizard);
		IWorkbench workbench = HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench();
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if(currentSelection instanceof IStructuredSelection) {
			graphWizard.init(workbench, (IStructuredSelection)currentSelection);
		} else {
			graphWizard.init(workbench, null);
		}
		dialog.open();
		return null;
	}

}
