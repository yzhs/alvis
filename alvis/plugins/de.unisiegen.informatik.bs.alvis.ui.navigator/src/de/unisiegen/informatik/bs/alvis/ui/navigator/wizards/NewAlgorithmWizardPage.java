/**
 * This calss is needed for the NewAlgorithmWizard and defines the WizardPage, windowTitle
 */
package de.unisiegen.informatik.bs.alvis.ui.navigator.wizards;

import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * @author Eduard Boos
 * 
 */
public class NewAlgorithmWizardPage extends WizardNewFileCreationPage {

	public NewAlgorithmWizardPage(IStructuredSelection selection) {
		super(Messages.NewAlgorithmWizardPage_newAlgorithmFileWizard, selection);
		setTitle(Messages.NewAlgorithmWizardPage_algorithmFile);
		setDescription(Messages.NewAlgorithmWizardPage_createsNewAlgorithmFile);
		setFileExtension("algo"); //$NON-NLS-1$
	}

	@Override
	protected InputStream getInitialContents() {
		return null;
	}
}
