package de.unisiegen.informatik.bs.alvis.vm;

import de.unisiegen.informatik.bs.alvis.primitives.SortableCollection;

public interface DPListener {
	void onDecisionPoint(int DPNr, SortableCollection toSort);
}
