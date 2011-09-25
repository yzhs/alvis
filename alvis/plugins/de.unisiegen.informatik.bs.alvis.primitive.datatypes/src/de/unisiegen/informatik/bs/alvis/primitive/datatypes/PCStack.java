/*
 * Copyright (c) 2011 Dominik Dingel
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

import java.util.ArrayList;
import java.util.List;

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
	public void _push_(T obj) {
		objects.add(obj);
	}

	/**
	 * 
	 * @return last item from the stack
	 */
	public T _pop_() {
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
	public PCBoolean _isEmpty_() {
		return new PCBoolean(this.objects.isEmpty());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		if (null == toCheckAgainst)
			return false;
		if (this == localNull
				&& (toCheckAgainst == localNull || toCheckAgainst == PCObject.getNull()))
			return true;
		if (!(toCheckAgainst instanceof PCStack))
			return false;
		@SuppressWarnings("rawtypes")
		PCStack other = (PCStack) toCheckAgainst;
		return objects.equals(other.objects);
	}

	@Override
	public List<String> getMethods() {
		List<String> result = new ArrayList<String>();
		result.add("isEmpty");
		result.add("push");
		result.add("pop");
		return result;
	}

	public static String getTypeName() {
		String result = PCStack.TYPENAME;
		result.concat("<");
		result.concat(PCObject.getTypeName());
		result.concat(">");
		return result;
	}
	
	public static boolean isGenericType() {
		return true;
	}
}
