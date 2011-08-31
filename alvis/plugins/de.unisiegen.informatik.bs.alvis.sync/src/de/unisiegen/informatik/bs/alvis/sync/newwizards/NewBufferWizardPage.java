package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NewBufferWizardPage extends WizardPage {

	private Text capacity;
	private Label lCapacity;
	private Composite container;

	public NewBufferWizardPage() {
		super(Messages.NewBufferWizardPage_newBufferWizardPageTitle);
		setTitle("Add a buffer"); //$NON-NLS-1$
		setDescription(Messages.NewBufferWizardPage_newBufferWizardPageDescription);
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		lCapacity = new Label(container, SWT.NULL);
		lCapacity.setText(Messages.NewBufferWizardPage_bufferPlaces);
		capacity = new Text(container, SWT.BORDER | SWT.SINGLE);
		setControl(container);
	}
	
	public String getCapacity() {
		return capacity.getText();
	}

}
