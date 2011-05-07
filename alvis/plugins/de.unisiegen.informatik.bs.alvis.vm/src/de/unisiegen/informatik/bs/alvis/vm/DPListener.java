package de.unisiegen.informatik.bs.alvis.vm;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.SortableCollection;

public interface DPListener {
	void onDecisionPoint(int DPNr, SortableCollection toSort);
}
