/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.views;

import java.util.ArrayList;

import org.eclipse.jface.fieldassist.ContentProposal;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;

/**
 * @author Eduard Boos
 * 
 */

public class AutoCompletionProposalProvider implements IContentProposalProvider {
	ContentProposalAdapter adapter;
	ArrayList<String> proposals;

	/**
	 * 
	 * @param proposals
	 *            the ArrayList<String> containing all available proposals
	 */
	public AutoCompletionProposalProvider(ArrayList<String> proposals) {
		this.proposals = proposals;
	}

	/**
	 * 
	 * @param proposals
	 *            the String array containing all available proposals
	 */
	public AutoCompletionProposalProvider(String[] proposals) {
		ArrayList<String> prop = new ArrayList<String>();
		for (String element : proposals) {
			prop.add(element);
		}
		this.proposals = prop;
	}

	/**
	 * Returns true is the character is a whitespace
	 * 
	 * @param character
	 *            the character to test
	 * @return true if character is a whitespace
	 */
	public static boolean isWhitespace(char character) {
		boolean isWhitespace = String.valueOf(character).matches("\\s");
		return isWhitespace;

	}

	/**
	 * Returns true if the character at the given position in the string is a
	 * whitespace
	 * 
	 * @param string
	 *            the string containing the character to test
	 * @param position
	 *            the position of the character to test
	 * @return true if character on this position is a whitespace
	 */
	public static boolean isWhitespace(String string, int position) {
		boolean isWhitespace = false;
		if (position < string.length() && position >= 0) {
			isWhitespace = isWhitespace(string.charAt(position));
		}
		return isWhitespace;
	}

	/**
	 * Returns all available Proposals for the content and position given
	 * 
	 * @param position
	 *            the position of the cursor
	 * @param content
	 *            the String to be checked for Proposals
	 * @return the Proposals available for the content and position given
	 */
	public IContentProposal[] getProposals(String content, int position) {
		// System.out.println(contents + " at Position: " + position);
		IContentProposal[] ret = new ContentProposal[0];
		;
		/** split.("\\s") splits the String on all whiteSpaces */
		if (content.length() > 0 && !(isWhitespace(content, position - 1))) {
			int endOfString = position;
			while (endOfString != (content.length())
					&& isWhitespace(content, endOfString)) {
				endOfString++;
			}
			String toSplit = content.substring(0, endOfString);
			String[] stringArray = toSplit.split("\\s");

			int stringArrayLength = stringArray.length;
			if (!(stringArrayLength < 1)) {
				String lastString = stringArray[stringArrayLength - 1];
				if (lastString.equals("complete")) {
					ret = new ContentProposal[3];
					ret[0] = new ContentProposal("Content1");
					ret[1] = new ContentProposal("Content2");
					ret[2] = new ContentProposal("Content3");
				} else {
					ArrayList<String> availableProposals = new ArrayList<String>();
					for (String element : proposals) {
						if (element.startsWith(lastString)) {
							availableProposals.add(element);
						}
					}
					ret = new ContentProposal[availableProposals.size()];
					int i = 0;
					for (String element : availableProposals) {
						ret[i] = new ContentProposal(element);
						i++;
					}
				}
			}
		}
		return ret;
	}

}
