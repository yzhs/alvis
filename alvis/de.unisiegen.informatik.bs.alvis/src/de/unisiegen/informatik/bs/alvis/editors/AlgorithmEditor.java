/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.editors;

import java.util.ArrayList;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditor;

/**
 * @author Eduard Boos
 * 
 */
public class AlgorithmEditor extends AbstractDecoratedTextEditor {

	/**
	 * 
	 */
	public AlgorithmEditor() {
		PlatformUI.getWorkbench().getDisplay();
		Color highlightColor = new Color(Display.getCurrent(), new RGB(111, 33,
				152));

		/** filling with test highlight Tokens */
		ArrayList<String> highlightTokens = new ArrayList<String>();
		String[] proposals = { "abstract", "boolean", "break", "byte", "case",
				"catch", "char", "class", "continue", "default", "do",
				"double", "else", "extends", "false", "final", "finally",
				"float", "for", "if", "implements", "import", "instanceof",
				"int", "interface", "long", "native", "new", "null", "package",
				"private", "protected", "public", "return", "short", "static",
				"super", "switch", "synchronized", "this", "throw", "throws",
				"transient", "true", "try", "void", "volatile", "while" };
		for (String proposal : proposals) {
			highlightTokens.add(proposal);
		}
		/** endof filling */

		AlgorithmEditorSourceViewerConfiguration sourceViewerConfiguration = new AlgorithmEditorSourceViewerConfiguration(
				highlightColor, highlightTokens);
		setSourceViewerConfiguration(sourceViewerConfiguration);
	}
}
