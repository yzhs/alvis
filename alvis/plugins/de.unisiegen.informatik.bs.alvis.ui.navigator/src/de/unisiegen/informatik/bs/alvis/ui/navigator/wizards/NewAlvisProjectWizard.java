/**
 * Creates a wizard for a new Alvis Project and create all initial resources.
 */
package de.unisiegen.informatik.bs.alvis.ui.navigator.wizards;

import java.io.StringBufferInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

/**
 * @author Eduard Boos
 *
 */
@SuppressWarnings("deprecation")
public class NewAlvisProjectWizard extends BasicNewProjectResourceWizard {

	public static final String ID = "de.unisiegen.informatik.bs.alvis.navigator.wizards.newAlvisProjectWizard"; //$NON-NLS-1$
	public static final String WIZARD_ID = "de.unisiegen.informatik.bs.alvis.navigator.wizards.newAlvisProjectWizard"; //$NON-NLS-1$
	public IFile fileToBeOpened;
	
	@Override
	public boolean performFinish() {
		boolean result = super.performFinish();
		IProject project =  this.getNewProject();
		result = createProjectFolders(project);
		
		if(result)
		{
			IWorkbenchPage wbPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			if (wbPage != null && fileToBeOpened != null) {
				try {
					IDE.openEditor(wbPage, fileToBeOpened, true);
				} catch (PartInitException e) {
					e.printStackTrace();
					return false;
				}
			}
			return true;
		}
		return result;
	}
	
	
	/**
	 * method to create the inital needed Project Folders and Files
	 * @param project the project to create the files and folders for
	 * @return true if successful
	 */
	private boolean createProjectFolders(IProject project) {
		try {
			IFolder srcFolder = project.getFolder("src"); //$NON-NLS-1$
			srcFolder.create(true, true, null);
			IFolder dataFolder = project.getFolder("data"); //$NON-NLS-1$
			dataFolder.create(true, true, null);
			IFile algoFile = srcFolder.getFile("algorithm.algo"); //$NON-NLS-1$
			//TODO find a new way to create the File! StringBufferInputStream is "deprecated"
			// with argument = null it will create a non local file (not existent)
			algoFile.create(new StringBufferInputStream(""), true, null); //$NON-NLS-1$
			this.fileToBeOpened = algoFile;
		} catch (CoreException e) {
			return false;
		}
		
		return true;
	}

}
