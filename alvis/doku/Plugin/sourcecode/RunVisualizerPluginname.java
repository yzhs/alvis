package de.unisiegen.informatik.bs.alvis.pluginname.run;

import org.eclipse.swt.widgets.Composite;

import de.unisiegen.informatik.bs.alvis.
	extensionpoints.IRunVisualizer;

public class RunVisualizerPluginname implements
	IRunVisualizer {

	public RunVisualizerPluginname() {}

	@Override
	public boolean addVisualizing(Composite parent,
		String inputFile){
		return false;
	}
}
