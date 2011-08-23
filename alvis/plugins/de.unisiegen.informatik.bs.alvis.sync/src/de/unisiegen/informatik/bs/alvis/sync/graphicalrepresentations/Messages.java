package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.messages"; //$NON-NLS-1$
	public static String AlvisActor_nextStepButton;
	public static String AlvisCondition_waiting;
	public static String AlvisScenario_buffer;
	public static String AlvisScenario_control;
	public static String AlvisScenario_fifo;
	public static String AlvisScenario_globalStep;
	public static String AlvisScenario_output;
	public static String AlvisScenario_prio;
	public static String AlvisScenario_random;
	public static String AlvisScenario_revPrio;
	public static String AlvisScenario_roundrobin;
	public static String AlvisScenario_vars;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
