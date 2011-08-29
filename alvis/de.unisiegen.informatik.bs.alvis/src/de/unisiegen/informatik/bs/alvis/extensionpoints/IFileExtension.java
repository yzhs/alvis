package de.unisiegen.informatik.bs.alvis.extensionpoints;

public interface IFileExtension {
	
	/**
	 * Returns the file extension for every plugin defining a type of algorithm.
	 * Example: ".graph"
	 * @return
	 */
	public String getFileExtension();

}
