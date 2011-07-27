package de.uni_siegen.informatik.bs.alvic;

import org.antlr.runtime.Token;

/**
 * This exception describes the problem that a function is called with the
 * wrong number of arguments.
 *
 * @author Colin
 */
public class ArgumentTypeException extends TypeMismatchException {
	private static final long serialVersionUID = -6914907729944478299L;
	
	/**
	 * The number of the argument that caused the exception.
	 */
	protected int n;

	public ArgumentTypeException(String method, Type expected, int n, Type given, Token token) {
		super(expected, given, method, token);
		this.expected = expected;
		this.n = n;
		this.given = given;
	}

	public String toString() {
		return "Type error " + getPos() + ": Argument " + n
		    + " of method '" + expr + "' is expected to be of type '"
		    + expected + "' but is of type '" + given + "'.";
	}
}
