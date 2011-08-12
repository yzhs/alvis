/**
 * This Class contain all completion relevant Data for a single Completion.
 */
package de.unisiegen.informatik.bs.alvis.compiler;

/**
 * @author Eduard Boos
 *
 */
public class CompletionInformation {
	private String replacementString;
	private int replacementOffset;
	private int replacementLength;
	public CompletionInformation(String replacementString, int replacementOffset, int replacementLength) {
		this.replacementString = replacementString;
		this.replacementOffset = replacementOffset;
		this.replacementLength = replacementLength;
	}
	/**
	 * @return the replacementString
	 */
	public String getReplacementString() {
		return replacementString;
	}
	/**
	 * @param replacementString the replacementString to set
	 */
	public void setReplacementString(String replacementString) {
		this.replacementString = replacementString;
	}
	/**
	 * @return the replacementOffset
	 */
	public int getReplacementOffset() {
		return replacementOffset;
	}
	/**
	 * @param replacementOffset the replacementOffset to set
	 */
	public void setReplacementOffset(int replacementOffset) {
		this.replacementOffset = replacementOffset;
	}
	/**
	 * @return the replacementLength
	 */
	public int getReplacementLength() {
		return replacementLength;
	}
	/**
	 * @param replacementLength the replacementLength to set
	 */
	public void setReplacementLength(int replacementLength) {
		this.replacementLength = replacementLength;
	}
	
}
