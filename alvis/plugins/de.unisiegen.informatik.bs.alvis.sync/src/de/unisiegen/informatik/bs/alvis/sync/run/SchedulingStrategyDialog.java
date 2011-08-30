package de.unisiegen.informatik.bs.alvis.sync.run;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.widgets.Shell;

import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisScenario;

public class SchedulingStrategyDialog extends Dialog {
	
	private int strategy;
	private AlvisScenario scenario;
	private FieldEditorPreferencePage page;
	
	private String myInputFilePath;

	protected SchedulingStrategyDialog(Shell parentShell) {
		super(parentShell);
	}
	
	public SchedulingStrategyDialog(Shell parentShell, String myInputFilePath) {
		super(parentShell);
		this.myInputFilePath = myInputFilePath;
	}

}
