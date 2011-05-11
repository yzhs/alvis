package de.unisiegen.informatik.bs.alvis.views;

import org.eclipse.swt.widgets.Composite;

//import de.unisiegen.informatik.bs.alvis.graphextension.editors.AlvisGraph;
public interface IRunGraph {
	/**
	 * Method to add an specific editor to the editor
	 * @param parent
	 * @return
	 */
	Composite createGraph(Composite parent, String exampleFile);
	
	//TODO hol den AlvisGraph hier raus
}
