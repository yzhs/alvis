/*
 * Copyright (c) 2011 Eduard Boos
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
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
 * Creates a wizard for a new alvis Project and create all initial resources.
 * 
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
