package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 
 * @author Dominik Dingel
 * 
 */

public class PCQueue<T extends PCObject> extends PCObject {
	protected static final String TYPENAME = "Queue";
	private ArrayList<T> objects;

	/**
	 * create empty Queue
	 */
	public PCQueue() {
		objects = new ArrayList<T>();
	}

	/**
	 * 
	 * @param enqueue
	 *            obj
	 */
	public void enqueue(T obj) {
		objects.add(obj);
	}

	/**
	 * 
	 * @return first item from the queue
	 */
	public T dequeue() {
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
	public PCBoolean isEmpty() {
		return new PCBoolean(this.objects.isEmpty());
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
	
	@Override
	public String getTypeName() {
		String result = PCQueue.TYPENAME;
		result.concat("<");
		result.concat(PCObject.localNull.getTypeName());
		result.concat(">");
		return result;
	}
	
	@Override
	public List<String> getMethods() {
		String[] methods = { "enqueue", "dequeue", "isEmpty" };
		return Arrays.asList(methods);
	}
}
