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

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

/**
 * Creates a new Algorithm Wizard which creates a new File with the .algo extension
 * 
 * @author Eduard Boos
 *
 */
public class NewAlgorithmWizard extends Wizard implements INewWizard {

	private IStructuredSelection selection;
	private IWorkbench workbench;
	private NewAlgorithmWizardPage newAlgorithmWizardPage;
	public static final String ID = "de.unisiegen.informatik.bs.alvis.navigator.wizards.newAlgorithmWizard"; //$NON-NLS-1$
	public static final String WIZARD_ID = "de.unisiegen.informatik.bs.alvis.navigator.wizards.newAlgorithmWizard"; //$NON-NLS-1$
	
	/**
	 * 
	 */
	public NewAlgorithmWizard() {
		setWindowTitle(Messages.NewAlgorithmWizard_newAlgorithmFile);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
	}
	
    @Override
	public void addPages() {
    	newAlgorithmWizardPage = new NewAlgorithmWizardPage(selection);
    	addPage(newAlgorithmWizardPage);
    }

	@Override
	public boolean performFinish() {
		IFile file = createNewAlgorithmFile();
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

	private IFile createNewAlgorithmFile() {
	  	IFile file = newAlgorithmWizardPage.createNewFile();
	  	return file;
	}

}
