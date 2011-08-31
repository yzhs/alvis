package de.unisiegen.informatik.bs.alvis.pluginname.editors;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

public classEditornameextendsEditorPart
		implements PropertyChangeListener {

	private IEditorInput myInput;
	private String myInputFilePath;
	private Composite myParent;
	private boolean dirty;

	public Editorname() {
	}

	public void init(IEditorSite site, IEditorInput input)
	throws PartInitException {
		setSite(site);
		setInput(input);
		// Set the title to the filename
		setPartName(input.getName());
		myInput = input;
		myInputFilePath = ((FileEditorInput) input)
			.getPath().toString();
	}

	public void createPartControl(Compositeparent) {
		this.myParent = parent;
		createEditorFromInput(this.myParent, this.myInput);
	}

	private void createEditorFromInput(Composite parent,
		IEditorInput input) {
		// if input contains an object
		// then put the object to parent
		// else put a new object to parent
	}

	// call this method when you change your code
	private void checkDirty() {
		// if myInput != current state of editor
		// then setDirty(true);
		// else setDirty(false);
	}

	// setDirty and fire change
	private void setDirty(boolean dirty) {
		this.dirty = dirty;
		firePropertyChange(IEditorPart.PROP_DIRTY);
	}

	// return dirty
	public boolean isDirty() {
		return this.dirty;
	}

	public void doSave(IProgressMonitor monitor) {
		// save the current state of the editor to
		// the file at myInputFilePath;
		// setDirty(false);
	}

	// Unused Methods
	public void propertyChange(PropertyChangeEvent arg0) {}
	public void doSaveAs() {}
	public boolean isSaveAsAllowed() { returnfalse; }
	public void setFocus() {}
}
