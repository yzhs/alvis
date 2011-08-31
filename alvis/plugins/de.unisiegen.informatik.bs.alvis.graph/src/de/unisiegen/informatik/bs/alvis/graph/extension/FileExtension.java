package de.unisiegen.informatik.bs.alvis.graph.extension;


import de.unisiegen.informatik.bs.alvis.extensionpoints.IFileExtension;
import de.unisiegen.informatik.bs.alvis.graph.Activator;

public class FileExtension implements IFileExtension{

	@Override
	public String getFileExtension() {
		return Activator.getDefault().getFileExtension();
	}
}
