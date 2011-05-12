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

	int[] nodeId, nodeX, nodeY;
	String[] nodeText;
	int startId, endId;
	int globalId;
	int zoomCounter;

	int[] conId, conStyle, conNode1, conNode2, conColor;

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
	public AlvisSerialize(HashMap<AlvisGraphNode, Point> remPos,
			ArrayList<AlvisGraphConnection> allConnections,
			AlvisGraphNode startNode, AlvisGraphNode endNode, int globalId,
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
}
