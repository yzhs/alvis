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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.html.simpleparser.StyleSheet;
import com.itextpdf.text.pdf.PdfWriter;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.editors.Messages;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.VirtualMachine;

/**
 * class which creates the export PDF file
 * 
 * @author Frank Weiler & Sebastian Schmitz
 */
public class PdfExport extends Document {

	private static final int EXPORT_WHOLE_SOURCE_CODE = -1;
	private static Font titleFont = FontFactory.getFont("Calibri", 32,
			Font.BOLD);
	private static Font catFont = FontFactory.getFont("Calibri", 18, Font.BOLD);
	// private static Font subFont = FontFactory.getFont("Calibri", 16,
	// Font.BOLD);
	private static Font smallBold = FontFactory.getFont("Calibri", 12,
			Font.BOLD);

	private ArrayList<StyledText> styledTexts, wantedStyledTexts;
	private ArrayList<Integer> sourceCodeLineIndices,
			wantedSourceCodeLineIndices;
	private ArrayList<Image> images, wantedImages;

	// private Anchor anchor;
	// private Chapter chapter;
	private Paragraph paragraph;

	/**
	 * the constructor creates export PDF file, opens file dialog to ask where
	 * to save the file
	 * 
	 * @throws DocumentException
	 * @throws IOException
	 */
	public PdfExport() throws DocumentException, IOException {
		final IExportItem exportItem = Activator.getDefault()
				.getActivePartToExport();

		if (exportItem == null) {
			MessageBox sure = new MessageBox(new Shell(), SWT.ICON_WARNING
					| SWT.OK);
			sure.setMessage(Messages.nothingToExport);
			sure.open();
			return;
		}

		images = new ArrayList<Image>();
		sourceCodeLineIndices = new ArrayList<Integer>();
		styledTexts = new ArrayList<StyledText>();

		if (exportItem.isRun()) { // export run
			VirtualMachine vm = VirtualMachine.getInstance();

			BPListener listen = new BPListener() {
				@Override
				public void onBreakPoint(int BreakPointNumber) {
					Image image = exportItem.getImage();
					if (image != null) {
						images.add(image);
						styledTexts.add(Activator.getDefault()
								.getActiveRunAlgorithm().getStyledText());
						sourceCodeLineIndices.add(BreakPointNumber);
					}
					VirtualMachine.getInstance().stepAlgoForward();
				}
			};

			Activator.getDefault().shutUpForExport(true);
			Activator.getDefault().runStart();
			vm.addBPListener(listen);
		}

		try {
			MyFileDialog saveDialog = new MyFileDialog(
					MyFileDialog.EXPORT_TO_PDF);
			String path = saveDialog.open();
			if (path == null)
				return; // file chooser canceled

			PdfWriter.getInstance(this, new FileOutputStream(path));

			if (!exportItem.isRun()) { // export single editor
				Image image = exportItem.getImage();
				if (image != null)
					images.add(image);

				StyledText sourceCode = (StyledText) exportItem.getSourceCode();
				if (sourceCode != null) {
					styledTexts.add(sourceCode);
				}
			} else { // export run, saving images which were taken earlier

				// while(VirtualMachine.getInstance().runningThreads());
				ExportShell exportShell = new ExportShell(Display.getDefault(),
						images, styledTexts, sourceCodeLineIndices);
				wantedImages = exportShell.getWantedImages();
				wantedSourceCodeLineIndices = exportShell
						.getWantedSourceCodeLineIndices();
				wantedStyledTexts = exportShell.getWantedSourceCodeParts();

				// Activator.getDefault().getWorkbench().getDisplay()
				// .syncExec(new Runnable() {
				// @Override
				// public void run() {
				//
				// ExportShell exportShell = new ExportShell(
				// Display.getDefault(), images,
				// sourceCodeParts);
				// wantedImages = exportShell.getWantedImages();
				// wantedStyledTexts = exportShell
				// .getWantedSourceCodeParts();
				// }
				// });
			}

			open();
			addMetaData();
			addTitle();

			if (!exportItem.isRun()) { // add editor content to pdf
				if (!styledTexts.isEmpty()) {
					paragraph = toParagraph(styledTexts.get(0));
					add(paragraph);
				}
				if (!images.isEmpty()) {
					paragraph = toParagraph(images.get(0));
					add(paragraph);
				}
			} else { // add run content to pdf
				
				paragraph = new Paragraph();
				paragraph.setFont(catFont);
				addEmptyLine(paragraph, 2);
				paragraph.add(Messages.pdfExportSourceCode + ":");
				add(paragraph);
				StyledText completeCodeOfThisRun = Activator.getDefault()
						.getActiveRunAlgorithm().getStyledText();
				paragraph = toParagraph(completeCodeOfThisRun);
				add(paragraph);
				newPage();
				
				for (int i = 0; i < wantedImages.size(); i++) {
					try {
						// adding the image first, then the image:
						paragraph = toParagraph(wantedImages.get(i));
						add(paragraph);
						paragraph = toParagraph(wantedStyledTexts.get(i),
								wantedSourceCodeLineIndices.get(i));
						add(paragraph);
						newPage();

					} catch (DocumentException e) {
						e.printStackTrace();
					}
				}
			}

		} catch (NullPointerException npe) {
			npe.printStackTrace();
		} catch (FileNotFoundException fnfe) {
			MessageBox sure = new MessageBox(new Shell(), SWT.ICON_WARNING
					| SWT.OK);
			sure.setMessage(Messages.FileProbablyopened);
			sure.open();
		} finally {
			Activator.getDefault().shutUpForExport(false);
			VirtualMachine.getInstance().removeAllBPListener();
			close();
		}
	}

