package de.unisiegen.informatik.bs.alvis.graph;

import java.util.ArrayList;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {


	// The plug-in ID
	public static final String PLUGIN_ID = "de.unisiegen.informatik.bs.alvis.graph"; //$NON-NLS-1$

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
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
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
	
	/* ********************************
	 * Run 
	 */
	private ArrayList<PCObject> tempPseudoCodeObjects = 
		new ArrayList<PCObject>();

	public ArrayList<PCObject> getTempPseudoCodeObjects() {
		return tempPseudoCodeObjects;
	}

}
