package de.unisiegen.informatik.bs.alvis.vm;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.SortableCollection;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

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
	@SuppressWarnings("rawtypes")
	void onDecisionPoint(int DPNr,PCObject from, SortableCollection toSort);
}
