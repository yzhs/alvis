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

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Wrapper Class around Java boolean
 * 
 * @author Dominik Dingel
 * 
 */

public class PCBoolean extends PCObject {
	protected static final String TYPENAME = "Boolean";

	protected static PCObject localNull = new PCBoolean();

	private boolean value;

	/**
	 * private Constructor to create the null object
	 */
	private PCBoolean() {
	}

	/**
	 * create new Boolean from literal
	 * 
	 * @param literal
	 */
	public PCBoolean(boolean literal) {
		commandsforGr = new ArrayList<Stack<Object>>();
		commandsforGr.add(new Stack<Object>());
		this.setLiteralValue(literal);
	}

	/**
	 * create new Boolean from another Boolean
	 * 
	 * @param toSetFrom
	 */
	public PCBoolean(PCBoolean toSetFrom) {
		commandsforGr = new ArrayList<Stack<Object>>();
		commandsforGr.add(new Stack<Object>());
		this.setValue(toSetFrom);
	}

	/**
	 * creates new Boolean from graphicalrepresentation
	 * 
	 * @param gr
	 */
	public PCBoolean(GraphicalRepresentation gr) {
		commandsforGr = new ArrayList<Stack<Object>>();
		commandsforGr.add(new Stack<Object>());
		allGr.add(gr);
		value = ((GRBoolean) gr).isSet();
	}

	/**
	 * get literal (java native) value
	 * 
	 * @return boolean value
	 */
	public boolean getLiteralValue() {
		return value;
	}

	/**
	 * set the inner member + change the outer representations
	 * 
	 * @param value
	 *            to set
	 */
	public void setLiteralValue(boolean value) {
		this.value = value;
		// operating in batchMode
		if (isInBatchRun) {
			commandsforGr.get(0).push(Boolean.valueOf(value));
		} else {
			for (GraphicalRepresentation gr : allGr) {
				((GRBoolean) gr).set(this.value);
			}
		}
	}

	/**
	 * @param value
	 *            to set
	 */
	public void setValue(PCBoolean value) {
		this.setLiteralValue(value.getLiteralValue());
	}

	@Override
	public String toString() {
		return value ? "true" : "false";
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		if (memberName.isEmpty()) {
			this.setValue((PCBoolean) value);
		}
		return null;
	}

	@Override
	protected void runDelayedCommands() {
		for (GraphicalRepresentation gr : allGr) {
			((GRBoolean) gr).set(((Boolean) this.commandsforGr.get(0).pop())
					.booleanValue());
		}
		this.commandsforGr.get(0).clear();
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		try {
			return (((PCBoolean) toCheckAgainst).getLiteralValue() == this.value && ((toCheckAgainst != localNull) || (toCheckAgainst == localNull && this == localNull)));
		} catch (ClassCastException e) {
			return false;
		}
	}

	public static String getTypeName() {
		return PCBoolean.TYPENAME;
	}

	public PCBoolean and(PCBoolean other) {
		return new PCBoolean(this.getLiteralValue() && other.getLiteralValue());
	}

	public PCBoolean or(PCBoolean other) {
		return new PCBoolean(this.getLiteralValue() || other.getLiteralValue());
	}

	public PCBoolean not() {
		return new PCBoolean(!this.getLiteralValue());
	}

	public PCBoolean equal(PCBoolean other) {
		return new PCBoolean(this.getLiteralValue() == other.getLiteralValue());
	}

	public PCBoolean notEqual(PCBoolean other) {
		return this.equal(other).not();
	}

	@Override
	public List<String> getMethods() {
		String[] methods = { "and", "or", "not", "equal", "notEqual" };
		return Arrays.asList(methods);
	}
}
