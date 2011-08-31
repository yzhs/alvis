package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

public class NewScenarioWizard extends Wizard implements INewWizard {
	
	private IStructuredSelection selection;
	private IWorkbench workbench;
	private NewScenarioWizardPage page;
	
	public NewScenarioWizard() {
		setWindowTitle(Messages.NewScenarioWizard_createNewScenarioWizardTitle);
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}
	
	@Override
	public void addPages() {
		page = new NewScenarioWizardPage(selection);
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		IFile file = createNewScenarioFile();
		if (file == null) {
			return false;
		} else {
			IWorkbenchPage wbPage = workbench.getActiveWorkbenchWindow().getActivePage();
			if (wbPage != null) {
				try {
					IDE.openEditor(wbPage, file, true);
				} catch (PartInitException e) {
					e.printStackTrace();
					return false;
				}
			}
			return true;
		}
	}
	
	private IFile createNewScenarioFile() {
	  	IFile file = page.createNewFile();
	  	return file;
	}

}
