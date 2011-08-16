package de.uni_siegen.informatik.bs.alvic;

/**
 * This exception describes the problem that a function is called with the wrong
 * number of arguments.
 * 
 * @author Colin
 */
public class ArgumentTypeException extends TypeMismatchException {
	private static final long serialVersionUID = -6914907729944478299L;

	/**
	 * The number of the argument that caused the exception.
	 */
	protected int n;

	/**
	 * Create new ArgumentTypeException instance.
	 * 
	 * @param method
	 *            The method which was called with the wrongly typed argument.
	 * @param expected
	 *            The type the argument should have had.
	 * @param n
	 *            The position of the offending argument in the argument list.
	 * @param given
	 *            The type the argument actually has.
	 * @param tree
	 *            The subtree of the function call, might be changed to the
	 *            subtree of the n-th argument.
	 */
	public ArgumentTypeException(String method, Type expected, int n,
			Type given, TypedTree tree) {
		super(expected, given, method, tree);
		this.expected = expected;
		this.n = n;
		this.given = given;
	}

	@Override
	public String toString() {
		return "Type error " + getPos() + ": Argument " + n + " of method '"
				+ expr + "' is expected to be of type '" + expected
				+ "' but is of type '" + given + "'.";
	}

	/**
	 * @return the number of the argument that has the wrong type.
	 */
	public int getArgumentNumber() {
		return n;
	}
}
