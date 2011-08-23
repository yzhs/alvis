package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationSemaphore;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCSemaphore;

/**
 * Graphical Representation of a semaphore
 * @author Jan Bauerdick
 *
 */
public class AlvisSemaphore implements GraphicalRepresentationSemaphore {
	
	/**
	 * Semaphore's name
	 */
	private String name;
	
	/**
	 * Semaphore's counter
	 */
	private int count;
	
	/**
	 * Label to represent the semaphore
	 */
	private Label label;
	
	/**
	 * Construct a new representation of a semaphore
	 * @param parent Composite where to display graphical representation
	 * @param sema Semaphore to show
	 */
	public AlvisSemaphore(Composite parent, PCSemaphore sema) {
		name = sema.getName();
		count = sema.getCounter();
		label = new Label(parent, SWT.LEFT);
		if (count > 0) {
			label.setBackground(FREE);
		} else if (count == 0) {
			label.setBackground(ZERO);
		} else {
			label.setBackground(WAIT);
		}
		label.setText("Semaphore " + name + ": " + count);
	}

	@Override
	/**
	 * Set counter and new state of the semaphore
	 */
	public void setState(final int count) {
		this.count = count;
		Display d = Display.getDefault();
		d.syncExec(new Runnable() {
			public void run() {
				if (label.isDisposed()) return;
				if (count > 0) {
					label.setBackground(FREE);
				} else if (count == 0) {
					label.setBackground(ZERO);
				} else {
					label.setBackground(WAIT);
				}
				label.setText("Semaphore " + name + ": " + count);
			}
		});
	}

}
