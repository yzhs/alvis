package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Dominik Dingel
 *
 * @param <E> Type Parameter of the stored objects
 */
public class PCList<E> extends PCObject implements SortableCollection, Iterable<E> {
	protected static final String TYPENAME = "List";
	private ArrayList<E> items;

	/**
	 * 
	 * @param items
	 */
	public void setItems(ArrayList<E> items) {
		this.items = items;
	}

	public ArrayList<E> getItems() {
		return this.items;
	}

	public PCList() {
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

	@Override
	public Iterator<E> iterator() {
		PCListIterator<E> it = new PCListIterator<E>(this);
		return it;
	}	
	
	@Override
	public void shuffle() {
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

	public static String getTypeName() {
		return PCList.TYPENAME;
	}

	@Override
	public void sortOn(SortableCollection toSortFrom) {
	}

	@Override
	public SortableCollection storeInformation() {
		return null;
	}

}
