package de.unisiegen.informatik.bs.alvis.editors;

import java.util.Locale;
import java.util.ResourceBundle;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static ResourceBundle labels;
	private static Locale currentLanguage;
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.editors.messages"; //$NON-NLS-1$

	public static String AlgorithmEditorCompletionProcessor_additionalInformationFor;
	public static String AlgorithmEditorCompletionProcessor_contextInformationFor;
	public static String AlgorithmEditorCompletionProcessor_newLineSomeInfo;
	public static String AlgorithmErrorMarker_ArgumentNumberEx;
	public static String AlgorithmErrorMarker_ArgumentTypeEx;
	public static String AlgorithmErrorMarker_DuplicateDeclaration;
	public static String AlgorithmErrorMarker_InvalidAssignment;
	public static String AlgorithmErrorMarker_InvalidNonVoidReturn;
	public static String AlgorithmErrorMarker_InvalidReturnType;
	public static String AlgorithmErrorMarker_InvalidStatement;
	public static String AlgorithmErrorMarker_InvalidVoidReturn;
	public static String AlgorithmErrorMarker_MismatcheTreeNode;
	public static String AlgorithmErrorMarker_NoSuchBinaryOperator;
	public static String AlgorithmErrorMarker_NoSuchUnaryOperator;
	public static String AlgorithmErrorMarker_NotAFunction;
	public static String AlgorithmErrorMarker_NotAnArray;
	public static String AlgorithmErrorMarker_NoViableAlt;
	public static String AlgorithmErrorMarker_TypeMismatch;
	public static String AlgorithmErrorMarker_UnknownError;
	public static String AlgorithmErrorMarker_UnknownIdentifier;
	public static String AlgorithmErrorMarker_UnknownMember;
	public static String AlgorithmErrorMarker_UnknownOperator;
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
	public static String RunEditor_12;
	public static String RunEditor_13;
	public static String RunEditor_14;
	public static String RunEditor_15;
	public static String RunEditor_16;
	public static String RunEditor_17;
	public static String RunEditor_18;
	public static String RunEditor_2;
	public static String RunEditor_22;
	public static String RunEditor_23;
	public static String RunEditor_24;
	public static String RunEditor_27;
	public static String RunEditor_28;
	public static String RunEditor_29;
	public static String RunEditor_3;
	public static String RunEditor_31;
	public static String RunEditor_33;
	public static String RunEditor_34;
	public static String RunEditor_35;
	public static String RunEditor_36;
	public static String RunEditor_37;
	public static String RunEditor_39;
	public static String RunEditor_4;
	public static String RunEditor_43;
	public static String RunEditor_44;
	public static String RunEditor_45;
	public static String RunEditor_47;
	public static String RunEditor_49;
	public static String RunEditor_5;
	public static String RunEditor_50;
	public static String RunEditor_51;
	public static String RunEditor_53;
	public static String RunEditor_54;
	public static String RunEditor_55;
	public static String RunEditor_57;
	public static String RunEditor_58;
	public static String RunEditor_59;
	public static String RunEditor_6;
	public static String RunEditor_60;
	public static String RunEditor_61;
	public static String RunEditor_63;
	public static String RunEditor_64;
	public static String RunEditor_65;
	public static String RunEditor_66;
	public static String RunEditor_68;
	public static String RunEditor_69;
	public static String RunEditor_7;
	public static String RunEditor_70;
	public static String RunEditor_71;
	public static String RunEditor_73;
	public static String RunEditor_75;
	public static String RunEditor_76;
	public static String RunEditor_77;
	public static String RunEditor_78;
	public static String RunEditor_79;
	public static String RunEditor_8;
	public static String RunEditor_80;
	public static String RunEditor_81;
	public static String RunEditor_82;
	public static String RunEditor_83;
	public static String RunEditor_84;
	public static String RunEditor_btnO_text;
	public static String RunEditor_btnO_1_text;
	public static String RunEditor_btnOpenExample_toolTipText;
	public static String RunEditor_btnOpenEditorAlgorithm_toolTipText;
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