	/**
	 * adds meta data to this document
	 */
	private void addMetaData() {
		addTitle(Messages.alvisExport);
		addSubject(Messages.alvisExport);
		addKeywords("Alvis, Java, PDF");
		addAuthor("AlvisPg2011");
		addCreator("Alvis");
	}

	/**
	 * adds title page to this document
	 * 
	 * @throws DocumentException
	 */
	private void addTitle() throws DocumentException {
		Paragraph title = new Paragraph();
		addEmptyLine(title, 1);

		title.add(new Paragraph(Messages.alvisExport, titleFont));

		addEmptyLine(title, 1);

		title.add(new Paragraph(Messages.generatedBy + ": "
				+ System.getProperty("user.name") + ", " + new Date(),
				smallBold));

		add(title);

	}

	/**
	 * adds organized, structured, highlighted source code to new paragraph and
	 * returns it
	 * 
	 * @author Sebastian Schmitz & Frank Weiler
	 * @param sourceCode
	 *            the source code as string including html tags for highlighting
	 *            etc
	 * @return a paragraph including the source code
	 * @throws DocumentException
	 *             will be thrown when new paragraph could not have been added
	 */
	private Paragraph toParagraph(StyledText sourceCode)
			throws DocumentException {
		if (sourceCode == null)
			return null;

		String content = highlightStyleTextinHTML(sourceCode); // returnt den
																// nicht
																// eingerückten,
																// aber
																// gehighlighteten
																// Code

		Paragraph paragraph = new Paragraph();

		if (content != null) {
			content = indentCode(content); // rückt den Code ein

			List<Element> bodyText;
			StyleSheet styles = new StyleSheet();
			styles.loadTagStyle("ol", "leading", "16,0");
			try {
				bodyText = HTMLWorker.parseToList(new StringReader(content),
						styles);

				paragraph.setFont(FontFactory.getFont("Courier", 10,
						Font.NORMAL));
				for (Element elem : bodyText) {
					paragraph.add(elem);
				}
			} catch (IOException e) {
				paragraph.add(Messages.noSourceCodeAdded);
			}
		}

		return paragraph;

	}

