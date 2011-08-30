package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewSemaphoreWizard extends Wizard implements INewWizard {
	
	private IStructuredSelection selection;
	private IWorkbench workbench;
	private NewSemaphoreWizardPage page;
	
	public NewSemaphoreWizard() {
		setWindowTitle("create new semaphore");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}
	
	@Override
	public void addPages() {
		page = new NewSemaphoreWizardPage();
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		
		return false;
	}

}
