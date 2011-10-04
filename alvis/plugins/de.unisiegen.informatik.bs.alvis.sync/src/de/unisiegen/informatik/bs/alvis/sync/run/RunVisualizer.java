package de.unisiegen.informatik.bs.alvis.sync.run;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IRunVisualizer;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationCondition;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationSemaphore;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationThread;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCScenario;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisCondition;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisPrimitive;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisSave;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisScenario;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisSemaphore;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisSerialize;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisThread;

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
	public boolean addVisualizing(Composite parent, String inputFile,
			String fileExtension) {
		if (!fileExtension
				.equals(de.unisiegen.informatik.bs.alvis.sync.Activator
						.getDefault().getFileExtension()))
			return false;

		if (parent == null | inputFile == null) {
			return false;
		}
		myParent = parent;
		myInputFilePath = inputFile;
		if (!createScenario()) {
			return false;
		} else {
			return true;
		}
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

	public boolean createScenario() {
		boolean res = false;
		try {
			AlvisSerialize seri = (AlvisSerialize) deserialize(myInputFilePath);
			myScenario = new AlvisScenario(myParent, true);
			new AlvisSave(myScenario, seri);
			ArrayList<GraphicalRepresentation> primitives = new ArrayList<GraphicalRepresentation>();
			ArrayList<GraphicalRepresentationThread> threads = new ArrayList<GraphicalRepresentationThread>();
			ArrayList<GraphicalRepresentationSemaphore> semas = new ArrayList<GraphicalRepresentationSemaphore>();
			ArrayList<GraphicalRepresentationCondition> conds = new ArrayList<GraphicalRepresentationCondition>();
			for (AlvisPrimitive p : myScenario.getPrimitivesList()) {
				primitives.add(p);
			}
			for (AlvisThread t : myScenario.getThreadsList()) {
				threads.add(t);
			}
			for (AlvisSemaphore s : myScenario.getSemaphoresList()) {
				semas.add(s);
			}
			for (AlvisCondition c : myScenario.getConditionsList()) {
				conds.add(c);
			}
			codeScenario = new PCScenario(threads, primitives, semas, conds,
					myScenario.getBuffer());
			res = true;
		} catch (ClassCastException e) {
			return false;
		}
		return res;
	}

}
