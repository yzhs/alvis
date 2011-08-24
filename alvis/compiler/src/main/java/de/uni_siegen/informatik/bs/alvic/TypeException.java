package de.uni_siegen.informatik.bs.alvic;

import org.antlr.runtime.RecognitionException;

/**
 * Implementations of this exception are used to handle all type checker
 * generated problems.
 *
 * @author Colin Benner
 */
public abstract class TypeException extends RecognitionException {
	private static final long serialVersionUID = -2651349912464757271L;

	/**
	 * The last line containing part of the invalid code.
	 */
	public int endLine;
	
	/**
	 * The last column containing part of the invalid code in the last line.
	 */
	public int endCharPositionInLine;

	public abstract String toString();

	/**
	 * @param tree the tree in which the error occurred.
	 */
	protected TypeException(TypedTree tree) {
		this.token = tree.getToken();
		this.line = tree.getLine();
		this.endLine = tree.getEndLine();
		this.charPositionInLine = tree.getCharPositionInLine();
		this.endCharPositionInLine = tree.getEndCharPositionInLine();
	}

	/**
	 * 
	 * @return a textual representation of the range in which which the error occurred.
	 */
	public String getPos() {
		return "(from " + line + ":" + charPositionInLine + " to " + endLine + ":" + endCharPositionInLine + ")";
	}
}
