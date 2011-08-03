package de.uni_siegen.informatik.bs.alvic;

/**
 * This exception is used when the user tries to use a function call as the left
 * argument of the assignment operator.
 * 
 * @author Colin
 */
public class InvalidAssignmentException extends TypeException {
	private static final long serialVersionUID = 7488963207043957012L;

	/**
	 * The left side of the assignment.
	 */
	protected String left;

	/**
	 * The right side of the assignment.
	 */
	protected String right;

	/**
	 * @param left
	 *            The expression to the left of the assignment operator.
	 * @param right
	 *            The expression to the right of the assignment operator.
	 * @param tree
	 *            The tree of the assignment.
	 */
	public InvalidAssignmentException(String left, String right, TypedTree tree) {
		super(tree);
		this.left = left;
		this.right = right;
	}

	public String toString() {
		return "Syntax error " + getPos() + ": The left "
				+ "side '" + left + "' of the assignement '" + left + " = "
				+ right + "' is a function call and thus not "
				+ "allowed in this place.";
	}

	public String getLeft() {
		return left;
	}

	public String getRight() {
		return right;
	}
}
