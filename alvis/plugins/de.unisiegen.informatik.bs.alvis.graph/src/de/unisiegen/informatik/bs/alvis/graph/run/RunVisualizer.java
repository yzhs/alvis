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
import org.eclipse.ui.IEditorInput;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraph;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisSave;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisSerialize;
import de.unisiegen.informatik.bs.alvis.virtualmachine.IRunVisualizer;

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
	public boolean addVisualizing(Composite parent, String inputFilePath) {

		if(parent == null | inputFilePath == null) {
			System.out.println("You got me!");
			return false;
		}
		
		myParent = parent;
		myInputFilePath = inputFilePath;
		
		// Check if input is for this plugin
		if(createGraph()) {
			
		}
		
		return true;
	}

	/** 
	 * Tries to cast the input to the recomment input of this plugin
	 * @return true if success
	 */
	private boolean createGraph() {
		boolean success = false;
		try {
			AlvisSerialize seri = (AlvisSerialize)deserialize(myInputFilePath);
			myGraph = new AlvisGraph(myParent, SWT.NONE);
			new AlvisSave(myGraph, seri);
			success = true;
		} catch(ClassCastException e) {
			
		}
		return success;
	}
	
	
	public static Object deserialize(String filename) {
		long filesize = new File(filename).length();
		Object seri = null;
		if(filesize > 7) {// TODO this is not so cool check it (SIMON)
		
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
