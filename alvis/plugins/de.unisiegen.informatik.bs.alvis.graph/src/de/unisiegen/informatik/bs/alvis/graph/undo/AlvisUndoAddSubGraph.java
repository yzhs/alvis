package de.unisiegen.informatik.bs.alvis.graph.undo;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraph;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphConnection;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphNode;

/**
 * undoes adding a sub graph (nodes and connections)
 * 
 * @author Frank Weiler
 * 
 */
public class AlvisUndoAddSubGraph implements AlvisGraphUndo {

	private boolean dirty;
	private ArrayList<AlvisGraphNode> gns;
	private ArrayList<AlvisGraphConnection> gcs;

	public AlvisUndoAddSubGraph(boolean wasDirty,
			ArrayList<AlvisGraphNode> gns, ArrayList<AlvisGraphConnection> gcs) {

		dirty = wasDirty;
		this.gns = gns;
		this.gcs = gcs;

	}

	@Override
	public void execute(AlvisGraph graph) {

		graph.removeConnectionsAndNodes(gcs, gns);

	}

	@Override
	public AlvisGraphUndo invert() {
		AlvisGraphUndo invertion = new AlvisUndoRemoveSubGraph(dirty, gns, gcs);
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
