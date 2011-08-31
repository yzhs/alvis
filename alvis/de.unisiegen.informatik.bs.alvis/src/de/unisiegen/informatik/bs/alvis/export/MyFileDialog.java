package de.unisiegen.informatik.bs.alvis.export;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.editors.Messages;

/**
 * own file dialog which asks if existing file shall be overwritten at saving
 * 
 * @author Frank Weiler
 * 
 */
public class MyFileDialog extends FileDialog {

	private int fileEnding;
	
	/**
	 * creates file chooser for exporting alvis to pdf or whatever
	 * 
	 * @param exportToWhat
	 *            which options the file dialog shall show as possible file
	 *            endings: 0==pdf; 1==png,jpg
	 * 
	 */
	public MyFileDialog(int exportToWhat) {

		super(new Shell(), SWT.SAVE);

		String[] fileNames = null;
		String[] extensions = null;
		String defaultEnding = ".pdf";
		if (exportToWhat == 0) {
			fileNames = new String[] { "PDF (*.pdf)",
					Messages.getLabel("allFiles") };
			extensions = new String[] { "*.pdf", "*.*" };
		} else if (exportToWhat == 1) {
			fileNames = new String[] { "PNG (*.png)", "JPG (*.jpg)",
					Messages.getLabel("allFiles") };

			extensions = new String[] { "*.png", "*.jpg", "*.*" };
			defaultEnding = ".png";
		} else {
			return;
		}

		setText(Messages.getLabel("saveExport"));
		setFilterNames(fileNames);
		setFilterExtensions(extensions);
		try {
			setFilterPath(FileLocator.getBundleFile(
					Activator.getDefault().getBundle()).getAbsolutePath());
		} catch (IOException e) {
		}

		setFileName(Messages.getLabel("alvisExport_")
				+ ((System.currentTimeMillis() / 1000) % 1000) + defaultEnding);
	}

	@Override
	protected void checkSubclass() {
		// important, without this (empty) method subclassing is not allowed
	}


	@Override
	/**
	 * opens file chooser, asks if already existing file shall be replaced
	 * 
	 * @return path the chosen file path
	 */
	public String open() {
		String path = super.open();

		if (path == null)
			return null;// operation canceled
		if (new File(path).exists()) {
			MessageBox mb = new MessageBox(getParent(), SWT.ICON_WARNING
					| SWT.YES | SWT.NO);
			mb.setMessage(path + Messages.getLabel("alreadyExists"));
			if (mb.open() == SWT.NO) {
				return open();
			}
		}
		
		if(path.toLowerCase().endsWith("png")){
			setFileEnding(SWT.IMAGE_PNG);
		} else if(path.toLowerCase().endsWith("jpg")){
			setFileEnding(SWT.IMAGE_JPEG);
		} else {
			setFileEnding(SWT.IMAGE_UNDEFINED);
		}

		return path;
	}

	public void setFileEnding(int fileEnding) {
		this.fileEnding = fileEnding;
	}

	public int getFileEnding() {
		return fileEnding;
	}

}
