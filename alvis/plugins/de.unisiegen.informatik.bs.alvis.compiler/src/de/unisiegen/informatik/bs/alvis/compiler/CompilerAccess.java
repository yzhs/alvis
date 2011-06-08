/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.compiler;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

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
}
