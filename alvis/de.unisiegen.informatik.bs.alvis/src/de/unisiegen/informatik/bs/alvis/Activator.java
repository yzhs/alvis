package de.unisiegen.informatik.bs.alvis;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.unisiegen.informatik.bs.alvis.editors.AlgorithmPartitionScanner;
import de.unisiegen.informatik.bs.alvis.export.Export;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IDatatypeList;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.views.AlgorithmContainer;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.VirtualMachine;

/* Ein paar Notizen
 * 
 * Der Ordner in dem der Workspace liegt auf dem System:
 * Platform.getInstanceLocation().getURL().getPath();
 * 
 * 
 */

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.unisiegen.informatik.bs.alvis"; //$NON-NLS-1$
	/** Naming convention of partitioning */
	public static final String ALGORITHM_PARTITIONING = "___algorithm__partitioning____"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private AlgorithmPartitionScanner fPartitionsScanner;

	private Export myExport = new Export();

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	/**
	 * Attributes for a run.
	 */
	private Run activeRun;
	private AlgorithmContainer algorithmContainer = new AlgorithmContainer();
	private PCObject runObject;

	public void setRunObject(PCObject runObject) {
		this.runObject = runObject;
	}

	public PCObject getRunObject() {
		return runObject;
	}

	public void setActiveRun(Run activeRun) {
		this.activeRun = activeRun;
	}

	public Run getActiveRun() {
		return this.activeRun;
	}

	/**
	 * @return the AlgorithmPartition Scannner used for the Editor
	 */
	public AlgorithmPartitionScanner getAlgorithmPartitionScanner() {
		if (fPartitionsScanner == null) {
			fPartitionsScanner = new AlgorithmPartitionScanner();
			return fPartitionsScanner;
		}
		return fPartitionsScanner;
	}

	private ArrayList<PCObject> pseudoCodeList = new ArrayList<PCObject>();

	public void setPseudoCodeList(ArrayList<PCObject> pseudoCodeList) {
		this.pseudoCodeList = pseudoCodeList;
	}

	public ArrayList<PCObject> getPseudoCodeList() {
		return pseudoCodeList;
	}

	private VirtualMachine vm = VirtualMachine.getInstance();;

	public void runStart() {
		vm.removeAllBPListener();
		vm.stopAlgos();
		vm.setParameter("algo", pseudoCodeList); //$NON-NLS-1$
		// if(this.runGraph.getStartNode() != null)
		// vm.addParameter(gr.getVertexFromGraphic(
		// this.runGraph.getStartNode()));
		// else {
		// for(AlvisGraphNode node : this.runGraph.getAllNodes()) {
		// vm.addParameter(gr.getVertexFromGraphic(node));
		// break;
		// }
		// }
		// if(this.runGraph.getEndNode() != null) {
		// vm.addParameter(gr.getVertexFromGraphic(this.runGraph.getEndNode()));
		// }
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
				Activator.getDefault().algorithmContainer.removeAllCurrentLine();
				Activator.getDefault().algorithmContainer.addCurrentLine(BreakPointNumber);
			}
		});
		vm.startAlgos();
	}

	public void runNext() {
		vm.stepAlgoForward();
	}

	public void runBack() {
		// TODO change for multiple Algos
		vm.stepAlgoBackward("algo");
	}

	public void registerExport(IExportItem item) {
		myExport.register(item);
	}

	public ArrayList<IExportItem> getExportItems() {
		return myExport.getExportItems();
	}

	/**
	 * Set the compiled .java algorithm path TODO @throws VMException
	 * 
	 * @param pathToAlgoInJava
	 */
	public boolean setJavaAlgorithmToVM(String pathToFile, String fileName) /*
																			 * throws
																			 * Exception
																			 */{
		// TODO vm.addAlgo needs three arguments: key to identify algo (any
		// given String it's just used to address this algo for mutliple
		// operations ) , path to
		// the java algo file, the java algo filename, without the typending
		// .java
		// Add all this to VM.
		return vm.addAlgoToVM("algo", pathToFile, fileName);
		 //			return vm.addAlgoToVM("first", pathToAlgoInJava); //$NON-NLS-1$
	}
	
	/**
	 * Get an instance of each datatype that is used in some plug-in.
	 * With this instance you can get informations about the datatypes.
	 * @return a list from all datatypes in the plug-ins
	 */
	public ArrayList<PCObject> getAllDatatypes() {
		ArrayList<PCObject> allDatatypes = new ArrayList<PCObject>();
		
        IExtensionRegistry registry = Platform.getExtensionRegistry();
        IExtensionPoint extensionPoint = registry.getExtensionPoint(
        		"de.unisiegen.informatik.bs.alvis.extensionpoints.datatypelist"); //$NON-NLS-1$
        IExtension[] extensions = extensionPoint.getExtensions();

        //     * For all Extensions that contribute:
        for (int i = 0; i < extensions.length; i++)
        {
            IExtension extension = extensions[i];
            IConfigurationElement[] elements = extension.getConfigurationElements();
            for (int j = 0; j < elements.length; j++)
            {
                try
                {
                    IConfigurationElement element = elements[j];
                    IDatatypeList datatypes = (IDatatypeList)element.
                        createExecutableExtension("class"); //$NON-NLS-1$
                    // Save the found datatypes in allDatatypes
                    allDatatypes.addAll(datatypes.getAllDatatypesInThisPlugin());
                }
                catch (CoreException e)
                {
                    e.printStackTrace();
                }
            }
        }
        // The list with all found datatypes
		return allDatatypes;
	}

	public void setAlgorithmContainer(AlgorithmContainer algorithmContainer) {
		this.algorithmContainer = algorithmContainer;
	}

	public AlgorithmContainer getAlgorithmContainer() {
		return algorithmContainer;
	}

	public void resetEverythingThatHasToDoWithTheRun() {
//		vm.clear();
//		vm.removeAllBPListener();
//		vm.stopAlgos();
//		vm.clear();
	}

}
