package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationSemaphore;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCSemaphore;

/**
 * Graphical Representation of a semaphore
 * @author Jan Bauerdick
 *
 */
public class AlvisSemaphore implements GraphicalRepresentationSemaphore {
	
	private String name;
	private int count;
	private Label label;
	private PCSemaphore sema;
	
	private final int id;
	private Display d;
	
	public AlvisSemaphore(AlvisScenario scenario, String name, int counter) {
		d = scenario.getMyDisplay();
		id = scenario.getAdmin().requestId();
		this.name = name;
		sema = new PCSemaphore(name, new PCInteger(counter));
		label = new Label(scenario.getSemaphoresGroup(), SWT.NULL);
		sema.addGraphicalRepresentation(this);
		this.setState(counter);
		
	}
	
	public AlvisSemaphore(AlvisScenario scenario, String name, int counter, int id) {
		d = scenario.getMyDisplay();
		this.id = id;
		this.name = name;
		sema = new PCSemaphore(name, new PCInteger(counter));
		label = new Label(scenario.getSemaphoresGroup(), SWT.NULL);
		sema.addGraphicalRepresentation(this);
		this.setState(counter);
		
	}

	@Override
	/**
	 * Set counter and new state of the semaphore
	 */
	public void setState(final int count) {
		this.count = count;
		d.syncExec(new Runnable() {
			public void run() {
				if (label.isDisposed()) return;
//				if (count > 0) {
//					label.setBackground(FREE);
//				} else if (count == 0) {
//					label.setBackground(ZERO);
//				} else {
//					label.setBackground(WAIT);
//				}
				label.setText("Semaphore " + name + ": " + count); //$NON-NLS-1$ //$NON-NLS-2$
			}
		});
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int value) {
		count = value;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String value) {
		name = value;
	}
	
	public int getId() {
		return id;
	}

	public String toString() {
		return name + ": " + count;  //$NON-NLS-1$
	}
	
	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public boolean equals(AlvisSemaphore s) {
		if (s == null) {
			return false;
		} else {
			return (this.id == s.getId());
		}
	}

	@Override
	public int getState() {
		return count;
	}

}
