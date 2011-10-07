package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

public interface GraphicalRepresentationThread extends GraphicalRepresentation {
	
	public void setBlocked(boolean newStatus);
	public boolean getBlocked();
	
	public String getName();

}
