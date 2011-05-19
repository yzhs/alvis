package de.unisiegen.informatik.bs.alvis.vm;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.SortableCollection;

/**
 * 
 * @author Dominik Dingel
 *
 */
public interface DPListener {
	
	/**
	 * 
	 * @param DPNr to identify Decision Point
	 * @param toSort, on which SortableCollection should we act
	 */
	void onDecisionPoint(int DPNr, SortableCollection toSort);
}
