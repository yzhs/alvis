/**
 * Creates a new Algorithm Wizard which creates a new File with the .algo extension
 */
package de.unisiegen.informatik.bs.alvis.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

/**
 * @author Simon Groth
 *
 */
public class NewRunWizard extends Wizard implements INewWizard {

	private IStructuredSelection selection;
	@SuppressWarnings("unused")
	private IWorkbench workbench;
	private NewRunWizardPage newRunWizardPage;

	/**
	 * 
	 */
	public NewRunWizard() {
		setWindowTitle(Messages.NewRunWizard_0);
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
	}
	
    public void addPages() {
    	newRunWizardPage = new NewRunWizardPage(selection);
    	addPage(newRunWizardPage);
    }

	public boolean performFinish() {
		boolean result = createNewRunFile();
		return result;
	}

	private boolean createNewRunFile() {
	  	IFile file = newRunWizardPage.createNewFile();
    	if (file != null)
    		return true;
    	else
    		return false;
	}

}
