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
		super("New Run File Wizard", selection);
		setTitle("Run File");
		setDescription("Creates a new Run File");
		setFileExtension("run");
	}

	protected InputStream getInitialContents() {
		return null;
	}
}
