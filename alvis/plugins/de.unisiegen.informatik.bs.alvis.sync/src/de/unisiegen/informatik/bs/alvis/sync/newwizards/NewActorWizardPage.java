package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NewActorWizardPage extends WizardPage {

	private Text name;
	private Label lName;
	private Composite container;

	public NewActorWizardPage() {
		super("Add an actor");
		setTitle("Add an actor");
		setDescription("This wizard adds an new actor to the scenario");
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		lName = new Label(container, SWT.NULL);
		lName.setText("Enter a name for the actor");
		name = new Text(container, SWT.BORDER | SWT.SINGLE);
		setControl(container);
	}

	public String getName() {
		return name.getText();
	}

}
