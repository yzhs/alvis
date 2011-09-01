package de.unisiegen.informatik.bs.alvis.sync.dialogs;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisCondition;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisScenario;

public class DeleteConditionDialog extends ApplicationWindow {
	
	private Text txt;

	public DeleteConditionDialog(Shell parentShell) {
		super(parentShell);
	}

	protected Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(null);

		final List list = new List(container, SWT.BORDER | SWT.MULTI);
		list.setBounds(249, 10, 185, 178);

		Color background = new Color(null, 0xD6, 0xD2, 0xD0);
		txt = new Text(container, SWT.BORDER | SWT.WRAP);
		txt.setText(Messages.DeleteConditionDialog_text);
		txt.setBackground(background);
		txt.setEditable(false);
		txt.setBounds(10, 10, 185, 120);

		for (AlvisCondition c : AlvisScenario.scenario.getConditionsList()) {
			list.add(c.toString());
		}

		Button btnCancel = new Button(container, SWT.NONE);
		btnCancel.setBounds(352, 232, 82, 26);
		btnCancel.setText(Messages.DeleteConditionDialog_cancel);
		btnCancel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				close();
			}
		});

		Button btnOk = new Button(container, SWT.NONE);
		btnOk.setBounds(249, 232, 82, 26);
		btnOk.setText(Messages.DeleteConditionDialog_ok);
		if (AlvisScenario.scenario.getConditionsList().isEmpty()) {
			btnOk.setEnabled(false);
		}
		btnOk.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				int[] selection = list.getSelectionIndices();
				for (int i = 0; i < selection.length; i++) {
					System.err
							.println("SIZE " //$NON-NLS-1$
									+ AlvisScenario.scenario
											.getConditionsList().size());
					System.err.println("SEL " + selection[i]); //$NON-NLS-1$
					AlvisCondition c = AlvisScenario.scenario
							.getConditionsList().get(selection[i]);
					AlvisScenario.scenario.removeCondition(c);
					close();
				}
			}
		});
		return null;

	}

}
