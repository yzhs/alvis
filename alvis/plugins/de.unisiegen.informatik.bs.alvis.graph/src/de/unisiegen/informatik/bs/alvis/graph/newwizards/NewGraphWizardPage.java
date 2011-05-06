/**
 * This class is needed for the NewGraphWizard and defines the WizardPage, windowTitle
 */
package de.unisiegen.informatik.bs.alvis.graph.newwizards;

import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * @author Eduard Boos
 * 
 */
public class NewGraphWizardPage extends WizardNewFileCreationPage {

	public NewGraphWizardPage(IStructuredSelection selection) {
		super("New Graph File Wizard", selection);
		setTitle("Graph File");
		setDescription("Creates a new Graph File");
		setFileExtension("graph");
	}

	protected InputStream getInitialContents() {
		return null;
	}
}
