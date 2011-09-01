package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
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
	private PCThread a;
	private Display d;
	private AlvisScenario myScenario;
	private final int id;
	
	public AlvisThread(AlvisScenario scenario, String name, boolean status) {
		myScenario = scenario;
		d = scenario.getMyDisplay();
		id = scenario.getAdmin().requestId();
		this.name = name;
		blocked = status;
		lName = new Label(myScenario.getThreadsScroll(), SWT.NONE);
		lName.setText(name);
		lName.setBackground(status ? BLOCKED : NORMAL);
	}
	
	public AlvisThread(AlvisScenario scenario, String name, boolean status, int id) {
		myScenario = scenario;
		d = scenario.getMyDisplay();
		this.id = id;
		this.name = name;
		blocked = status;
		lName = new Label(myScenario.getThreadsScroll(), SWT.NONE);
		lName.setText(name);
		lName.setBackground(status ? BLOCKED : NORMAL);
	}

	@Override
	/**
	 * Set a new line to highlight
	 * @param newLine line to highlight
	 */
	public void setLine(final int newLine) {
		if (currentLine != newLine) {
			
		}
	}

	@Override
	/**
	 * Set the thread as blocked or normal, enable/disable nextStep-button
	 * @param blocked True if thread is now blocked, false if not
	 * @param bySemaphore Color of blocking differs between semaphore or condition, true if blocked by semaphore, false if blocked by condition
	 */
	public void setBlocked(final boolean blocked, final boolean bySemaphore) {
		this.blocked = blocked;
		d.syncExec(new Runnable() {
			public void run() {
				Color c;
				if (blocked) {
					c = (bySemaphore ? SEMA : BLOCKED);
				} else {
					c = HIGHLIGHT;
				}
				lName.setBackground(c);
			}
		});
	}

	@Override
	/**
	 * Get thread's current status
	 * @return Thread's current status
	 */
	public boolean isBlocked() {
		return blocked;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentLine() {
		return currentLine;
	}

	public void setCurrentLine(int currentLine) {
		this.currentLine = currentLine;
	}

	public PCThread getA() {
		return a;
	}

	public void setA(PCThread a) {
		this.a = a;
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

	public boolean equals(AlvisThread a) {
		if (a == null) {
			return false;
		} else {
			return (a.getId() == id);
		}
	}

}
