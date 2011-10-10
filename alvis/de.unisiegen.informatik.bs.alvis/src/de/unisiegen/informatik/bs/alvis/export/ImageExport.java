/*
 * Copyright (c) 2011 Frank Weiler
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
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
			sure.setMessage(Messages.FileProbablyopened);
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
