/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.graph.run;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IRunVisualizer;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.PCEdge;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.PCGraph;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.PCVertex;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraph;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphConnection;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphNode;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisSave;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisSerialize;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCList;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

/**
 * @author simon
 * 
 */
public class RunVisualizer implements IRunVisualizer {

	private AlvisGraph myGraph;
	private Composite myParent;
	private String myInputFilePath;

	/**
	 * Adds the content of input to the parent
	 */
	@Override
	public boolean addVisualizing(Composite parent, String inputFilePath) {

		if (parent == null | inputFilePath == null) {
			System.out.println("You got me!"); // TODO was?! (Ändern : SImon)
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

			PCGraph codeGraph = new PCGraph();

			// Make a list that contains Nodes
			PCList<PCVertex> pseudoCodeVertexList = new PCList<PCVertex>();

			for (AlvisGraphNode node : myGraph.getAllNodes()) {
				pseudoCodeVertexList.add(codeGraph.getVertexFromGraphic(node));
			}

			// Make a list that contains Edges
			PCList<PCEdge> pseudoCodeEdgeList = new PCList<PCEdge>();

			for (AlvisGraphConnection connecton : myGraph.getAllConnections()) {
				// TODO Dingel soll diese Methode überprüfen.
				// Groth sollte mal sagen was er damit meint... welche Methode,
				// welches Ergebnis?
			}

			// Give the lists to the graph.
			codeGraph = new PCGraph(pseudoCodeVertexList, pseudoCodeEdgeList);

			Activator.getDefault().setRunObject(codeGraph);
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
			/*
			 * TODO (SIMON) Hier wurde der Graph erzeugt. Aus dem Object Graph
			 * muss nun ein PCObject gemacht werden, dass der VM als Parameter
			 * gereicht werden kann.
			 * 
			 * de.unisiegen.informatik.bs.alvis.Activator.getDefault().
			 * getPseudoCodeList().add();
			 * 
			 * Da die VM aber noch mehr Parameter von dieser Visualisierung hier
			 * gebrauchen kann sollten wir die irgentwie extrahieren. Vielleicht
			 * in einer ArrayList speichern und dann hochgeben.
			 * 
			 * Die Frage ist, wo soll die Entscheidung fallen, welche benutzt
			 * werden. Ich denke erstmal nach dem klick auf RunStart. Wie wir
			 * (Dingel) schon besprochenhaben aus der gesamtliste der datentypen
			 * alle Graphen aussuchen und dann alle knoten. Da nur ein Knoten
			 * gebraucht wird aber viele vorhadnen sind eine abfrage
			 */
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

}
