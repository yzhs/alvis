package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import org.eclipse.swt.graphics.Color;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;

public interface GraphicalRepresentationCondition extends
		GraphicalRepresentation {
	
	public final static Color WAIT = new Color(null, 0xFF, 0x7F, 0x00);
	public final static Color FREE = new Color(null, 0x00, 0xFF, 0x00);
	
	public void setState(PCInteger waiting);

}
