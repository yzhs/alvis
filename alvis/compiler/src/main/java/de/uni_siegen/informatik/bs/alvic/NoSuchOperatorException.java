package de.uni_siegen.informatik.bs.alvic;

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
	 * The type of the second argument or null if there is none.
	 */
	protected Type argType;

	/**
	 * @param object
	 *            The object that does not have such an operator.
	 * @param op
	 *            The operator that is missing
	 * @param arguments
	 *            The number of arguments the operator is supposed to take
	 *            (should be 0 or 1)
	 * @param tree
	 *            The tree which has the operator as its root
	 */
	public NoSuchOperatorException(Type object, String op, Type argType, int arguments, TypedTree tree) {
		super(object, op, tree);
		this.arguments = arguments;
		this.argType = argType;
	}

	@Override
	public String toString() {
		return "Operator error " + getPos() + ": There is "
				+ "no operator '" + member + "' for objects of type '" + object + "'"
				+ ((arguments == 0) ? "." : (" taking exactly " + arguments
						+ " arguments of a " + "subtype of '" + object + "'."));
	}

	public int getArguments() {
		return arguments;
	}
	
	public Type getArgType() {
		return argType;
	}
}
