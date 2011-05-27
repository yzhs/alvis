package de.unisiegen.informatik.bs.alvis.export;

import java.util.ArrayList;
import java.util.Date;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkingSet;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;

//TODO replace static strings with dynamic, language-specific files
/**
 * class which creates the export PDF file
 * 
 * @author Frank Weiler
 */
public class PdfExport extends Document {

	private static Font titleFont = new Font(Font.FontFamily.TIMES_ROMAN, 32,
			Font.BOLD);
	private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
			Font.BOLD);
	private static Font colorfont = new Font(Font.FontFamily.COURIER, 12,
			Font.ITALIC, BaseColor.BLUE);
	private static Font blackFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
			Font.NORMAL);
	private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
			Font.BOLD);
	private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
			Font.BOLD);

	/**
	 * the constructor creates export PDF file, opens file dialog to ask where
	 * to save the file
	 * 
	 * @throws DocumentException
	 */
	public PdfExport() throws DocumentException {

		open();

		addMetaData();
		addTitlePage();
		addContent();

		close();
	}

	/**
	 * adds meta data to this document
	 */
	private void addMetaData() {
		addTitle("Alvis export");
		addSubject("Alvis Export");
		addKeywords("Alvis, Java, PDF");
		addAuthor("AlvisPg2011");
		addCreator("Alvis");
	}

	/**
	 * adds title page to this document
	 * 
	 * @throws DocumentException
	 */
	private void addTitlePage() throws DocumentException {
		Paragraph title = new Paragraph();
		addEmptyLine(title, 1);

		title.add(new Paragraph("Alvis Export", titleFont));

		addEmptyLine(title, 1);

		title.add(new Paragraph("Generated by: "
				+ System.getProperty("user.name") + ", " + new Date(),
				smallBold));

		add(title);
		newPage();
	}

	private void addContent() {

		ArrayList<IExportItem> exportItems = Activator.getDefault()
				.getExportItems();

		for (IExportItem exportItem : exportItems) {
			addSourceCode(exportItem.getSourceCode());
			addImage(exportItem.getImage());
		}

		// // GET THE ACTIVE EDITOR
		// IExportItem activeEditor = (IExportItem) Activator.getDefault()
		// .getWorkbench().getActiveWorkbenchWindow().getActivePage()
		// .getActiveEditor();
		// addSourceCode(activeEditor.getSourceCode());
		// addImage(activeEditor.getImage());
		//
		// // PROBLEM NULLPOINTEREXCEOTION weil der die Instanz des IExportItem
		// // neu erzeugt und nicht den aktiven Graph nimmt.
		// IExtensionRegistry registry = Platform.getExtensionRegistry();
		// IExtensionPoint extensionPoint = registry
		// .getExtensionPoint("de.unisiegen.informatik.bs.alvis.export");
		//
		// for (IExtension extension : extensionPoint.getExtensions()) {
		//
		// IConfigurationElement[] elements = extension
		// .getConfigurationElements();
		//
		// for (IConfigurationElement element : elements) {
		//
		// try {
		// IExportItem myExportItem = (IExportItem) element
		// .createExecutableExtension("class");
		//
		// // add all export items to the export file:
		// String sourceCode = myExportItem.getSourceCode();
		// addSourceCode(sourceCode);
		// Image image = myExportItem.getImage();
		// addImage(image);
		// } catch (CoreException e) {
		// e.printStackTrace();
		// }
		//
		// }
		//
		// }

	}

	private void addImage(Image image) {
		if (image == null)
			return;
		System.out.println("image added (PdfExport)");// TODO weg, richtig
														// implementieren

	}

	private void addSourceCode(String sourceCode) {
		if (sourceCode == null)
			return;
		System.out.println("source code added (PdfExport)\n" + sourceCode);// TODO
																			// weg,
																			// richtig
																			// implementieren

	}

	/**
	 * adds empty lines (i.e. line breaks) to given paragraph
	 * 
	 * @param paragraph
	 *            the paragraph to add empty lines to
	 * @param amount
	 *            the amount of empty lines
	 */
	private static void addEmptyLine(Paragraph paragraph, int amount) {
		for (int i = 0; i < amount; i++) {
			paragraph.add(new Paragraph(" "));
		}
	}

}