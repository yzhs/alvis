package de.unisiegen.informatik.bs.alvis.graph.undo;

import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraph;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphConnection;

public class AlvisUndoRenameConnection implements AlvisGraphUndo {

	private boolean dirty;
	private int id;
	private int oldWeight;
	private int newWeight;

	public AlvisUndoRenameConnection(boolean wasDirty, int id, int oldWeight) {

		dirty = wasDirty;
		this.id = id;
		this.oldWeight = oldWeight;
		newWeight = 0;

	}

	@Override
	public void execute(AlvisGraph graph) {

		AlvisGraphConnection gc = graph.getAdmin().getConnection(id);
		newWeight = gc.getAlvisWeight();
		gc.setAlvisWeight(oldWeight);

	}

	@Override
	public AlvisGraphUndo invert() {

		return new AlvisUndoRenameConnection(dirty, id, newWeight);

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
