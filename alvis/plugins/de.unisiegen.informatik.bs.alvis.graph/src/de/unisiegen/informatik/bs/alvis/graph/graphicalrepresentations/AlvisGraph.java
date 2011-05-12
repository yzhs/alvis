package de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Set;

import org.eclipse.draw2d.Animation;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.ZestStyles;

import de.unisiegen.informatik.bs.alvis.graph.datatypes.GraphicalRepresentationEdge;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.GraphicalRepresentationGraph;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.GraphicalRepresentationVertex;

/**
 * class, that creates the alvis graph
 * 
 * @author Frank Weiler
 */
public class AlvisGraph extends Graph implements GraphicalRepresentationGraph {

	AlvisSave admin;

	private double middleX, middleY, radiusX, radiusY, angle;
	private int middleFactor, widthPerGraph, heightPerLevel, midWidth;
	private int[] levelWidth, levelPos;
	private int tagNo;
	private double zoomFactor;

	/**
	 * the Constructor
	 * 
	 * @param parent
	 *            the parent composite
	 * @param style
	 *            the style
	 */
	public AlvisGraph(Composite parent, int style) {
		super(parent, style);
		setLayoutAlgorithm(null, false);

		admin = new AlvisSave();
		middleFactor = 0;
		tagNo = 0;
		zoomFactor = 1.4;
	}

	/**
	 * creates and saves new alvis graph node in allNodes
	 * 
	 * @param style
	 *            the style...something
	 * @param name
	 *            the tag of the node
	 * @return new alvis graph node
	 */
	public AlvisGraphNode makeGraphNode(String name) {

		// Image image;
		if (name.equals(""))
			name = "" + getAdmin().getId();
		// try { // to make an image
		// image = GraphEditor.makeGraphImage(name);
		// TODO no image anymore just bigger text
		// } catch (IOException e1) { // if it did not work...
		// image = null;
		// }

		final AlvisGraphNode gn = new AlvisGraphNode(this, name, null);
		int fontSize = 4 + (int) (6 * Math.pow(2, getZoomCounter()));
		Font font = new Font(getFont().getDevice(), "gn", fontSize, 1);
		gn.setFont(font);

		if (getZoomCounter() < 0) {
			gn.setLocation(
					gn.getLocation().preciseX()
							* (1.0 + (1.0 / Math.abs(getZoomCounter()))),
					gn.getLocation().preciseY()
							* (1.0 + (1.0 / Math.abs(getZoomCounter()))));
		} else if (getZoomCounter() > 0) {
			gn.setLocation(gn.getLocation().preciseX()
					/ (1.0 + (1.0 / getZoomCounter())), gn.getLocation()
					.preciseY() / (1.0 + (1.0 / getZoomCounter())));
		}

		admin.addNode(gn, new Point(gn.getLocation().x, gn.getLocation().y));

		return gn;
	}

	/**
	 * creates and saves new alvis graph connection in allConnections
	 * 
	 * @param connectionLayout
	 *            the connection layout
	 * @param node1
	 *            the source node
	 * @param node2
	 *            the drain node
	 * @return new alvis graph connection
	 */
	public AlvisGraphConnection makeGraphConnection(int connectionLayout,
			AlvisGraphNode node1, AlvisGraphNode node2) {

		if (node1.equals(node2)) {
			// no self connection
			return null;
		}
		if (AlvisGraphConnection.wouldContain(node1, node2,
				admin.getAllConnections())) {
			// no double connections
			return null;
		} else {
			AlvisGraphConnection result = new AlvisGraphConnection(this,
					connectionLayout, node1, node2);
			admin.addConnection(result);
			return result;
		}
	}

	/**
	 * places nodes
	 */
	public void placeNodes() {
		middleFactor = 0;

		findSubGraphs();

		int aOfG = Math.max(1, getAmountOfGraphs());
		widthPerGraph = this.getSize().x / aOfG;

		Animation.markBegin();

		placeCircles();
		placeTrees();
		placeSingles();

		Animation.run(500);
	}

