package de.uni_siegen.informatik.bs.alvic;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

/**
 * Implementations of this exception are used to handle all type checker
 * generated problems.
 *
 * @author Colin
 */
public abstract class TypeException extends RecognitionException {
	private static final long serialVersionUID = -2651349912464757271L;
	
	public abstract String toString();

	protected TypeException(Token token) {
		this.token = token;
		this.line = token.getLine();
		this.charPositionInLine = token.getCharPositionInLine();
	}

	String getPos() {
		return "(" + line + ":" + charPositionInLine + ")";
	}
}
