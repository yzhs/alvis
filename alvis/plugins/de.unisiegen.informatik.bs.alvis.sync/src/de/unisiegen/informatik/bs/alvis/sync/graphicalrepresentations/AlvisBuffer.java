package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.SWT;
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
			usage[i] = new Label(myScenario.bufferGroup, SWT.NONE);
			usage[i].setBounds(8, 20 + i * 25, 180, 20);
			usage[i].setBackground(AlvisColor.green.color());
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
			usage[i] = new Label(myScenario.bufferGroup, SWT.NONE);
			usage[i].setBounds(8, 20 + i * 25, 180, 20);
			usage[i].setBackground(AlvisColor.green.color());
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
				usage[lastFilled++].setBackground(AlvisColor.orange.color());
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
				usage[--lastFilled].setBackground(AlvisColor.green.color());
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
	
	public Label[] getLabels() {
		return usage;
	}	

	public void remove() {
		for (int i = 0; i < usage.length; i++) {
			usage[i].dispose();
		}
	}

	@Override
	public int getUsage() {
		return lastFilled;
	}
}
