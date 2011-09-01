package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;


public class NewSemaphoreWizardPage extends WizardPage {

	private Text name, counter;
	private Label Lname, Lcounter;
	private Composite container;

	public NewSemaphoreWizardPage() {
		super(Messages.NewSemaphoreWizardPage_addSemaphorePageTitle);
		setTitle(Messages.NewSemaphoreWizardPage_addSemaphorePageTitle);
		setDescription(Messages.NewSemaphoreWizardPage_semaphoreWizardPageDescription);
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		Lname = new Label(container, SWT.NULL);
		Lname.setText(Messages.NewSemaphoreWizardPage_semaphoreName);
		name = new Text(container, SWT.BORDER | SWT.SINGLE);
		Lcounter = new Label(container, SWT.NULL);
		Lcounter.setText(Messages.NewSemaphoreWizardPage_semaphoreCounter);
		counter = new Text(container, SWT.BORDER | SWT.SINGLE);
		setControl(container);
	}

	public String getName() {
		return name.getText();
	}
	
	public String getCounter() {
		return counter.getText();
	}

}
