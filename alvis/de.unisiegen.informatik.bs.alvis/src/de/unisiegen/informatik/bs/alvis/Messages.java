package de.unisiegen.informatik.bs.alvis;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.messages"; //$NON-NLS-1$
	public static String Activator_DP_current_position;
	public static String Activator_DP_drag_and_drop;
	public static String Activator_DP_order;
	public static String Activator_DP_position_begin_algo;
	public static String ApplicationWorkbenchWindowAdvisor_0;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
