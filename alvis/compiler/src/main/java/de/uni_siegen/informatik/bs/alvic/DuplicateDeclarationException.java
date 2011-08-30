package de.uni_siegen.informatik.bs.alvic;

/**
 * This exception is used when the user tries do declare an identifier that was
 * already declared in that scope.
 * 
 * @author Colin Benner
 */
public class DuplicateDeclarationException extends TypeException {
	private static final long serialVersionUID = -7517459767870677237L;

	/**
	 * The identifier that was declared more than once.
	 */
	protected String id;

	/**
	 * @param identifier
	 *            The identifier that has already been declared.
	 * @param tree
	 *            The tree of the assignment.
	 */
	public DuplicateDeclarationException(String identifier, TypedTree tree) {
		super(tree);
		this.id = identifier;
	}

	@Override
	public String toString() {
		return "Syntax error " + getPos() + ": Trying to declare identifier '"
				+ id + "' which has already been declared.";
	}

	/**
	 * @return the type of the left argument of the operator
	 */
	public String getIdentifier() {
		return id;
	}
}
