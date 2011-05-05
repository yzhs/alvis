package de.unisiegen.informatik.bs.alvis.primitives;

import java.util.ArrayList;
import java.util.Iterator;

public class PseudoCodeList<E> extends Datatype implements SortableCollection, Iterable<E> {
	private ArrayList<E> items;

	public void setItems(ArrayList<E> items) {
		this.items = items;
	}

	public ArrayList<E> getItems() {
		return this.items;
	}

	public PseudoCodeList() {
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
		PseudoCodeListIterator<E> it = new PseudoCodeListIterator<E>(this);
		return it;
	}	
	
	public void shuffle() {
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Datatype set(String memberName, Datatype value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Datatype toCheckAgainst) {
		// TODO Auto-generated method stub
		return false;
	}

}
