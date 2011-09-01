package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.unisiegen.informatik.bs.alvis.sync.Activator;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisScenario;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisSemaphore;

public class NewSemaphoreWizard extends Wizard implements INewWizard {
	
	private NewSemaphoreWizardPage page;
	private AlvisScenario myScenario;
	
	public NewSemaphoreWizard() {
		setWindowTitle(Messages.NewSemaphoreWizard_createNewSemaphoreWizardTitle);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		myScenario = AlvisScenario.scenario;
	}
	
	@Override
	public void addPages() {
		page = new NewSemaphoreWizardPage();
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		String name = page.getName();
		String counter = page.getCounter();
		try {
			AlvisSemaphore s = new AlvisSemaphore(myScenario, name, Integer.parseInt(counter));
			myScenario.addSemaphore(s);
			return true;
		} catch (NumberFormatException e) {
			Shell s = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
			Status st = new Status(IStatus.ERROR, "Alvis", e.getMessage(), e); //$NON-NLS-1$
			ErrorDialog.openError(s, Messages.NewSemaphoreWizard_inputError, Messages.NewSemaphoreWizard_notInteger, st);
			return false;
		}
	}

}
