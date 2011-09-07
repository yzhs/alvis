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

import java.awt.Point;

import org.eclipse.swt.graphics.Font;

import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraph;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphConnection;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphNode;

/**
 * undoes removing a sub graph (nodes and connections)
 * 
 * @author Frank Weiler
 * 
 */
public class AlvisUndoRemoveSubGraph implements AlvisGraphUndo {

	private boolean dirty;

	private int[] nodeId, nodeX, nodeY, conWeight;
	private String[] nodeText;

	private int[] conId, conStyle, conNode1, conNode2;

	private int zoomCounter;

	public AlvisUndoRemoveSubGraph(boolean wasDirty, int[] nodeId, int[] nodeX,
			int[] nodeY, String[] nodeText, int[] conId, int[] conStyle,
			int[] conNode1, int[] conNode2, int[] conWeight) {

		dirty = wasDirty;

		this.nodeId = nodeId;
		this.nodeX = nodeX;
		this.nodeY = nodeY;
		this.nodeText = nodeText;

		this.conId = conId;
		this.conStyle = conStyle;
		this.conNode1 = conNode1;
		this.conNode2 = conNode2;
		this.conWeight = conWeight;

	}

	@Override
	public void execute(AlvisGraph graph) {

		this.zoomCounter = graph.getZoomCounter();

		int fontSize = 4 + (int) (6 * Math.pow(2, zoomCounter));
		int gcFontSize = Math.min(48, fontSize);
		Font gnFont = new Font(null, "gn", fontSize, 1);
		Font gcFont = new Font(null, "gc", gcFontSize, 1);

		for (int i = 0; i < nodeId.length; i++) {
			Point point = new Point(nodeX[i], nodeY[i]);

			AlvisGraphNode gn = new AlvisGraphNode(graph, nodeText[i], null,
					nodeId[i]);
			gn.setLocation(point.x, point.y);
			gn.setFont(gnFont);
			graph.getAdmin().addNode(gn, point);
		}

		for (int i = 0; i < conId.length; i++) {
			AlvisGraphNode node1 = graph.getAdmin().getNode(conNode1[i]);
			AlvisGraphNode node2 = graph.getAdmin().getNode(conNode2[i]);
			AlvisGraphConnection gc = new AlvisGraphConnection(graph,
					conStyle[i], node1, node2, conId[i], conWeight[i]);
			gc.setFont(gcFont);
			gc.setLineWidth((this.zoomCounter <= 0) ? 1 : (int) Math.pow(graph
					.getAdmin().getZoomFactor(), this.zoomCounter + 2));
			gc.setAlvisWeight(conWeight[i]);
			graph.getAdmin().addConnection(gc);
		}

	}

	@Override
	public AlvisGraphUndo invert() {
		AlvisGraphUndo invertion = new AlvisUndoAddSubGraph(dirty, nodeId,
				nodeX, nodeY, nodeText, conId, conStyle, conNode1, conNode2,
				conWeight);

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