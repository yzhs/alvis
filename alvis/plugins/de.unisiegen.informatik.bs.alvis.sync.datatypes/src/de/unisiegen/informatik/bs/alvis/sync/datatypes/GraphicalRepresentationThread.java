package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import org.eclipse.swt.graphics.Color;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

public interface GraphicalRepresentationThread extends GraphicalRepresentation {
	
	public final static Color HIGHLIGHT = new Color(null, 0x55, 0xFF, 0xFF);
	public final static Color SEMA = new Color(null, 0xFF, 0x00, 0x00);
	public final static Color BLOCKED = new Color(null, 0xFF, 0x7F, 0x00);
	public final static Color NORMAL = new Color(null, 0xFF, 0xFF, 0xFF);
	
	public void setLine(int newLine);
	public void setBlocked(boolean blocked, boolean bySemaphore);
	public boolean isBlocked();

}
