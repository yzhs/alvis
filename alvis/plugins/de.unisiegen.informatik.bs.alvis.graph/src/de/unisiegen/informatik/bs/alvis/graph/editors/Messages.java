package de.unisiegen.informatik.bs.alvis.graph.editors;

import java.util.Locale;
import java.util.ResourceBundle;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static ResourceBundle labels;
	private static Locale currentLanguage;
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.graph.editors.messages"; //$NON-NLS-1$

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
