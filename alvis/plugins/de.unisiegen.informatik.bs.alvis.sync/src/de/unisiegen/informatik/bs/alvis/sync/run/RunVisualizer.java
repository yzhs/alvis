package de.unisiegen.informatik.bs.alvis.sync.run;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IRunVisualizer;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationSemaphore;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCScenario;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCSemaphore;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisScenario;

public class RunVisualizer implements IRunVisualizer {
	
	private AlvisScenario myScenario;
	private Composite myParent;
	private String myInputFilePath;
	private PCScenario codeScenario;
	

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getSourceCode() {

		return null;
	}

	@Override
	public boolean isRun() {
		
		return true;
	}
	
	public static Object deserialize(String filename) {
		Object o = null;
		BufferedInputStream bis = null;
		XStream x = new XStream(new DomDriver());
		try {
			bis = new BufferedInputStream(new FileInputStream(filename));
			o = x.fromXML(bis);
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return o;
	}

	@Override
	public boolean addVisualizing(Composite parent, String inputFile) {
		if (parent == null | inputFile == null) {
			return false;
		}
		return false;
	}

	@Override
	public ArrayList<PCObject> chooseVariable(PCObject typ, String bezeichner) {
		ArrayList<PCObject> res = new ArrayList<PCObject>();
		
		if (typ instanceof PCScenario) {
			res.add(codeScenario);
			return res;
		}
		return null;
	}

}
