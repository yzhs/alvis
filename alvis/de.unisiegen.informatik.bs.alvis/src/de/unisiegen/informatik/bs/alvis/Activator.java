package de.unisiegen.informatik.bs.alvis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.unisiegen.informatik.bs.alvis.editors.AlgorithmPartitionScanner;
import de.unisiegen.informatik.bs.alvis.editors.EDecisionPoint;
import de.unisiegen.informatik.bs.alvis.exceptions.VirtualMachineException;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IDatatypeList;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCBoolean;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCList;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCQueue;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCStack;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCString;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCVoid;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.SortableCollection;
import de.unisiegen.informatik.bs.alvis.views.AlgorithmContainer;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.DPListener;
import de.unisiegen.informatik.bs.alvis.vm.VirtualMachine;

import de.unisiegen.informatik.bs.alvis.io.dialogs.*;

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

	// private Export myExport = new Export();

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

	private HashMap<String, PCObject> paraMap = new HashMap<String, PCObject>();

	Shell shellContainer;

	public void setPseudoCodeList(HashMap<String, PCObject> para) {
		this.paraMap = para;
	}

	public HashMap<String, PCObject> getPseudoCodeList() {
		return paraMap;
	}

	private VirtualMachine vm = VirtualMachine.getInstance();

	// Storage for Decision Points
	public int DPNr;
	public SortableCollection toSort;
	public PCObject from;

	public void runStart() {

		vm.removeAllBPListener();
		vm.stopAlgos();
		vm.setParameter("algo", paraMap); //$NON-NLS-1$
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
				Activator.getDefault().algorithmContainer
						.removeAllCurrentLine();
				Activator.getDefault().algorithmContainer
						.addCurrentBP(BreakPointNumber);
			}
		});
		vm.addDPListener(new DPListener() {
			@Override
			public void onDecisionPoint(int DPNr, PCObject from, SortableCollection toSort) {
				// Check if the user wants to order the decisions
				if(activeRun.getOnDecisionPoint().equals(EDecisionPoint.RAND))
						return;
				toSort.sort();
				Activator.getDefault().DPNr = DPNr;
				Activator.getDefault().toSort = toSort;
				Activator.getDefault().from = from;
				
				Runnable progress = new Runnable() {
					public void run() {
						Activator.getDefault().shellContainer = Display.getDefault().getActiveShell();
						
						Activator.getDefault().algorithmContainer.removeAllCurrentLine();
						Activator.getDefault().algorithmContainer.addCurrentDP(Activator.getDefault().DPNr);
						
						String name = Activator.getDefault().from.toString();
						if(name == null)
							name = "Anfang des Algorithmus";
						// TODO: Internationalisierung für übergebene Strings einbauen
						if (Display.getDefault() != null) {
							AskMeAgain ask = new AskMeAgain(true);
							// OrderDialog can change the order of toSort
							// or changes the attribute of ask.
							OrderDialog toOrder = new OrderDialog(
									shellContainer,
									Activator.getDefault().toSort,
									ask,
									"Legen Sie eine Reihenfolge fest", "Sie sind bei: " + name,
									"Bewegen Sie die Daten per Drag&Drop\n");
							toOrder.open();
							if(ask.getAsk() == false) {
								// the user hit the box ,,Do not askme again''
								getActiveRun().setOnDecisionPoint(EDecisionPoint.RAND);
							}
						}
					}
				};
				Display.getDefault().syncExec(progress);

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

	/**
	 * Set the compiled .java algorithm path TODO @throws VMException
	 * 
	 * @param pathToAlgoInJava
	 */
	public void setJavaAlgorithmToVM(String pathToFile, String fileName,
			ArrayList<PCObject> datatypesToAddToClasspathAsPCObjects)
			throws VirtualMachineException {

		// TODO vm.addAlgo needs three arguments: key to identify algo (any
		// given String it's just used to address this algo for mutliple
		// operations ) , path to
		// the java algo file, the java algo filename, without the typending
		// .java
		// Add all this to VM.

		
		// Cast the PCObjects to Objects, so that class further down this stream
		// are independent from PCObjects
		//ArrayList<Object> datatypesToAddToClasspath = new ArrayList<Object>();
		//for (PCObject obj : datatypesToAddToClasspathAsPCObjects)
		//	datatypesToAddToClasspath.add((Object) obj);
			
		
		// Cycle through the list of delivered data types and extract the
		// package they belong to
		// TreeSet is used so that every packages is only added once
		TreeSet<String> dynamicallyReferencedPackagesNeededToCompile = new TreeSet<String>();	
		for (Object obj : datatypesToAddToClasspathAsPCObjects) {
			String path = obj.getClass().getProtectionDomain().getCodeSource()
					.getLocation().getFile().toString();
			if (path.endsWith(".jar"))
				dynamicallyReferencedPackagesNeededToCompile.add(path);
			else
				dynamicallyReferencedPackagesNeededToCompile.add(path + "src/");
		}

		try {
			if(!vm.addAlgoToVM("algo", pathToFile, fileName, dynamicallyReferencedPackagesNeededToCompile))
				throw new VirtualMachineException("Adding the algorithm to the Virtual Machine failed.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		//			return vm.addAlgoToVM("first", pathToAlgoInJava); //$NON-NLS-1$
	}

	/* ************************************************************************
	 * DATATYPES AND PACKAGES OUT OF THE PLUGINS
	 * ***********************************************************************
	 */

	private ArrayList<PCObject> allDatatypesInPlugIns = null;
	private ArrayList<String> allDatatypesPackagesInPlugIns = null;

	/**
	 * Get an instance of each datatype, that is used in some plug-in. With this
	 * instance you can get informations about the datatype.
	 * 
	 * @return a list with all datatypes in the plug-ins
	 */
	public ArrayList<PCObject> getAllDatatypesInPlugIns() {
		if (allDatatypesInPlugIns == null)
			registerAllDatatypes();
		return allDatatypesInPlugIns;
	}

	/**
	 * Get the names of the packages the datatypes from
	 * getAllDatatypesInPlugIns() are in.
	 * 
	 * @return a list with all packagenames that contain datatypes in the
	 *         plug-ins
	 */
	public ArrayList<String> getAllDatatypesPackagesInPlugIns() {
		if (allDatatypesPackagesInPlugIns == null)
			registerAllDatatypes();
		return allDatatypesPackagesInPlugIns;
	}

	/**
	 * Fill allDatatypesInPlugIns and allDatatypesPackagesInPlugIns with
	 * datatypes and packagenames.
	 */
	private void registerAllDatatypes() {
		// The list to add all known datatypes
		allDatatypesInPlugIns = new ArrayList<PCObject>();
		// The list to add all known packages that contain datatypes
		allDatatypesPackagesInPlugIns = new ArrayList<String>();

		/*
		 * ADD DATATYPES AND PACKAGENAMES FROM ALVIS-PLUG-INS
		 */
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint = registry
				.getExtensionPoint("de.unisiegen.informatik.bs.alvis.extensionpoints.datatypelist"); //$NON-NLS-1$
		IExtension[] extensions = extensionPoint.getExtensions();

		// * For all Extensions that contribute:
		for (int i = 0; i < extensions.length; i++) {
			IExtension extension = extensions[i];
			IConfigurationElement[] elements = extension
					.getConfigurationElements();
			for (int j = 0; j < elements.length; j++) {
				try {
					IConfigurationElement element = elements[j];
					IDatatypeList datatypes = (IDatatypeList) element
							.createExecutableExtension("class"); //$NON-NLS-1$
					// Save the found datatypes in allDatatypes
					allDatatypesInPlugIns.addAll(datatypes
							.getAllDatatypesInThisPlugin());
					allDatatypesPackagesInPlugIns.addAll(datatypes
							.getDatatypePackagesInThisPlugin());
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}

		/*
		 * ADD DATATYPES THAT COME WITH ALVIS
		 */
		allDatatypesInPlugIns.add(new PCBoolean(true));
		allDatatypesInPlugIns.add(new PCInteger(0));
		// allDatatypes.add(new PCListIterator(null));
		allDatatypesInPlugIns.add(new PCList());
		allDatatypesInPlugIns.add(new PCStack());
		allDatatypesInPlugIns.add(new PCQueue());
		allDatatypesInPlugIns.add(new PCString(""));
		allDatatypesInPlugIns.add(new PCVoid());

		/*
		 * ADD THE DATATYPE-PACKAGENAMES THAT COME WITH ALVIS
		 */
		allDatatypesPackagesInPlugIns
				.add("de.unisiegen.informatik.bs.alvis.primitive.datatypes");
	}

	/* ************************************************************************
	 * RUNALGORITHM TOOLS
	 * ***********************************************************************
	 */
	/**
	 * @param algorithmContainer
	 */
	public void setAlgorithmContainer(AlgorithmContainer algorithmContainer) {
		this.algorithmContainer = algorithmContainer;
	}

	/**
	 * Get the AlgorithmContainer. The AlgorithmContainer contains surroundings
	 * for the graphical represenation of the Algorithm that is currently
	 * running. You can highlight lines as an example.
	 * 
	 * @return
	 */
	public AlgorithmContainer getAlgorithmContainer() {
		return algorithmContainer;
	}

	/* ************************************************************************
	 * EXPORT
	 * ***********************************************************************
	 */

	// public void registerExport(IExportItem item) {
	// myExport.register(item);
	// }
	//
	// public ArrayList<IExportItem> getExportItems() {
	// return myExport.getExportItems();
	// }

	/**
	 * returns active part as export item
	 * 
	 * @return active part as export item
	 */
	public IExportItem getActivePartToExport() throws ClassCastException {
		IExportItem part;
		part = (IExportItem) getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getActivePart();

		return part;
	}
}
