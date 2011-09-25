package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import java.util.Arrays;
import java.util.List;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

/**
 * Pseudo code implementation of a buffer
 * 
 * @author Jan Bauerdick
 * 
 */

public class PCBuffer extends PCObject {
	
	protected static final String TYPENAME = "Buffer";
	
	/**
	 * Capacity of the buffer & uses spaces
	 */
	private int capacity;
	private int used;
	
	public PCBuffer() {
		capacity = 0;
		used = 0;
	}
	
	public PCBuffer(int capacity) {
		this.capacity = capacity;
		used = 0;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getUsed() {
		return used;
	}

	public void setUsed(int used) {
		this.used = used;
	}
	
	public static String getTypename() {
		return TYPENAME;
	}
	
	/**
	 * Insert an item/use a free space
	 */
	public void insert() {
		if (used < (capacity - 1)) {
			used++;
		}
	}
	
	/**
	 * Remove an item/free a used space
	 */
	public void remove() {
		if (used > 0) {
			used--;
		}
	}

	@Override
	public String toString() {
		return TYPENAME + ": capacity=" + capacity + ", in use=" + used; 
	}

	public PCObject set(String memberName, PCObject value) {
		// TODO remove this method
		if (memberName.equals("capacity")) {
			capacity = ((PCInteger) value).getLiteralValue();
			return this;
		} else if (memberName.equals("used")) {
			used = ((PCInteger) value).getLiteralValue();
			return this;
		} else {
			return null;
		}
	}
	
	public PCObject get(String memberName) {
		// TODO remove this method
		if (memberName.equals("capacity")) {
			return new PCInteger(capacity);
		} else if (memberName.equals("used")) {
			return new PCInteger(used);
		} else {
			return null;
		}
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		if (toCheckAgainst instanceof PCBuffer) {
			PCBuffer b = (PCBuffer) toCheckAgainst;
			if (b.getCapacity() == getCapacity() && b.getUsed() == getUsed()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	@Override
	public List<String> getMethods() {
		String[] methods = { "insert", "remove" };
		return Arrays.asList(methods);
	}
	
	@Override
	public void updateGR(GraphicalRepresentation gr) {
		
	}

}
