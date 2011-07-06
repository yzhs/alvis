/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.views;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IRunVisualizer;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.vm.VirtualMachine;

/**
 * @author simon 
 * We search for extensions for the extension point. We list all
 * Objects that contribute this ext.point. We give our example and our
 * parent to the extensions. If the extension feels responsible for the
 * input then its addVisualizing method visualizes the input. If not the
 * extension returns false and gets kicked out of the list.
 */
public class RunGraph extends ViewPart implements IExportItem{

	ArrayList<IRunVisualizer> myRunVisualizers = new ArrayList<IRunVisualizer>();

	private Composite myParent;
	private String myInputFilePath;

	public static final String ID = "de.unisiegen.informatik.bs.alvis.views.run.graph"; // TODO
																						// change
																						// id

	@Override
	public void createPartControl(Composite parent) {
		myParent = parent;
		try {
			myInputFilePath = Platform.getInstanceLocation().getURL().getPath();
			myInputFilePath += Activator.getDefault().getActiveRun()
					.getExampleFile();
			if (System.getProperty("os.name").contains("win")) {
				if (myInputFilePath.charAt(0) == '\\'
						|| myInputFilePath.charAt(0) == '/') {
					myInputFilePath = myInputFilePath.substring(1);
				}
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		// Activate the Extension
		// Look for plug-ins that can draw our objects
		activateExtensions();

		// Give the known
		handExampleToExtensions();

		// SetParameters to vm
		setParameters();
	}

	public void setParameters() {
		Map<PCObject, String> parameters = VirtualMachine.getInstance().getParametersTypesAlgo("algo"); // TODO
		ArrayList<PCObject> pcObjects = new ArrayList<PCObject>();
		
		for(PCObject para : parameters.keySet()) {
			for (IRunVisualizer runviz : myRunVisualizers) {
				pcObjects.addAll(runviz.chooseVariable(para, parameters.get(para)));
//				
//				// Nur derzeit
//																	// so sollte von
//																	// der VM kommen
//																	// was benötigt
//																	// wird
//				pcObjects.addAll(runviz.chooseVariable(null, "V")); // Currently
//				Activator.getDefault().getPseudoCodeList().clear();
//				Activator.getDefault().getPseudoCodeList().addAll(pcObjects);
			}
		}
		Activator.getDefault().getPseudoCodeList().clear();
		Activator.getDefault().getPseudoCodeList().addAll(pcObjects);
	}

	/**
	 * Activate the Extensions and save the instances of IRunVisualizer.
	 */
	private void activateExtensions() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint = registry
				.getExtensionPoint("de.unisiegen.informatik.bs.alvis.runvisualizer");
		IExtension[] extensions = extensionPoint.getExtensions();

		// * For all Extensions that contribute:
		for (int i = 0; i < extensions.length; i++) {
			IExtension extension = extensions[i];
			IConfigurationElement[] elements = extension
					.getConfigurationElements();
			for (int j = 0; j < elements.length; j++) {
				try {
					IConfigurationElement element = elements[j];
					IRunVisualizer runvizual = (IRunVisualizer) element
							.createExecutableExtension("class");
					// Save the found IRunVisualizer in a list
					myRunVisualizers.add(runvizual);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Calls all IRunVisualizer and hand down the myParent and the
	 * myInputFilePath
	 */
	private void handExampleToExtensions() {
		// For all registered extensions
		for (IRunVisualizer runviz : myRunVisualizers) {
			// Call the method and if the extension returns false then
			// the extension does not know about the type in myInputFilePath...
			if (!runviz.addVisualizing(myParent, myInputFilePath))
				// ... and we delete it.
				myRunVisualizers.remove(runviz);
		}
	}

	/* Methods we do not use */
	@Override
	public void setFocus() {
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StyledText getSourceCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRun() {
		return true;
	}
}
