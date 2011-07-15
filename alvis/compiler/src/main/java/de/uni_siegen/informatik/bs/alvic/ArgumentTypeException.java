package de.uni_siegen.informatik.bs.alvic;

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

	public ArgumentTypeException(String method, Type expected, int n, Type given,
	                             int line, int column) {
		super(expected, given, method, line, column);
		this.expected = expected;
		this.n = n;
		this.given = given;
	}

	public String toString() {
		return "Type error (" + line + ":" + column + "): Argument " + n
		    + " of method '" + expr + "' is expected to be of type '"
		    + expected + "' but is of type '" + given + "'.";
	}
}
