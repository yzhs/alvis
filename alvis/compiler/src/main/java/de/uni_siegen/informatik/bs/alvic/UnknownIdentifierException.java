package de.uni_siegen.informatik.bs.alvic;

/**
 * This exception is thrown when encountering an identifier that was not defined
 * in the current scope.
 * 
 * @author Colin
 */
public class UnknownIdentifierException extends TypeException {
	private static final long serialVersionUID = -2452015985530518766L;

	/**
	 * The identifier that was used before being used in the current scope.
	 */
	protected String identifier;

	/**
	 * Describes the problem that the given identifier was used but not
	 * declared.
	 * 
	 * @param identifier
	 *            The name of the identifier in question.
	 * @param tree
	 *            The token containing the identifier.
	 */
	public UnknownIdentifierException(String identifier, TypedTree tree) {
		super(tree);
		this.identifier = identifier;
	}

	public String toString() {
		return "Type error " + getPos() + ": Identifier '"
				+ identifier + "' was used before being declared in the "
				+ "current scope.";
	}

	public String getIdentifier() {
		return identifier;
	}
}
