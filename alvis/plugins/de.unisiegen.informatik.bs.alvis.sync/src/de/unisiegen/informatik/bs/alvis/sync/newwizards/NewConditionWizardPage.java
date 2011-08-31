package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;


public class NewConditionWizardPage extends WizardPage {

	private Text name;
	private Label lName;
	private Composite container;

	public NewConditionWizardPage() {
		super("Add a condition");
		setTitle("Add a condition");
		setDescription("This wizard adds a new condition to the scenario");
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		lName = new Label(container, SWT.NULL);
		lName.setText("Enter a name for the condition");
		name = new Text(container, SWT.BORDER | SWT.SINGLE);
		setControl(container);
	}

	public String getName() {
		return name.getText();
	}
}
