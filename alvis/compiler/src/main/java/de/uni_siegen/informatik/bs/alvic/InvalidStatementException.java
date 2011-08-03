package de.uni_siegen.informatik.bs.alvic;

/**
 * This exception is used when the user writes something like 'x,', that is some
 * expression 'x' that is not a function call where a statement was expected.
 * 
 * @author Colin
 */
public class InvalidStatementException extends TypeException {
	private static final long serialVersionUID = -2667840149739205105L;
	/**
	 * The invalid statement.
	 */
	protected String expr;

	/**
	 * @param expr
	 *            The expression that is no statement but used as one.
	 * @param token
	 *            A token of the expression.
	 */
	public InvalidStatementException(String expr, TypedTree tree) {
		super(tree);
		this.expr = expr;
	}

	public String toString() {
		return "Syntax error " + getPos() + ": Found '" + expr
				+ "' which is not a valid statement but used where a statement"
				+ " was expected.";
	}

	public String getExpr() {
		return expr;
	}
}
