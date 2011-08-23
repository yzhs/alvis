package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

public class PCBuffer extends PCObject {
	
	private int capacity;
	private ArrayList<Object> usage;
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public ArrayList<Object> getUsage() {
		return usage;
	}

	public void setUsage(ArrayList<Object> usage) {
		this.usage = usage;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		// TODO Auto-generated method stub
		return false;
	}

}
