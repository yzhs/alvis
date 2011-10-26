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
import java.util.Arrays;
import java.util.Collections;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

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
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisSave;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisSerialize;
import de.unisiegen.informatik.bs.alvis.io.dialogs.AskMeAgain;
import de.unisiegen.informatik.bs.alvis.io.dialogs.CheckDialog;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

/**
 * @author simon
 * 
 */
public class RunVisualizer implements IRunVisualizer {

	private AlvisGraph myGraph;
	private Composite myParent;
	private String myInputFilePath;
	private PCGraph codeGraph;
	
	// these 'random' numbers make sure, the algorithm
	// does not get the same parameter twice
	int randomNumberVertex = 0;
	int randomNumberEdge = 0;

	/**
	 * Adds the content of input to the parent
	 */
	@Override
	public boolean addVisualizing(Composite parent, String inputFilePath, String fileExtension) {
		if(!fileExtension.equals(de.unisiegen.informatik.bs.alvis.graph.Activator.getDefault().getFileExtension()))
			return false;
		
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
		// if (typ == null && bezeichner.equals("G")) {
		// typ = new PCGraph();
		// }
		// if (typ == null && bezeichner.equals("V")) {
		// typ = new PCVertex();
		// }
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
				if(randomNumberVertex >= allPCVertex.size())
					randomNumberVertex = 0; // if we are out of bounds, reset the 'random' number
				// Return a node that has not already been chosen
				result.add(allPCVertex.get(randomNumberVertex++));
			} else {
				Collections.sort(allPCVertex);
				while(result.isEmpty()){
					AskMeAgain ask = new AskMeAgain(true);
					CheckDialog getVertex = new CheckDialog(myParent.getShell(),
							allPCVertex, // From
							result, // To
							ask, 1, // How much
							Messages.RunVisualizer_Choose1 + bezeichner + "\"", // window title //$NON-NLS-2$
							Messages.RunVisualizer_Choose2, // Title
							Messages.RunVisualizer_Choose3 + bezeichner + "\""); // //$NON-NLS-2$
					getVertex.open();
					if (ask.getAsk() == false) {
						Activator.getDefault().getActiveRun()
								.setOnStartPoint(EStartPoint.RAND);
					}
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
				if(randomNumberEdge >= allPCEdge.size())
					randomNumberEdge = 0; // if we are out of bounds, reset the 'random' number
				// Return a node that has not already been chosen
				result.add(allPCEdge.get(randomNumberEdge++));
				// Just return the first
				result.add(allPCEdge.get(0));
			} else {
				while(result.isEmpty()){
					AskMeAgain ask = new AskMeAgain(true);
					CheckDialog getEdge = new CheckDialog(myParent.getShell(),
							allPCEdge, // From
							result, // To
							ask, 1, // How much
							Messages.RunVisualizer_Choose1 + bezeichner + "\"", // window title //$NON-NLS-2$
							Messages.RunVisualizer_Choose2, // Title
							Messages.RunVisualizer_Choose3 + bezeichner + "\""); // //$NON-NLS-2$
					getEdge.open();
					if (ask.getAsk() == false) {
						Activator.getDefault().getActiveRun()
								.setOnStartPoint(EStartPoint.RAND);
					}
				}
			}
		}
		return result;
	}

	@Override
	public Image getImage() {
	
		return myGraph.getImage();

	}

	@Override
	public Object getSourceCode() {
		// no source code from here
		return null;
	}

	@Override
	public boolean isRun() {
		return true;
	}

}
