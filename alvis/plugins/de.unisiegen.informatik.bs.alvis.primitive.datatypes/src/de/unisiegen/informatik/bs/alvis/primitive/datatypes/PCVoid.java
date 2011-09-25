/*
 * Copyright (c) 2011 Dominik Dingel
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

package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

public class PCVoid extends PCObject {
	protected static final String TYPENAME = "Void";
	
	@Override
	public String toConsole() {
		// no value in get String representation
		String result = new String("");
		return result;
	}

	@Override
	public String toString() {
		// no value in get String representation
		String result = new String("");
		return result;
	}

	public static String getTypeName() {
		return PCVoid.TYPENAME;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		try {
			@SuppressWarnings("unused")
			PCVoid x = (PCVoid) toCheckAgainst;
			return true;
		} catch (ClassCastException e) {
			return false;
		}
	}

}
