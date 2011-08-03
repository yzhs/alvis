package de.uni_siegen.informatik.bs.alvic;

/**
 * This exception describes the problem that the user tries to access a member
 * of a given class that does not exist.
 * 
 * @author Colin
 */
public class UnknownMemberException extends TypeException {
	private static final long serialVersionUID = -2392060752964066036L;

	/**
	 * The member of this object does not exists.
	 */
	protected Type object;

	/**
	 * This is the name of the missing member.
	 */
	protected String member;

	/**
	 * @param object
	 *            This object's member is the one that is unknown.
	 * @param member
	 *            The name of the member.
	 * @param tree
	 *            The subtree in which the problem ocurred
	 */
	public UnknownMemberException(Type object, String member, TypedTree tree) {
		super(tree);
		this.object = object;
		this.member = member;
	}

	public String toString() {
		return "Attribute error " + getPos() + ": Class '"
				+ object + "' does not have a member called '" + member + "'.";
	}

	public Type getObject() {
		return object;
	}

	public String getMember() {
		return member;
	}
}
