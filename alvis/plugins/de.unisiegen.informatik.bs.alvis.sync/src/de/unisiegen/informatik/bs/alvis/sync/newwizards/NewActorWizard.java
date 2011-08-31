package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisActor;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisScenario;

public class NewActorWizard extends Wizard implements INewWizard {

	private NewActorWizardPage page;
	private AlvisScenario myScenario;
	
	public NewActorWizard() {
		setWindowTitle("create new actor");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		myScenario = AlvisScenario.scenario;
	}
	
	@Override
	public void addPages() {
		page = new NewActorWizardPage();
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		String name = page.getName();
		AlvisActor a = new AlvisActor(myScenario, name, false);
		myScenario.addActor(a);
		return true;
	}

}
