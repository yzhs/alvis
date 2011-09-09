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

import java.util.ArrayList;

import org.eclipse.zest.core.widgets.GraphConnection;

import de.unisiegen.informatik.bs.alvis.graph.datatypes.GraphicalRepresentationEdge;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.GraphicalRepresentationVertex;

/**
 * class, that creates the alvis graph connections
 * 
 * @author Frank Weiler
 */
public class AlvisGraphConnection extends GraphConnection implements
		GraphicalRepresentationEdge {

	private AlvisGraph graph;

	private AlvisGraphNode node1, node2;

	private int weight;
	private int connectionColor;
	private int style;
	/**
	 * identifier, used for equals method
	 */
	private final int id;

	/**
	 * 
	 * @param graph
	 *            the graph in which graph connection is shown
	 * @param style
	 *            the style
	 * @param node1
	 *            first node to connect
	 * @param node2
	 *            second node to connect
	 */
	public AlvisGraphConnection(AlvisGraph graph, int style,
			AlvisGraphNode node1, AlvisGraphNode node2) {
		this(graph, style, node1, node2, -1, -1);
	}

	/**
	 * 
	 * @param graph
	 *            the graph in which graph connection is shown
	 * @param style
	 *            the style
	 * @param node1
	 *            first node
	 * @param node2
	 *            second node
	 * @param id
	 *            the id
	 * @param conText
	 *            the connection text(e.g. weight)
	 * @param weight
	 *            the weight of the connection
	 */
	public AlvisGraphConnection(AlvisGraph graph, int style,
			AlvisGraphNode node1, AlvisGraphNode node2, int id, int weight) {

		super(graph, style, node1, node2);

		this.weight = weight;
		if (weight != -1) {
			setText("" + weight);
		}

		this.style = style;

		if (id == -1) {
			this.id = graph.requestConId();
		} else {
			this.id = id;
		}

		connectionColor = 0;

		this.graph = graph;

		this.node1 = node1;
		this.node2 = node2;

		node1.addConnection(this);
		node2.addConnection(this);
	}

	int getConnectionColor() {
		return connectionColor;
	}

	void setConnectionColor(int connectionColor) {
		this.connectionColor = connectionColor;
	}

	AlvisGraphNode getNextNode(AlvisGraphNode allButThis) {
		return (this.node1 == allButThis) ? node2 : node1;
	}

	public AlvisGraphNode getFirstNode() {
		return this.node1;
	}

	public AlvisGraphNode getSecondNode() {
		return this.node2;
	}

	AlvisGraphNode[] getNodes() {
		AlvisGraphNode[] result = new AlvisGraphNode[2];
		result[0] = this.node1;
		result[1] = this.node2;
		return result;
	}

	/**
	 * checks, if new connection between 2 given nodes already exists
	 * 
	 * @param node1
	 *            the first node to compare
	 * @param node2
	 *            the second node to compare
	 * @param connections
	 *            the set of connections in the graph
	 * @return if connection between given node already exists
	 */
	public static boolean wouldContain(AlvisGraphNode node1,
			AlvisGraphNode node2, ArrayList<AlvisGraphConnection> connections) {

		for (AlvisGraphConnection gc : connections) {
			if (node1.equals(gc.node1) && node2.equals(gc.node2)) {
				return true;
			}
			if (node1.equals(gc.node2) && node2.equals(gc.node1)) {
				return true;
			}
		}
		return false;
	}

	public boolean equals(AlvisGraphConnection other) {
		if (other == null)
			return false;
		return (this.id == other.id);
	}

	public int getGlobalColor() {
		return graph.getConnectionColor();
	}

	public void setGlobalColor(int color) {
		graph.setConnectionColor(color);
	}

	public int getId() {
		return id;
	}

	public AlvisGraph getGraph() {
		return graph;
	}

	@Override
	public String toString() {
		return node1.toString() + "<->" + node2.toString();
	}

	public int getAlvisWeight() {
		if (weight != -1) {
			setText("" + weight);
		}
		return weight;
	}

	/**
	 * sets weight of graph connection and writes weight on it (for user to see
	 * in alvis gui)
	 * 
	 * @param weight
	 *            the weight
	 */
	public void setAlvisWeight(int weight) {
		this.weight = weight;
		final int value = weight;
		this.getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				if (value != -1) {
					setText("" + value);
				} else {
					setText("");
				}
			}
		});

	}

	@Override
	public GraphicalRepresentationVertex getSourceVertex() {
		return getFirstNode();
	}

	@Override
	public GraphicalRepresentationVertex getDestinationVertex() {
		return getSecondNode();
	}

	@Override
	public int getStyle() {
		try {
			style = super.getStyle();
		} catch (Exception e) {
			// widget is disposed already, but style is needed to undelete the
			// connection (via redo)
		}
		return style;
	}

	@Override
	public int getWeight() {
		return getAlvisWeight();
	}

	@Override
	public void setWeight(int newValue) {
		setAlvisWeight(newValue);
	}

}
