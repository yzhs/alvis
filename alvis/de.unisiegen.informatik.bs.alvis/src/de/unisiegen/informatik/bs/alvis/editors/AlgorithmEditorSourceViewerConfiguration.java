/*
 * Copyright (c) 2011 Eduard Boos
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
package de.unisiegen.informatik.bs.alvis.editors;

import java.util.ArrayList;

import org.eclipse.jface.text.DefaultTextHover;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.jface.text.source.DefaultAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import de.unisiegen.informatik.bs.alvis.Activator;

/**
 * AlgorithmEditor Configuration Class is used to set up e.g. highlighting,
 * content assist and document partitioning
 * 
 * @author Eduard Boos
 * 
 */
public class AlgorithmEditorSourceViewerConfiguration extends
		SourceViewerConfiguration {

	private ArrayList<String> wordsToHighlight = new ArrayList<String>();
	private Color highlightColor = PlatformUI.getWorkbench().getDisplay()
			.getSystemColor(SWT.COLOR_BLACK);
	private IWordDetector wordDetector;
	private IWhitespaceDetector whitespaceDetector;
	private Token defaultToken = new Token(new TextAttribute(Display
			.getCurrent().getSystemColor(SWT.COLOR_BLACK), null, SWT.NORMAL));

	/**
	 * Will create a sourceViewerConfiguration where the wordToHighlight will be
	 * highlighted with the highlightColor
	 * 
	 * @param highlightColor
	 *            the Color for the highlighting
	 * @param wordsToHighlight
	 *            the words to highlight
	 */
	public AlgorithmEditorSourceViewerConfiguration(Color highlightColor,
			ArrayList<String> wordsToHighlight) {
		super();
		this.wordsToHighlight = wordsToHighlight;
		this.highlightColor = highlightColor;
	}

	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {

		ContentAssistant assistant = new ContentAssistant();
		assistant
				.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
		assistant.setContentAssistProcessor(
				new AlgorithmEditorCompletionProcessor(),
				IDocument.DEFAULT_CONTENT_TYPE);
		assistant.enableAutoActivation(true);
		assistant.setAutoActivationDelay(500);
		assistant
				.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
		assistant
				.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
		assistant.setContextInformationPopupBackground(new Color(PlatformUI
				.getWorkbench().getDisplay(), 205, 205, 0));
		assistant
				.setInformationControlCreator(getInformationControlCreator(sourceViewer));

		return assistant;
	}

	@Override
	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer) {

		PresentationReconciler reconciler = new PresentationReconciler();
		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setDamager(dr, AlgorithmPartitionScanner.BEGIN_END);
		reconciler.setRepairer(dr, AlgorithmPartitionScanner.BEGIN_END);

		/** setting color for the Multiline_comment parts */
		NonRuleBasedDamagerRepairer ndr = new NonRuleBasedDamagerRepairer(
				new TextAttribute(createColor(63, 95, 191)));
		reconciler
				.setDamager(ndr, AlgorithmPartitionScanner.MULTILINE_COMMENT);
		reconciler.setRepairer(ndr,
				AlgorithmPartitionScanner.MULTILINE_COMMENT);
		
		/** setting color for the Singleline_comment parts */
		ndr = new NonRuleBasedDamagerRepairer(new TextAttribute(createColor(63,
				127, 95)));
		reconciler.setDamager(ndr, AlgorithmPartitionScanner.SINGLELINE_COMMENT);
		reconciler
				.setRepairer(ndr, AlgorithmPartitionScanner.SINGLELINE_COMMENT);
		return reconciler;
	}

	@Override
	public String getConfiguredDocumentPartitioning(ISourceViewer sourceViewer) {
		return Activator.ALGORITHM_PARTITIONING;
	}

	@Override
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] { IDocument.DEFAULT_CONTENT_TYPE,
				AlgorithmPartitionScanner.MULTILINE_COMMENT,
				AlgorithmPartitionScanner.SINGLELINE_COMMENT,
				AlgorithmPartitionScanner.BEGIN_END };
	}
	@Override
	public ITextHover getTextHover(ISourceViewer sourceViewer, String
			contentType)
			{
			return new DefaultTextHover(sourceViewer);
			}
	@Override
	public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
		
		return new DefaultAnnotationHover(true);
	}


	/**
	 * This method helps to create a color, cause it can be hard to do so if not
	 * often worked with SWT
	 * 
	 * @param red
	 *            the red instance for the color to create(0-255)
	 * @param green
	 *            the green instance for the color to create(0-255)
	 * @param blue
	 *            the blue instance for the color to create(0-255)
	 * @return the Color from the RGB values given by the parameter
	 */
	public static Color createColor(int red, int green, int blue) {
		return new Color(Display.getCurrent(), new RGB(red, green, blue));
	}

	/**
	 * Create an Token from the Color given, bold if boolean bold is true.
	 * 
	 * @param red
	 *            the red instance for the color to create(0-255)
	 * @param green
	 *            the green instance for the color to create(0-255)
	 * @param blue
	 *            the blue instance for the color to create(0-255)
	 * @param bold
	 *            true if text should be bold
	 * @return the result Token given by the parameters.
	 */
	public static Token createToken(int red, int green, int blue, boolean bold) {
		Color color = createColor(red, green, blue);
		if (bold) {
			return new Token(new TextAttribute(color, null, SWT.BOLD));
		} else {
			return new Token(new TextAttribute(color, null, SWT.NORMAL));
		}
	}

	/**
	 * Retrieves the word detector.
	 * 
	 * @return The word detector
	 */
	protected IWordDetector getWordDetector() {
		if (wordDetector == null) {
			wordDetector = new IWordDetector() {

				@Override
				public boolean isWordPart(char character) {
					return Character.isJavaIdentifierPart(character);
				}

				@Override
				public boolean isWordStart(char character) {
					return Character.isJavaIdentifierStart(character);
				}
			};
		}
		return wordDetector;
	}

	/**
	 * Returns the whitespace detector. Whitespaces are blanks, tabs and new
	 * lines.
	 * 
	 * @return WhitespaceDetector-instance
	 */
	protected IWhitespaceDetector getWhitespaceDetector() {
		if (whitespaceDetector == null)
			whitespaceDetector = new IWhitespaceDetector() {

				@Override
				public boolean isWhitespace(char c) {
					return (c == ' ' || c == '\t' || c == '\n' || c == '\r');

				}

			};
		return whitespaceDetector;
	}


	/**
	 * @return the wordsToHighlight
	 */
	public ArrayList<String> getWordsToHighlight() {
		return wordsToHighlight;
	}

	/**
	 * @param wordsToHighlight
	 *            the wordsToHighlight to set
	 */
	public void setWordsToHighlight(ArrayList<String> wordsToHighlight) {
		this.wordsToHighlight = wordsToHighlight;
	}

	/**
	 * Returns the ITokenScanner with the rules for highlighting.
	 * @return the ITokenScanner with the rules for highlighting.
	 */
	private ITokenScanner getScanner() {
		RuleBasedScanner scanner = new RuleBasedScanner();
		/** get the Rules for Syntax highlighting */
		scanner.setRules(getRules());
		/** set default token to black not bold */
		IToken def = new Token(new TextAttribute(Display.getCurrent()
				.getSystemColor(SWT.COLOR_BLACK), null, SWT.NORMAL));
		scanner.setDefaultReturnToken(def);
		return scanner;
	}

	/**
	 * Returns the Highlighting rules
	 * 
	 * @return the Array containing all IRules needed for highlighting
	 */
	private IRule[] getRules() {
		ArrayList<IRule> rules = new ArrayList<IRule>();
		/** adding all words to highlight */
		rules.add(new WhitespaceRule(getWhitespaceDetector()));
		WordRule wordRule = new WordRule(getWordDetector(), defaultToken, false);
		for (String word : wordsToHighlight) {
			if (word != null && !word.equals("")) {
				wordRule.addWord(word, new Token(new TextAttribute(
						highlightColor, null, SWT.BOLD)));
			}
		}
		rules.add(wordRule);
		return rules.toArray(new IRule[rules.size()]);
	}
}
