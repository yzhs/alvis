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
	public boolean equals(PCObject toCheckAgainst) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static String getTypeName() {
		String result = PCQueue.TYPENAME;
		result.concat("<");
		result.concat(PCObject.getTypeName());
		result.concat(">");
		return result;
	}
	
	@Override
	public List<String> getMethods() {
		String[] methods = { "enqueue", "dequeue", "isEmpty" };
		return Arrays.asList(methods);
	}
	
	public static boolean isGenericType() {
		return true;
	}
}
