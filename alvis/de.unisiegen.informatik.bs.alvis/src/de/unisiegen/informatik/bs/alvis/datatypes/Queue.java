package de.unisiegen.informatik.bs.alvis.datatypes;
import java.util.ArrayList;

public class Queue implements Datatype {
	private ArrayList<Object> objects;

	public Queue() {
		objects = new ArrayList<Object>();
	}
	
	public void clear() {
		objects.clear();
	}

	public void enqueue(Object obj) {
		objects.add(obj);
	}

	public Object dequeue() {
		if (objects.isEmpty()) {
			return null;
		} else {
			return objects.remove(0);
		}
	}

	public boolean isEmpty() {
		return this.objects.isEmpty();
	}
}
