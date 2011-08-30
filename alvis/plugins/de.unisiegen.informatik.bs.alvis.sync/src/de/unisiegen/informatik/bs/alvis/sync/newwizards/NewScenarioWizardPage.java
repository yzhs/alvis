package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class NewScenarioWizardPage extends WizardNewFileCreationPage {

	public NewScenarioWizardPage(IStructuredSelection selection) {
		super("New Scenario File Wizard", selection);
		setTitle("Scenario File");
		setDescription("Creates a new Scenario File");
		setFileExtension("sync");
	}

}
