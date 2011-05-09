/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.views;

import java.util.ArrayList;

import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.swt.custom.StyledText;

/**
 * @author Eduard Boos
 * 
 */
public class AutoCompletion {
	
	/**
	 * Enables auto completion for ctrl+space  for the text.
	 * @param text the {@link StyledText} to be autoCompleted
	 * @param completions all available completions for this text
	 * @return true if successful
	 */
	public static ContentProposalAdapter contentProposalAdapter=null;
	public static boolean setCompletion(StyledText text,
			ArrayList<String> completions) {
		char[] autoActivationCharacters = new char[] { '.', '#' };
		KeyStroke keyStroke;
		try {
			keyStroke = KeyStroke.getInstance("Ctrl+Space");
			AutoCompletionProposalProvider autoCompletionProposalProvider = new AutoCompletionProposalProvider(completions);
			ContentProposalAdapter adapter = new ContentProposalAdapter(text,
					new StyledTextContentAdapter(),autoCompletionProposalProvider
					, keyStroke,
					autoActivationCharacters);
			contentProposalAdapter = adapter;
		} catch (Exception e) {
			return false;

		}
		return true;
	}
	public static ContentProposalAdapter getContentProposalAdapter() {
		return contentProposalAdapter;
	}
}
