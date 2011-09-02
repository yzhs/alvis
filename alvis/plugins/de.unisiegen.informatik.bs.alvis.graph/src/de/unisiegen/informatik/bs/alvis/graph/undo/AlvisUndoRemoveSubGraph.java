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
import java.util.ArrayList;

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
	private ArrayList<AlvisGraphNode> renewNodes;
	private ArrayList<AlvisGraphConnection> renewCons;

	private int[] nodeId, nodeX, nodeY;
	private String[] nodeText, conText;

	private int[] conId, conStyle, conNode1, conNode2;

	private int zoomCounter;

	public AlvisUndoRemoveSubGraph(boolean wasDirty,
			ArrayList<AlvisGraphNode> gns, ArrayList<AlvisGraphConnection> gcs) {

		dirty = wasDirty;

		nodeId = new int[gns.size()];
		nodeX = new int[gns.size()];
		nodeY = new int[gns.size()];
		nodeText = new String[gns.size()];

		conId = new int[gcs.size()];
		conStyle = new int[gcs.size()];
		conNode1 = new int[gcs.size()];
		conNode2 = new int[gcs.size()];
		conText = new String[gcs.size()];

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
			conText[i] = gcs.get(i).getSecondNode().getText();
		}

	}

	@Override
	public void execute(AlvisGraph graph) {

		this.zoomCounter = graph.getZoomCounter();
		renewNodes = new ArrayList<AlvisGraphNode>();
		renewCons = new ArrayList<AlvisGraphConnection>();

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
			renewNodes.add(gn);
			graph.getAdmin().addNode(gn, point);
		}

		for (int i = 0; i < conId.length; i++) {
			AlvisGraphNode node1 = graph.getAdmin().getNode(conNode1[i]);
			AlvisGraphNode node2 = graph.getAdmin().getNode(conNode2[i]);
			AlvisGraphConnection gc = new AlvisGraphConnection(graph,
					conStyle[i], node1, node2, conId[i], conText[i]);
			gc.setFont(gcFont);
			gc.setLineWidth((this.zoomCounter <= 0) ? 1 : (int) Math.pow(graph
					.getAdmin().getZoomFactor(), this.zoomCounter + 2));
			renewCons.add(gc);
			graph.getAdmin().addConnection(gc);
		}

	}

	@Override
	public AlvisGraphUndo invert() {
		AlvisGraphUndo invertion= new AlvisUndoAddSubGraph(dirty, renewNodes, renewCons);
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