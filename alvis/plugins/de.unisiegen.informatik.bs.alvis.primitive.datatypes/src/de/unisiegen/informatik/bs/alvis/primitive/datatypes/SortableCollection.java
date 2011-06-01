package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

/**
 * 
 * @author Dominik Dingel
 * 
 *         a Decision Point where the order of a Dataset is important
 * 
 */
public interface SortableCollection {

	/**
	 * shuffles the List to generated a complete random result
	 */
	public void shuffle();

	/**
	 * If already a decision was made, we will sort the Collection in question
	 * on this one
	 * 
	 * @param toSortFrom
	 */
	public void sortOn(SortableCollection toSortFrom);
	
	/**
	 * 
	 * @return the SortableCollection the VM will safe after a Decision was made
	 */
	public SortableCollection storeInformation();
	
}
