package de.uni_siegen.informatik.bs.alvic;

/**
 * This exception is used when trying to index something that is not an array.
 * 
 * @author Colin
 */
public class NotAnArrayException extends TypeException {
	private static final long serialVersionUID = 8561795105957083725L;

	/**
	 * The type of the expression.
	 */
	protected Type type;

	/**
	 * This is what was indexed, but is not an array.
	 */
	protected String expr;

	/**
	 * @param type
	 *            The expressions actual type.
	 * @param expr
	 *            The expression that caused the problem itself.
	 * @param line
	 *            The line of the expression.
	 * @param column
	 *            Its column
	 */
	public NotAnArrayException(Type type, String expr, int line, int column) {
		super(line, column);
		this.type = type;
		this.expr = expr;
	}

	public String toString() {
		return "Indexing error (" + line + ":" + column + "): "
				+ "Tried to index '" + expr + "', which has type '" + type
				+ "', which is not an array type.";
	}
}
