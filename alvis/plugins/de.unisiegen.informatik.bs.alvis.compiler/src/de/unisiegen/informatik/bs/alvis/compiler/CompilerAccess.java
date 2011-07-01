/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.compiler;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.runtime.FileLocator;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;


/**
 * @author mays
 *
 */
public class CompilerAccess {
	
	private static CompilerAccess instance;
	
	public static CompilerAccess getDefault() {
		if(instance == null)
			instance = new CompilerAccess();
		return instance;
	}
	
	private ArrayList<PCObject> datatypes;
	private ArrayList<String> datatypePackages;
	
	
	public boolean compile(String code, ArrayList<PCObject> datatypes) {
		// TODO Compilieren
//		CompilerManager manager = new CompilerManager();
		return true;
	}
	
	/**
	 * Returns the path to the algorithm file
	 * @return
	 * @throws IOException
	 */
	public String getAlgorithmPath() throws IOException {
		String path = "";
		path = FileLocator.getBundleFile(Activator.getDefault().getBundle()).getCanonicalPath().toString();
		return path;
	}
	
	/**
	 * 
	 * @param code
	 * @param datatypes
	 * @return
	 */
	public String compileThisDummy(String code, ArrayList<PCObject> datatypes) {	
		String javaFilePath = "Algorithm"; // TODO HARD CODED!
		return javaFilePath;
	}

	
	/* ******************************************
	 * The Datatypes and Packagenames
	 * ******************************************/
	/**
	 * @param datatypes the datatypes to set
	 */
	public void setDatatypes(ArrayList<PCObject> datatypes) {
		this.datatypes = datatypes;
	}

	/**
	 * @param datatypePackages the datatypePackages to set
	 */
	public void setDatatypePackages(ArrayList<String> datatypePackages) {
		this.datatypePackages = datatypePackages;
	}

	public void testDatatypes() {
		System.out.println("Compiler shows its datatypes:");
		// Hier sind alle Datentypen
		for(PCObject obj : datatypes) {
			System.out.println(obj.getClass());
		}
		System.out.println("Compiler shows its packages:");
		// Hier sind alle Packagenames
		for(String obj : datatypePackages) {
			System.out.println(obj);
		}
	}

}
