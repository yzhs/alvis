/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.editors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
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
import de.unisiegen.informatik.bs.alvis.compiler.CompletionInformation;

/**
 * Provides Content Assist(Code-Completion) functionality to the Algorithmeditor
 * 
 * @author Eduard Boos
 * 
 */
public class AlgorithmEditorCompletionProcessor implements
		IContentAssistProcessor {

	public AlgorithmEditorCompletionProcessor() {
	}

	/**
	 * Simple content assist tip closer. The tip is valid in a range of 5
	 * characters around its popup location.
	 */
	protected static class Validator implements IContextInformationValidator,
			IContextInformationPresenter {

		protected int fInstallOffset;

		/*
		 * @see IContextInformationValidator#isContextInformationValid(int)
		 */
		@Override
		public boolean isContextInformationValid(int offset) {
			return Math.abs(fInstallOffset - offset) < 5;
		}

		/*
		 * @see IContextInformationValidator#install(IContextInformation,
		 * ITextViewer, int)
		 */
		@Override
		public void install(IContextInformation info, ITextViewer viewer,
				int offset) {
			fInstallOffset = offset;
		}

		/*
		 * @see
		 * org.eclipse.jface.text.contentassist.IContextInformationPresenter
		 * #updatePresentation(int, TextPresentation)
		 */
		@Override
		public boolean updatePresentation(int documentPosition,
				TextPresentation presentation) {
			return false;
		}
	}

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int offset) {
		int line = -1;
		int charPositionInLine = -1;
		try {
			CompilerAccess.getDefault().compileString(
					viewer.getTextWidget().getText());
			line = viewer.getDocument().getLineOfOffset(offset);
			charPositionInLine = offset
					- viewer.getDocument().getLineOffset(line);
			line++;
		} catch (BadLocationException e) {
			System.out.println("BAD LOCATION");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<CompletionInformation> availableProposals = new ArrayList<CompletionInformation>();
		if (line != -1 && charPositionInLine != -1) {
			availableProposals = CompilerAccess.getDefault().tryAutoCompletion(
					line, charPositionInLine);

		}
		/** creation of the CompletionProposal Array */
		List<CompletionProposal> resultList = new ArrayList<CompletionProposal>();
		for (int i = 0; i < availableProposals.size(); i++) {

			CompletionInformation currentProposal = availableProposals.get(i);
			if (currentProposal != null) {
				
				ContextInformation contextInfo = new ContextInformation(
						currentProposal.getReplacementString(),
						"Context Information for "
								+ currentProposal.getReplacementString());
				
				int replacementOffset = viewer.getTextWidget().getOffsetAtLine((
						currentProposal.getLine()-1))
						+ currentProposal.getCharPositionInLine();
				
				CompletionProposal completionProposal = new CompletionProposal(
						currentProposal.getReplacementString(),
						replacementOffset,
						currentProposal.getReplacementLength(), currentProposal
								.getReplacementString().length(), null,
						currentProposal.getReplacementString(), contextInfo,
						"Additional Information for: "
								+ currentProposal.getReplacementString()
								+ "\n Some Info here");
				resultList.add(completionProposal);
			}
		}
		ICompletionProposal[] result = new ICompletionProposal[availableProposals
				.size()];
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

}
