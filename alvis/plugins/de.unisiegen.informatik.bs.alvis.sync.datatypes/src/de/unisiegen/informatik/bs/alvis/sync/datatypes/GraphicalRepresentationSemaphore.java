package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

public interface GraphicalRepresentationSemaphore extends
		GraphicalRepresentation {
	
	public void setState(int count);
	
	public int getState();

}
