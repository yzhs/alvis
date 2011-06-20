/**
 * Command to open a new popup with the new Alvis Project Wizard
 */
package de.unisiegen.informatik.bs.alvis.ui.navigator.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.handlers.HandlerUtil;
import de.unisiegen.informatik.bs.alvis.ui.navigator.wizards.*;

/**
 * @author Eduard Boos
 * 
 */
public class ShowNewAlvisProjectWizard extends AbstractHandler {

	public static final String HANDLING_COMMAND_ID = "de.unisiegen.informatik.bs.alvis.navigator.commands.showNewAlvisProjectWizard";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		NewAlvisProjectWizard wizard = new NewAlvisProjectWizard();
		WizardDialog dialog = new WizardDialog(HandlerUtil.getActiveShell(event), wizard);
		IWorkbench workbench = HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench();
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if(currentSelection instanceof IStructuredSelection) {
			wizard.init(workbench, (IStructuredSelection)currentSelection);
		} else {
			wizard.init(workbench, null);
		}
		dialog.open();
		return null;
	}

	

}
