/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.inputoutput;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;

/**
 * Collection of usefull dialogs.
 * @author simon
 *
 */
public class Dialogs {

	public final int SAVE = SWT.SAVE;
	public final int OPEN = SWT.OPEN;
	
	public void showImageSaver() {
//		FileDialog dialog = new FileDialog (
//				Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell(), 
//				SWT.SAVE);
//		String [] filterNames = new String [] {"Image Files", "All Files (*)"};
//		String [] filterExtensions = new String [] {"*.gif;*.png;*.xpm;*.jpg;*.jpeg;*.tiff", "*"};
//		String filterPath = "/";
//		String platform = SWT.getPlatform();
//		if (platform.equals("win32") || platform.equals("wpf")) {
//			filterNames = new String [] {"Image Files", "All Files (*.*)"};
//			filterExtensions = new String [] {"*.gif;*.png;*.bmp;*.jpg;*.jpeg;*.tiff", "*.*"};
//			filterPath = "c:\\";
//		}
//		dialog.setFilterNames (filterNames);
//		dialog.setFilterExtensions (filterExtensions);
//		dialog.setFilterPath (filterPath);
//		dialog.setFileName ("myfile");
	}
}
