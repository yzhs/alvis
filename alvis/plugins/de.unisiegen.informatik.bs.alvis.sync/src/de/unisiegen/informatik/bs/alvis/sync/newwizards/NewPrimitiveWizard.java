package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;

import de.unisiegen.informatik.bs.alvis.sync.Activator;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisPrimitive;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisScenario;

public class NewPrimitiveWizard extends Wizard implements IWizard {
	
	private NewPrimitiveWizardPage page;
	private AlvisScenario myScenario;
	
	public NewPrimitiveWizard() {
		setWindowTitle("Create new primitive");
	}
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		myScenario = AlvisScenario.scenario;
	}
	
	public void addPages() {
		page = new NewPrimitiveWizardPage();
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		int type = page.getType();
		String name = page.getName();
		String value = page.getValue();
		switch (type) {
		case 0: //int
			try {
				AlvisPrimitive p = new AlvisPrimitive(myScenario, name, Integer.parseInt(value));
				myScenario.addPrimitive(p);
				return true;
			} catch (NumberFormatException e) {
				Shell s = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
				Status st = new Status(IStatus.ERROR, "Alvis", e.getMessage(), e);
				ErrorDialog.openError(s, "Input error", "The value you entered is not an integer", st);
				return false;
			}
		case 1: //bool
			boolean v;
			if (value.equals("true") || value.equals("t") || value.equals("1")) {
				v = true;
			} else if (value.equals("false") || value.equals("f") || value.equals("0")) {
				v = false;
			} else {
				Shell s = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
				Status st = new Status(IStatus.ERROR, "Alvis", value + "is not a valid boolean value");
				ErrorDialog.openError(s, "Input error", "The value you entered is not an integer", st);
				return false;
			}
			AlvisPrimitive p = new AlvisPrimitive(myScenario, name, v);
			myScenario.addPrimitive(p);
			return true;
		default:
			Shell s = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
			Status st = new Status(IStatus.ERROR, "Alvis", "Oooops");
			ErrorDialog.openError(s, "Input error", "Fuck...", st);
			return false;
		} 
	}

}
