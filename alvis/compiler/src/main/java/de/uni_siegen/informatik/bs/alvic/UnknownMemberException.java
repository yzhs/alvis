/*                                                                                                                                                                                                                                            
 * Copyright (c) 2011 Colin Benner
 * Permission is hereby granted, free of charge, to any person obtaining a copy of                                                                                                                                                            
 * this software and associated documentation files (the "Software"), to deal in the                                                                                                                                                          
 * Software without restriction, including without limitation the rights to use,                                                                                                                                                              
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the                                                                                                                                                            
 * Software, and to permit persons to whom the Software is furnished to do so,                                                                                                                                                                
 * subject to the following conditions:                                                                                                                                                                                                       
 * The above copyright notice and this permission notice shall be included in all                                                                                                                                                             
 * copies or substantial portions of the Software.                                                                                                                                                                                            
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,                                                                                                                                                        
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A                                                                                                                                                              
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT                                                                                                                                                         
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION                                                                                                                                                          
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE                                                                                                                                                             
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.                                                                                                                                                                                     
 */
package de.uni_siegen.informatik.bs.alvic;

/**
 * This exception describes the problem that the user tries to access a member
 * of a given class that does not exist.
 * 
 * @author Colin Benner
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
	 *            The subtree in which the problem occurred
	 */
	public UnknownMemberException(Type object, String member, TypedTree tree) {
		super(tree);
		this.object = object;
		this.member = member;
	}

	@Override
	public String toString() {
		return "Attribute error " + getPos() + ": Class '" + object
				+ "' does not have a member called '" + member + "'.";
	}

	/**
	 * @return the class used.
	 */
	public Type getObject() {
		return object;
	}

	/**
	 * @return the name of the member that the class does not have.
	 */
	public String getMember() {
		return member;
	}
}
