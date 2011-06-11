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
	
	public static boolean compile(String code, ArrayList<PCObject> datatypes) {
		// TODO Compilieren
//		CompilerManager manager = new CompilerManager();
		return true;
	}
	
	/**
	 * 
	 * @param code
	 * @param datatypes
	 * @return
	 */
	public static String compileThisDummy(String code, ArrayList<PCObject> datatypes) {
//		String javaFilePath = "-1";
//		try {
//			String dir = FileLocator.getBundleFile(
//					Activator.getDefault().getBundle())
//					.getAbsolutePath().toString();
//////			 javaFilePath = dir+"/Algorithm.java";
////			 javaFilePath = "Algorithm";
//////			 javaFilePath = javaFilePath.replaceAll("\\\\", "/");
////
////			 System.out.println("Dir: " + dir);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}	
		String javaFilePath = "Algorithm"; // TODO HARD CODED!
		return javaFilePath;
	}
}
