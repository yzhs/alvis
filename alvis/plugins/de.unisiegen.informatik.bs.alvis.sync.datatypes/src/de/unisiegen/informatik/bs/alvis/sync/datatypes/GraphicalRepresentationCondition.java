package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

public interface GraphicalRepresentationCondition extends
		GraphicalRepresentation {
	
	public void setState(int waiting);
	public int getState();
	
	public String getName();

}
