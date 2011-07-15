package de.uni_siegen.informatik.bs.alvic;

import de.uni_siegen.informatik.bs.alvic.UnknownOperatorException;

/**
 * This exception describes the problem that the user tries to use an operator
 * of a given class when no such method with the correct number of arguments and
 * the correct argument types exists.
 * 
 * @author Colin
 */
public class NoSuchOperatorException extends UnknownOperatorException {
	private static final long serialVersionUID = -54345625059571797L;

	/**
	 * Number of arguments the operator expects.
	 */
	protected int arguments;

	/**
	 * @param object
	 *            The object that does not have such an operator.
	 * @param op
	 *            The operator that is missing
	 * @param arguments
	 *            The number of arguments the operator is supposed to take
	 *            (should be 0 or 1)
	 * @param line
	 *            Line in which the operator is used.
	 * @param column
	 *            Column in which the operator is used.
	 */
	public NoSuchOperatorException(Type object, String op, int arguments,
			int line, int column) {
		super(object, op, line, column);
		this.arguments = arguments;
	}

	@Override
	public String toString() {
		return "Operator error ("
				+ line
				+ ":"
				+ column
				+ "): There is "
				+ "no operator '"
				+ member
				+ "' for objects of type '"
				+ object
				+ "'"
				+ ((arguments == 0) ? "." : (" taking exactly " + arguments
						+ " arguments of a " + "subtype of '" + object + "'."));
	}
}
