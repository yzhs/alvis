package de.unisiegen.informatik.bs.alvis.primitives;

import java.util.ArrayList;


/**
 * 
 * @author Dominik Dingel
 * 
 */

public class PseudoCodeQueue extends Datatype {
	private ArrayList<Object> objects;

	/**
	 * create empty Queue
	 */
	public PseudoCodeQueue() {
		objects = new ArrayList<Object>();
	}

	/**
	 * 
	 * @param enqueue
	 *            obj
	 */
	public void enqueue(Object obj) {
		objects.add(obj);
	}

	/**
	 * 
	 * @return first item from the queue
	 */
	public Object dequeue() {
		if (objects.isEmpty()) {
			return null;
		} else {
			return objects.remove(0);
		}
	}

	/**
	 * 
	 * @return boolean value if is empty
	 */
	public boolean isEmpty() {
		return this.objects.isEmpty();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Datatype set(String memberName, Datatype value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Datatype toCheckAgainst) {
		// TODO Auto-generated method stub
		return false;
	}
}
