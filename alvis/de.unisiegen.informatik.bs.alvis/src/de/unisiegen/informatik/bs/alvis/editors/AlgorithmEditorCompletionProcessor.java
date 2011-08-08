/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.editors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import de.unisiegen.informatik.bs.alvis.compiler.CompilerAccess;

/**
 * Provides Content Assist(autocompletion) functionality for the Algorithmeditor
 * @author Eduard Boos
 * 
 */
public class AlgorithmEditorCompletionProcessor implements
		IContentAssistProcessor {

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
		@Override
		public boolean isContextInformationValid(int offset) {
			return Math.abs(fInstallOffset - offset) < 5;
		}

		/*
		 * @see IContextInformationValidator#install(IContextInformation, ITextViewer, int)
		 */
		@Override
		public void install(IContextInformation info, ITextViewer viewer, int offset) {
			fInstallOffset= offset;
		}

		/*
		 * @see org.eclipse.jface.text.contentassist.IContextInformationPresenter#updatePresentation(int, TextPresentation)
		 */
		@Override
		public boolean updatePresentation(int documentPosition, TextPresentation presentation) {
			return false;
		}
	}

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int offset) {
		List<String> availableProposals = new ArrayList<String>();
		String prefix = getPrefix(viewer.getDocument(), offset);
		int line = -1;
		int charPositionInLine = -1;
		try {
			CompilerAccess.getDefault().compileString(viewer.getTextWidget().getText());
			line = viewer.getDocument().getLineOfOffset(offset);
			charPositionInLine = offset - viewer.getDocument().getLineOffset(line);
			line++;
			System.out.println("Line: " + line + "Position in Line: " + charPositionInLine);
			
		} catch (BadLocationException e) {
			System.out.println("BAD LOCATION");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(line!=-1 && charPositionInLine!=-1)
		{
			availableProposals = CompilerAccess.getDefault().tryAutoCompletion(line, charPositionInLine);
		}

		//TODO to implement
		/** getting all proposals that fit the prefix */
//		for (String proposal : proposals) {
//			if (proposal.startsWith(prefix)) {
//				availableProposals.add(proposal);
//			}
//		}

//		availableProposals.addAll(proposals);
		System.out.println();
		/** creation of the CompletionProposal Array */
		ArrayList<ICompletionProposal> resultList = new ArrayList<ICompletionProposal>();
		ICompletionProposal[] result = new ICompletionProposal[availableProposals
				.size()];
		for (int i = 0; i < availableProposals.size(); i++) {
			// TODO change or modify it, when needed not sure whether this feature is needed
			String currentProposal = availableProposals.get(i);
			if(currentProposal!=null)
			{				
				ContextInformation contextInfo = new ContextInformation(currentProposal,"Context Information for " + currentProposal);
				ICompletionProposal completionProposal = new CompletionProposal(currentProposal,
						offset - prefix.length(), prefix.length(),
						currentProposal.length(),null,currentProposal,contextInfo, "Additional Information for: " + currentProposal + "\n Some Info here");
				resultList.add(completionProposal);
			}
		}
		result = resultList.toArray(new ICompletionProposal[0]);
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
