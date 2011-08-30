package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationOutput;

public class AlvisOutput implements GraphicalRepresentationOutput {
	
	private Label output;
	private String current;
	
	public AlvisOutput(Composite parent) {
		output = new Label(parent, SWT.LEFT);
		current = "";
		output.setText(current);
	}

	@Override
	public void append(String s) {
		current += s;
		output.setText(current);
	}
	
	public String getOutput() {
		return current;
	}
	
	public void setOutput(String value) {
		current = value;
		append("");
	}

}
