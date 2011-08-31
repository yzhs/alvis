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
		super(Messages.NewActorWizardPage_addActorWizardPageTitle);
		setTitle("Add an actor"); //$NON-NLS-1$
		setDescription(Messages.NewActorWizardPage_addActorWizardPageDescription);
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		lName = new Label(container, SWT.NULL);
		lName.setText(Messages.NewActorWizardPage_actorName);
		name = new Text(container, SWT.BORDER | SWT.SINGLE);
		setControl(container);
	}

	public String getName() {
		return name.getText();
	}

}
