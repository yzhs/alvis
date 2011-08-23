package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

public interface GraphicalRepresentationScenario extends GraphicalRepresentation {
	
	public void addSemaphore(PCSemaphore s);
	
	public void hasBuffer();
	
	public void hasOutput();

}