	/**
	 * finds sub graphs in this graph and saves them in admin.trees and .circles
	 */
	private void findSubGraphs() {

		resetSubGraphs();

		ArrayList<AlvisGraphNode> subGraph, subSubGraph;

		for (AlvisGraphConnection gc : getAllConnections()) {
			if (gc.getConnectionColor() != 0) {
				continue; // already visited by recursion: setConnectionColorRec
			}

			subGraph = new ArrayList<AlvisGraphNode>();

			int connectionColor = getConnectionColor();
			setConnectionColor(connectionColor + 1);
			int newColor;

			gc.getFirstNode().setConnectionColorRec(connectionColor, -1,
					subGraph);

			if (getCircles().contains(subGraph)) { // circle: cut it and sort it

				newColor = getConnectionColor();
				setConnectionColor(newColor + 1);
				boolean changed = true;
				while (changed) {
					changed = false;
					int count;
					for (AlvisGraphNode gn : subGraph) {

						if (gn.getConnectionColor() == newColor) {
							continue;
						}

						count = 0;
						if (gn == gc.getFirstNode() || gn == gc.getSecondNode()) {
							count = 2;
						} else {
							for (AlvisGraphConnection gci : gn.getConnections()) {
								if (gci.getConnectionColor() == gc
										.getConnectionColor()) {
									count++;
								}
							}
						}
						if (count < 2) {
							subGraph.remove(gn);
							gn.setConnectionColor(newColor);
							for (AlvisGraphConnection gci : gn.getConnections()) {
								gci.setConnectionColor(newColor);
							}
							changed = true;
							break;
						}

					}
				}
				subGraph = AlvisGraphNode.sortCircle(subGraph);

				for (AlvisGraphNode gn : getAllNodes()) {
					if (gn.getConnectionColor() != newColor)
						continue;
					int newTreeColor = getConnectionColor();
					setConnectionColor(newTreeColor + 1);
					subSubGraph = new ArrayList<AlvisGraphNode>();
					gn.setConnectionColorRec(newTreeColor, connectionColor,
							subSubGraph);
					if (subSubGraph.size() > 1) {
						addTree(subSubGraph);
					} else {
						gn.setConnectionColor(0);
					}
				}

			} else { // tree

				addTree(subGraph);

			}
		}
	}

	private void resetSubGraphs() {
		admin.resetSubGraphs();
	}

	/**
	 * places single nodes in graph
	 */
	private void placeSingles() {

		int size = getSingles().size();
		if (size == 0)
			return;

		int cols = (int) Math.round(Math.sqrt(size));

		int rPN = widthPerGraph / cols;
		int myX, myY;
		for (int i = 0; i < size; i++) {
			myX = middleFactor * widthPerGraph + (i % cols) * rPN + 5;
			myY = (i / cols) * 70 + 5;
			getSingles().get(i).setLocation(myX, myY);
		}

		middleFactor++;
	}

	/**
	 * places circles in graph
	 */
	private void placeCircles() {

		radiusX = Math.min(this.getSize().x / 2.0, this.getSize().y / 2.0)
				* getLimiter() / getAmountOfGraphs();
		radiusY = Math.min(this.getSize().x / 2.0, this.getSize().y / 2.0)
				* getLimiter();
		for (ArrayList<AlvisGraphNode> gns : getCircles()) {

			middleFactor++;
			middleX = middleFactor
					* ((double) this.getSize().x / (getAmountOfGraphs() + 1));
			middleY = (double) this.getSize().y / (2.0);

			if (gns.size() != 0) {
				angle = 1.0 / gns.size();
			} else {
				angle = 0.0;
			}

			int xn, yn;

			for (int i = 0; i < gns.size(); i++) {
				xn = (int) (middleX + radiusX
						* Math.cos(i * angle * 2 * Math.PI) - gns.get(i)
						.getSize().width);
				yn = (int) (middleY + radiusY
						* Math.sin(i * angle * 2 * Math.PI) - gns.get(i)
						.getSize().height);
				gns.get(i).setLocation(xn, yn);
			}
		}
	}

	/**
	 * places trees in graph
	 */
	private void placeTrees() {

		int treeDepth;

		for (ArrayList<AlvisGraphNode> tree : getTrees()) {

			middleFactor++;
			if (tree.size() == 2) {
				int x = (middleFactor - 1) * widthPerGraph + widthPerGraph / 2;
				tree.get(0).setLocation(x, 10);
				tree.get(1).setLocation(x, this.getSize().y / 2 + 10);
				continue;
			}
			AlvisGraphNode root = getRoot(tree);
			if (root == null)
				continue;

			treeDepth = root.getDepth() + 1;
			heightPerLevel = this.getSize().y / treeDepth;
			levelWidth = new int[treeDepth];
			levelPos = new int[treeDepth];
			midWidth = (middleFactor - 1) * widthPerGraph;
			for (int i = 0; i < treeDepth; i++) {
				levelWidth[i] = root.getAmountOfNextLevel(i, null);
				levelPos[i] = 1;
			}
			placeTreeNodes(0, root, null);
		}
	}

