package de.unisiegen.informatik.bs.alvis.sync.newwizards;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.sync.newwizards.messages"; //$NON-NLS-1$
	public static String NewScenarioWizard_title;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
