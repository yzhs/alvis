package de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations;

import java.util.ArrayList;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.zest.core.widgets.GraphNode;

import de.unisiegen.informatik.bs.alvis.graph.datatypes.GraphicalRepresentationVertex;

/**
 * class, that creates the alvis graph nodes
 * 
 * @author Frank Weiler
 */
public class AlvisGraphNode extends GraphNode implements
		GraphicalRepresentationVertex {

	public static final String START = "start";
	public static final Color S_COLOR = AlvisColor.green.color();
	public static final String END = "end";
	public static final Color E_COLOR = new Color(null, 255, 0, 0);
	public static final Color DEFAULT_COLOR = AlvisColor.gray.color();
	public static final Color RENAME_COLOR = AlvisColor.white.color();

	private String myText;
	private int depth;
	private int connectionColor;
	private AlvisGraph graph;
	private ArrayList<AlvisGraphConnection> connections;
	/**
	 * identifier, used for equals method
	 */
	private final int id;

	/**
	 * constructor builds graph nodes
	 * 
	 * @param graphModel
	 *            the graph
	 * @param style
	 *            the style
	 * @param text
	 *            the text shown in the node
	 * @param image
	 *            the image shown in the node, NULL if no image
	 */
	public AlvisGraphNode(AlvisGraph graph, int style, String text, Image image) {
		this(graph, style, text, image, -1);
	}

	/**
	 * constructor builds graph nodes with given id, of id!=-1
	 * 
	 * @param graphModel
	 *            the graph
	 * @param style
	 *            the style
	 * @param text
	 *            the text shown in the node
	 * @param image
	 *            the image shown in the node, NULL if no image
	 * @param id
	 *            the id
	 */
	public AlvisGraphNode(AlvisGraph graph, int style, String text,
			Image image, int id) {

		super(graph, style, text, image, null);
		this.graph = graph;
		depth = 0;
		myText = text;
		connectionColor = 0;

		connections = new ArrayList<AlvisGraphConnection>();

		if (id == -1) {
			this.id = graph.requestId();
		} else {
			this.id = id;
		}

	}

	public void markAsStartNode() {
		setBackgroundColor(S_COLOR);
		setText(START);
		graph.setSelection(null);
	}

	public void markAsEndNode() {
		setBackgroundColor(E_COLOR);
		setText(END);
		graph.setSelection(null);
	}

	public void unmarkAsStartOrEndNode() {
		setBackgroundColor(DEFAULT_COLOR);
		setText(myText);
	}

	boolean addConnection(AlvisGraphConnection gc) {
		return this.connections.add(gc);
	}

	int getConnectionColor() {
		return connectionColor;
	}

	/**
	 * recursive function set connection color to this and all connected graph
	 * nodes
	 * 
	 * @param connectionColor
	 *            the connection color of the sub graph
	 * @param notOverWriteColor
	 *            the connection color not to overwrite to find new sub trees
	 *            and keep found circles intact ;
	 *            -1 if nothing to overwrite
	 * @param subGraph
	 *            the sub graph to fill
	 */
	void setConnectionColorRec(int connectionColor, int notOverWriteColor,
			ArrayList<AlvisGraphNode> subGraph) {
		if (this.connectionColor == connectionColor
				|| this.connectionColor == notOverWriteColor)
			return;
		this.connectionColor = connectionColor;
		subGraph.add(this);

		for (AlvisGraphConnection gc : this.connections) {
			if (gc.getConnectionColor() == connectionColor)
				continue; // already visited

			if (gc.getNextNode(this).getConnectionColor() == connectionColor) {// circle
				gc.setConnectionColor(connectionColor);
				if (!graph.getCircles().contains(subGraph)) {
					graph.addCircle(subGraph);
				}
			} else {
				gc.setConnectionColor(connectionColor);
				gc.getNextNode(this).setConnectionColorRec(connectionColor,
						notOverWriteColor, subGraph);// recursion
			}
		}
	}

	public void setConnectionColor(int connectionColor) {
		this.connectionColor = connectionColor;
	}

	/**
	 * sorts circle
	 * 
	 * @param circle
	 *            the circle to sort
	 * @return sorted circle
	 */
	public static ArrayList<AlvisGraphNode> sortCircle(
			ArrayList<AlvisGraphNode> circle) {

		if (circle.size() == 0)
			return circle;

		ArrayList<AlvisGraphNode> newCircle = new ArrayList<AlvisGraphNode>();
		AlvisGraphNode start = circle.get(0);
		newCircle.add(start);
		AlvisGraphNode gn = start;
		boolean firstRun = true;
		boolean changed = true;
		while (changed && (!gn.equals(start) || firstRun)) {
			firstRun = false;
			changed = false;
			for (AlvisGraphNode gni : circle) {
				if (!newCircle.contains(gni)) {
					for (AlvisGraphConnection gc : gni.getConnections()) {
						if (gc.getNextNode(gni).equals(gn)) {
							gn = gni;
							newCircle.add(gni);
							changed = true;
							break;
						}
					}
				}
			}
		}
		return newCircle;
	}

	/**
	 * returns amount of nodes in next level of tree
	 * 
	 * @param i
	 *            the number of levels to go down
	 * @param parent
	 *            the parent node
	 * @return amount of nodes in next level of tree
	 */
	public int getAmountOfNextLevel(int i, AlvisGraphNode parent) {
		int result = 0;

		if (i <= 0)
			return 1;

		for (AlvisGraphConnection gc : this.getConnections()) {
			AlvisGraphNode gn = gc.getNextNode(this);
			if (gn.equals(parent))
				continue;

			for (ArrayList<AlvisGraphNode> circle : graph.getCircles()) {
				if (circle.contains(this))
					return 1;// no extra breadth,circles get ordered
								// diffenrently
			}

			result += gn.getAmountOfNextLevel((i - 1), this);
		}

		return result;
	}

	public ArrayList<AlvisGraphConnection> getConnections() {
		return this.connections;
	}

	public void setConnections(ArrayList<AlvisGraphConnection> connections) {
		this.connections = connections;
	}

	public boolean equals(AlvisGraphNode other) {
		if (other == null)
			return false;
		return (this.id == other.id);
	}

	public String toString() {
		if (getText().isEmpty())
			return Integer.toString(getId());
		return getText();
	}

	public int getId() {
		return id;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getDepth() {
		return depth;
	}

	public String getMyText() {
		return myText;
	}

	public void setMyText(String myText) {
		this.myText= myText;
	}

	@Override
	public String getColorText() {
		return AlvisColor.getAlvisColor(getBackgroundColor());
	}

	@Override
	public void setColor(String color) {
		setBackgroundColor(AlvisColor.getAlvisColor(color).color());
	}

	@Override
	public String getLabel() {
		if (getText().equals("")){
			return Integer.toString(getId());
		}
		return getText();
	}

	@Override
	public void setLabel(String label) {
		setText(label);		
	}

}