	/**
	 * places nodes from aa tree
	 * 
	 * @param depth
	 *            the current depth, i.e. how deep node is according to root of
	 *            tree
	 * @param node
	 *            the node to place
	 * @param parent
	 *            the parent node
	 */
	private void placeTreeNodes(int depth, AlvisGraphNode node,
			AlvisGraphNode parent) {
		int myY = depth * heightPerLevel + 10;
		int myX = (widthPerGraph * levelPos[depth] / (levelWidth[depth] + 1))
				- (node.getSize().width / 2) + midWidth;
		node.setLocation(myX, myY);
		levelPos[depth]++;
		for (AlvisGraphConnection gc : node.getConnections()) {
			AlvisGraphNode gn = gc.getNextNode(node);
			boolean cont = false;
			for (ArrayList<AlvisGraphNode> circle : getCircles()) {
				if (circle.contains(gn)) {
					cont = true;
					break;
				}
			}
			if (cont)
				continue;

			if (gn.equals(parent))
				continue;
			placeTreeNodes(depth + 1, gn, node);// recursion
		}
	}

	/**
	 * resets, e.g. forgets the content of the graph
	 */
	public void resetContent() {

		for (AlvisGraphConnection gc : getAllConnections()) {
			gc.dispose();
		}
		this.setSelection(null);
		for (AlvisGraphNode gn : this.getAllNodes()) {
			gn.dispose();
		}

		admin = new AlvisSave();
	}

	/**
	 * returns connection that is currently marked
	 * 
	 * @return connection that is currently marked
	 */
	public AlvisGraphConnection getHighlightedConnection() {

		if (!getSelection().isEmpty()) {
			try {
				AlvisGraphConnection result = (AlvisGraphConnection) getSelection()
						.get(0);
				return result;
			} catch (Exception e) {
			}
		}
		return null;
	}

	/**
	 * returns node that is currently marked
	 * 
	 * @return node that is currently marked
	 */
	public AlvisGraphNode getHighlightedNode() {

		if (!getSelection().isEmpty()) {
			try {
				AlvisGraphNode result = (AlvisGraphNode) getSelection().get(0);
				return result;
			} catch (Exception e) {
			}
		}
		return null;
	}

	/**
	 * marks graph nodes to be connected
	 * 
	 * @param gn
	 *            the graph node to be connected
	 */
	public void markToBeConnected(AlvisGraphNode gn) {
		if (gn == null) {
			resetMarking();
			return;
		}
		if (getConnectNode() == null) {
			setConnectNode(gn);
		} else {
			makeGraphConnection(ZestStyles.CONNECTIONS_DOT, getConnectNode(),
					gn);
			resetMarking();
		}
	}

	/**
	 * resets the connected-marking
	 */
	public void resetMarking() {
		setConnectNode(null);
	}

	public void removeHighlightedConnection() {

		AlvisGraphConnection con = getHighlightedConnection();
		if (con == null)
			return; // no connection selected

		setSelection(null);

		con.getFirstNode().getConnections().remove(con);
		con.getSecondNode().getConnections().remove(con);

		removeConnection(con);
		con.dispose();
	}

	/**
	 * removes currently highlighted node and all belonging connections
	 */
	public void removeHighlightedNode() {
		AlvisGraphNode node = getHighlightedNode();
		if (node == null)
			return; // no node selected

		this.setSelection(null);

		for (int i = getAllConnections().size() - 1; i >= 0; i--) {
			if (getAllConnections().get(i).getFirstNode().equals(node)
					|| getAllConnections().get(i).getSecondNode().equals(node)) {
				getAllConnections().get(i).dispose();
				removeConnection(i);
			}
		}

		removeNode(node);

		if (getConnectNode() != null && getConnectNode().equals(node))
			resetMarking();
		if (getStartNode() != null && getStartNode().equals(node))
			setStartNode(null);
		if (getEndNode() != null && getEndNode().equals(node))
			setEndNode(null);

		node.dispose();
	}

	/**
	 * saves node positions
	 */
	public void saveNodes() {
		admin.saveNodes();
	}

	/**
	 * loads node positions
	 */
	public void loadNodes() {
		Animation.markBegin();
		admin.loadNodes();
		Animation.run(500);
	}

