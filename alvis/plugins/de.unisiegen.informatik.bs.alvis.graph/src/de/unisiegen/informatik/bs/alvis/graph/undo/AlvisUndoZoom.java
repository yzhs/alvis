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
