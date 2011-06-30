package de.unisiegen.informatik.bs.alvis.graph.editors;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.editors.ImageCache;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.*;

public class GraphEditor extends EditorPart implements PropertyChangeListener,
		IExportItem {

	public static final int MODUS_STANDARD = 0;// cursor
	public static final int MODUS_MOVE = 1;// hand
	public static final int MODUS_NODE = 110;// SWT -> n
	public static final int MODUS_CONNECTION = 99;// SWT -> c
	public static final int MODUS_START = 115;// SWT -> s
	public static final int MODUS_END = 101;// SWT -> e
	public static final int MODUS_DELETE = SWT.DEL;// SWT -> delete
	public static final int CTRL = SWT.CTRL;// SWT -> ctrl
	private int pressed;

	private Button bNode, bConnection, bStartNode, bEndNode, bHand, bDelete,
			bZoomIn, bZoomOut;
	private Button bChangeLayout, bDeleteAll, bScreenShot;
	public AlvisGraph myGraph;
	private Composite myParent;
	private Cursor oldCursor;
	private static IEditorInput myInput;
	private String myInputFilePath;
	private boolean rename;
	AlvisGraphNode actNode;
	AlvisGraphConnection actCon;

	/**
	 * Loads the file from input and creates a new AlvisGraph from it.
	 * 
	 * @param parent
	 *            the parent to hang on
	 * @param input
	 *            the file that contains the description of the graph
	 * @return an AlvisGraph
	 */
	private void createGraph(Composite parent, IEditorInput input) {

		myGraph = new AlvisGraph(parent, SWT.NONE);
		// Get the absolute Path to the InstanceLocation
		// String root = Platform.getInstanceLocation().getURL().getPath();
		// Get the path to the file

		if (myInput instanceof FileEditorInput) {
			FileEditorInput fileInput = (FileEditorInput) myInput;
			myInputFilePath = fileInput.getPath().toString();
			AlvisSerialize seri = (AlvisSerialize) deserialize(myInputFilePath);
			if (seri != null)
				new AlvisSave(myGraph, seri);
		}
		rename = false;

		doSave(null);
	}

	private boolean dirty = false;

	/**
	 * Compares the current state of myInput to the current state of myGraph
	 * 
	 * @return true if they are not equal else false
	 */
	@Override
	public boolean isDirty() {
		return dirty;
	}

	/**
	 * checks if the current state of the graph equals the state of the doc
	 */
	private void checkDirty() {
		if (!((AlvisSerialize) deserialize(myInputFilePath)).equals(myGraph
				.getAdmin().serialize())) {
			setDirty(true);
		}
	}

	/**
	 * Sets the state of isDirty
	 * 
	 * @param dirty
	 *            true, if something has changed in the graph that has to be
	 *            saved, false if the graph is saved
	 */
	private void setDirty(boolean dirty) {
		this.dirty = dirty;
		firePropertyChange(IEditorPart.PROP_DIRTY);
	}

	/**
	 * Save the current state of myGraph to the file in myInput
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
		if (myInputFilePath == null)
			myInputFilePath = ((FileEditorInput) myInput).getPath().toString();
		XStream xstream = new XStream(new DomDriver());
		BufferedOutputStream fos;
		try {
			AlvisSerialize seri = myGraph.getAdmin().serialize();
			fos = new BufferedOutputStream(
					new FileOutputStream(myInputFilePath));
			fos.write(xstream.toXML(seri).getBytes());
			fos.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		setDirty(false);
	}

	/**
	 * Add all tools for editing the graph
	 */
	public Composite createEditor(Composite parent, IEditorInput input) {
		myParent = parent;
		myInput = input;
		oldCursor = myParent.getCursor();

		// Activator.getDefault().registerExport(this);

		RowLayout rowLayout = new RowLayout();
		rowLayout.type = SWT.VERTICAL;
		parent.setLayout(new GridLayout(1, false));

		Group graphGroup = new Group(parent, SWT.NONE);
		graphGroup.setText(Messages.getLabel("editor"));
		graphGroup.setLayout(new FillLayout());

		GridData gdGraph = new GridData();
		gdGraph.horizontalAlignment = SWT.FILL;
		gdGraph.verticalAlignment = SWT.FILL;
		gdGraph.grabExcessHorizontalSpace = true;
		gdGraph.grabExcessVerticalSpace = true;
		graphGroup.setLayoutData(gdGraph);

		/*
		 * Create the Graph from given input
		 */
		createGraph(graphGroup, myInput);

		pressed = MODUS_STANDARD;
		setGraphModus(MODUS_STANDARD);

		Group tools = new Group(parent, SWT.NONE);
		tools.setText(Messages.getLabel("group_tools"));
		tools.setLayout(new GridLayout(8, false));

		GridData gdTools = new GridData();
		gdTools.horizontalAlignment = SWT.FILL;
		gdTools.grabExcessHorizontalSpace = true;
		tools.setLayoutData(gdTools);

		bZoomOut = new Button(tools, SWT.NONE);
		bZoomOut.setText("-");

		bZoomIn = new Button(tools, SWT.NONE);
		bZoomIn.setText("+");

		bHand = new Button(tools, SWT.NONE);
		bHand.setImage(ImageCache.getImage("icons/editor/graph_move.png")); //$NON-NLS-1$
		bHand.setToolTipText(Messages.getLabel("button_move"));

		bNode = new Button(tools, SWT.NONE);
		bNode.setImage(ImageCache.getImage("icons/editor/graph_add.png")); //$NON-NLS-1$
		bNode.setToolTipText(Messages.getLabel("button_add"));

		bConnection = new Button(tools, SWT.NONE);
		bConnection.setImage(ImageCache
				.getImage("icons/editor/graph_connection.png")); //$NON-NLS-1$
		bConnection.setToolTipText(Messages.getLabel("button_connection"));

		bStartNode = new Button(tools, SWT.NONE);
		bStartNode.setImage(ImageCache
				.getImage("icons/editor/graph_startnode.png")); //$NON-NLS-1$
		bStartNode.setToolTipText(Messages.getLabel("button_startnode"));

		bEndNode = new Button(tools, SWT.NONE);
		bEndNode.setImage(ImageCache.getImage("icons/editor/graph_endnode.png")); //$NON-NLS-1$
		bEndNode.setToolTipText(Messages.getLabel("button_endnode"));

		bDelete = new Button(tools, SWT.NONE);
		bDelete.setImage(ImageCache.getImage("icons/editor/graph_delete.png"));
		bDelete.setToolTipText(Messages.getLabel("button_deletenode"));

		Group autofill = new Group(parent, SWT.NONE);
		autofill.setText(Messages.getLabel("button_autofill"));
		autofill.setLayout(new GridLayout(9, false));

		GridData gdAutoFill = new GridData();
		gdAutoFill.horizontalAlignment = SWT.FILL;
		gdAutoFill.grabExcessHorizontalSpace = true;
		autofill.setLayoutData(gdAutoFill);

		bChangeLayout = new Button(autofill, SWT.NONE);
		bChangeLayout.setText(Messages.getLabel("button_change_layout"));

		bDeleteAll = new Button(autofill, SWT.NONE);
		bDeleteAll.setText(Messages.getLabel("button_delete_all"));

		bScreenShot = new Button(autofill, SWT.NONE);
		bScreenShot.setText(Messages.getLabel("screenshot"));

		autofill.pack();

		setListeners();

		return parent;
	}

	/*
	 * TEST
	 */
	@Override
	public void createPartControl(Composite parent) {
		myParent = parent;
		createEditor(myParent, myInput);
	}

	private ImageData loadImageData(String filename) {
		InputStream f;
		ImageData imageData = null;
		try {
			f = FileLocator.find(Activator.getDefault().getBundle(),
					new Path(filename), null).openStream();
			imageData = new ImageData(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return imageData;
	}

	private static Image loadImage(String filename) {
		ClassLoader classLoader = GraphEditor.class.getClassLoader();
		InputStream is = classLoader.getResourceAsStream(filename);
		if (is == null) {
			// the old way didn't have leading slash, so if we can't find the
			// image stream,
			// let's see if the old way works.
			is = classLoader.getResourceAsStream(filename.substring(1));
			if (is == null) {
				is = classLoader.getResourceAsStream(filename);
				if (is == null) {
					is = classLoader.getResourceAsStream(filename.substring(1));
					if (is == null) {
						return null;
					}
				}
			}
		}

		Image img = new Image(Display.getDefault(), is);
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return img;
	}

	/*
	 * TEST END
	 */

	/**
	 * Creates a GraphIcon from a given String
	 * 
	 * @throws IOException
	 */
	public static org.eclipse.swt.graphics.Image makeGraphImage(String text)
			throws IOException {
		int width = 32, height = 32;
		String dir = ""; //$NON-NLS-1$

		dir = FileLocator.getBundleFile(Activator.getDefault().getBundle())
				.getAbsolutePath();

		BufferedImage bi = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_ARGB);
		Graphics2D ig2 = bi.createGraphics();
		Font font = new Font("Arial", Font.BOLD, 16); //$NON-NLS-1$
		ig2.setFont(font);
		FontMetrics fontMetrics = ig2.getFontMetrics();
		int stringWidth = fontMetrics.stringWidth(text);
		int stringHeight = fontMetrics.getAscent();
		ig2.setPaint(java.awt.Color.black);
		ig2.drawString(text, (width - stringWidth) / 2, height / 2
				+ stringHeight / 4 + 4);

		ImageIO.write(bi, "PNG",
				new File(dir + System.getProperty("file.separator") + "temp"
						+ System.getProperty("file.separator")
						+ "alvis_graph_icon_" //$NON-NLS-1$ 
						+ text + ".png")); //$NON-NLS-1$

		return loadImage("/temp/alvis_graph_icon_" + text + ".png");
		// return loadImage("icons/editor/graph_add.png");
	}

	/**
	 * sets the mouse- and key-listeners for graph view TODO implement that mode
	 * switching is not possible by pushed ctrl key, because ctrl s => save
	 */
	private void setListeners() {

		myGraph.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (!rename) { // default key actions
					if (e.keyCode == pressed) {
						pressed = MODUS_STANDARD;
						setGraphModus(MODUS_STANDARD);
					} else if (e.keyCode == MODUS_DELETE) {
						if (pressed == CTRL) {
							clearGraph();
						} else {
							removeHighlightedNode();
							removeHighlightedConnection();
						}
					} else {
						pressed = e.keyCode;
						setGraphModus(pressed);
					}
				} else { // rename
					if (e.keyCode == 27) { // escape
						if (actNode != null) {
							actNode.setText(actNode.getMyText());
						} else if (actNode != null) {
							actCon.setText(actCon.getMyText());
						}
						myGraph.setRedraw(true);
						rename = false;
					} else if (e.keyCode == 13) { // return
						if (actNode != null) {
							actNode.setMyText(actNode.getText());
						} else if (actNode != null) {
							actCon.setMyText(actCon.getText());
						}
						myGraph.setRedraw(true);
						rename = false;
					} else if (e.keyCode == 8) { // backspace
						if (actNode != null) {
							// TODO implement
						} else if (actNode != null) {
							// TODO implement
						}
					} else {
						if (actNode != null) {
							actNode.setText(actNode.getText() + e.character);
						} else if (actNode != null) {
							actCon.setText(actCon.getText() + e.character);
						}
					}
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (pressed == CTRL) {
					pressed = MODUS_STANDARD;
				}
			}
		});

		Listener zoomer = new Listener() {
			@Override
			public void handleEvent(Event event) {
				if (event.widget.equals(bZoomIn)) {
					if(myGraph.zoomIn())
						checkDirty();
				} else if (event.widget.equals(bZoomOut)) {
					if(myGraph.zoomOut())
						checkDirty();
				}
			}
		};

		bZoomIn.addListener(SWT.Selection, zoomer);
		bZoomOut.addListener(SWT.Selection, zoomer);

		Listener listener = new Listener() {
			@Override
			public void handleEvent(Event event) {

				// /* TEST */
				// ArrayList<AlvisGraphNode> drain = new
				// ArrayList<AlvisGraphNode>();
				// ArrayList<AlvisGraphNode> source = new
				// ArrayList<AlvisGraphNode>();
				// source.addAll(myGraph.getAllNodes());
				// CheckDialog dialog = new CheckDialog(
				// myParent.getShell(),
				// source,
				// drain,
				// 4,
				// "Alle Knoten", "Das sind alle Knoten",
				// "Wählen Sie bis zu vier Knoten");
				// dialog.open();
				// for(Object o : drain) {
				// System.out.println(o.toString());
				// }

				myGraph.resetMarking();
				if (event.widget.equals(bNode)) {
					pressed = MODUS_NODE;
				} else if (event.widget.equals(bConnection)) {
					pressed = MODUS_CONNECTION;
				} else if (event.widget.equals(bStartNode)) {
					pressed = MODUS_START;
				} else if (event.widget.equals(bEndNode)) {
					pressed = MODUS_END;
				} else if (event.widget.equals(bHand)) {
					pressed = MODUS_STANDARD;
				} else if (event.widget.equals(bChangeLayout)) {
					setLayoutManager();
				} else if (event.widget.equals(bDelete)) {
					pressed = MODUS_DELETE;
				} else if (event.widget.equals(bDeleteAll)) {
					clearGraph();
				} else if (event.widget.equals(bScreenShot)) {
					saveScreenshotToImg();
				}
				setGraphModus(pressed);

			}
		};

		bHand.addListener(SWT.Selection, listener);
		bNode.addListener(SWT.Selection, listener);
		bConnection.addListener(SWT.Selection, listener);
		bStartNode.addListener(SWT.Selection, listener);
		bEndNode.addListener(SWT.Selection, listener);
		bChangeLayout.addListener(SWT.Selection, listener);
		bDelete.addListener(SWT.Selection, listener);
		bDeleteAll.addListener(SWT.Selection, listener);
		bScreenShot.addListener(SWT.Selection, listener);

		myGraph.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseScrolled(MouseEvent e) {
				if (pressed == CTRL) {
					if (e.count < 0) { // mouse wheel down
						if(myGraph.zoom(e.x, e.y, false))
							checkDirty();
					} else { // mouse wheel up
						if(myGraph.zoom(e.x, e.y, true))
							checkDirty();
					}
				}
			}
		});

		myGraph.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {

				if (!rename) {
					actNode = myGraph.getHighlightedNode();
					actCon = myGraph.getHighlightedConnection();

					if (pressed == MODUS_MOVE) {
						pressed = MODUS_STANDARD;
						setGraphModus(pressed);
					} else if (pressed == MODUS_NODE) {
						if (actNode == null) {
							clickNewNode(e.x, e.y);
						}
					} else if (pressed == MODUS_START) {
						clickStartNode(actNode);
					} else if (pressed == MODUS_END) {
						clickEndNode(actNode);
					} else if (pressed == MODUS_DELETE) {
						clickRemove(actNode);
						clickRemove(actCon);
					} else if (pressed == MODUS_CONNECTION) {
						clickNewConnection(actNode);
					}
				} else {

				}
			}

			@Override
			public void mouseDown(MouseEvent e) {
				if (pressed == MODUS_STANDARD
						&& !myGraph.getSelection().isEmpty()) {
					pressed = MODUS_MOVE;
					setGraphModus(pressed);
				}
			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// actNode = myGraph.getHighlightedNode();
				// actCon = myGraph.getHighlightedConnection();
				// if (actNode != null || actCon != null) {
				// rename = true;
				// pressed = MODUS_STANDARD;
				// setGraphModus();
				// if (actNode != null) {
				// actNode.setHighlightColor(AlvisGraphNode.RENAME_COLOR);//
				// TODO
				// // doenst
				// // work
				// // jet
				// } else if (actCon != null) {
				// // TODO implement
				// }
				// myGraph.setRedraw(false);
				// }
			}
		});

	}

	/**
	 * Set the modus
	 * 
	 * @param modus
	 */
	public void setModus(int modus) {
		myGraph.resetMarking();
		pressed = modus;
		setGraphModus(pressed);
	}

	/**
	 * Connects two nodes
	 * 
	 * @param node
	 * @param e
	 */
	protected void clickNewConnection(AlvisGraphNode node) {
		myGraph.markToBeConnected(node);
		// the graph might be changed
		checkDirty();
	}

	/**
	 * Removes a node
	 * 
	 * @param node
	 * @param e
	 */
	protected void clickRemove(AlvisGraphNode node) {
		if (node != null) {
			myGraph.removeHighlightedNode();
			// the graph might be changed
			checkDirty();
		}
		pressed = MODUS_MOVE;
		setGraphModus(pressed);
	}

	@Override
	public String getSourceCode() {
		// no source code in this plug in
		return null;
	}

	/**
	 * captures current graphical representation from the graph editor and
	 * returns it
	 * 
	 * @return screenshot the screenshot to create the the export file with
	 *         (e.g.)
	 */
	@Override
	public Image getImage() {
		Image screenshot;
		int width = myGraph.getSize().x;
		int height = myGraph.getSize().y;
		GC gc = new GC(myGraph.getGraphModel());
		gc.drawText("Created by Alvis", 5, 5);
		gc.drawRectangle(new Rectangle(0, 0, width - 1, height - 1));
		screenshot = new Image(Display.getCurrent(), width, height);
		gc.copyArea(screenshot, 0, 0);

		gc.dispose();
		myGraph.redraw();

		return screenshot;
	}

	/**
	 * calls file chooser to set location for saving a screenshot of the graph
	 * editor to a *.png file
	 * 
	 */
	private void saveScreenshotToImg() {
		FileDialog saveDialog = new FileDialog(myGraph.getShell(), SWT.SAVE);
		saveDialog.setFilterNames(new String[] { "PNG (*.png)",
				Messages.getLabel("allFiles") });
		saveDialog.setFilterExtensions(new String[] { "*.png", "*.*" });
		try {
			saveDialog.setFilterPath(FileLocator.getBundleFile(
					Activator.getDefault().getBundle()).getAbsolutePath());
		} catch (IOException e) {
		}

		saveDialog.setFileName("alvisGraph" + System.currentTimeMillis()
				+ ".png");

		Image screenshot = getImage();

		String name = saveDialog.open();
		if (name == null)
			return; // saving canceled
		if (new File(name).exists()) {
			// The file already exists; asks for confirmation
			MessageBox mb = new MessageBox(saveDialog.getParent(),
					SWT.ICON_WARNING | SWT.YES | SWT.NO);
			mb.setMessage(name + Messages.getLabel("imgAlreadyExists"));
			if (mb.open() == SWT.NO)
				return;// do not overwrite
		}

		ImageLoader loader = new ImageLoader();
		loader.data = new ImageData[] { screenshot.getImageData() };
		loader.save(name, SWT.IMAGE_PNG);

		screenshot.dispose();
	}

	/**
	 * removes connection
	 * 
	 * @param con
	 */
	protected void clickRemove(AlvisGraphConnection con) {
		if (con != null) {
			myGraph.removeHighlightedConnection();
			// the graph might be changed
			checkDirty();
		}
		pressed = MODUS_MOVE;
		setGraphModus(pressed);
	}

	/**
	 * sets the end node of the graph
	 * 
	 * @param node
	 *            the node to be the end node
	 */
	protected void clickEndNode(AlvisGraphNode node) {
		if (node == myGraph.getStartNode())
			myGraph.setStartNode(null);
		if (node == null)
			return;
		if (myGraph.getEndNode() != null) {
			myGraph.getEndNode().unmarkAsStartOrEndNode();
		}
		myGraph.setEndNode(node);
		myGraph.resetMarking();
		pressed = MODUS_STANDARD;
		setGraphModus(pressed);
		// the graph might be changed
		checkDirty();
	}

	/**
	 * Sets the start node of the graph
	 * 
	 * @param node
	 *            the node to be the start node
	 */
	protected void clickStartNode(AlvisGraphNode node) {
		if (node == null)
			return;

		if (node == myGraph.getEndNode())
			myGraph.setEndNode(null);
		if (myGraph.getStartNode() != null) {
			myGraph.getStartNode().unmarkAsStartOrEndNode();
		}
		myGraph.setStartNode(node);
		myGraph.resetMarking();
		pressed = MODUS_STANDARD;
		setGraphModus(pressed);
		setLayoutManager();

		// the graph might be changed
		checkDirty();
	}

	/**
	 * Adds a new node to the graph
	 * 
	 * @param x
	 *            the x coordinate
	 * @param y
	 *            the y coordinate
	 */
	protected void clickNewNode(int x, int y) {
		AlvisGraphNode gn = myGraph.makeGraphNode(""
				+ myGraph.getAdmin().getId());

		gn.setLocation(x - gn.getSize().width / 2, y - gn.getSize().height / 2);

		// the graph might be changed
		checkDirty();
	}

	/**
	 * Set modus that is activated to users mouse click changes mouse icon
	 * 
	 * @param pressed
	 *            key to decide which cursor will be chosen
	 */
	private void setGraphModus(int pressed) {
		Cursor cursor = oldCursor;
		cursor = new Cursor(Display.getCurrent(),
				loadImageData("icons/editor/graph_move.png"), 8, 8);
		switch (pressed) {
		case (MODUS_MOVE):
			cursor = new Cursor(Display.getCurrent(),
					loadImageData("icons/editor/graph_move.png"), 8, 8);
			myGraph.setCursor(cursor);
			break;
		case (MODUS_NODE):
			cursor = new Cursor(Display.getCurrent(),
					loadImageData("icons/editor/graph_add.png"), 8, 8);
			myGraph.setCursor(cursor);
			break;
		case (MODUS_CONNECTION):
			cursor = new Cursor(Display.getCurrent(),
					loadImageData("icons/editor/graph_connection.png"), 8, 8);
			myGraph.setCursor(cursor);
			break;
		case (MODUS_START):
			cursor = new Cursor(Display.getCurrent(),
					loadImageData("icons/editor/graph_startnode.png"), 8, 8);
			myGraph.setCursor(cursor);
			break;
		case (MODUS_END):
			cursor = new Cursor(Display.getCurrent(),
					loadImageData("icons/editor/graph_endnode.png"), 8, 8);
			myGraph.setCursor(cursor);
			break;
		case (MODUS_DELETE):
			cursor = new Cursor(Display.getCurrent(),
					loadImageData("icons/editor/graph_delete.png"), 8, 8);
			myGraph.setCursor(cursor);
			break;
		default:
			myGraph.setCursor(cursor);
		}
	}

	// * @param type tree or circle, tree==0,circle==1
	// * @param width either average width of tree or number of circle nodes
	// * @param depth depth of tree, don't care if its a circle
	/**
	 * creates tree or circle and adds it to the graph editor
	 */
	public void autoFill() {

		AddTreeWindow adw = new AddTreeWindow(new Shell());
		int result = adw.open();
		if (result == -1)
			return;

		int depth = result % 65536 /* (2^16) */;
		int width = result / 65536;

		if (width == 0) {
			myGraph.createCircle(depth);
		} else {
			myGraph.createTree(depth, width, null);
		}

		setLayoutManager();
		checkDirty();

	}

	/**
	 * clears the graph editor by creating a new alvis save
	 */
	public void clearGraph() {
		MessageBox sure = new MessageBox(myGraph.getShell(), SWT.ICON_WARNING
				| SWT.YES | SWT.NO);
		sure.setMessage(Messages.getLabel("resetAll"));

		if (sure.open() == SWT.YES) {
			myGraph.resetContent();
			checkDirty();
		}
	}

	/**
	 * removes highlighted node
	 */
	protected void removeHighlightedNode() {
		myGraph.removeHighlightedNode();
	}

	/**
	 * removes highlighted connection
	 */
	protected void removeHighlightedConnection() {
		myGraph.removeHighlightedConnection();
	}

	/**
	 * switches between layouts
	 */
	public void setLayoutManager() {
		myGraph.placeNodes();
		checkDirty();
	}

	/**
	 * saves positions of graph nodes
	 */
	public void savePositions() {
		myGraph.saveNodes();
	}

	/**
	 * loads positions of graph nodes
	 */
	public void loadPositions() {
		myGraph.loadNodes();
	}

	// IGraphEditor editorExtension;

	// public void doSave(final IProgressMonitor monitor) {
	// editorExtension.doSave(monitor);
	// }

	/**
	 * isSaveAsAllowed? Currently not!
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * Save the Graph as... Currently not allowed
	 */
	@Override
	public void doSaveAs() {

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		setPartName(input.getName());
		myInput = input;
		myInputFilePath = ((FileEditorInput) input).getPath().toString();
		// TODO Backinto plugin

	}

	// public boolean isDirty() {
	// return editorExtension.isDirty();
	// }

	// public void createPartControl(Composite parent) {
	// activateEditorExtension(parent);
	//
	// editorExtension.addPropertyChangeListener(this);
	//
	//
	//
	// }

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
	}

	// /************************
	// * THE EDITOR EXTENSION *
	// ************************/
	//
	// /**
	// * This method activates the editor that is in the plugin
	// */
	// private void activateEditorExtension(Composite parent) {
	// IConfigurationElement[] config = Platform
	// .getExtensionRegistry()
	// .getConfigurationElementsFor(
	// "de.unisiegen.informatik.bs.alvis.editors.extensions.graph");
	// try {
	// for (IConfigurationElement e : config) {
	// final Object o = e.createExecutableExtension("class");
	// final Composite par = parent;
	// if (o instanceof IGraphEditor) {
	// editorExtension = (IGraphEditor) o;
	// editorExtension.createEditor(par, getEditorInput());
	// }
	// }
	// } catch (CoreException ex) {
	// System.out.println(ex.getMessage());
	// }
	// }
	//
	// @Override
	// public void propertyChange(PropertyChangeEvent arg0) {
	// if (arg0.getNewValue() instanceof Integer) {
	// firePropertyChange(IEditorPart.PROP_DIRTY);
	// }
	// }

	public static Object deserialize(String filename) {
		// System.out.println(filename);//TODO weg
		long filesize = new File(filename).length();
		Object seri = null;
		if (filesize > 7) {// TODO this is not so cool check it (SIMON)

			BufferedInputStream fis = null;
			XStream xstream = new XStream(new DomDriver());

			try {
				fis = new BufferedInputStream(new FileInputStream(filename));

				seri = xstream.fromXML(new BufferedInputStream(
						new FileInputStream(filename)));
				fis.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return seri;
	}

}
