package de.uni_siegen.informatik.bs.alvic;

import org.antlr.runtime.RecognitionException;

/**
 * Implementations of this exception are used to handle all type checker
 * generated problems.
 *
 * @author Colin
 */
public abstract class TypeException extends RecognitionException {
	private static final long serialVersionUID = -2651349912464757271L;

	public int endLine;
	public int endCharPositionInLine;
	
	public abstract String toString();

	protected TypeException(TypedTree tree) {
		this.token = tree.getToken();
		this.line = tree.getLine();
		this.endLine = tree.getEndLine();
		this.charPositionInLine = tree.getCharPositionInLine();
		this.endCharPositionInLine = tree.getEndCharPositionInLine();
	}

	public String getPos() {
		return "(from " + line + ":" + charPositionInLine + " to " + endLine + ":" + endCharPositionInLine + ")";
	}
}
