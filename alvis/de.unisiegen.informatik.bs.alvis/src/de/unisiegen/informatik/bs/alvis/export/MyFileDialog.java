package de.unisiegen.informatik.bs.alvis.export;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

import de.unisiegen.informatik.bs.alvis.Activator;

//TODO replace static strings with dynamic, language-specific files
/**
 * own file dialog which asks if existing file shall be overwritten at saving
 * 
 * @author Frank Weiler
 * 
 */
public class MyFileDialog {

	/**
	 * creates file chooser for exporting alvis to pdf
	 * 
	 * @return dialog a file dialog for exporting alvis to pdf
	 */
	public static FileDialog getExportDialog() {
		Shell shell = new Shell();
		FileDialog dialog = new FileDialog(shell, SWT.SAVE);
		dialog.setText("save export");
		dialog.setFilterNames(new String[] { "PDF (*.pdf)", "allFiles" });
		dialog.setFilterExtensions(new String[] { "*.pdf", "*.*" });
		try {
			dialog.setFilterPath(FileLocator.getBundleFile(
					Activator.getDefault().getBundle()).getAbsolutePath());
		} catch (IOException e) {
		}

		dialog.setFileName("alvisExport" + System.currentTimeMillis() + ".pdf");

		return dialog;
	}

	/**
	 * opens file chooser, asks if already existing file shall be replaced
	 * 
	 * @dialog the file dialog to open
	 * @return path the chosen file path
	 */
	public static String open(FileDialog dialog) {
		String path = dialog.open();

		if (path == null)
			return null;// operation canceled
		if (new File(path).exists()) {
			MessageBox mb = new MessageBox(dialog.getParent(), SWT.ICON_WARNING
					| SWT.YES | SWT.NO);
			mb.setMessage(path + "already exists");
			if (mb.open() == SWT.NO) {
				return open(dialog);
			}
		}
		return path;
	}

}
