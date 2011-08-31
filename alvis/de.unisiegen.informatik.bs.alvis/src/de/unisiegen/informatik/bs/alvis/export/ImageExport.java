package de.unisiegen.informatik.bs.alvis.export;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.editors.Messages;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;

/**
 * class which creates the export png/jpg file
 * 
 * @author Frank Weiler
 */
public class ImageExport {

	/**
	 * the constructor creates export png/jpg file, opens file dialog to ask
	 * where to save the file
	 * 
	 * @throws IOException
	 */
	public ImageExport() throws IOException {

		try {

			MyFileDialog saveDialog = new MyFileDialog(1);
			String path = saveDialog.open();
			int fileEnding = saveDialog.getFileEnding();

			if (path != null){
				addContent(path, fileEnding);
			}

		} catch (NullPointerException npe) {
		} catch (FileNotFoundException fnfe) {
			MessageBox sure = new MessageBox(new Shell(), SWT.ICON_WARNING
					| SWT.OK);
			sure.setMessage(Messages.getLabel("FileProbablyopened"));
			sure.open();
		}
	}

	/**
	 * adds content, which means: creates image file at given location, if image
	 * from editor is available
	 * 
	 * @param path
	 *            the path (+filename) to save the file to
	 * @param fileEnding
	 *            the file ending code from swt
	 */
	private void addContent(String path, int fileEnding) throws FileNotFoundException {

		IExportItem exportItem;
		exportItem = Activator.getDefault().getActivePartToExport();

		try {
			Thread.sleep(200);// wait for gui to potentially open editor and
								// dispose file dialog
		} catch (InterruptedException e) {
		}

		if (exportItem == null)
			return; // nothing to export

		if (exportItem.isRun())
			return; // runs don't get exported to png or jpg

		Image image = exportItem.getImage();
		if (image == null)
			return; // editor doesn't offer an image to export

		ImageLoader loader = new ImageLoader();
		loader.data = new ImageData[] { image.getImageData() };
		
		try {
			loader.save(path, fileEnding);
		} catch (Exception e){
			throw new FileNotFoundException();
		}

		image.dispose();

	}

}
