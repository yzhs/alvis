package de.unisiegen.informatik.bs.alvis.graph.editors;

import java.util.Locale;
import java.util.ResourceBundle;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static ResourceBundle labels;
	private static Locale currentLanguage;
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.graph.editors.messages"; //$NON-NLS-1$

	public static String Graph_button_depth;
	public static String Graph_button_width;
	public static String Graph_button_add;
	public static String Graph_button_autofill;
	public static String Graph_button_change_layout;
	public static String Graph_button_connection;
	public static String Graph_button_delete_all;
	public static String Graph_button_deletenode;
	public static String Graph_button_endnode;
	public static String Graph_button_graph;
	public static String Graph_button_graphnodes;
	public static String Graph_button_move;
	public static String Graph_button_ok;
	public static String Graph_button_startnode;
	public static String Graph_group_tools;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}

	public static String getLabel(String key) {
		String res;
		if (currentLanguage == null) {
			Locale.setDefault(Locale.ENGLISH); // default language: English
			currentLanguage = Locale.getDefault();
		}
		try {
			labels = ResourceBundle.getBundle(BUNDLE_NAME, currentLanguage);
			res = labels.getString(key);
		} catch (Exception e) {
			res = "#err";
		}
		return res;
	}

	public static Locale getCurrentLanguage() {
		return currentLanguage;
	}

	public static void setCurrentLanguage(Locale currentLanguage) {
		Messages.currentLanguage = currentLanguage;
	}
}
