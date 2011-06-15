package de.unisiegen.informatik.bs.alvis.wizards;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.wizards.messages"; //$NON-NLS-1$
	public static String NewRunWizard_0;
	public static String NewRunWizardPage_0;
	public static String NewRunWizardPage_1;
	public static String NewRunWizardPage_2;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
