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
import de.unisiegen.informatik.bs.alvis.tools.IO;
import de.unisiegen.informatik.bs.alvis.virtualmachine.AlvisGraph;
import de.unisiegen.informatik.bs.alvis.virtualmachine.AlvisSave;
import de.unisiegen.informatik.bs.alvis.virtualmachine.AlvisSerialize;
import de.unisiegen.informatik.bs.alvis.virtualmachine.IRunVisualizer;

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
	private IRunGraph runGraph;

	private Composite myParent;
	private String myInputFilePath;

	public static final String ID = 
		"de.unisiegen.informatik.bs.alvis.views.run.graph"; // todo change id
	
	private AlvisGraph myGraph;
	public void createPartControl(Composite parent) {
		myParent = parent;
		try {
		myInputFilePath = Platform.getInstanceLocation().getURL().getPath() +
			Activator.getDefault().getActiveRun().getExampleFile();
//		AlvisSerialize seri = (AlvisSerialize)IO.deserialize(myInputFilePath);
//		myGraph = new AlvisGraph(parent, SWT.NONE);
//
//		new AlvisSave(myGraph, seri);
//		Activator.getDefault().setRunGraph(getGraph());

		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

		activateExtensions();
		handExampleToExtensions();
		greetExtensions();
	}


	public AlvisGraph getGraph() {
//		return runGraph.getGraph();
		return myGraph;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

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
                    //	* Save the IRunVisualizer
                    myRunVisualizers.add(runvizual);
                }
                catch (CoreException e)
                {
                	e.printStackTrace();
                }
            }
        }
	}
	
	private void handExampleToExtensions() {
		for(IRunVisualizer runviz : myRunVisualizers) {
			if(!runviz.addVisualizing(myParent, myInputFilePath))
				myRunVisualizers.remove(runviz);
		}
	}
	
	private void greetExtensions() {
		for(IRunVisualizer runviz : myRunVisualizers) {
			runviz.addVisualizing(null, null);
		}
	}

}
