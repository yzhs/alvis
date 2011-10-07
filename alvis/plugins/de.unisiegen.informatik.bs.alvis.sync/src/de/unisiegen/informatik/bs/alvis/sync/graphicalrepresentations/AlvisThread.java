package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationThread;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCThread;

/**
 * Graphical representation of an thread
 * 
 * @author Jan Bauerdick
 * 
 */
public class AlvisThread implements GraphicalRepresentationThread {

	private String name;
	private Label lName;
	private int currentLine;
	private boolean blocked;
	private PCThread thread;
	private Display d;
	private AlvisScenario myScenario;
	private final int id;
	private String method;
	
	public AlvisThread(AlvisScenario scenario, String name, String method, boolean status) {
		myScenario = scenario;
		d = scenario.getMyDisplay();
		id = scenario.getAdmin().requestId();
		this.name = name;
		this.method = method;
		blocked = status;
		lName = new Label(myScenario.getThreadsGroup(), SWT.NONE);
		lName.setText(name + " (" + method + "())");
		lName.setBackground(status ? AlvisColor.red.color() : AlvisColor.green.color());
	}
	
	public AlvisThread(AlvisScenario scenario, String name, String method, boolean status, int id) {
		myScenario = scenario;
		d = scenario.getMyDisplay();
		this.id = id;
		this.name = name;
		this.method = method;
		blocked = status;
		lName = new Label(myScenario.getThreadsGroup(), SWT.NONE);
		lName.setText(name + " (" + method + "())");
		lName.setBackground(status ? AlvisColor.red.color() : AlvisColor.green.color());
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getMethod() {
		return method;
	}
	
	public void setMethod(String method) {
		this.method = method;
	}

	public int getCurrentLine() {
		return currentLine;
	}

	public void setCurrentLine(int currentLine) {
		this.currentLine = currentLine;
	}

	public PCThread getThread() {
		return thread;
	}

	public void setThread(PCThread thread) {
		this.thread = thread;
	}

	public int getId() {
		return id;
	}
	
	public Label getlName() {
		return lName;
	}

	public void setlName(Label lName) {
		this.lName = lName;
	}

	public boolean equals(AlvisThread t) {
		if (t == null) {
			return false;
		} else {
			return (t.getId() == id);
		}
	}
	
	public String toString() {
		return name + " " + (blocked ? "" : "not ") + "blocked";
	}

	@Override
	public void setBlocked(final boolean newStatus) {
		this.blocked = newStatus;
		d.syncExec(new Runnable() {
			public void run() {
				lName.setBackground(newStatus ? AlvisColor.red.color() : AlvisColor.green.color());
			}
		});
	}

	@Override
	public boolean getBlocked() {
		return blocked;
	}

}
