package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NewPrimitiveWizardPage extends WizardPage {

	private Combo type;
	private Composite container;
	private Text name, value;
	private Label lName, lValue, lType;

	public NewPrimitiveWizardPage() {
		super(Messages.NewPrimitiveWizardPage_addPrimitiveWizardPageTitle);
		setTitle(Messages.NewPrimitiveWizardPage_addPrimitiveWizardPageTitle);
		setDescription(Messages.NewPrimitiveWizardPage_addPrimitiveWizardPageDescription);
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		lType = new Label(container, SWT.NULL);
		lType.setText(Messages.NewPrimitiveWizardPage_selectType);
		type = new Combo(container, SWT.READ_ONLY | SWT.DROP_DOWN);
		String[] typeValues = {"Integer", "Boolean"}; //$NON-NLS-1$ //$NON-NLS-2$
		
		type.setItems(typeValues);
		type.select(0);
		lName = new Label(container, SWT.NULL);
		lName.setText(Messages.NewPrimitiveWizardPage_primitiveName);
		name = new Text(container, SWT.BORDER | SWT.SINGLE);
		lValue = new Label(container, SWT.NULL);
		lValue.setText(Messages.NewPrimitiveWizardPage_primitiveValue);
		value = new Text(container, SWT.BORDER | SWT.SINGLE);
		setControl(container);
	}
	
	public String getName() {
		return name.getText();
	}
	
	public String getValue() {
		return value.getText();
	}
	
	public int getType() {
		return type.getSelectionIndex();
	}
	
}
