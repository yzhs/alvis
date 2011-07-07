/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.graph.run;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.editors.EStartPoint;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IRunVisualizer;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.GraphicalRepresentationEdge;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.GraphicalRepresentationVertex;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.PCEdge;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.PCGraph;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.PCVertex;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraph;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphConnection;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphNode;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisSave;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisSerialize;
import de.unisiegen.informatik.bs.alvis.io.dialogs.*;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCList;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.SortableCollection;

/**
 * @author simon
 * 
 */
public class RunVisualizer implements IRunVisualizer {

	private AlvisGraph myGraph;
	private Composite myParent;
	private String myInputFilePath;
	private PCGraph codeGraph;

	/**
	 * Adds the content of input to the parent
	 */
	@Override
	public boolean addVisualizing(Composite parent, String inputFilePath) {

		if (parent == null | inputFilePath == null) {
			return false;
		}

		myParent = parent;
		myInputFilePath = inputFilePath;

		// Check if input is for this plugin
		if (!createGraph()) {
			return false;
		} else {
			/*
			 * Plug the myGraph Object to the Alvis Activator For that we have
			 * to convert the Graph and all its containing to Objects of the
			 * PseudoCode kind.
			 */

			// Make a list that contains Nodes
			// PCList<PCVertex> pseudoCodeVertexList = new PCList<PCVertex>();

			// for (AlvisGraphNode node : myGraph.getAllNodes()) {
			// pseudoCodeVertexList.add(codeGraph.getVertexFromGraphic(node));
			// }

			// ArrayList allVertex = myGraph.getVertex();
			// ArrayList allConnection = myGraph.getEdges();
			// PCGraph codeGraph = new PCGraph(allVertex, allConnection);
			// // Make a list that contains Edges
			// PCList<PCEdge> pseudoCodeEdgeList = new PCList<PCEdge>();

			// for (AlvisGraphConnection connecton :
			// myGraph.getAllConnections()) {
			// // TODO Dingel soll diese Methode überprüfen.
			// // Groth sollte mal sagen was er damit meint... welche Methode,
			// // welches Ergebnis?
			// }

			// Give the lists to the graph.
			// codeGraph = new PCGraph(myGraph.getVertex(), myGraph.getEdges());

			// Activator.getDefault().setRunObject(codeGraph);
		}

		return true;
	}

	/**
	 * Tries to cast the input to the recommend input of this plug-in
	 * 
	 * @return true if success
	 */
	private boolean createGraph() {
		boolean success = false;
		try {
			AlvisSerialize seri = (AlvisSerialize) deserialize(myInputFilePath);
			myGraph = new AlvisGraph(myParent, SWT.NONE);
			new AlvisSave(myGraph, seri);
			codeGraph = new PCGraph(myGraph.getVertex(), myGraph.getEdges());
			success = true;
		} catch (ClassCastException e) {
			return false;
		}
		return success;
	}

	public static Object deserialize(String filename) {
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

	@Override
	public ArrayList<PCObject> chooseVariable(PCObject typ, String bezeichner) {
		ArrayList<PCObject> result = new ArrayList<PCObject>();

		// Temporär
//		 if (typ == null && bezeichner.equals("G")) {
//		 typ = new PCGraph();
//		 }
//		 if (typ == null && bezeichner.equals("V")) {
//		 typ = new PCVertex();
//		 }
		//

		if (typ instanceof PCGraph) {
			result.add(codeGraph);
			return result;
		}
		if (typ instanceof PCVertex) {
			ArrayList<PCVertex> allPCVertex = new ArrayList<PCVertex>();
			for (GraphicalRepresentationVertex node : myGraph.getVertex()) {
				allPCVertex.add(codeGraph.getVertexFromGraphic(node));
			}
			if (result.size() == 1
					|| Activator.getDefault().getActiveRun().getOnStartPoint()
							.equals(EStartPoint.RAND)) {
				// Just return the first
				result.add(allPCVertex.get(0));
			} else {
				// TODO SORT LIST HERE
				AskMeAgain ask = new AskMeAgain(true);
				CheckDialog getVertex = new CheckDialog(myParent.getShell(),
						allPCVertex, // From
						result, // To
						ask, 1, // How much
						"Choose \"" + bezeichner + "\"", // window title
						"Choose parameter", // Title
						"Choose one parameter for \"" + bezeichner + "\""); //
				getVertex.open();
				if (ask.getAsk() == false) {
					Activator.getDefault().getActiveRun()
							.setOnStartPoint(EStartPoint.RAND);
				}
			}
		}
		if (typ instanceof PCEdge) {
			ArrayList<PCEdge> allPCEdge = new ArrayList<PCEdge>();
			for (GraphicalRepresentationEdge edge : myGraph.getEdges()) {
				allPCEdge.add(codeGraph.getEdgeFromGraphic(edge));
			}
			if (result.size() == 1
					|| Activator.getDefault().getActiveRun().getOnStartPoint()
							.equals(EStartPoint.RAND)) {
				// Just return the first
				result.add(allPCEdge.get(0));
			} else {
				AskMeAgain ask = new AskMeAgain(true);
				CheckDialog getEdge = new CheckDialog(myParent.getShell(),
						allPCEdge, // From
						result, // To
						ask, 1, // How much
						"Choose \"" + bezeichner + "\"", // window title
						"Choose parameter", // Title
						"Choose one parameter for \"" + bezeichner + "\""); //
				getEdge.open();
				if (ask.getAsk() == false) {
					Activator.getDefault().getActiveRun()
							.setOnStartPoint(EStartPoint.RAND);
				}
			}
		}
		return result;
	}

	@Override
	public Image getImage() {
		Image screenshot;
		int width = myGraph.getSize().x;
		int height = myGraph.getSize().y;
		GC gc = new GC(myGraph);
		gc.drawText("Created by Alvis", 5, 5);
		gc.drawRectangle(new Rectangle(0, 0, width - 1, height - 1));
		screenshot = new Image(Display.getCurrent(), width, height);
		gc.copyArea(screenshot, 0, 0);

		gc.dispose();
		myGraph.redraw();

		System.out.println("LALA");// TODO weg

		return screenshot;

	}

	@Override
	public StyledText getSourceCode() {
		// no source code from here
		return null;
	}

	@Override
	public boolean isRun() {
		return true;
	}

}
