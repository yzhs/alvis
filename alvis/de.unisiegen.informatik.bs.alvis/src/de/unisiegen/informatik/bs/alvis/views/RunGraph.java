/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.views;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.IRunVisualizer;
import de.unisiegen.informatik.bs.alvis.tools.IO;

/**
 * @author simon
 * We search for extensions for the extension point.
 * We list all Objects that contribute this ext.point.
 * We give our example and our parent to the extensions.
 * If the extension feels responsible for the input then its
 * addVisualizing method visualizes the input.
 * If not the extension returns false and gets kicked out of the list.
 */
public class RunGraph extends ViewPart {
	
	ArrayList<IRunVisualizer> myRunVisualizers = new ArrayList<IRunVisualizer>();

	private Composite myParent;
	private String myInputFilePath;

	public static final String ID = 
		"de.unisiegen.informatik.bs.alvis.views.run.graph"; // TODO change id
	
	public void createPartControl(Composite parent) {
		myParent = parent;
		try {
		myInputFilePath = Platform.getInstanceLocation().getURL().getPath() +
			Activator.getDefault().getActiveRun().getExampleFile();
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

		activateExtensions();
		handExampleToExtensions();
	}



	/**
	 * Activate the Extensions and save the instances of IRunVisualizer.
	 */
	private void activateExtensions() {
        IExtensionRegistry registry = Platform.getExtensionRegistry();
        IExtensionPoint extensionPoint = registry.getExtensionPoint(
        		"de.unisiegen.informatik.bs.alvis.runvisualizer");
        IExtension[] extensions = extensionPoint.getExtensions();
        
        //	 * For all Extensions that contribute:
        for (int i = 0; i < extensions.length; i++)
        {
            IExtension extension = extensions[i];
            IConfigurationElement[] elements = extension.getConfigurationElements();
            for (int j = 0; j < elements.length; j++)
            {
                try
                {
                    IConfigurationElement element = elements[j];
                    IRunVisualizer runvizual = (IRunVisualizer)element.
                    	createExecutableExtension("class");
                    //	Save the found IRunVisualizer in a list
                    myRunVisualizers.add(runvizual);
                }
                catch (CoreException e)
                {
                	e.printStackTrace();
                }
            }
        }
	}
	
	/**
	 * Calls all IRunVisualizer and hand down the myParent and the myInputFilePath
	 */
	private void handExampleToExtensions() {
		// For all registered extensions
		for(IRunVisualizer runviz : myRunVisualizers) {
			// Call the method and if the extension returns false then
			// the extension does not know about the type in myInputFilePath...
			if(!runviz.addVisualizing(myParent, myInputFilePath))
				// ... and we delete it.
				myRunVisualizers.remove(runviz);
		}
	}
	
	
	/* Methods we do not use */
	public void setFocus() {
	}
}
