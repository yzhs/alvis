package de.unisiegen.informatik.bs.alvis.pluginname.editors;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

public class EditornameextendsEditorPart
		implements PropertyChangeListener {

	public Editorname() {
	}

	public void init(IEditorSite site, IEditorInput input)
	throws PartInitException {
	}

	public void createPartControl(Composite parent) {
	}

	public boolean isDirty() {
		return false;
	}

	public void doSave(IProgressMonitor monitor) {
	}

	//UnusedMethods
	public void propertyChange(PropertyChangeEvent arg0) {}
	public void doSaveAs() {}
	public boolean isSaveAsAllowed() { returnfalse; }
	public void setFocus() {}
}
