/*
 * Copyright (c) 2011 Frank Weiler
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
package de.unisiegen.informatik.bs.alvis.graph.undo;

import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraph;

/**
 * it's what makes undo's possible (like the flux capacitor makes time travel
 * possible)
 * 
 * @author Frank Weiler
 * 
 */
public interface AlvisGraphUndo {

	/**
	 * executes undo operation
	 * 
	 * @param graph
	 *            the alvis graph to work on
	 */
	void execute(AlvisGraph graph);

	/**
	 * inverts undo action
	 * 
	 * @return invertion of undo action
	 */
	AlvisGraphUndo invert();

	/**
	 * returns true if graph will be dirty after undoing, false otherwise
	 * 
	 * @return true if graph will be dirty after undoing, false otherwise
	 */
	boolean willBeDirty();

	/**
	 * sets whether graph will be dirty when this undo is reached
	 */
	void setWillBeDirty(boolean dirty);

}