	/**
	 * adds one line of organized, structured, highlighted source code to new
	 * paragraph and returns it
	 * 
	 * @author Sebastian Schmitz & Frank Weiler
	 * @param sourceCode
	 *            the source code as string including html tags for highlighting
	 *            etc
	 * @param wantedLineIndex
	 *            the wanted line number
	 * @return a paragraph including the source code line
	 * @throws DocumentException
	 *             will be thrown when new paragraph could not have been added
	 */
	private Paragraph toParagraph(StyledText sourceCode, int wantedLineIndex)
			throws DocumentException {
		if (sourceCode == null)
			return null;
		if (wantedLineIndex < 0 || wantedLineIndex >= sourceCode.getLineCount())
			return null;

		String content = highlightStyleTextinHTML(sourceCode, wantedLineIndex);

		Paragraph paragraph = new Paragraph();

		if (content != null) {
			List<Element> bodyText;
			StyleSheet styles = new StyleSheet();
			styles.loadTagStyle("ol", "leading", "16,0");
			try {
				bodyText = HTMLWorker.parseToList(new StringReader(content),
						styles);

				paragraph.setFont(FontFactory.getFont("Courier", 10,
						Font.NORMAL));
				for (Element elem : bodyText) {
					paragraph.add(elem);
				}
			} catch (IOException e) {
				paragraph.add(Messages.noSourceCodeAdded);
			}
		}

		return paragraph;

	}

	/**
	 * adds image to new paragraph and returns it
	 * 
	 * @param image
	 *            the image which will be parsed to a pdf-valid format
	 * @return paragraph a paragraph including the image
	 * @throws DocumentException
	 *             will be thrown when new paragraph could not have been added
	 */
	private Paragraph toParagraph(Image image) throws DocumentException {
		if (image == null)
			return null;

		String path = Messages.tmpAlvisImage + ".png";
		com.itextpdf.text.Image pdfImage;

		Paragraph paragraph = new Paragraph();

		ImageLoader loader = new ImageLoader();
		loader.data = new ImageData[] { image.getImageData() };
		loader.save(path, SWT.IMAGE_PNG);

		addEmptyLine(paragraph, 2);
		try {
			pdfImage = com.itextpdf.text.Image.getInstance(path);
			float height, width;
			width = Math.min(530, pdfImage.getScaledWidth());
			height = pdfImage.getScaledHeight() / pdfImage.getScaledWidth()
					* width;
			if (height > 500.0f) {
				height = 500.0f;
				width = pdfImage.getScaledWidth() / pdfImage.getScaledHeight()
						* height;
			}
			pdfImage.scaleAbsolute(width, height);
			paragraph.add(pdfImage);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(Messages.errorAddingImage);
		}
		addEmptyLine(paragraph, 2);

		// image.dispose();
		return paragraph;

	}

	/**
	 * adds empty lines (i.e. line breaks) to given paragraph
	 * 
	 * @param paragraph
	 *            the paragraph to add empty lines to
	 * @param amount
	 *            the amount of empty lines
	 */
	private void addEmptyLine(Paragraph paragraph, int amount) {
		for (int i = 0; i < amount; i++) {
			paragraph.add(new Paragraph(" "));
		}
	}

