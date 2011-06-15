package de.unisiegen.informatik.bs.alvis.commands;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.commands.messages"; //$NON-NLS-1$
	public static String RunCompile_7;
	public static String RunCompile_8;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
