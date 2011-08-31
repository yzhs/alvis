package de.unisiegen.informatik.bs.alvis.graph.editors;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.graph.editors.messages"; //$NON-NLS-1$
	public static String AddTreeWindow_amountOfNodes;
	public static String AddTreeWindow_autoFill;
	public static String AddTreeWindow_averageWidth;
	public static String AddTreeWindow_chooseOptions;
	public static String AddTreeWindow_circle;
	public static String AddTreeWindow_depth;
	public static String AddTreeWindow_NewRandomGraphWizard;
	public static String AddTreeWindow_tree;
	public static String GraphEditor_allFiles;
	public static String GraphEditor_alreadyExists;
	public static String GraphEditor_reset;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
