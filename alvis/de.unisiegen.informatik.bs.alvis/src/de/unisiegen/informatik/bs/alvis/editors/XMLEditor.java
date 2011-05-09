package de.unisiegen.informatik.bs.alvis.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class XMLEditor extends TextEditor {

	// A simple HashMap that stores collors
	private XMLColorManager colorManager;

	public XMLEditor() {
		super();
		colorManager = new XMLColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
