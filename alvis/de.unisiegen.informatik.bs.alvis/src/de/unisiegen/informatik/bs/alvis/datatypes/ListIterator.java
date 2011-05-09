package de.unisiegen.informatik.bs.alvis.datatypes;

import java.util.Iterator;

public class ListIterator<E> implements Iterator<E> {
	private List<E> parent;
	private int index;
	
	public ListIterator(List<E> parent) {
		this.parent = parent;
		this.index = -1;
	}
	
	public boolean hasNext() {
		if(index < parent.size()-1) {
			return true;
		}
		return false;
	}
	
	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
	public E next() {
		index++;
		return parent.get(index);
	}
	
}