	public AlvisGraphNode getRoot(ArrayList<AlvisGraphNode> tree) {

		AlvisGraphNode startNode = getStartNode();
		if (startNode != null && tree.contains(startNode)) {
			int myDepth = getDepth(null, startNode);
			startNode.setDepth(myDepth);
			return startNode;
		}

		ArrayList<AlvisGraphNode> treeWithoutLeafs = new ArrayList<AlvisGraphNode>();
		AlvisGraphNode result = null;
		for (AlvisGraphNode gn : tree) {
			if (gn.getConnections().size() >= 2)
				treeWithoutLeafs.add(gn);
		}

		int minDepth = Integer.MAX_VALUE;
		for (AlvisGraphNode gn : treeWithoutLeafs) {
			int newMinDepth = getDepth(null, gn);
			if (newMinDepth < minDepth) {
				minDepth = newMinDepth;
				result = gn;
			}
		}
		if (result != null)
			result.setDepth(minDepth);
		return result;
	}

	/**
	 * returns depth of this node !caution! node must not be in circle
	 * 
	 * @param parent
	 *            the parent node which is not to be visited again
	 * @param node
	 *            the node to visit
	 * @return depth of this graph node
	 */
	private int getDepth(AlvisGraphNode parent, AlvisGraphNode node) {

		int result = 0;

		if (node.getConnections().size() == 0)
			return 0; // node has no connections

		if ((node.getConnections().size() == 1) && (parent != null))
			return 0; // anchor, parent==null=> caller of function is root

		for (ArrayList<AlvisGraphNode> circle : getCircles()) {
			if (circle.contains(node)) {
				return -1;// depth is undefined, node is in circle
			}
		}

		for (AlvisGraphConnection gc : node.getConnections()) {
			AlvisGraphNode gn = gc.getNextNode(node);
			if (gn.equals(parent))
				continue;
			result = Math.max(result, 1 + getDepth(node, gn)); // recursion
		}

		return result;
	}

	/**
	 * creates tree with depth = parameter 'depth' and average amount of child
	 * nodes = width
	 * 
	 * @param depth
	 *            the depth of ne generated graph
	 * @param width
	 *            average amount of child nodes
	 * @param parent
	 *            the parent node
	 */
	public void createTree(int depth, int width, AlvisGraphNode parent) {

		if (depth <= 0)
			return; // anchor
		if (depth > 6)
			depth = 6; // too big to draw
		if (width > 3)
			width = 3; // too big to draw

		AlvisGraphNode gn = makeGraphNode("" + tagNo++);
		if (parent == null) {
			if (getStartNode() != null) {
				getStartNode().unmarkAsStartOrEndNode();
			}
			setStartNode(gn);
		} else
			makeGraphConnection(ZestStyles.CONNECTIONS_DOT, gn, parent);

		for (int i = 0; i < myRandom(width); i++) {
			createTree(depth - 1, width, gn);
		}

	}

	/**
	 * creates random number for width for createTree
	 * 
	 * @param width
	 * @return random number between 1 and (2*width)
	 */
	private int myRandom(int width) {
		int result = ((int) (Math.random() * 1000)) % (2 * width - 1);
		result += 1;
		return result;
	}

	/**
	 * clones this alvis graph
	 * 
	 * @param toClone
	 * @return
	 */
	public AlvisGraph clone(Composite parent) {
		AlvisGraph dolly = new AlvisGraph(parent, 0);
		dolly.admin = this.admin.clone(dolly);

		return dolly;
	}

	/**
	 * zooms out, i.e. pumps down the sizes and positions of graph nodes and
	 * connections
	 */
	public void zoomIn() {
		zoom(0, 0, true);
	}

	/**
	 * zooms in, i.e. pumps up the sizes and positions of graph nodes and
	 * connections
	 * 
	 * 
	 * @param mouseX
	 *            the x mouse coordinate
	 * @param mouseY
	 *            the y mouse coordinate
	 * @param zoomIn
	 *            true if function is supposed to zoom in, false to zoom out
	 * 
	 */
	public void zoom(int mouseX, int mouseY, boolean zoomIn) {
		double myZoomFactor;
		if (zoomIn) {
			if (getZoomCounter() >= 4)
				return; // too far zoomed in already
			increaseZoomCounter();
			myZoomFactor = zoomFactor;
		} else {
			if (getZoomCounter() <= -2)
				return; // too far zoomed out already
			decreaseZoomCounter();
			myZoomFactor = 1.0 / zoomFactor;
		}

		int fontSize = 4 + (int) (6 * Math.pow(2, getZoomCounter()));
		int gcFontSize = Math.min(48, fontSize);
		Font gnFont = new Font(null, "gn", fontSize, 1);
		Font gcFont = new Font(null, "gc", gcFontSize, 1);

		int conWidth = (getZoomCounter() <= 0) ? 1 : Integer.MAX_VALUE;
		Animation.markBegin();
		int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
		for (AlvisGraphNode gn : getAllNodes()) {
			gn.setLocation(gn.getLocation().x * myZoomFactor,
					gn.getLocation().y * myZoomFactor);
			gn.setFont(gnFont);
			minX = Math.min(minX, gn.getLocation().x);
			minY = Math.min(minY, gn.getLocation().y);
		}
		for (AlvisGraphNode gn : getAllNodes()) {
			gn.setLocation(gn.getLocation().x - minX + 20 - mouseX,
					gn.getLocation().y - minY + 20 - mouseY);
		}

		if (zoomIn) {
			for (AlvisGraphConnection gc : getAllConnections()) {
				gc.setFont(gcFont);
				gc.setLineWidth(Math.min(conWidth,
						(int) (1.5 * getZoomCounter())));
			}
		} else {
			for (AlvisGraphConnection gc : getAllConnections()) {
				gc.setFont(gcFont);
				gc.setLineWidth(Math.max(1, (int) (1.5 * getZoomCounter())));
			}
		}
		Animation.run(200);
	}

