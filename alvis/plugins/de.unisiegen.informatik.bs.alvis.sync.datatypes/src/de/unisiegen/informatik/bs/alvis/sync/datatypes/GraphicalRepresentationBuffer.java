package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import org.eclipse.swt.graphics.Color;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

public interface GraphicalRepresentationBuffer extends GraphicalRepresentation {
	
	public final static Color FULL = new Color(null, 0x00, 0x7F, 0xFF);
	public final static Color EMPTY = new Color(null, 0x44, 0x44, 0x44);

	public void setFull();

	public void setEmpty();
}
