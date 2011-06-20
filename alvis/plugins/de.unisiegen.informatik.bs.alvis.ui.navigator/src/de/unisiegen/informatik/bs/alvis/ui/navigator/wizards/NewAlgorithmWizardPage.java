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
		super("New Algorithm File Wizard", selection);
		setTitle("Algorithm File");
		setDescription("Creates a new Algorithm File");
		setFileExtension("algo");
	}

	@Override
	protected InputStream getInitialContents() {
		return null;
	}
}
