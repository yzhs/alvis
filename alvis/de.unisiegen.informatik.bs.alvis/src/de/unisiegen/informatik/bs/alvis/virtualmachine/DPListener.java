package de.unisiegen.informatik.bs.alvis.virtualmachine;
import de.unisiegen.informatik.bs.alvis.datatypes.SortableCollection;

public interface DPListener {
	void onDecisionPoint(int DPNr, SortableCollection toSort);
}
