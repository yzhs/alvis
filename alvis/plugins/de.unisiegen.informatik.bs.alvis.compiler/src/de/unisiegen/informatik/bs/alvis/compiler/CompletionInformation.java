/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.compiler;

/**
 * This Class contains all completion relevant Data for a single completion.
 * Note this isn't the final version of this class. It shall be completed for
 * advanced code-completion.
 * 
 * @author Eduard Boos
 * 
 */
public class CompletionInformation {

	private String replacementString;
	private int line;
	private int charPositionInLine;
	private int replacementLength;

	/**
	 * Creates a basic CompletionInformaion Object needed for Code-Completion.
	 * 
	 * @param replacementString
	 *            the String
	 * @param line
	 *            the line where this proposal should be inserted.
	 * @param charPositionInLine
	 *            the offset in the line.
	 * @param replacementLength
	 *            usually the length of the proposal that was already written.
	 */
	public CompletionInformation(String replacementString, int line,
			int charPositionInLine, int replacementLength) {
		this.replacementString = replacementString;
		this.line = line;
		this.charPositionInLine = charPositionInLine;
		this.replacementLength = replacementLength;
	}

	/**
	 * @return the replacementString
	 */
	public String getReplacementString() {
		return replacementString;
	}

	/**
	 * @param replacementString
	 *            the replacementString to set
	 */
	public void setReplacementString(String replacementString) {
		this.replacementString = replacementString;
	}

	/**
	 * @return the replacementLength
	 */
	public int getReplacementLength() {
		return replacementLength;
	}

	/**
	 * @param replacementLength
	 *            the replacementLength to set
	 */
	public void setReplacementLength(int replacementLength) {
		this.replacementLength = replacementLength;
	}

	/**
	 * @return the line
	 */
	public int getLine() {
		return line;
	}

	/**
	 * @param line
	 *            the line to set
	 */
	public void setLine(int line) {
		this.line = line;
	}

	/**
	 * @return the charPositionInLine
	 */
	public int getCharPositionInLine() {
		return charPositionInLine;
	}

	/**
	 * @param charPositionInLine
	 *            the charPositionInLine to set
	 */
	public void setCharPositionInLine(int charPositionInLine) {
		this.charPositionInLine = charPositionInLine;
	}

}
