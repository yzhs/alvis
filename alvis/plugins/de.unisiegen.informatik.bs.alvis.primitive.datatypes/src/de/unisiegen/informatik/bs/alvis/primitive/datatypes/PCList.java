package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 * @author Dominik Dingel
 * 
 * @param <E>
 *            Type Parameter of the stored Es
 */
public class PCList<E> extends PCObject implements SortableCollection<E> {
	protected static final String TYPENAME = "List";
	private List<E> items;

	/**
	 * 
	 * @param items
	 */
	public void setItems(ArrayList<E> items) {
		this.items = items;
	}

	public List<E> getItems() {
		return this.items;
	}

	public PCList() {
		items = new ArrayList<E>();
	}

	public PCList(List<E> list) {
		items = list;
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
	public boolean add(E e) {
		return items.add(e);
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub

	}

	/**
	 * addAll only works with PCList
	 */
	@Override
	public boolean addAll(Collection<? extends E> c) {
		boolean result = true;
		for (E item : c) {
			result = result && items.add(item);
		}
		return result;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		items.clear();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return items.subList(fromIndex, toIndex);
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sortOn(SortableCollection toSortFrom) {
		// TODO Auto-generated method stub
	}

	@Override
	public void sort() { 
		@SuppressWarnings("unchecked")
		E tmp[] = (E[]) items.toArray();
		Arrays.sort(tmp);
		if (tmp != null) {
			items = new ArrayList<E>();
			for (int i = 0; i < tmp.length; i++) {
				items.add(tmp[i]);
			}
		}

	}

	@Override
	public SortableCollection storeInformation() {
		// TODO Auto-generated method stub
		return null;
	}
}
