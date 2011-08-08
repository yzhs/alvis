package de.unisiegen.informatik.bs.alvis.graph.undo;

import java.util.ArrayList;

import org.eclipse.draw2d.Animation;
import org.eclipse.swt.graphics.Point;

import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraph;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphNode;

/**
 * undoes moving nodes
 * 
 * @author Frank Weiler
 * 
 */
public class AlvisUndoMoveNodes implements AlvisGraphUndo {

	private boolean dirty;
	private ArrayList<AlvisGraphNode> gns;
	private ArrayList<Point> oldPositions;

	public AlvisUndoMoveNodes(boolean wasDirty, ArrayList<AlvisGraphNode> gns) {

		dirty = wasDirty;
		this.gns = gns;
		this.oldPositions = new ArrayList<Point>();

		for (AlvisGraphNode gn : gns) {
			Point p = new Point(gn.getLocation().x, gn.getLocation().y);
			oldPositions.add(p);
		}

	}

	@Override
	public void execute(AlvisGraph graph) {

		Animation.markBegin();

		ArrayList<Point> redoPositions = new ArrayList<Point>();
		for (int i = 0; i < gns.size(); i++) {
			
			Point p = new Point(gns.get(i).getLocation().x, gns.get(i)
					.getLocation().y);
			redoPositions.add(p);
			
			gns.get(i)
					.setLocation(oldPositions.get(i).x, oldPositions.get(i).y);
			
		}
		oldPositions = redoPositions;

		Animation.run(500);

	}

	@Override
	public AlvisGraphUndo invert() {
		return this;
	}

	@Override
	public boolean willBeDirty() {
		return dirty;
	}

	@Override
	public void setWillBeDirty(boolean dirty) {
		this.dirty = dirty;
	}

}