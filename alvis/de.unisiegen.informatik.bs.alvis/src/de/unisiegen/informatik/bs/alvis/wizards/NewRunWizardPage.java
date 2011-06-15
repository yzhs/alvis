/**
 * This calss is needed for the NewAlgorithmWizard and defines the WizardPage, windowTitle
 */
package de.unisiegen.informatik.bs.alvis.wizards;

import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * @author Eduard Boos
 * 
 */
public class NewRunWizardPage extends WizardNewFileCreationPage {

	public NewRunWizardPage(IStructuredSelection selection) {
		super(Messages.NewRunWizardPage_0, selection);
		setTitle(Messages.NewRunWizardPage_1);
		setDescription(Messages.NewRunWizardPage_2);
		setFileExtension("run"); //$NON-NLS-1$
	}

	protected InputStream getInitialContents() {
		return null;
	}
}
