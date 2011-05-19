package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
	public Map<List<String>, List<PCObject>> getMethods() {
		Map<List<String>, List<PCObject>> result = new HashMap<List<String>, List<PCObject>>();
		
		ArrayList<String> namesEnq = new ArrayList<String>();
		namesEnq.add("enqueue");
		namesEnq.add("enqueue");
		ArrayList<PCObject> dataEnq = new ArrayList<PCObject>();
		dataEnq.add(PCVoid.localNull);
		dataEnq.add(T.localNull);
		
		result.put(namesEnq, dataEnq);
		
		ArrayList<String> namesDeq = new ArrayList<String>();
		namesDeq.add("dequeue");
		namesDeq.add("dequeue");
		ArrayList<PCObject> dataDeq = new ArrayList<PCObject>();
		dataDeq.add(T.localNull);
		
		result.put(namesDeq, dataDeq);
		
		ArrayList<String> nameIsEmp = new ArrayList<String>();
		nameIsEmp.add("isEmpty");
		nameIsEmp.add("isEmpty");
		ArrayList<PCObject> dataIsEmp = new ArrayList<PCObject>();
		dataIsEmp.add(PCBoolean.localNull);
		
		result.put(nameIsEmp, dataIsEmp);
		
		return result;
	}

	@Override
	public String getTypeName() {
		String result = PCQueue.TYPENAME;
		result.concat("<");
		result.concat(T.localNull.getTypeName());
		result.concat(">");
		return result;
	}
}
