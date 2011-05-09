/**
 * Provides the Content Assist(autocompletion) functionality for the Algorithmeditor
 */
package de.unisiegen.informatik.bs.alvis.editors;

import java.util.ArrayList;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ContextInformation;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationPresenter;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

/**
 * 
 * @author Eduard Boos
 * 
 */
public class AlgorithmEditorCompletionProcessor implements
		IContentAssistProcessor {

	/** This list has to be generated by the Compiler or Lexer */
	protected final static String[] proposals = { "abstract", "boolean",
			"break", "byte", "case", "catch", "char", "class", "continue",
			"default", "do", "double", "else", "extends", "false", "final",
			"finally", "float", "for", "if", "implements", "import",
			"instanceof", "int", "interface", "long", "native", "new", "null",
			"package", "private", "protected", "public", "return", "short",
			"static", "super", "switch", "synchronized", "this", "throw",
			"throws", "transient", "true", "try", "void", "volatile", "while" };

	public AlgorithmEditorCompletionProcessor() {
	}
	
	/**
	 * Simple content assist tip closer. The tip is valid in a range
	 * of 5 characters around its popup location.
	 */
	protected static class Validator implements IContextInformationValidator, IContextInformationPresenter {

		protected int fInstallOffset;

		/*
		 * @see IContextInformationValidator#isContextInformationValid(int)
		 */
		public boolean isContextInformationValid(int offset) {
			return Math.abs(fInstallOffset - offset) < 5;
		}

		/*
		 * @see IContextInformationValidator#install(IContextInformation, ITextViewer, int)
		 */
		public void install(IContextInformation info, ITextViewer viewer, int offset) {
			fInstallOffset= offset;
		}

		/*
		 * @see org.eclipse.jface.text.contentassist.IContextInformationPresenter#updatePresentation(int, TextPresentation)
		 */
		public boolean updatePresentation(int documentPosition, TextPresentation presentation) {
			return false;
		}
	}

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int offset) {
		String prefix = getPrefix(viewer.getDocument(), offset);

		/** getting all proposals that fit the prefix */
		ArrayList<String> availableProposals = new ArrayList<String>();
		for (String proposal : proposals) {
			if (proposal.startsWith(prefix)) {
				availableProposals.add(proposal);
			}
		}
		/** creation of the CompletionProposal Array */
		ICompletionProposal[] result = new ICompletionProposal[availableProposals
				.size()];
		for (int i = 0; i < availableProposals.size(); i++) {
			// TODO change or modify it, when needed not sure whether this feature is needed
			String currentProposal = availableProposals.get(i);
			ContextInformation contextInfo = new ContextInformation(currentProposal,"Context Information for " + currentProposal);
			result[i] = new CompletionProposal(currentProposal,
					offset - prefix.length(), prefix.length(),
					currentProposal.length(),null,currentProposal,contextInfo, "Additional Information for: " + currentProposal + "\n Some Info here");
		}
		return result;
	}

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer,
			int offset) {
		/** no context Information needed at the moment */
		return null;
	}

	@Override
	/**
	 * Completions should be shown after the char "."
	 */
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { '.' };
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		/** no context Information needed at the moment */
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		/** defines how long the Context Information is shown(valid) */
		return new Validator();
	}

	@Override
	public String getErrorMessage() {
		return null;
	}

	/**
	 * Return the prefix String given by the document at the given offset
	 * Position (e.g. "My Document" offset =4 => returns: "Do")
	 * 
	 * @param document
	 *            the document to provide the text
	 * @param offset
	 *            the position from which to get the prefix
	 * @return the String containing the prefix
	 */
	private String getPrefix(IDocument document, int offset) {
		int currentposition = offset - 1;
		String documentText = document.get();
		String prefix = "";
		while (currentposition > 0) {
			/** if character is a whitespace the prefix is found */
			if (isWhitespace(documentText.charAt(currentposition))) {
				currentposition++;
				break;
			}
			currentposition--;

		}
		try {
			prefix = document.get(currentposition, offset - currentposition);
		} catch (BadLocationException e) {
		}
		return prefix;
	}

	/**
	 * Returns true is the character is a whitespace
	 * 
	 * @param c
	 *            character to test
	 * @return true if c is whitespace
	 */
	private boolean isWhitespace(char c) {
		return (c == ' ' || c == '\t' || c == '\n' || c == '\r');
	}

}
