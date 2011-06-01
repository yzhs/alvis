package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import org.eclipse.swt.graphics.Color;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

public interface GraphicalRepresentationSemaphore extends
		GraphicalRepresentation {
	
	public final static Color WAIT = new Color(null, 0xFF, 0x00, 0x00);
	public final static Color ZERO = new Color(null, 0xFF, 0xFF, 0x00);
	public final static Color FREE = new Color(null, 0x00, 0xFF, 0x00);
	
	public void setState(int count);

}
