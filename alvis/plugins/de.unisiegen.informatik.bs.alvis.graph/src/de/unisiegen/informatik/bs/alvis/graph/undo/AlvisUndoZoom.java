package de.unisiegen.informatik.bs.alvis.graph.undo;

import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraph;

public class AlvisUndoZoom implements AlvisGraphUndo {

	private boolean dirty;
	private boolean wasZoomedIn;

	public AlvisUndoZoom(boolean wasDirty, boolean wasZoomedIn) {

		dirty = wasDirty;
		this.wasZoomedIn = wasZoomedIn;

	}

	@Override
	public void execute(AlvisGraph graph) {

		if (wasZoomedIn) {
			graph.zoomOut();
		} else {
			graph.zoomIn();
		}

	}

	@Override
	public AlvisGraphUndo invert() {
		AlvisGraphUndo invertion = new AlvisUndoZoom(dirty, !wasZoomedIn);
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
