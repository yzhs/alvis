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

/**
 * Wrapper Class around java Integer
 * 
 * @author Dominik Dingel
 * 
 */

public class PCInteger extends PCObject {
	protected static final String TYPENAME = "Integer";

	protected static PCInteger localNull;
	protected static PCInteger localInfty;

	private int value;

	synchronized public void inc() {
		value++;
	}

	synchronized public void dec() {
		value--;
	}

	public static PCInteger getNull() {
		if (localNull == null) {
			localNull = new PCInteger(Integer.MAX_VALUE - 1);
		}
		return localNull;
	}

	public static PCInteger getInfty() {
		if (localInfty == null) {
			localInfty = new PCInteger(Integer.MAX_VALUE);
		}
		return localInfty;
	}

	/**
	 * Create new PCInteger from literal
	 * 
	 * @param literal
	 */
	public PCInteger(int literal) {
		value = literal;
	}

	public int getLiteralValue() {
		return value;
	}

	public void setLiteralValue(int value) {
		this.value = value;
	}

	public void setValue(PCInteger value) {
		this.value = value.getLiteralValue();
	}

	public void addTo(PCInteger value) {
		this.value += value.getLiteralValue();
	}

	@Override
	public String toString() {
		return Integer.toString(value);
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		try {
			return ((PCInteger) toCheckAgainst).getLiteralValue() == this.value;
		} catch (ClassCastException e) {
			return false;
		}
	}

	public static String getTypeName() {
		return PCInteger.TYPENAME;
	}

	public PCInteger add(PCInteger other) {
		return new PCInteger(this.getLiteralValue() + other.getLiteralValue());
	}

	public PCString add(PCString other) {
		return new PCString(this.getLiteralValue() + other.getLiteralValue());
	}

	public PCInteger sub(PCInteger other) {
		return new PCInteger(this.getLiteralValue() - other.getLiteralValue());
	}

	public PCInteger mul(PCInteger other) {
		return new PCInteger(this.getLiteralValue() * other.getLiteralValue());
	}

	public PCInteger div(PCInteger other) {
		return new PCInteger(this.getLiteralValue() / other.getLiteralValue());
	}

	public PCInteger mod(PCInteger other) {
		return new PCInteger(this.getLiteralValue() % other.getLiteralValue());
	}

	public PCBoolean equal(PCInteger other) {
		return new PCBoolean(this.getLiteralValue() == other.getLiteralValue());
	}

	public PCBoolean notEqual(PCInteger other) {
		return this.equal(other).not();
	}

	public PCBoolean less(PCInteger other) {
		return new PCBoolean(this.getLiteralValue() < other.getLiteralValue());
	}

	public PCBoolean greater(PCInteger other) {
		return new PCBoolean(this.getLiteralValue() > other.getLiteralValue());
	}

	public PCBoolean lessOrEqual(PCInteger other) {
		return new PCBoolean(this.getLiteralValue() <= other.getLiteralValue());
	}

	public PCBoolean greaterOrEqual(PCInteger other) {
		return new PCBoolean(this.getLiteralValue() >= other.getLiteralValue());
	}

	public PCInteger negate() {
		return new PCInteger(-this.getLiteralValue());
	}

	@Override
	public List<String> getMethods() {
		String[] methods = { "add", "sub", "mul", "div", "mod", "equal",
				"notEqual", "less", "greater", "lessOrEqual", "greaterOrEqual",
				"negate" };
		return Arrays.asList(methods);
	}
}
