package de.unisiegen.informatik.bs.alvis.graph.undo;

import org.eclipse.swt.graphics.Point;

import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraph;

public class AlvisUndoZoom implements AlvisGraphUndo {

	private boolean dirty;
	private boolean wasZoomedIn;
	private Point mousePos;

	public AlvisUndoZoom(boolean wasDirty, boolean wasZoomedIn, Point mousePos) {

		dirty = wasDirty;
		this.wasZoomedIn = wasZoomedIn;
		this.mousePos = mousePos;

	}

	@Override
	public void execute(AlvisGraph graph) {
		int x = mousePos.x, y = mousePos.y;

		graph.zoom(x, y, !wasZoomedIn);

	}

	@Override
	public AlvisGraphUndo invert() {
		AlvisGraphUndo invertion = new AlvisUndoZoom(dirty, !wasZoomedIn,
				mousePos);
		return invertion;
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
