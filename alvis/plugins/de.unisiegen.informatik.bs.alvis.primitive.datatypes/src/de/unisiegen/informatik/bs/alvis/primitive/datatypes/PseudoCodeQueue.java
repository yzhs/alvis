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

public class PseudoCodeQueue<T extends PseudoCodeObject> extends PseudoCodeObject {
	protected static final String TYPENAME = "Queue";
	private ArrayList<T> objects;

	/**
	 * create empty Queue
	 */
	public PseudoCodeQueue() {
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
	public PseudoCodeBoolean isEmpty() {
		return new PseudoCodeBoolean(this.objects.isEmpty());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PseudoCodeObject set(String memberName, PseudoCodeObject value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(PseudoCodeObject toCheckAgainst) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Map<List<String>, List<PseudoCodeObject>> getMethods() {
		Map<List<String>, List<PseudoCodeObject>> result = new HashMap<List<String>, List<PseudoCodeObject>>();
		
		ArrayList<String> namesEnq = new ArrayList<String>();
		namesEnq.add("enqueue");
		namesEnq.add("enqueue");
		ArrayList<PseudoCodeObject> dataEnq = new ArrayList<PseudoCodeObject>();
		dataEnq.add(PseudoCodeVoid.localNull);
		dataEnq.add(T.localNull);
		
		result.put(namesEnq, dataEnq);
		
		ArrayList<String> namesDeq = new ArrayList<String>();
		namesDeq.add("dequeue");
		namesDeq.add("dequeue");
		ArrayList<PseudoCodeObject> dataDeq = new ArrayList<PseudoCodeObject>();
		dataDeq.add(T.localNull);
		
		result.put(namesDeq, dataDeq);
		
		ArrayList<String> nameIsEmp = new ArrayList<String>();
		nameIsEmp.add("isEmpty");
		nameIsEmp.add("isEmpty");
		ArrayList<PseudoCodeObject> dataIsEmp = new ArrayList<PseudoCodeObject>();
		dataIsEmp.add(PseudoCodeBoolean.localNull);
		
		result.put(nameIsEmp, dataIsEmp);
		
		return result;
	}

	@Override
	public String getTypeName() {
		String result = PseudoCodeQueue.TYPENAME;
		result.concat("<");
		result.concat(T.localNull.getTypeName());
		result.concat(">");
		return result;
	}
}
