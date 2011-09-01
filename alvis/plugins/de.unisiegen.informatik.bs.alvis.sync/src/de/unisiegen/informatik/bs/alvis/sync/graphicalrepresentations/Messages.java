package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.messages"; //$NON-NLS-1$
	public static String AlvisCondition_conditionWaiting;
	public static String AlvisScenario_threads;
	public static String AlvisScenario_add;
	public static String AlvisScenario_buffer;
	public static String AlvisScenario_conditions;
	public static String AlvisScenario_delete;
	public static String AlvisScenario_needBuffer;
	public static String AlvisScenario_needOutput;
	public static String AlvisScenario_output;
	public static String AlvisScenario_primitives;
	public static String AlvisScenario_semaphores;
	public static String AlvisScenario_lblNewLabel_text;
	public static String AlvisScenario_lblBoolValid_text;
	public static String AlvisScenario_lblBoolInvalid_text;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
