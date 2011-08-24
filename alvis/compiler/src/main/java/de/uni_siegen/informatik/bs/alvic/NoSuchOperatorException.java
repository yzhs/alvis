package de.uni_siegen.informatik.bs.alvic;

/**
 * This exception describes the problem that the user tries to use an operator
 * of a given class when no such method with the correct number of arguments and
 * the correct argument types exists.
 * 
 * @author Colin Benner
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
		this.arguments = arguments + 1;
		this.argType = argType;
	}

	@Override
	public String toString() {
		return "Operator error " + getPos() + ": There is "
				+ "no operator '" + member + "' for objects of type '" + object + "'"
				+ ((arguments == 1) ? "." : (" taking exactly " + arguments
						+ " arguments of a " + "subtype of '" + object + "'."));
	}

	/**
	 * @return the number of parameters of the operator (should always be either 1 or 2). 
	 */
	public int getArguments() {
		return arguments;
	}
	
	/**
	 * @return the type of the second argument if there is one, null otherwise.
	 */
	public Type getArgType() {
		return argType;
	}
}
