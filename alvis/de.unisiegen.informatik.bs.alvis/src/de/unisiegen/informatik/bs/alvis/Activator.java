package de.unisiegen.informatik.bs.alvis;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.unisiegen.informatik.bs.alvis.editors.AlgorithmPartitionScanner;
import de.unisiegen.informatik.bs.alvis.export.Export;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
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
	public static final String ALGORITHM_PARTITIONING = "___algorithm__partitioning____";

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
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
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
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	


	/**
	 * Attributes for a run.
	 */
	private Run activeRun;
	
	
	
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
		if (fPartitionsScanner==null)
		{
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
	
	private VirtualMachine vm;
	public void runStart() {
		ArrayList<PCObject> paras = new ArrayList<PCObject>();
		vm = VirtualMachine.getInstance();
		vm.clear();
		 
		// Hier muss das plugin nach datentypen gefragt werden
		// aus dem primitiv
		// typename
//		Graph gr = new Graph(this.runGraph.getAllNodesG(), 
//				this.runGraph.getAllConnectionsG());

		paras.add(runObject);
		for(PCObject pseudoObj : pseudoCodeList) {
			// Currently there are two objects in there
			// startnode and end node
			paras.add(pseudoObj);
		}
		vm.setParameter("algo", paras);
//		if(this.runGraph.getStartNode() != null)
//			vm.addParameter(gr.getVertexFromGraphic(
//					this.runGraph.getStartNode()));
//		else {
//			for(AlvisGraphNode node : this.runGraph.getAllNodes()) {
//				vm.addParameter(gr.getVertexFromGraphic(node));
//				break;
//			}
//		}
//		if(this.runGraph.getEndNode() != null) {
//			vm.addParameter(gr.getVertexFromGraphic(this.runGraph.getEndNode()));
//		}

		vm.startAlgos();
	}

	public void runNext() {
		vm.stepAlgoBackward("algo");
	}

	public void runBack() {
		vm.stepAlgoForward();
	}

	public void registerExport(IExportItem item) {
		myExport.register(item);
	}
	
	public ArrayList<IExportItem> getExportItems() {
		return myExport.getExportItems();
	}
	
}
