package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisThread;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisScenario;

public class NewThreadWizard extends Wizard implements INewWizard {

	private NewThreadWizardPage page;
	private AlvisScenario myScenario;
	
	public NewThreadWizard() {
		setWindowTitle(Messages.NewThreadWizard_newThreadWizard);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		myScenario = AlvisScenario.scenario;
	}
	
	@Override
	public void addPages() {
		page = new NewThreadWizardPage();
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		String name = page.getName();
		AlvisThread a = new AlvisThread(myScenario, name, false);
		myScenario.addThread(a);
		return true;
	}

}
