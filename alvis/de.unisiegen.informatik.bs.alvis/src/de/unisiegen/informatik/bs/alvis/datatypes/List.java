package de.unisiegen.informatik.bs.alvis.datatypes;

import java.util.ArrayList;
import java.util.Iterator;

public class List<E> implements SortableCollection, Iterable<E>, Datatype {
	private ArrayList<E> items;

	public void setItems(ArrayList<E> items) {
		this.items = items;
	}

	public ArrayList<E> getItems() {
		return this.items;
	}

	public List() {
		items = new ArrayList<E>();
	}

	public E get(int index) {
		return items.get(index);
	}
	
	public boolean isEmtpy() {
		return items.isEmpty();
	}
	
	public int size() {
		return items.size();
	}
	
	public void add(E itemToAdd) {
		items.add(itemToAdd);
	}

	public Iterator<E> iterator() {
		ListIterator<E> it = new ListIterator<E>(this);
		return it;
	}	
	
	public void shuffle() {
	}

}
