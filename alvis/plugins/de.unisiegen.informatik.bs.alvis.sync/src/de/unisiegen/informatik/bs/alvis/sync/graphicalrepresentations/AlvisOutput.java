package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

public class AlvisOutput implements GraphicalRepresentation {

	private AlvisScenario myScenario;
	private Label output;
	private String current;
	private Display myDisplay;
	private final int id;

	public AlvisOutput(AlvisScenario scenario, String output) {
		myScenario = scenario;
		myDisplay = myScenario.getMyDisplay();
		id = myScenario.getAdmin().requestId();
//		output = new Label(parent, SWT.LEFT);
//		current = "";
//		output.setText(current);
	}
	
	public AlvisOutput(AlvisScenario scenario, String output, int id) {
		myScenario = scenario;
		myDisplay = myScenario.getMyDisplay();
		this.id = id;
//		output = new Label(parent, SWT.LEFT);
//		current = "";
//		output.setText(current);
	}

	public void append(final String s) {
		myDisplay.syncExec(new Runnable() {
			public void run() {
				current += s;
				output.setText(current);
			}
		});

	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	public int getId() {
		return id;
	}

}
