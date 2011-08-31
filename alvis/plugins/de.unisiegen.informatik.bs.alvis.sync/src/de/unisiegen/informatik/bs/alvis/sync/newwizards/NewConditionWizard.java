package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisCondition;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisScenario;

public class NewConditionWizard extends Wizard implements INewWizard {

	private NewConditionWizardPage page;
	private AlvisScenario myScenario;

	public NewConditionWizard() {
		setWindowTitle(Messages.NewConditionWizard_createNewConditionWizardTitle);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		myScenario = AlvisScenario.scenario;
	}

	@Override
	public void addPages() {
		page = new NewConditionWizardPage();
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		String name = page.getName();
		AlvisCondition c = new AlvisCondition(myScenario, name);
		myScenario.addCondition(c);
		return true;
	}

}
