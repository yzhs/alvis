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
		setWindowTitle(Messages.NewPrimitiveWizard_createNewPrimitiveWizard);
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
				Status st = new Status(IStatus.ERROR, "Alvis", e.getMessage(), e); //$NON-NLS-1$
				ErrorDialog.openError(s, Messages.NewPrimitiveWizard_inputError, Messages.NewPrimitiveWizard_notInteger, st);
				return false;
			}
		case 1: //bool
			boolean v;
			if (value.equals("true") || value.equals("t") || value.equals("1")) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				v = true;
			} else if (value.equals("false") || value.equals("f") || value.equals("0")) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				v = false;
			} else {
				Shell s = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
				Status st = new Status(IStatus.ERROR, "Alvis", value + Messages.NewPrimitiveWizard_notBool1); //$NON-NLS-1$
				ErrorDialog.openError(s, "Input error", Messages.NewPrimitiveWizard_notBool2, st); //$NON-NLS-1$
				return false;
			}
			AlvisPrimitive p = new AlvisPrimitive(myScenario, name, v);
			myScenario.addPrimitive(p);
			return true;
		default:
			Shell s = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
			Status st = new Status(IStatus.ERROR, "Alvis", "Oooops"); //$NON-NLS-1$ //$NON-NLS-2$
			ErrorDialog.openError(s, "Input error", Messages.NewPrimitiveWizard_17, st); //$NON-NLS-1$
			return false;
		} 
	}

}
