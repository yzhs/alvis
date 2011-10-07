package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

public interface GraphicalRepresentationPrimitive extends GraphicalRepresentation {
	
	public int getInt();
	public boolean getBool();
	public void setValue(int i);
	public void setValue(boolean b);
	
	public String getName();
}
