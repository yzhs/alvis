package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class NewScenarioWizardPage extends WizardNewFileCreationPage {

	public NewScenarioWizardPage(IStructuredSelection selection) {
		super(Messages.NewScenarioWizardPage_newScenarioFileWizardTitle, selection);
		setTitle("Scenario File"); //$NON-NLS-1$
		setDescription(Messages.NewScenarioWizardPage_newScenarioWizardPageTitle);
		setFileExtension("sync"); //$NON-NLS-1$
	}

}
