package de.unisiegen.informatik.bs.alvis.extensionpoints;

/**
 * @author Frank Weiler
 */
import org.eclipse.swt.graphics.Image;

/**
 * 
 * @author Frank Weiler
 * @description the export object interface. every exportable object (i.e.
 *              text-> source code, images-> graph, etc) needs to be implement
 *              this
 */
public interface IExportItem {

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