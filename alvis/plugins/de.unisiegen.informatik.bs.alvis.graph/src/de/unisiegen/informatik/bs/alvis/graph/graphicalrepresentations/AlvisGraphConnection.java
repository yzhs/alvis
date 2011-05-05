package de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations;

import java.util.ArrayList;
import java.util.Set;

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

	private String myText;
	private int connectionColor;
	/**
	 * identifier, used for equals method
	 */
	private final int id;

	/**
	 * constructor finds circles and trees in graph and adds them to
	 * circles,trees from graph
	 * 
	 * @param graph
	 *            the graph
	 * @param style
	 *            the style
	 * @param node1
	 *            first node
	 * @param node2
	 *            second node
	 */
	public AlvisGraphConnection(AlvisGraph graph, int style,
			AlvisGraphNode node1, AlvisGraphNode node2) {
		this(graph, style, node1, node2, -1);
	}

	/**
	 * constructor finds circles and trees in graph and adds them to
	 * circles,trees from graph
	 * 
	 * @param graph
	 *            the graph
	 * @param style
	 *            the style
	 * @param node1
	 *            first node
	 * @param node2
	 *            second node
	 * @param id
	 *            the id
	 */
	public AlvisGraphConnection(AlvisGraph graph, int style,
			AlvisGraphNode node1, AlvisGraphNode node2, int id) {

		super(graph, style, node1, node2);

		setText("Test");// TODO just for testing

		if (id == -1) {
			this.id = graph.requestId();
		} else {
			this.id = id;
		}
		connectionColor = 0;
		myText = "";

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

	AlvisGraphNode getFirstNode() {
		return this.node1;
	}

	AlvisGraphNode getSecondNode() {
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

	public String getMyText() {
		return myText;
	}

	public void setMyText(String myText) {
		this.myText = myText;
	}

	@Override
	public GraphicalRepresentationVertex getSourceVertex() {
		return (GraphicalRepresentationVertex)getFirstNode();
	}

	@Override
	public GraphicalRepresentationVertex getDestinationVertex() {
		return (GraphicalRepresentationVertex)getSecondNode();
	}

}
