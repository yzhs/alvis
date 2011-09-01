package de.unisiegen.informatik.bs.alvis.sync.dialogs;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.sync.dialogs.messages"; //$NON-NLS-1$
	public static String DeleteConditionDialog_cancel;
	public static String DeleteConditionDialog_ok;
	public static String DeleteConditionDialog_text;
	public static String DeletePrimitiveDialog_cancel;
	public static String DeletePrimitiveDialog_ok;
	public static String DeletePrimitiveDialog_text;
	public static String DeleteSemaphoreDialog_cancel;
	public static String DeleteSemaphoreDialog_ok;
	public static String DeleteSemaphoreDialog_text;
	public static String DeleteThreadDialog_cancel;
	public static String DeleteThreadDialog_ok;
	public static String DeleteThreadDialog_text;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
