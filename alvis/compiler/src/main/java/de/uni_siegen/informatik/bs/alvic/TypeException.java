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
	
	/**
	 * The line in which the error occurred.
	 */
	protected int line;
	
	/**
	 * The column in which the error occurred.
	 */
	protected int column;

	public abstract String toString();

	protected TypeException(int line, int column) {
		this.line = line;
		this.column = column;
	}
}
