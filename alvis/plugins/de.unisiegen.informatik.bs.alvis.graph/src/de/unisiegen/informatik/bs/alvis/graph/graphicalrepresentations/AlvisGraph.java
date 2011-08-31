package de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations;

import java.util.ArrayList;
import java.util.Set;

import org.eclipse.draw2d.Animation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphItem;
import org.eclipse.zest.core.widgets.ZestStyles;

import de.unisiegen.informatik.bs.alvis.graph.Activator;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.GraphicalRepresentationEdge;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.GraphicalRepresentationGraph;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.GraphicalRepresentationVertex;
import de.unisiegen.informatik.bs.alvis.graph.editors.GraphEditor;

/**
 * class, that creates the alvis graph
 * 
 * @author Frank Weiler
 * 
 */
public class AlvisGraph extends Graph implements GraphicalRepresentationGraph {

	public static final String ID = "de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.graph";
	public static final int CTRL = SWT.CTRL;// SWT -> ctrl
	public static final int PLUS = 43;// SWT -> "+"
	public static final int MINUS = 45;// SWT -> "-"

	AlvisSave admin;

	private double middleX, middleY, radiusX, radiusY, angle;
	private int middleFactor, widthPerGraph, heightPerLevel, midWidth;
	private int[] levelWidth, levelPos;
	private int keyPressed;

