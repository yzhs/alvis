package de.unisiegen.informatik.bs.alvis.sync.extension;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IFileExtension;

public class FileExtension implements IFileExtension{

	@Override
	public String getFileExtension() {
		return ".sync";
	}

}
