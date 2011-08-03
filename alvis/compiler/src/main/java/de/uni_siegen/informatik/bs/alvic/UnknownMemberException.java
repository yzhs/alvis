package de.uni_siegen.informatik.bs.alvic;

import org.antlr.runtime.Token;

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
	 * @param token
	 *            The '.'-token.
	 */
	public UnknownMemberException(Type object, String member, Token token) {
		super(token);
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
