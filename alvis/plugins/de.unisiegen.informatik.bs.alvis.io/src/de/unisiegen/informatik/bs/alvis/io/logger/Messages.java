package de.unisiegen.informatik.bs.alvis.io.logger;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.io.logger.messages"; //$NON-NLS-1$
	public static String Logger_ERROR_CHANGE_LEVEL;
	public static String Logger_FILE_DISABLED;
	public static String Logger_FILE_ENABLED;
	public static String Logger_FUCKED;
	public static String Logger_LEVEL_CHANGED;
	public static String Logger_LOG_FILE_CHANGED;
	public static String Logger_LOGGING_FAILED;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
