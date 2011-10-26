package de.unisiegen.informatik.bs.alvis.graph.run;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.graph.run.messages"; //$NON-NLS-1$
	public static String RunVisualizer_Choose1;
	public static String RunVisualizer_Choose2;
	public static String RunVisualizer_Choose3;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
