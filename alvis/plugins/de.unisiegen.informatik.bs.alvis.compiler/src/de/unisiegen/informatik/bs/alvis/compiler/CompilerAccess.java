/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.compiler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;

import de.unisiegen.informatik.bs.alvis.io.files.FileCopy;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

/**
 * @author mays
 * 
 */
public class CompilerAccess {

	private static CompilerAccess instance;

	public static CompilerAccess getDefault() {
		if (instance == null)
			instance = new CompilerAccess();
		return instance;
	}

	private ArrayList<PCObject> datatypes;
	private ArrayList<String> datatypePackages;

	public boolean compile(String code, ArrayList<PCObject> datatypes) {
		// TODO Compilieren
		// CompilerManager manager = new CompilerManager();
		return true;
	}

	String algorithmPath = "";

	/**
	 * Returns the path to the algorithm file
	 * 
	 * @return
	 * @throws IOException
	 */
	public String getAlgorithmPath() throws IOException {
		String path = "";
		path = FileLocator.getBundleFile(Activator.getDefault().getBundle())
				.getCanonicalPath().toString();
		return algorithmPath;
	}

	/**
	 * This method copies the Dummy Algorithm file next to the PCAlgorithm file
	 * that is written by the user.
	 * To get the path of the created file see getAlgorithmPath().
	 * @param pathToAlgorithm
	 *            relative to Alvis-workspace e.g.: "project/src/Algorithm.algo"
	 * @return Name of the Java Algorithm file
	 */
	public String compileThisDummy(String pathToAlgorithm) {
		String SLASH = System.getProperty("file.separator");

		// the path were the translated java file is.
		String pathWhereTheJavaIs = "";
		try {
			pathWhereTheJavaIs = FileLocator
					.getBundleFile(Activator.getDefault().getBundle())
					.getCanonicalPath().toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// The compiled algorithm
		File source = new File(pathWhereTheJavaIs + SLASH + "Algorithm.java");

		// Get the path to algorithm and separate path and filename
		String[] splitedPathToAlgorithm = pathToAlgorithm.split("\\/");
		ArrayList<String> partsOfAlgoPath = new ArrayList<String>();
		for (String part : splitedPathToAlgorithm) {
			partsOfAlgoPath.add(part);
		}

		// getFileName
		String algoWorkSpaceFile = partsOfAlgoPath.remove(partsOfAlgoPath.size()-1);
		
		// getPath
		String algoWorkSpacePath = "";
		for (String part : partsOfAlgoPath) {
			algoWorkSpacePath += part + SLASH;
		}

//		for (String st : splitedPathToAlgorithm)
//			System.out.println(st);

		// Destination 
		File destination = new File(Platform.getInstanceLocation().getURL()
				.getPath()
				+ algoWorkSpacePath + "Algorithm.java");
		algorithmPath = Platform.getInstanceLocation().getURL().getPath()
				+ algoWorkSpacePath + SLASH;

		// Copy compiled file into the workspace
		FileCopy fileCopy = new FileCopy();
		fileCopy.copy(source, destination);

		// Still hard Coded.
		String javaFilePath = "Algorithm"; // TODO HARD CODED!
		return javaFilePath;
	}

	/* ******************************************
	 * The Datatypes and Packagenames *****************************************
	 */
	/**
	 * @param datatypes
	 *            the datatypes to set
	 */
	public void setDatatypes(ArrayList<PCObject> datatypes) {
		this.datatypes = datatypes;
	}

	/**
	 * @param datatypePackages
	 *            the datatypePackages to set
	 */
	public void setDatatypePackages(ArrayList<String> datatypePackages) {
		this.datatypePackages = datatypePackages;
	}

	public void testDatatypes() {
		System.out.println("Compiler shows its datatypes:");
		// Hier sind alle Datentypen
		for (PCObject obj : datatypes) {
			System.out.println(obj.getClass());
		}
		System.out.println("Compiler shows its packages:");
		// Hier sind alle Packagenames
		for (String obj : datatypePackages) {
			System.out.println(obj);
		}
	}

}
