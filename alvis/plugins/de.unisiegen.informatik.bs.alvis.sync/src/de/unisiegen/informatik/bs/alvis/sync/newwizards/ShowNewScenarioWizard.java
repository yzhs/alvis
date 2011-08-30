package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.handlers.HandlerUtil;

public class ShowNewScenarioWizard extends AbstractHandler {
	
	public static final String HANDLING_COMMAND_ID = "de.unisiegen.informatik.bs.alvis.sync.commands.showNewScenarioWizard";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		NewScenarioWizard wizard = new NewScenarioWizard();
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
