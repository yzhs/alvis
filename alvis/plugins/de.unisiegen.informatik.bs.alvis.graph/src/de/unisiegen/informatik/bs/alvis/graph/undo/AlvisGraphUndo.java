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
