package de.uni_siegen.informatik.bs.alvic;

/**
 * This exception is used when the user tries to call something that is not a
 * function.
 * 
 * @author Colin
 */
public class NotAFunctionException extends TypeException {
	private static final long serialVersionUID = 2290856303317891280L;

	/**
	 * The type of the expression.
	 */
	protected Type type;

	/**
	 * This is what was called, but is not a function.
	 */
	protected String expr;

	/**
	 * @param type
	 *            The type of the expression that was called.
	 * @param expr
	 *            The actual expression that was called.
	 * @param tree
	 *            The function's identifier
	 */
	public NotAFunctionException(Type type, String expr, TypedTree tree) {
		super(tree);
		this.type = type;
		this.expr = expr;
	}

	public String toString() {
		return "Function call error " + getPos() + ": "
				+ "Tried to call '" + expr + "', which has type '" + type
				+ "', which is not a function type.";
	}

	public Type getType() {
		return type;
	}

	public String getExpr() {
		return expr;
	}
}