	/**
	 * the constructor
	 * 
	 * @param parent
	 *            the parent composite
	 * @param style
	 *            the style
	 */
	public AlvisGraph(Composite parent, int style) {
		super(parent, style);
		setLayoutAlgorithm(null, false);
		setForeground(new Color(null, 128, 128, 128));

		admin = new AlvisSave();
		middleFactor = 0;
		keyPressed = 0;

		addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.keyCode == PLUS) {
					if (zoomIn()) {
						superSetDirty(true, new Point(getSize().x / 2,
								getSize().y / 2), true);
					}
				} else if (e.keyCode == MINUS) {
					if (zoomOut()) {
						superSetDirty(true, new Point(getSize().x / 2,
								getSize().y / 2), false);
					}
				}
				keyPressed = e.keyCode;
			}

			@Override
			public void keyReleased(KeyEvent e) {
				keyPressed = 0;
			}
		});

		addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseScrolled(MouseEvent e) {
				if (keyPressed == CTRL) {
					if (zoom(e.x, e.y, e.count > 0)) { // mouse wheel down ==
														// e.count < 0
						superSetDirty(true, new Point(e.x, e.y), e.count > 0);
					}
				}
			}
		});

	}

	/**
	 * checks if container of alvis graph is an editor and sets its dirty status
	 * 
	 * @param dirty
	 *            true if dirty, false otherwise
	 * @param mousePos
	 *            mouse position, if superSetDirty gets called from zoom, !!null
	 *            otherwise!!
	 * @param zoomIn
	 *            if caller was zoom method and graph shall get zoomed in
	 * @return if container is editor
	 */
	private boolean superSetDirty(boolean dirty, Point mousePos, boolean zoomIn) {
		try {
			GraphEditor edit = (GraphEditor) Activator.getDefault()
					.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.getActiveEditor();
			edit.setDirty(dirty);
			if (mousePos != null) {
				edit.setZoomUndo(zoomIn, mousePos);
			}
			return true;
		} catch (ClassCastException cce) {
			return false;
		}
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

		if (name.equals(""))
			name = Integer.toString(getAdmin().getId());

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

		admin.addNode(gn,
				new java.awt.Point(gn.getLocation().x, gn.getLocation().y));

		return gn;
	}

	/**
	 * creates and saves new alvis graph connection in allConnections
	 * 
	 * @param node1
	 *            the source node
	 * @param node2
	 *            the drain node
	 * @return new alvis graph connection
	 */
	public AlvisGraphConnection makeGraphConnection(AlvisGraphNode node1,
			AlvisGraphNode node2) {

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
					ZestStyles.CONNECTIONS_DOT, node1, node2);
			result.setLineWidth((getZoomCounter() <= 0) ? 1 : (int) Math.pow(
					admin.getZoomFactor(), getZoomCounter() + 1));
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
			middleY = this.getSize().y / (2.0);

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
	 * returns items that are currently marked
	 * 
	 * @return items that are currently marked
	 */
	public ArrayList<GraphItem> getHighlightedItems() {

		ArrayList<GraphItem> selectedItems = new ArrayList<GraphItem>();

		for (Object object : getSelection()) {
			try {
				selectedItems.add((GraphItem) object);
			} catch (Exception e) {
			}
		}

		return selectedItems;
	}

	/**
	 * returns nodes that are currently marked
	 * 
	 * @return nodes that are currently marked
	 */
	public ArrayList<AlvisGraphNode> getHighlightedNodes() {

		ArrayList<AlvisGraphNode> selectedItems = new ArrayList<AlvisGraphNode>();

		for (Object object : getSelection()) {
			try {
				selectedItems.add((AlvisGraphNode) object);
			} catch (Exception e) {
			}
		}

		return selectedItems;
	}

	/**
	 * returns connections that belong to currently marked graph nodes
	 * 
	 * @return connections that belong to currently marked graph nodes
	 */
	public ArrayList<AlvisGraphConnection> getHighlightedConnections() {

		ArrayList<AlvisGraphNode> gns = getHighlightedNodes();
		ArrayList<AlvisGraphConnection> selectedConnections = new ArrayList<AlvisGraphConnection>();

		for (AlvisGraphNode gn : gns) {
			for (AlvisGraphConnection gc : gn.getConnections()) {
				if (!selectedConnections.contains(gc)) {
					selectedConnections.add(gc);
				}
			}
		}

		return selectedConnections;
	}

	/**
	 * marks graph nodes to be connected
	 * 
	 * @param gn
	 *            the graph node to be connected
	 * @return new graph connection, null if no connection was generated
	 */
	public AlvisGraphConnection markToBeConnected(AlvisGraphNode gn) {
		AlvisGraphConnection gc = null;
		if (gn == null) {
			return null;
		}
		if (getConnectNode() == null) {
			setConnectNode(gn);
		} else {
			gc = makeGraphConnection(getConnectNode(), gn);
			resetMarking();
		}
		return gc;
	}

	/**
	 * resets the connected-marking
	 */
	public void resetMarking() {
		setConnectNode(null);
	}

	/**
	 * first removes and disposes given graph connections, then removes given
	 * graph nodes and disposes
	 * 
	 * @param gcs
	 *            graph connections to remove
	 * @param gns
	 *            graph nodes to remove
	 */
	public void removeConnectionsAndNodes(ArrayList<AlvisGraphConnection> gcs,
			ArrayList<AlvisGraphNode> gns) {

		setSelection(null);

		for (AlvisGraphConnection con : gcs) {
			con.getFirstNode().getConnections().remove(con);
			con.getSecondNode().getConnections().remove(con);

			removeConnection(con);
			con.dispose();

		}

		for (AlvisGraphNode node : gns) {

			removeNode(node);

			if (getConnectNode() != null && getConnectNode().equals(node))
				resetMarking();
			if (getStartNode() != null && getStartNode().equals(node))
				setStartNode(null);
			if (getEndNode() != null && getEndNode().equals(node))
				setEndNode(null);

			node.dispose();

		}

	}

	/**
	 * removes currently highlighted items and all (to node) belonging
	 * connections, disposes items^
	 * 
	 * @return if something was removed
	 */
	public boolean removeHighlightedItems() {
		ArrayList<GraphItem> items = getHighlightedItems();
		if (items.isEmpty())
			return false; // nothing to remove

		ArrayList<AlvisGraphNode> nodes = new ArrayList<AlvisGraphNode>();
		ArrayList<AlvisGraphConnection> cons = new ArrayList<AlvisGraphConnection>();

		for (GraphItem graphItem : items) {
			try {
				nodes.add((AlvisGraphNode) graphItem);
			} catch (ClassCastException cce) {
				try {
					cons.add((AlvisGraphConnection) graphItem);
				} catch (Exception e) {
				}
			}
		}

		setSelection(null);

		for (AlvisGraphConnection con : cons) {
			con.getFirstNode().getConnections().remove(con);
			con.getSecondNode().getConnections().remove(con);

			removeConnection(con);
			con.dispose();

		}

		for (AlvisGraphNode node : nodes) {

			for (int i = node.getConnections().size() - 1; i >= 0; i--) {
				AlvisGraphConnection gc = node.getConnections().get(i);
				gc.getNextNode(node).getConnections().remove(gc);
				removeConnection(gc);
				gc.dispose();
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

		return true;

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
		loadNodes(500);
	}

	/**
	 * loads node positions
	 * 
	 * @param millis
	 *            time to move nodes (in milli seconds)
	 */
	public void loadNodes(int millis) {
		Animation.markBegin();
		admin.loadNodes();
		Animation.run(millis);
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
	public ArrayList<AlvisGraphNode> createTree(int depth, int width,
			AlvisGraphNode parent) {

		ArrayList<AlvisGraphNode> result = new ArrayList<AlvisGraphNode>();

		if (depth <= 0)
			return null; // anchor
		if (depth > 7)
			depth = 7; // too big to draw
		if (width > 3)
			width = 3; // too big to draw

		AlvisGraphNode gn = makeGraphNode("");
		result.add(gn);
		if (parent == null) {
			if (getStartNode() != null) {
				getStartNode().unmarkAsStartOrEndNode();
			}
			// setStartNode(gn);
		} else
			makeGraphConnection(gn, parent);

		for (int i = 0; i < myRandom(width); i++) {
			ArrayList<AlvisGraphNode> gnRec = createTree(depth - 1, width, gn);

			if (gnRec != null) {
				for (AlvisGraphNode alvisGraphNode : gnRec) {
					result.add(alvisGraphNode);
				}
			}

		}

		return result;

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
	 * creates circle which has given amount of nodes
	 * 
	 * @param amountOfNodes
	 *            the amount of nodes in circle
	 * @return list of new nodes
	 */
	public ArrayList<AlvisGraphNode> createCircle(int amountOfNodes) {

		ArrayList<AlvisGraphNode> result = new ArrayList<AlvisGraphNode>();

		if (amountOfNodes > 300)
			amountOfNodes = 300; // too many
		if (amountOfNodes < 3)
			amountOfNodes = 3; // too few

		AlvisGraphNode start = makeGraphNode("");
		result.add(start);
		AlvisGraphNode one = start, two = null;

		for (int i = 1; i < amountOfNodes; i++) {
			two = makeGraphNode("");
			result.add(two);
			makeGraphConnection(one, two);
			one = two;
		}
		makeGraphConnection(one, start);

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
	 * zooms out, i.e. pumps up the sizes and positions of graph nodes and
	 * connections
	 * 
	 * @return true if graph has zoomed in
	 */
	public boolean zoomIn() {
		return zoom(getSize().x / 2, getSize().y / 2, true);
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
	 * @return true if graph has zoomed
	 * 
	 */
	public boolean zoom(int mouseX, int mouseY, boolean zoomIn) {
		double myZoomFactor;
		if (zoomIn) {
			if (getZoomCounter() >= 4)
				return false; // too far zoomed in already
			increaseZoomCounter();
			myZoomFactor = admin.getZoomFactor();
		} else {
			if (getZoomCounter() <= -2)
				return false; // too far zoomed out already
			decreaseZoomCounter();
			myZoomFactor = 1.0 / admin.getZoomFactor();
		}

		int fontSize = 4 + (int) (6 * Math.pow(2, getZoomCounter()));
		int gcFontSize = Math.min(48, fontSize);
		Font gnFont = new Font(null, "gn", fontSize, 1);
		Font gcFont = new Font(null, "gc", gcFontSize, 1);

		Animation.markBegin();
		int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
		for (AlvisGraphNode gn : getAllNodes()) {
			int x = gn.getLocation().x;
			int y = gn.getLocation().y;
			gn.setLocation((x - mouseX) * myZoomFactor + mouseX, (y - mouseY)
					* myZoomFactor + mouseY);
			gn.setFont(gnFont);
			minX = Math.min(minX, x);
			minY = Math.min(minY, y);
		}

		for (AlvisGraphConnection gc : getAllConnections()) {
			gc.setFont(gcFont);
			gc.setLineWidth((getZoomCounter() <= 0) ? 1 : (int) Math.pow(
					admin.getZoomFactor(), getZoomCounter() + 2));
		}
		Animation.run(200);
		return true;
	}

	/**
	 * zooms out, i.e. pumps down the sizes and positions of graph nodes and
	 * connections
	 * 
	 * @return true if graph has zoomed out
	 */
	public boolean zoomOut() {
		return zoom(getSize().x / 2, getSize().y / 2, false);
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

	private boolean removeConnection(AlvisGraphConnection gcC) {
		return admin.removeConnection(gcC);
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
			result.add(node);
		}
		return result;
	}

	@Override
	public ArrayList<GraphicalRepresentationEdge> getEdges() {
		ArrayList<GraphicalRepresentationEdge> result = new ArrayList<GraphicalRepresentationEdge>();
		for (AlvisGraphConnection conn : getAllConnections()) {
			result.add(conn);
		}
		return result;
	}

	private void increaseZoomCounter() {
		admin.increaseZoomCounter();
	}

	private void decreaseZoomCounter() {
		admin.decreaseZoomCounter();
	}

	public int getZoomCounter() {
		return admin.getZoomCounter();
	}

	@Override
	public void setVertices(ArrayList<GraphicalRepresentationVertex> vertToSet) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setEdges(ArrayList<GraphicalRepresentationEdge> edgeToSet) {
		// TODO Auto-generated method stub
	}

	public AlvisGraphNode getHighlightedNode() {
		for (GraphItem item : getHighlightedItems()) {
			try {
				AlvisGraphNode gn = (AlvisGraphNode) item;
				return gn;
			} catch (ClassCastException cce) {
			}
		}
		return null;
	}

	public AlvisGraphConnection getHighlightedConnection() {
		for (GraphItem item : getHighlightedItems()) {
			try {
				AlvisGraphConnection gc = (AlvisGraphConnection) item;
				return gc;
			} catch (ClassCastException cce) {
			}
		}
		return null;
	}

	public void fitToPage() {
		fitToPage(500);
	}

	/**
	 * makes Graph fit to page by moving graph nodes
	 * 
	 * @param millis
	 *            time to move nodes (in milli seconds)
	 */
	public void fitToPage(int millis) {
		int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, maxX = 0, maxY = 0;
		int maxWidth = 0, maxHeight = 0;
		for (AlvisGraphNode gn : getAllNodes()) {
			maxX = Math.max(maxX, (gn.getLocation().x + gn.getSize().width));
			maxY = Math.max(maxY, (gn.getLocation().y + gn.getSize().height));
			minX = Math.min(minX, gn.getLocation().x);
			minY = Math.min(minY, gn.getLocation().y);
			maxWidth = Math.max(maxWidth, gn.getSize().width);
			maxHeight = Math.max(maxHeight, gn.getSize().height);
		}

		double actWidth = maxX - minX;
		double actHeight = maxY - minY;
		if (actWidth == 0 || actHeight == 0)
			return;// avoid division by zero

		double gX = Math.max(getSize().x - maxWidth, 20);
		double gY = Math.max(getSize().y - maxHeight, 20);

		double relX = gX / actWidth;
		double relY = gY / actHeight;
		Animation.markBegin();
		for (AlvisGraphNode gn : getAllNodes()) {
			double x = (gn.getLocation().x - minX) * relX
					+ ((maxWidth / 2) * relX);
			double y = (gn.getLocation().y - minY) * relY
					+ ((maxHeight / 2) * relY);
			gn.setLocation(x, y);
		}
		Animation.run(millis);

		superSetDirty(true, null, false);

	}

	/**
	 * captures current graphical representation from the graph editor and
	 * returns it
	 * 
	 * @return the screen shot to create the the export file with (e.g.)
	 */
	public Image getImage() {

		final ArrayList<Image> screenshot = new ArrayList<Image>();
		this.getDisplay().syncExec(new Runnable() {
			public void run() {
				GC gc = new GC(AlvisGraph.this);
				int width = getSize().x;
				int height = getSize().y;
				gc.drawText("Created by Alvis", width - 95, height - 20);
				gc.drawRectangle(new Rectangle(0, 0, width - 1, height - 1));
				screenshot.add(new Image(Display.getCurrent(), width, height));
				gc.copyArea(screenshot.get(0), 0, 0);
				gc.dispose();
			}
		});

		return screenshot.get(0);

	}
}
