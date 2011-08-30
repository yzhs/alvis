package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.handlers.HandlerUtil;

public class ShowNewSemaphoreWizard extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		NewSemaphoreWizard wizard = new NewSemaphoreWizard();
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
