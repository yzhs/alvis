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

import java.util.List;

/**
 * 
 * @author Dominik Dingel
 * 
 *         a Decision Point where the order of a Dataset is important
 * 
 */
public interface SortableCollection<E> extends List<E> {

	/**
	 * will sort based on the comparator in E
	 */
	public void sort();
	
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
	public void sortOn(SortableCollection<E> toSortFrom);
	
	/**
	 * 
	 * @return the SortableCollection the VM will safe after a Decision was made
	 */
	public SortableCollection<E> storeInformation();
	
}
