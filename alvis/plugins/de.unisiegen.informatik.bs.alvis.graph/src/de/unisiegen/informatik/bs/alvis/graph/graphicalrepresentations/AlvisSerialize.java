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
package de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * class for serializing alvis graph details
 * 
 * @author Frank Weiler
 * 
 */
public class AlvisSerialize {

	private int[] nodeId, nodeX, nodeY;
	private String[] nodeText;
	private int startId, endId;
	private int globalId;
	private int zoomCounter;

	private int[] conId, conStyle, conNode1, conNode2, conColor;

	/**
	 * the constructor
	 * 
	 * @param remPos map of nodes 
	 * @param allConnections list of connections
	 * @param startNode start node of graph, null of none
	 * @param endNode  end node of graph, null of none
	 * @param globalId the id counter
	 * @param zoomCounter to remember how far graph is zoomed
	 */
	public AlvisSerialize(
			HashMap<AlvisGraphNode, Point> remPos,
			ArrayList<AlvisGraphConnection> allConnections,
			AlvisGraphNode startNode, 
			AlvisGraphNode endNode, 
			int globalId,
			int zoomCounter) {

		nodeId = new int[remPos.size()];
		nodeX = new int[remPos.size()];
		nodeY = new int[remPos.size()];
		nodeText = new String[remPos.size()];

		conId = new int[allConnections.size()];
		conStyle = new int[allConnections.size()];
		conNode1 = new int[allConnections.size()];
		conNode2 = new int[allConnections.size()];
		conColor = new int[allConnections.size()];

		int i = 0;
		for (AlvisGraphNode gn : remPos.keySet()) {
			nodeId[i] = gn.getId();
			nodeX[i] = gn.getLocation().x;
			nodeY[i] = gn.getLocation().y;
			nodeText[i] = gn.getMyText();
			i++;
		}

		i = 0;
		for (AlvisGraphConnection gc : allConnections) {
			conId[i] = gc.getId();
			conStyle[i] = gc.getStyle();
			conNode1[i] = gc.getFirstNode().getId();
			conNode2[i] = gc.getSecondNode().getId();
			conColor[i] = gc.getConnectionColor();
			i++;
		}

		if (startNode != null)
			startId = startNode.getId();
		if (endNode != null)
			endId = endNode.getId();

		this.globalId = globalId;
		this.zoomCounter = zoomCounter;

	}

	public int[] getNodeId() {
		return nodeId;
	}

	public int[] getNodeX() {
		return nodeX;
	}

	public int[] getNodeY() {
		return nodeY;
	}

	public String[] getNodeText() {
		return nodeText;
	}

	public int getStartId() {
		return startId;
	}

	public int getEndId() {
		return endId;
	}

	public int[] getConId() {
		return conId;
	}

	public int[] getConStyle() {
		return conStyle;
	}

	public int[] getConNode1() {
		return conNode1;
	}

	public int[] getConNode2() {
		return conNode2;
	}

	public int getGlobalId() {
		return globalId;
	}

	public int[] getConColor() {
		return conColor;
	}

	public int getZoomCounter() {
		return zoomCounter;
	}
}