	/**
	 * this method takes the String from the Editor (which has been highlighted
	 * already by getContentFromAlgoEditor) and translates the indendation of
	 * the pseudo code to HTML
	 * 
	 * The String is read linewise and indented via the
	 * <p padding-left:" XYpx;">
	 * HTML-tag
	 * 
	 * @param stringToIndent
	 * @return indented String
	 */
	private String indentCode(String stringToIndent) {
		String line = ""; // storage for the lines

		// Support for different styles of indendation (four spaces, eight
		// spaces and tabs):
		// stringToIndent = stringToIndent.replaceAll("\t", "    ");
		// stringToIndent = stringToIndent.replaceAll("    ", "\t");

		stringToIndent = stringToIndent.replaceAll("    ", "\u00A0\u00A0");
		stringToIndent = stringToIndent.replaceAll("\t", "\u00A0\u00A0");

		// in case someone meddled with weird windows text editors
		stringToIndent = stringToIndent.replaceAll("\r\n", "\n");

		int indentationCounter = 0; // variable holding knowledge about how deep
									// the current line has to be indented
		int indentationDepth = 20;
		boolean onlyWhiteSpacesYet = true; // tabs after the first char that's
											// not a white space are ignored
		String toReturn = "";
		for (Character curr : stringToIndent.toCharArray()) {
			if (curr == '\t' && onlyWhiteSpacesYet == true) // if we are at the
															// beginning of a
															// line, we want to
															// count how deep
				indentationCounter++; // the current line has to be indented
			else if (!(curr == '\n' || curr == '\r')) { // if we read a common
														// character, just add
														// it to the line
				onlyWhiteSpacesYet = false;
				line += curr;
			} else if (line.isEmpty() && (curr == '\n' || curr == '\r')) { // Support
																			// for
																			// empty
																			// lines
				toReturn += "<br/>";
			} else {
				// the line is complete. Surround it with "tabs" and append it
				// to the returned String
				toReturn += "<p style=\"padding-left:" + indentationCounter
						* indentationDepth + "px; margin: 0;\">";
				toReturn += line;
				toReturn += "</p>";
				indentationCounter = 0; // reset
				onlyWhiteSpacesYet = true; // reset, because the next line is
											// independent from this one
				line = ""; // reset
			}
		}
		return toReturn;
	}

	// /**
	// * @author Sebastian Schmitz This method adds the content from the active
	// * editor to the document. The content added is not inside of a
	// * paragraph, let's hope we can find a fix for that.
	// * @throws IOException
	// * @throws DocumentException
	// */
	// private void addContentOutsideParagraph() throws IOException,
	// DocumentException {
	// List<Element> bodyText;
	// StyleSheet styles = new StyleSheet();
	// styles.loadTagStyle("ol", "leading", "16,0");
	// String pseudoCode = highlightStyleTextinHTML(getStyledText());
	//
	// if (pseudoCode != null) {
	// bodyText = HTMLWorker.parseToList(new StringReader(
	// indentCode(pseudoCode)), styles);
	// for (Element elem : bodyText) {
	// add(elem);
	// }
	// } else {
	// System.out
	// .println("ERROR: The content retrieved from the editor was empty!");
	// }
	// }

	/**
	 * @author Sebastian Schmitz this function grabs the content from the editor
	 *         containing a file with ".algo"-ending and returns it as String if
	 *         you use this, checking whether the returned String is null is
	 *         advised!
	 * @param style
	 *            the styled text to highlight
	 * @return content of the editor
	 */
	private String highlightStyleTextinHTML(StyledText style) {
		return highlightStyleTextinHTML(style, EXPORT_WHOLE_SOURCE_CODE);
	}

