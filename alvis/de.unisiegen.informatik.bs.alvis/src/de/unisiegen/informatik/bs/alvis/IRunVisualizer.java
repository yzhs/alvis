package de.unisiegen.informatik.bs.alvis;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;

public interface IRunVisualizer {

	/**
	 * Adds all necessary elements to the parent of the run view.
	 * @param parent
	 */
	public boolean addVisualizing(Composite parent, String inputFile);
	
}