	/**
	 * zooms out, i.e. pumps down the sizes and positions of graph nodes and
	 * connections
	 */
	public void zoomOut() {
		zoom(0, 0, false);
	}

	private AlvisGraphNode getConnectNode() {
		return admin.getConnectNode();
	}

	private void setConnectNode(AlvisGraphNode connectNode) {
		admin.setConnectNode(connectNode);
	}

	public int getConnectionColor() {
		return admin.getConnectionColor();
	}

	public void setConnectionColor(int connectionColor) {
		admin.setConnectionColor(connectionColor);
	}

	private int getAmountOfGraphs() {
		return admin.getAmountOfGraphs();
	}

	private ArrayList<AlvisGraphNode> getSingles() {
		return admin.getSingles();
	}

	private double getLimiter() {
		return admin.getLimiter();
	}

	private void removeNode(AlvisGraphNode node) {
		admin.removeNode(node);
	}

	private void removeConnection(int i) {
		admin.removeConnection(i);
	}

	private void removeConnection(AlvisGraphConnection gcC) {
		admin.removeConnection(gcC);
	}

	public void setStartNode(AlvisGraphNode startNode) {
		admin.setStartNode(startNode);
		if (startNode != null)
			startNode.markAsStartNode();
	}

	public AlvisGraphNode getStartNode() {
		return admin.getStartNode();
	}

	public void setEndNode(AlvisGraphNode endNode) {
		admin.setEndNode(endNode);
		if (endNode != null)
			endNode.markAsEndNode();
	}

	public AlvisGraphNode getEndNode() {
		return admin.getEndNode();
	}

	public Set<AlvisGraphNode> getAllNodes() {
		return admin.getAllNodes();
	}

	public ArrayList<AlvisGraphConnection> getAllConnections() {
		return admin.getAllConnections();
	}

	public ArrayList<ArrayList<AlvisGraphNode>> getCircles() {
		return admin.getCircles();
	}

	public ArrayList<ArrayList<AlvisGraphNode>> getTrees() {
		return admin.getTrees();
	}

	public void addCircle(ArrayList<AlvisGraphNode> circle) {
		admin.addCircle(circle);
	}

	public void addTree(ArrayList<AlvisGraphNode> tree) {
		admin.addTree(tree);
	}

	public AlvisSave getAdmin() {
		return admin;
	}

	int requestId() {
		return admin.requestId();
	}

	public boolean removeTree(ArrayList<AlvisGraphNode> tree) {
		return admin.removeTree(tree);
	}

	public int getId() {
		return admin.getId();
	}

	@Override
	public ArrayList<GraphicalRepresentationVertex> getVertex() {
		ArrayList<GraphicalRepresentationVertex> result = new ArrayList<GraphicalRepresentationVertex>();
		for (AlvisGraphNode node : getAllNodes()) {
			result.add((GraphicalRepresentationVertex) node);
		}
		return result;
	}

	@Override
	public ArrayList<GraphicalRepresentationEdge> getEdges() {
		ArrayList<GraphicalRepresentationEdge> result = new ArrayList<GraphicalRepresentationEdge>();
		for (AlvisGraphConnection conn : getAllConnections()) {
			result.add((GraphicalRepresentationEdge) conn);
		}
		return result;
	}

	private void increaseZoomCounter() {
		admin.increaseZoomCounter();
	}

	private void decreaseZoomCounter() {
		admin.decreaseZoomCounter();
	}

	private int getZoomCounter() {
		return admin.getZoomCounter();
	}

}
