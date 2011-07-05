package de.unisiegen.informatik.bs.alvis.extensionpoints;


import org.eclipse.swt.graphics.Image;

/**
 * 
 * @author Frank Weiler
 * @description the export object interface. every exportable object (i.e.
 *              text-> source code, images-> graph, etc) needs to be implement
 *              this
 */
public interface IExportItem {

	// TODO not only a string should be returned, but formated strings with font
	// styles etc
	/**
	 * returns source code for export
	 * 
	 * @return source code for export, null if object does not contain any
	 *         source code (e.g. graph files)
	 */
	public String getSourceCode();

	/**
	 * returns image for export
	 * 
	 * @return image for export, null if object does not contain any image
	 */
	public Image getImage();
	
	/**
	 * returns true if export item is a run, which implies a more complex export, false otherwise
	 * @return true if export item is a run, false otherwise
	 */
	public boolean isRun();

}