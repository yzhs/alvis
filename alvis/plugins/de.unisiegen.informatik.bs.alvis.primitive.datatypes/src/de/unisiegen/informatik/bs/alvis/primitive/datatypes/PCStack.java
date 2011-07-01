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

public class PCStack<T extends PCObject> extends PCObject {
	protected static final String TYPENAME = "Stack";
	private ArrayList<T> objects;

	/**
	 * create empty Queue
	 */
	public PCStack() {
		objects = new ArrayList<T>();
	}

	/**
	 * 
	 * @param obj
	 */
	public void push(T obj) {
		objects.add(obj);
	}

	/**
	 * 
	 * @return last item from the stack
	 */
	public T pop() {
		if (objects.isEmpty()) {
			return null;
		} else {
			return objects.remove(objects.size() -1);
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
		return result;
	}

	@Override
	public String getTypeName() {
		String result = PCStack.TYPENAME;
		result.concat("<");
		result.concat(PCObject.localNull.getTypeName());
		result.concat(">");
		return result;
	}
}
