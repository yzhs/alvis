package de.unisiegen.informatik.bs.alvis.ui.navigator.wizards;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.ui.navigator.wizards.messages"; //$NON-NLS-1$
	public static String NewAlgorithmWizard_newAlgorithmFile;
	public static String NewAlgorithmWizardPage_algorithmFile;
	public static String NewAlgorithmWizardPage_createsNewAlgorithmFile;
	public static String NewAlgorithmWizardPage_newAlgorithmFileWizard;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
