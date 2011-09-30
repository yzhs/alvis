package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

public interface GraphicalRepresentationBuffer extends GraphicalRepresentation {

	public void setFull();

	public void setEmpty();
	
	public int getUsage();
}
