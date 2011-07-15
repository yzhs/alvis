package de.uni_siegen.informatik.bs.alvic;

import de.uni_siegen.informatik.bs.alvic.UnknownMemberException;

/**
 * This exception describes the problem that the user tries to use an operator
 * of a given class when no operator with that name exists.
 * 
 * @author Colin
 */
public class UnknownOperatorException extends UnknownMemberException {
	private static final long serialVersionUID = 3837290428993154987L;

	/**
	 * @param object
	 *            The left argument of the operator.
	 * @param op
	 *            The operator that is not available with this left argument
	 * @param line
	 *            The line the operator occurs in.
	 * @param column
	 *            The column the operator occurs in.
	 */
	public UnknownOperatorException(Type object, String op, int line, int column) {
		super(object, op, line, column);
	}

	@Override
	public String toString() {
		return "Operator error (" + line + ":" + column + "): Class '" + object
				+ "' does not have any operator called '" + member + "'.";
	}
}
