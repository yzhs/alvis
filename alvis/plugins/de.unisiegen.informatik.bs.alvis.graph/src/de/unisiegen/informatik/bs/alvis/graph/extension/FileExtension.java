package de.unisiegen.informatik.bs.alvis.graph.extension;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IFileExtension;

public class FileExtension implements IFileExtension{

	@Override
	public String getFileExtension() {
		return ".graph";
	}

}
