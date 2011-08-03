package de.uni_siegen.informatik.bs.alvic;

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
	 *            The operator that is not available with this left argument.
	 * @param tree
	 *            The tree of which the operator is the root.
	 */
	public UnknownOperatorException(Type object, String op, TypedTree tree) {
		super(object, op, tree);
	}

	@Override
	public String toString() {
		return "Operator error " + getPos() + ": Class '" + object
				+ "' does not have any operator called '" + member + "'.";
	}
}
