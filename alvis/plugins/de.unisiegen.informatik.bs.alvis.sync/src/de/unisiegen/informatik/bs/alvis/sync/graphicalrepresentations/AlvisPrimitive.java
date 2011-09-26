package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

public class AlvisPrimitive implements GraphicalRepresentation {
	
	private String name;
	private boolean type;
	private boolean boolValue;
	private int intValue;
	private final int id;
	private Label label;
	private Display d;
	
	public AlvisPrimitive(AlvisScenario scenario, String name, int value) {
		d = scenario.getMyDisplay();
		id = scenario.getAdmin().requestId();
		type = true;
		this.name = name;
		intValue = value;
		label = new Label(scenario.getPrimitivesGroup(), SWT.NONE);
		label.setText("int " + name + " = " + intValue); //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	public AlvisPrimitive(AlvisScenario scenario, String name, int value, int id) {
		d = scenario.getMyDisplay();
		this.id = id;
		type = true;
		this.name = name;
		intValue = value;
		label = new Label(scenario.getPrimitivesGroup(), SWT.NONE);
		label.setText("int " + name + " = " + intValue); //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	public AlvisPrimitive(AlvisScenario scenario, String name, boolean value) {
		d = scenario.getMyDisplay();
		id = scenario.getAdmin().requestId();
		type = false;
		this.name = name;
		boolValue = value;
		label = new Label(scenario.getPrimitivesGroup(), SWT.NONE);
		label.setText("boolean " + name + " = " + (value ? "true" : "false")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		
	}
	
	public AlvisPrimitive(AlvisScenario scenario, String name, boolean value, int id) {
		d = scenario.getMyDisplay();
		this.id = id;
		type = false;
		this.name = name;
		boolValue = value;
		label = new Label(scenario.getPrimitivesGroup(), SWT.NONE);
		label.setText("boolean " + name + " = " + (value ? "true" : "false")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		
	}
	
	public void update(final int i) {
		intValue = i;
		d.syncExec(new Runnable() {
			public void run() {
				label.setText("int " + name + " = " + intValue); //$NON-NLS-1$ //$NON-NLS-2$
			}
		});
	}
	
	public void update(final boolean b) {
		boolValue = b;
		d.syncExec(new Runnable() {
			public void run() {
				label.setText("boolean " + name + " = " + (boolValue ? "true" : "false")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			}
		});
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String value) {
		name = value;
	}
	
	public boolean getType() {
		return type;
	}
	
	public void setType(boolean value) {
		type = value;
	}
	
	public int getIntValue() {
		if (type) {
			return intValue;
		} else {
			return 0;
		}
	}
	
	public void setIntValue(int value) {
		if (type) {
			intValue = value;
		} else {
			intValue = 0;
		}
	}
	
	public boolean getBoolValue() {
		if (!type) {
			return boolValue;
		} else {
			return false;
		}
	}
	
	public void setBoolValue(boolean value) {
		if (!type) {
			boolValue = value;
		} else {
			boolValue = false;
		}
	}

	public int getId() {
		return id;
	}
	
	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public boolean equals(AlvisPrimitive p) {
		if (p == null) {
			return false;
		} else {
			return (p.getId() == id);
		}
	}
	
	public String toString() {
		return (type ? "int" : "bool") + " " + name + " = " + (type ? intValue : boolValue);
	}

}
