package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCSemaphore;

public class NewSemaphoreWizardPage extends WizardPage {
	
	private Text name, counter;
	private Label Lname, Lcounter;
	private Button confirm, cancel;
	private Composite container;
	
	public NewSemaphoreWizardPage() {
		super("Add a semaphore");
		setTitle("Add a semaphore");
		setDescription("This wizard adds a new semaphore to the scenario");
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		Lname = new Label(container, SWT.NULL);
		Lname.setText("Enter a name for the semaphore");
		name = new Text(container, SWT.BORDER | SWT.SINGLE);
		confirm = new Button(container, SWT.PUSH);
		confirm.setText("Add semaphore");
		confirm.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				PCSemaphore s = new PCSemaphore(1, name.getText());
				System.out.println(s);
			}
		});
		cancel = new Button(container, SWT.PUSH);
		cancel.setText("Cancel");
		cancel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				System.err.println("cancel");
			}
		});
	}

}
