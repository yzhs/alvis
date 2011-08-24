package de.uni_siegen.informatik.bs.alvic;

/**
 * This exception describes the problem that a function is called with the wrong
 * number of arguments.
 * 
 * @author Colin Benner
 */
public class ArgumentNumberException extends TypeException {
	private static final long serialVersionUID = 6261123203257225538L;

	/**
	 * This is the name of the method being called.
	 */
	protected String method;

	/**
	 * The number of arguments the function would have accepted.
	 */
	protected int given;

	/**
	 * The number of the arguments the method expected.
	 */
	protected int expected;

	/**
	 * Create new ArgumentNumberException instance.
	 * 
	 * @param method
	 *            The name of the method or function that is called with the
	 *            wrong number of arguments.
	 * @param expected
	 *            The number of arguments the method or function expects.
	 * @param given
	 *            The actual number of arguments given.
	 * @param tree
	 *            The tree containing the function call.
	 */
	public ArgumentNumberException(String method, int expected, int given,
			TypedTree tree) {
		super(tree);
		this.method = method;
		this.expected = expected;
		this.given = given;
	}

	/**
	 * @return a textual representation of the problem.
	 */
	@Override
	public String toString() {
		return "Argument error " + getPos() + ": Method " + " '" + method
				+ "' expects " + expected + " parameters "
				+ "but is called with " + given + " arguments.";
	}
}
