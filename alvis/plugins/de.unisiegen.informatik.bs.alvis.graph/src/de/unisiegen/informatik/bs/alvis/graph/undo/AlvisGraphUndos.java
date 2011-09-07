/*
 * Copyright (c) 2011 Frank Weiler
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.unisiegen.informatik.bs.alvis.graph.undo;

import java.util.ArrayList;
import java.util.Stack;

import org.eclipse.swt.graphics.Point;

import de.unisiegen.informatik.bs.alvis.graph.editors.GraphEditor;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphConnection;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphNode;

/**
 * it's the container of what makes undo's possible (like the flux capacitor
 * makes time travel possible)
 * 
 * @author Frank Weiler
 * 
 */
public class AlvisGraphUndos {

	private Stack<AlvisGraphUndo> undos;
	private Stack<AlvisGraphUndo> redos;
	private GraphEditor editor;

	/**
	 * constructor
	 * 
	 * @param graph
	 *            the graph to work with
	 */
	public AlvisGraphUndos(GraphEditor editor) {

		this.editor = editor;
		undos = new Stack<AlvisGraphUndo>();
		redos = new Stack<AlvisGraphUndo>();

	}

	/**
	 * creates new AlvisUndoAddSubGraph and pushes it to undos, clears redos
	 * 
	 * @param wasDirty
	 *            if editor was dirty before this action
	 * @param gn
	 *            affected node
	 */
	public void pushAddNode(boolean wasDirty, AlvisGraphNode gn) {
		ArrayList<AlvisGraphNode> gns = new ArrayList<AlvisGraphNode>();
		gns.add(gn);
		pushAddSubGraph(wasDirty, gns, null);
	}

	/**
	 * creates new AlvisUndoRemoveSubGraph and pushes it to undos, clears redos
	 * 
	 * @param wasDirty
	 *            if editor was dirty before this action
	 * @param gn
	 *            affected node
	 */
	public void pushRemoveNode(boolean wasDirty, AlvisGraphNode gn) {
		ArrayList<AlvisGraphNode> gns = new ArrayList<AlvisGraphNode>();
		gns.add(gn);
		pushRemoveSubGraph(wasDirty, gns, null);
	}

	/**
	 * creates new AlvisUndoAddSubGraph and pushes it to undos, clears redos
	 * 
	 * @param wasDirty
	 *            if editor was dirty before this action
	 * @param gc
	 *            affected connection
	 */
	public void pushAddConnection(boolean wasDirty, AlvisGraphConnection gc) {
		ArrayList<AlvisGraphConnection> gcs = new ArrayList<AlvisGraphConnection>();
		gcs.add(gc);
		pushAddSubGraph(wasDirty, null, gcs);
	}

	/**
	 * creates new AlvisUndoRemoveSubGraph and pushes it to undos, clears redos
	 * 
	 * @param wasDirty
	 *            if editor was dirty before this action
	 * @param gc
	 *            affected connection
	 */
	public void pushRemoveConnection(boolean wasDirty, AlvisGraphConnection gc) {
		ArrayList<AlvisGraphConnection> gcs = new ArrayList<AlvisGraphConnection>();
		gcs.add(gc);
		pushRemoveSubGraph(wasDirty, null, gcs);
	}

	/**
	 * creates new AlvisUndoMoveNodes and pushes it to undos, clears redos
	 * 
	 * @param wasDirty
	 *            if editor was dirty before this action
	 * @param gn
	 *            affected node
	 */
	public void pushMoveNode(boolean wasDirty, AlvisGraphNode gn,
			Point oldPosition) {
		ArrayList<AlvisGraphNode> gns = new ArrayList<AlvisGraphNode>();
		gns.add(gn);
		pushMoveNodes(wasDirty, gns);
	}

	/**
	 * creates new AlvisUndoMoveNodes and doesn't push it to undos, returns it
	 * instead because the concerning node is not moved yet
	 * 
	 * @param wasDirty
	 *            if editor was dirty before this action
	 * @param gn
	 *            the affected node
	 * @return according undo for when and if the "move node" action takes place
	 */
	public AlvisUndoMoveNodes preparePushMoveNode(boolean wasDirty,
			AlvisGraphNode gn) {

		ArrayList<AlvisGraphNode> gns = new ArrayList<AlvisGraphNode>();
		gns.add(gn);

		return preparePushMoveNodes(wasDirty, gns);

	}

