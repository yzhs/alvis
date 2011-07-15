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
	 * @param line
	 *            The line the member is referenced in.
	 * @param column
	 *            The column the member is referenced in.
	 */
	public UnknownMemberException(Type object, String member, int line,
			int column) {
		super(line, column);
		this.object = object;
		this.member = member;
	}

	public String toString() {
		return "Attribute error (" + line + ":" + column + "): Class '"
				+ object + "' does not have a member called '" + member + "'.";
	}
}
