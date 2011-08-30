package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCBoolean;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

public class AlvisPrimitive implements GraphicalRepresentation {
	
	private String name;
	private boolean type;
	private boolean boolValue;
	private int intValue;
	private Label label;
	private Display d;
	
	public AlvisPrimitive(Composite parent, PCObject o) {
		d = parent.getDisplay();
		name = ""; //TODO: get primitive's name
		label = new Label(parent, SWT.NULL);
		if (o instanceof PCInteger) {
			type = true;
			intValue = ((PCInteger) o).getLiteralValue();
			label.setText(name + ": " + intValue);
		} else if (o instanceof PCBoolean) {
			type = false;
			boolValue = ((PCBoolean) o).getLiteralValue();
			label.setText(name + ": " + (boolValue ? "true" : "false"));
		}
	}
	
	public void update(final PCObject o) { 
		d.syncExec(new Runnable() {
			public void run() {
				if (o instanceof PCInteger) {
					intValue = ((PCInteger) o).getLiteralValue();
					label.setText(name + ": " + intValue);
				} else if (o instanceof PCBoolean) {
					boolValue = ((PCBoolean) o).getLiteralValue();
					label.setText(name + ": " + (boolValue ? "true" : "false"));
				}
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

}