	/**
	 * creates new AlvisUndoMoveNodes and pushes it to undos, clears redos
	 * 
	 * @param wasDirty
	 *            if editor was dirty before this action
	 * @param gns
	 *            all affected nodes
	 */
	public void pushMoveNodes(boolean wasDirty, ArrayList<AlvisGraphNode> gns) {

		if (gns == null)
			gns = new ArrayList<AlvisGraphNode>();

		AlvisGraphUndo undo = new AlvisUndoMoveNodes(wasDirty, gns);
		undos.add(undo);
		clearRedos();

	}

	/**
	 * creates new AlvisUndoAddSubGraph and pushes it to undos, clears redos
	 * 
	 * @param wasDirty
	 *            if editor was dirty before this action
	 * @param gns
	 *            all affected nodes
	 * @param gcs
	 *            all affected connections
	 */
	public void pushAddSubGraph(boolean wasDirty,
			ArrayList<AlvisGraphNode> gns, ArrayList<AlvisGraphConnection> gcs) {

		if (gns == null)
			gns = new ArrayList<AlvisGraphNode>();
		if (gcs == null)
			gcs = new ArrayList<AlvisGraphConnection>();

		int[] nodeId = new int[gns.size()];
		int[] nodeX = new int[gns.size()];
		int[] nodeY = new int[gns.size()];
		String[] nodeText = new String[gns.size()];

		int[] conId = new int[gcs.size()];
		int[] conStyle = new int[gcs.size()];
		int[] conNode1 = new int[gcs.size()];
		int[] conNode2 = new int[gcs.size()];
		int[] conWeight = new int[gcs.size()];

		for (int i = 0; i < gns.size(); i++) {
			nodeId[i] = gns.get(i).getId();
			nodeX[i] = gns.get(i).getLocation().x;
			nodeY[i] = gns.get(i).getLocation().y;
			nodeText[i] = gns.get(i).getMyText();
		}

		for (int i = 0; i < gcs.size(); i++) {
			conId[i] = gcs.get(i).getId();
			conStyle[i] = gcs.get(i).getStyle();
			conNode1[i] = gcs.get(i).getFirstNode().getId();
			conNode2[i] = gcs.get(i).getSecondNode().getId();
			conWeight[i] = gcs.get(i).getAlvisWeight();
		}
		
		AlvisGraphUndo undo = new AlvisUndoAddSubGraph(wasDirty, nodeId,
				nodeX, nodeY, nodeText, conId, conStyle, conNode1, conNode2,
				conWeight);
		undos.add(undo);
		clearRedos();

	}

	/**
	 * creates new AlvisUndoRemoveSubGraph and pushes it to undos, clears redos
	 * 
	 * @param wasDirty
	 *            if editor was dirty before this action
	 * @param gns
	 *            all affected nodes
	 * @param gcs
	 *            all affected connections
	 */
	public void pushRemoveSubGraph(boolean wasDirty,
			ArrayList<AlvisGraphNode> gns, ArrayList<AlvisGraphConnection> gcs) {

		if (gns == null)
			gns = new ArrayList<AlvisGraphNode>();
		if (gcs == null)
			gcs = new ArrayList<AlvisGraphConnection>();

		int[] nodeId = new int[gns.size()];
		int[] nodeX = new int[gns.size()];
		int[] nodeY = new int[gns.size()];
		String[] nodeText = new String[gns.size()];

		int[] conId = new int[gcs.size()];
		int[] conStyle = new int[gcs.size()];
		int[] conNode1 = new int[gcs.size()];
		int[] conNode2 = new int[gcs.size()];
		int[] conWeight = new int[gcs.size()];

		for (int i = 0; i < gns.size(); i++) {
			nodeId[i] = gns.get(i).getId();
			nodeX[i] = gns.get(i).getLocation().x;
			nodeY[i] = gns.get(i).getLocation().y;
			nodeText[i] = gns.get(i).getMyText();
		}

		for (int i = 0; i < gcs.size(); i++) {
			conId[i] = gcs.get(i).getId();
			conStyle[i] = gcs.get(i).getStyle();
			conNode1[i] = gcs.get(i).getFirstNode().getId();
			conNode2[i] = gcs.get(i).getSecondNode().getId();
			conWeight[i] = gcs.get(i).getAlvisWeight();
		}

		AlvisGraphUndo undo = new AlvisUndoRemoveSubGraph(wasDirty, nodeId,
				nodeX, nodeY, nodeText, conId, conStyle, conNode1, conNode2,
				conWeight);
		undos.add(undo);
		clearRedos();

	}

