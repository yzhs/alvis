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
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisBuffer;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisScenario;

public class NewBufferWizard extends Wizard implements INewWizard {

	private NewBufferWizardPage page;
	private AlvisScenario myScenario;
	
	public NewBufferWizard() {
		setWindowTitle(Messages.NewBufferWizard_createNewBufferWizardTitle);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		myScenario = AlvisScenario.scenario;
	}
	
	@Override
	public void addPages() {
		page = new NewBufferWizardPage();
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		try {
			int capacity = Integer.parseInt(page.getCapacity());
			AlvisBuffer b = new AlvisBuffer(myScenario, capacity);
			myScenario.setBuffer(b);
			myScenario.getAdmin().addBuffer(b);
			return true;
		} catch (NumberFormatException e) {
			Shell s = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
			Status st = new Status(IStatus.ERROR, "Alvis", e.getMessage(), e); //$NON-NLS-1$
			ErrorDialog.openError(s, Messages.NewBufferWizard_inputError, Messages.NewBufferWizard_notInteger, st);
			return false;
		}
	}

}