	/**
	 * @author Sebastian Schmitz this function grabs the content from the editor
	 *         containing a file with ".algo"-ending and returns it as String if
	 *         you use this, checking whether the returned String is null is
	 *         advised!
	 * @param style
	 *            the styled text to highlight
	 * @param wantedLineIndex
	 *            the wanted line number of the styled text to be highlighted,
	 *            '-1' if whole styled text is wanted
	 * @return content of the editor
	 */
	private String highlightStyleTextinHTML(StyledText style,
			int wantedLineIndex) {
		if (style == null) {
			info("The style could not be grabbed from the Editor");
			return null;
		}

		String codeWithHTMLStyleTags = "";

		// XtextEditor edit = getXTextEditor();
		// if (edit == null) {
		// info("The XTextEditor could not be fetched");
		// }

		if (wantedLineIndex != EXPORT_WHOLE_SOURCE_CODE) {
			String wantedRow = style.getLine(wantedLineIndex);

			// this returns wanted line of source code, not highlighted
			// TODO for alvis 2.0: highlight it!
			return wantedRow;
		}

		RGB rgb;
		RGB black = new RGB(0, 0, 0);
		String text = style.getText(); // the complete text grabbed from the
										// editor
		StyleRange[] range = style.getStyleRanges();// ranges declaring the
													// styles of each part
													// of the text

		// int start;// start at 0 if whole text shall be highlighted, or at
		// // wantedLineIndex if only this row shall be highlighted
		// int length;// end at range.length if whole text shall be highlighted
		// or
		// // at wantedLineIndex+1 if only this row shall be
		// // highlighted
		// if (wantedLineIndex == -1) {
		// start = 0;
		// length = range.length;
		// } else {
		// start = wantedLineIndex;
		// length = start + 1;
		// }
		for (StyleRange ran : range) { // cycle through these ranges and
										// style them using HTML

			String word = "";
			for (int i = ran.start; i < ran.start + ran.length; i++) {
				if (text.charAt(i) == '<') // Replace "<" and ">" otherwise
											// they will be interpreted and
											// thus erased by the HTMLWorker
					word += "&lt;";
				else if (text.charAt(i) == '>')
					word += "&gt;";
				else
					word += text.charAt(i); // if the character is neither
											// "<" nor ">" append it to the
											// current word
			}
			Color col = ran.foreground;
			if (col == null) { // color must not be null
				rgb = black;
			} else
				rgb = col.getRGB();
			if (!rgb.equals(black)) // black is assumed as standard color,
									// other color will be included here.
				word = "<font color=\"#"
						+ FormatStringCorrectly(Integer.toHexString(rgb.red))
						+ FormatStringCorrectly(Integer.toHexString(rgb.green))
						+ FormatStringCorrectly(Integer.toHexString(rgb.blue))
						+ "\">" + word + "</font>";
			// add font style to the current word
			// if (ran.fontStyle == 0)
			// word = "<u>" + word + "</u>";
			if (ran.fontStyle == 1)
				word = "<b>" + word + "</b>";
			if (ran.fontStyle == 2) {
				word = "<i>" + word + "</i>";
			}
			codeWithHTMLStyleTags += word;

		}
		return codeWithHTMLStyleTags + "\n";

	}

	/**
	 * Adds a '0' character in front a string. Important for color values: "0"
	 * instead of "00" or "f" instead of "0f" would be misinterpreted by the
	 * HTMLParser
	 * 
	 * @param toFormat
	 * @return formatted String
	 */
	private String FormatStringCorrectly(String toFormat) {
		if (toFormat.length() == 1)
			return "0" + toFormat;
		return toFormat;
	}

	private void info(String str) {
		// Method to log error messages
		System.out.println(str);
	}

	// private StyledText getStyledText() {
	//
	// AlgorithmEditor edit = null;
	//
	// // Get active page:
	// IWorkbenchPage page = PlatformUI.getWorkbench()
	// .getActiveWorkbenchWindow().getActivePage();
	// try {
	// edit = (AlgorithmEditor) page.getActiveEditor();
	// } catch (ClassCastException ccee) {
	// }
	//
	// // XtextEditor edit = null;
	// // // Get open pages
	// // IWorkbenchPage pages[] = PlatformUI.getWorkbench()
	// // .getActiveWorkbenchWindow().getPages();
	// // // Cycle through these pages
	// // for (IWorkbenchPage page : pages) {
	// // // Cycle through every page's editors
	// // for (IEditorReference ref : page.getEditorReferences()) {
	// // String title = ref.getTitle();
	// // IEditorPart refpart = ref.getEditor(true);
	// // // Get algo-editor
	// // if (title.contains(".algo")) {
	// // if (refpart.getAdapter(refpart.getClass()) instanceof XtextEditor) {
	// // edit = (XtextEditor) ref.getEditor(true).getAdapter(
	// // XtextEditor.class);
	// // }
	// // }
	// //
	// // }
	// //
	// // }
	//
	// return edit.getTextWidget();
	// }

}
