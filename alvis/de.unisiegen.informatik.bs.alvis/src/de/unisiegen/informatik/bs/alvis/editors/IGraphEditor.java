package de.unisiegen.informatik.bs.alvis.editors;

import java.beans.PropertyChangeListener;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;

public interface IGraphEditor {
	
	/**
	 * Method to add an specific editor to the editor
	 * @param parent
	 * @return
	 */
	Composite createEditor(Composite parent, IEditorInput input);
	
	/**
	 * Returns true if the current state of the editor matches the current state of the input
	 * @return
	 */
	boolean isDirty();
	
	void doSave(IProgressMonitor monitor);

	void addPropertyChangeListener(PropertyChangeListener listener);
}
