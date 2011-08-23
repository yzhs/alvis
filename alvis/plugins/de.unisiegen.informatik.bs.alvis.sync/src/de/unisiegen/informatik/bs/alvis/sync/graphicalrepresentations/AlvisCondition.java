package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationCondition;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCCondition;

/**
 * Graphical representation of a condition
 * @author Jan Bauerdick
 *
 */
public class AlvisCondition implements GraphicalRepresentationCondition {
	
	/**
	 * Condition's name
	 */
	private String name;
	
	/**
	 * Number of threads waiting for condition
	 */
	private int waiting;
	
	/**
	 * Label representing the condition
	 */
	private Label label;
	
	/**
	 * Contruct a new graphical representation
	 * @param parentComposite where to display graphical representation
	 * @param c Condition to display
	 */
	public AlvisCondition(Composite parent, PCCondition c) {
		name = c.getName();
		waiting = c.getWaiting();
		label = new Label(parent, SWT.LEFT);
		label.setText("Condition " + name + Messages.AlvisCondition_waiting + waiting);
		label.setBackground(FREE);
	}

	@Override
	/**
	 * Set a new state
	 * @param waiting Number of threads waiting for condition
	 */
	public void setState(final int waiting) {
		this.waiting = waiting;
		Display d = Display.getDefault();
		d.syncExec(new Runnable() {
			public void run() {
				if (waiting == 0) {
					label.setBackground(FREE);
				} else {
					label.setBackground(WAIT);
				}
				label.setText("Condition " + name + Messages.AlvisCondition_waiting + waiting);
			}
		});
	}

}