	/**
	 * creates new AlvisUndoMoveNodes and pushes it to undos, clears redos
	 * 
	 * @param undo
	 *            the undo to push when nodes are finally getting moved, undo
	 *            was created by preparePushMoveNodes()
	 */
	public void pushMoveNodes(AlvisUndoMoveNodes undo) {

		if (undo == null)
			return;

		undos.add(undo);
		clearRedos();

	}

	/**
	 * creates new AlvisUndoMoveNodes and doesn't push it to undos, returns it
	 * instead because the concerning nodes are not moved yet
	 * 
	 * @param wasDirty
	 *            if editor was dirty before this action
	 * @param gns
	 *            all affected nodes
	 * @return according undo for when and if the "move nodes" action takes
	 *         place
	 */
	public AlvisUndoMoveNodes preparePushMoveNodes(boolean wasDirty,
			ArrayList<AlvisGraphNode> gns) {

		if (gns == null || gns.isEmpty())
			return null;

		AlvisUndoMoveNodes undo = new AlvisUndoMoveNodes(wasDirty, gns);
		return undo;

	}

	/**
	 * creates new AlvisUndoZoom and pushes it to undos, clears redos
	 * 
	 * @param wasDirty
	 *            if editor was dirty before this action
	 * @param zoomIn
	 *            true if graph got zoomed in, false otherwise
	 * @param mousePos
	 *            the mouse position, i.e. where to zoom in/out
	 */
	public void pushZoom(boolean wasDirty, boolean zoomIn, Point mousePos) {

		AlvisGraphUndo undo = new AlvisUndoZoom(wasDirty, zoomIn, mousePos);
		undos.add(undo);
		clearRedos();

	}

	/**
	 * creates new AlvisUndoRenameConnection and pushes it to undos, clears
	 * redos
	 * 
	 * @param wasDirty
	 *            if editor was dirty before this action
	 * @param gc
	 *            the graph connection which was renamed
	 */
	public void pushRenameConnection(boolean wasDirty, AlvisGraphConnection gc) {

		int id = gc.getId();
		int oldWeight = gc.getAlvisWeight();
		AlvisGraphUndo undo = new AlvisUndoRenameConnection(wasDirty, id,
				oldWeight);
		undos.add(undo);
		clearRedos();

	}

	/**
	 * undoes last action
	 */
	public void undo() {
		if (undos.isEmpty())
			return; // no undos available

		AlvisGraphUndo undo = undos.pop();
		undo.execute(editor.myGraph);
		redos.push(undo.invert());

		// editor.setDirty(undo.willBeDirty());//does not work like it should
		editor.setDirty(true);

	}

	/**
	 * redoes last undone action
	 */
	public void redo() {
		if (redos.isEmpty())
			return; // no redos available

		AlvisGraphUndo redo = redos.pop();
		redo.execute(editor.myGraph);
		undos.push(redo.invert());

		editor.setDirty(redo.willBeDirty());
	}

	/**
	 * clears all undos
	 */
	public void clearUndos() {
		undos.clear();
	}

	/**
	 * clears all redos
	 */
	public void clearRedos() {
		redos.clear();
	}

	/**
	 * sets actual head of undos as not dirty, every other entry as dirty
	 */
	public void setActualAsUndirty() {
		if (undos.isEmpty())
			return;

		for (AlvisGraphUndo undo : undos) {
			undo.setWillBeDirty(true);
		}
		for (AlvisGraphUndo undo : redos) {
			undo.setWillBeDirty(true);
		}
		undos.peek().setWillBeDirty(false);

	}

}
