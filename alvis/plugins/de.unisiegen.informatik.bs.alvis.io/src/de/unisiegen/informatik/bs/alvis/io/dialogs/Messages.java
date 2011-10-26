package de.unisiegen.informatik.bs.alvis.io.dialogs;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.io.dialogs.messages"; //$NON-NLS-1$
	public static String CheckDialog_DoNotAskAgain;
	public static String CheckDialog_DoNotAskAgain_ToolTip;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
