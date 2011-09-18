package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationBuffer;

/**
 * Graphical representation of a buffer
 * @author Jan Bauerdick
 *
 */
public class AlvisBuffer implements GraphicalRepresentationBuffer {
	
	private AlvisScenario myScenario;
	private int capacity;
	private Label[] usage;
	private int lastFilled;
	private Display d;
	private final int id;

	public AlvisBuffer(AlvisScenario scenario, int capacity) {
		myScenario = scenario;
		d = scenario.getMyDisplay();
		id = scenario.getAdmin().requestId();
		this.capacity = capacity;
		usage = new Label[capacity];
		for (int i = 0; i < capacity; i++) {
//			usage[i] = new Label(scenario, SWT.NONE);
//			usage[i].setBackground(EMPTY);
		}
		lastFilled = 0;
	}
	
	public AlvisBuffer(AlvisScenario scenario, int capacity, int id) {
		myScenario = scenario;
		d = scenario.getMyDisplay();
		this.id = id;
		this.capacity = capacity;
		usage = new Label[capacity];
		for (int i = 0; i < capacity; i++) {
//			usage[i] = new Label(scenario, SWT.NONE);
//			usage[i].setBackground(EMPTY);
		}
		lastFilled = 0;
	}
	
	@Override
	/**
	 * Set next place full
	 */
	public void setFull() {
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
		d.syncExec(new Runnable() {
			public void run() {
				usage[--lastFilled].setBackground(EMPTY);
			}
		});
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int value) {
		capacity = value;
	}
	
	public int getLastFilled() {
		return lastFilled;
	}
	
	public void setLastFilled(int value) {
		lastFilled = 0;
		for (int i = 0; i < value; i++) {
			setFull();
		}
	}

	public int getId() {
		return id;
	}
	
	public boolean equals(AlvisBuffer b) {
		if (b == null) {
			return false;
		} else {
			return (b.getId() == id);
		}
	}

}
