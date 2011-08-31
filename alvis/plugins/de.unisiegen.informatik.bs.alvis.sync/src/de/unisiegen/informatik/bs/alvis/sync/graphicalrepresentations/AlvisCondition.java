package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationCondition;

/**
 * Graphical representation of a condition
 * @author Jan Bauerdick
 *
 */
public class AlvisCondition implements GraphicalRepresentationCondition {
	
	private String name;
	private int waiting;
	private AlvisSemaphore sema;
	private String semaName;
	private Label label;
	private Display d;
	private final int id;

	public AlvisCondition(AlvisScenario scenario, String name) {
		d = scenario.getMyDisplay();
		id = scenario.getAdmin().requestId();
		this.name = name;
		sema = new AlvisSemaphore(scenario, name + "_sema", 1); //$NON-NLS-1$
		semaName = sema.getName();
		label = new Label(scenario.getConditionsScroll(), SWT.NONE);
		setState(0);
	}
	
	public AlvisCondition(AlvisScenario scenario, String name, int id) {
		d = scenario.getMyDisplay();
		this.id = id;
		this.name = name;
		sema = new AlvisSemaphore(scenario, name + "_sema", 1); //$NON-NLS-1$
		semaName = sema.getName();
		label = new Label(scenario.getConditionsScroll(), SWT.NONE);
		setState(0);
	}

	@Override
	/**
	 * Set a new state
	 * @param waiting Number of threads waiting for condition
	 */
	public void setState(final int waiting) {
		this.waiting = waiting;
		d.syncExec(new Runnable() {
			public void run() {
				if (waiting == 0) {
					label.setBackground(FREE);
				} else {
					label.setBackground(WAIT);
				}
				label.setText("Condition " + name + Messages.AlvisCondition_conditionWaiting + waiting); //$NON-NLS-1$
			}
		});
	}
	
	public int getWaiting() {
		return waiting;
	}
	
	public void setWaiting(int value) {
		waiting = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String value) {
		name = value;
	}

	public AlvisSemaphore getSema() {
		return sema;
	}

	public void setSema(AlvisSemaphore sema) {
		this.sema = sema;
	}

	public String getSemaName() {
		return semaName;
	}

	public void setSemaName(String semaName) {
		this.semaName = semaName;
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

	public boolean equals(AlvisCondition c) {
		if (c == null) {
			return false;
		} else {
			return (c.getId() == id);
		}
	}

}
