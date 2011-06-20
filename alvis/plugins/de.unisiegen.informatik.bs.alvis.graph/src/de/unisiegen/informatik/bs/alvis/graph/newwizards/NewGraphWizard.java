/**
 * Creates a new Algorithm Wizard which creates a new File with the .algo extension
 */
package de.unisiegen.informatik.bs.alvis.graph.newwizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

/**
 * @author Eduard Boos
 *
 */
public class NewGraphWizard extends Wizard implements INewWizard {

	private IStructuredSelection selection;
	private IWorkbench workbench;
	private NewGraphWizardPage newGraphWizardPage;

	/**
	 * 
	 */
	public NewGraphWizard() {
		setWindowTitle("New Graph File");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
	}
	
    @Override
	public void addPages() {
    	newGraphWizardPage = new NewGraphWizardPage(selection);
    	addPage(newGraphWizardPage);
    }

	@Override
	public boolean performFinish() {
		IFile file = createNewGraphFile();
		if(file==null)
		{
			return false;
		}
		else
		{
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

	private IFile createNewGraphFile() {
	  	IFile file = newGraphWizardPage.createNewFile();
	  	return file;
	}

}
