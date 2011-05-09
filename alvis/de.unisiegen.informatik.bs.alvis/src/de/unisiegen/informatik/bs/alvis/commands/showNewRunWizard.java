/**
 * Command to open a new popup showing the new Run wizard
 */
package de.unisiegen.informatik.bs.alvis.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.handlers.HandlerUtil;

import de.unisiegen.informatik.bs.alvis.wizards.NewRunWizard;

/**
 * @author Simon Groth
 *
 */
public class showNewRunWizard extends AbstractHandler {
	public static final String HANDLING_COMMAND_ID =
		"de.unisiegen.informatik.bs.alvis.commands.showNewRunWizard";
	public Object execute(ExecutionEvent event) throws ExecutionException {
		NewRunWizard runWizard = new NewRunWizard();
		WizardDialog dialog = new WizardDialog(
				HandlerUtil.getActiveShell(event), runWizard);
		IWorkbench workbench = HandlerUtil.
			getActiveWorkbenchWindow(event).getWorkbench();
		ISelection currentSelection = HandlerUtil.
			getCurrentSelection(event);
		if(currentSelection instanceof IStructuredSelection) {
			runWizard.init(workbench, (IStructuredSelection)currentSelection);
		} else {
			runWizard.init(workbench, null);
		}
		dialog.open();
		return null;
	}

}
