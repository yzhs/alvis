package de.unisiegen.informatik.bs.alvis.sync.editors;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.sync.editors.messages"; //$NON-NLS-1$
	public static String ScenarioEditor_resetAll;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
