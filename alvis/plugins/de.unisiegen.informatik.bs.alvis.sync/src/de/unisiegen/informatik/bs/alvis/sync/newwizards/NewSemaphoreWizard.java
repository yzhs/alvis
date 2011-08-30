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
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCSemaphore;
import de.unisiegen.informatik.bs.alvis.sync.editors.ScenarioEditor;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisSemaphore;

public class NewSemaphoreWizard extends Wizard implements INewWizard {
	
	private NewSemaphoreWizardPage page;
	
	public NewSemaphoreWizard() {
		setWindowTitle("create new semaphore");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		ScenarioEditor.semaphoresList.removeAll();
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
			AlvisSemaphore s = new AlvisSemaphore(null, name, Integer.parseInt(counter));
			ScenarioEditor.semaphoresList.add(s.toString());
			return true;
		} catch (NumberFormatException e) {
			Shell s = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
			Status st = new Status(IStatus.ERROR, "Alvis", e.getMessage(), e);
			ErrorDialog.openError(s, "Input error", "The value you entered for counter is not an integer", st);
			return false;
		}
	}

}
