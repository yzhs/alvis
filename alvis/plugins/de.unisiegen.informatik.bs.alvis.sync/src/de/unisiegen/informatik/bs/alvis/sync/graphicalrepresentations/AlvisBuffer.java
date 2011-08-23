package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationBuffer;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCBuffer;

/**
 * Graphical representation of a buffer
 * @author Jan Bauerdick
 *
 */
public class AlvisBuffer implements GraphicalRepresentationBuffer {
	
	/**
	 * Buffer's capacity
	 */
	private int capacity;
	
	/**
	 * Array of labels, showing the buffer's places
	 */
	private Label[] usage;
	
	/**
	 * Last place of the buffer that was filled
	 */
	private int lastFilled;
	
	/**
	 * Contruct a new representation of a buffer
	 * @param parent Composite where to display graphical representation
	 * @param b Buffer to show
	 */
	public AlvisBuffer(Composite parent, PCBuffer b) {
		capacity = b.getCapacity();
		usage = new Label[capacity];
		for (int i = 0; i < capacity; i++) {
			usage[i] = new Label(parent, SWT.LEFT);
			usage[i].setBackground(EMPTY);
		}
		lastFilled = 0;
	}

	@Override
	/**
	 * Set next place full
	 */
	public void setFull() {
		Display d = Display.getDefault();
		d.syncExec(new Runnable() {
			public void run() {
				usage[lastFilled++].setBackground(FULL);
			}
		});
	}

	@Override
	/**
	 * Set last place empty 
	 */
	public void setEmpty() {
		Display d = Display.getDefault();
		d.syncExec(new Runnable() {
			public void run() {
				usage[--lastFilled].setBackground(EMPTY);
			}
		});
	}

}
