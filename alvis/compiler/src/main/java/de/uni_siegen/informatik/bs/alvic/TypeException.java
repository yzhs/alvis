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
	
	public abstract String toString();

	protected TypeException(int line, int column) {
		this.line = line;
		this.charPositionInLine = column;
	}
}
