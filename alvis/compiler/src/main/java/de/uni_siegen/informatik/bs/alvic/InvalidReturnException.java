package de.uni_siegen.informatik.bs.alvic;

/**
 * This exception is used when the user tries to return something of the wrong
 * type, a function with return-type void contains a return statement with a
 * parameter or a non-void functions contains an empty return statement.
 * 
 * @author Colin
 */
public class InvalidReturnException extends TypeException {
	private static final long serialVersionUID = -1434703988506333067L;

	/**
	 * The type that was expected when encountering the return statement.
	 */
	protected Type expected;

	/**
	 * What the user tried to return.
	 */
	protected Type given;

	/**
	 * The function the error occurred in.
	 */
	protected String function;

	/**
	 * The return statement.
	 */
	protected String stat;

	/**
	 * @param expected
	 *            The type that was expected.
	 * @param given
	 *            The type that was actually found.
	 * @param function
	 *            The function in question.
	 * @param stat
	 *            The actual return statement
	 * @param line
	 *            The line of the return statement.
	 * @param column
	 *            The column of the return statement.
	 */
	public InvalidReturnException(Type expected, Type given, String function,
			String stat, int line, int column) {
		super(line, column);
		this.expected = expected;
		this.given = given;
		this.function = function;
		this.stat = stat;
	}

	public String toString() {
		if (expected.toString().equalsIgnoreCase("void"))
			return "Type error (" + line + ":" + column
					+ "): Trying to return " + "non-void value '" + stat
					+ "' from function '" + function
					+ "' when an empty return statement was expected.";
		if (given == null)
			return "Type error (" + line + ":" + column
					+ "): Trying to return " + " value of type '" + given
					+ "' from non-void function '" + function + "'.";
		return "Type error (" + line + ":" + column + "): Trying to return "
				+ "value '" + stat + "' of type '" + given
				+ "' when a value of " + "type '" + expected
				+ "' was expected.";
	}
}
