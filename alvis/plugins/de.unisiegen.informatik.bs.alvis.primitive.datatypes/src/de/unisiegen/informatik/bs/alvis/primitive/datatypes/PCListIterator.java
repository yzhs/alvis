package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

import java.util.Iterator;

/**
 * 
 * @author Dominik Dingel
 *
 * @param <E> Typ used for stored Objects in the List
 */

public class PCListIterator<E> implements Iterator<E> {
	// reference to Object on which we are currently working
	private PCList<E> parent;
	// index pointer with in the list
	private int index;
	
	/**
	 * create Iterator from Parent, set index to -1
	 * @param parent
	 */
	public PCListIterator(PCList<E> parent) {
		this.parent = parent;
		this.index = -1;
	}
	
	/**
	 * is there a next item in our collection
	 */
	public boolean hasNext() {
		if(index < parent.size()-1) {
			return true;
		}
		return false;
	}
	
	/**
	 * we don't support removing a object from a list with a iterator!
	 */
	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * retrive next object, throws out of bound exception
	 */
	public E next() {
		index++;
		return parent.get(index);
	}
	
}
