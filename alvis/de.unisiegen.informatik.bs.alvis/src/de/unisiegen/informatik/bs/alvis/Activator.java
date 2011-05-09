package de.unisiegen.informatik.bs.alvis;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.unisiegen.informatik.bs.alvis.datatypes.Graph;

import de.unisiegen.informatik.bs.alvis.virtualmachine.AlvisGraph;
import de.unisiegen.informatik.bs.alvis.virtualmachine.AlvisGraphNode;
import de.unisiegen.informatik.bs.alvis.virtualmachine.Run;
import de.unisiegen.informatik.bs.alvis.virtualmachine.VirtualMachine;

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
	private AlvisGraph runGraph; // TODO RAUS DAMIT
	
	public void setActiveRun(Run activeRun) {
		this.activeRun = activeRun;
	}
	
	public Run getActiveRun() {
		return this.activeRun;
	}
	
	private VirtualMachine vm;
	public void runStart() {
		vm = VirtualMachine.getInstance();
		vm.removeOldParameters();
		vm.resetState();
		
		// Hier muss das plugin nach datentypen gefragt werden
		// aus dem primitiv
		// typename
		Graph gr = new Graph(this.runGraph.getAllNodesG(), 
				this.runGraph.getAllConnectionsG());
		vm.addParameter(gr);

		if(this.runGraph.getStartNode() != null)
			vm.addParameter(gr.getVertexFromGraphic(
					this.runGraph.getStartNode()));
		else {
			for(AlvisGraphNode node : this.runGraph.getAllNodes()) {
				vm.addParameter(gr.getVertexFromGraphic(node));
				break;
			}
		}
		if(this.runGraph.getEndNode() != null) {
			vm.addParameter(gr.getVertexFromGraphic(this.runGraph.getEndNode()));
		}

		vm.startDefaultRun();
	}

	public void setRunGraph(AlvisGraph runGraph) {
		this.runGraph = runGraph;
	}

	public AlvisGraph getRunGraph() {
		return runGraph;
	}

	public void runNext() {
		vm.stepForward();
	}

	public void runBack() {
		vm.stepBackward();
	}
}
