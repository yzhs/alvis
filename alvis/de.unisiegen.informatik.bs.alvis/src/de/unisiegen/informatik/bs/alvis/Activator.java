package de.unisiegen.informatik.bs.alvis;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeObject;
import de.unisiegen.informatik.bs.alvis.virtualmachine.AlvisGraph;
import de.unisiegen.informatik.bs.alvis.vm.VirtualMachine;
//import de.unisiegen.informatik.bs.alvis.vm
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

	// The shared instance
	private static Activator plugin;
	
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
	
	
	
	private PseudoCodeObject runObject;
	public void setRunObject(PseudoCodeObject runObject) {
		this.runObject = runObject;
	}

	public PseudoCodeObject getRunObject() {
		return runObject;
	}
	
	public void setActiveRun(Run activeRun) {
		this.activeRun = activeRun;
	}
	
	public Run getActiveRun() {
		return this.activeRun;
	}
	
	private ArrayList<PseudoCodeObject> pseudoCodeList = new ArrayList<PseudoCodeObject>();

	public void setPseudoCodeList(ArrayList<PseudoCodeObject> pseudoCodeList) {
		this.pseudoCodeList = pseudoCodeList;
	}

	public ArrayList<PseudoCodeObject> getPseudoCodeList() {
		return pseudoCodeList;
	}
	
	private VirtualMachine vm;
	public void runStart() {
		vm = VirtualMachine.getInstance();
		vm.removeOldParameters();
		vm.resetState();
		
		// Hier muss das plugin nach datentypen gefragt werden
		// aus dem primitiv
		// typename
//		Graph gr = new Graph(this.runGraph.getAllNodesG(), 
//				this.runGraph.getAllConnectionsG());
		vm.addParameter(runObject);
		for(PseudoCodeObject pseudoObj : pseudoCodeList) {
			// Currently there are two objects in there
			// startnode and end node
			vm.addParameter(pseudoObj);
		}
		
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

		vm.startDefaultRun();
	}

	public void runNext() {
		vm.stepForward();
	}

	public void runBack() {
		vm.stepBackward();
	}
}
