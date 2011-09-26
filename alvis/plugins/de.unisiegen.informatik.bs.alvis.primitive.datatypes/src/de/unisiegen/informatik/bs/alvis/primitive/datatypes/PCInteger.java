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
import java.util.HashMap;
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

	synchronized public void _inc_() {
		value++;
	}

	synchronized public void _dec_() {
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
		if (null == toCheckAgainst)
			return false;
		if (this == localNull
				&& (toCheckAgainst == localNull || toCheckAgainst == PCObject.getNull()))
			return true;
		if (!(toCheckAgainst instanceof PCInteger))
			return false;
		return ((PCInteger) toCheckAgainst).getLiteralValue() == this.value;
	}

	public static String getTypeName() {
		return PCInteger.TYPENAME;
	}

	public PCInteger _add_(PCInteger other) {
		return new PCInteger(this.getLiteralValue() + other.getLiteralValue());
	}

	public PCString _add_(PCString other) {
		return new PCString(this.getLiteralValue() + other.getLiteralValue());
	}

	public PCInteger _sub_(PCInteger other) {
		return new PCInteger(this.getLiteralValue() - other.getLiteralValue());
	}

	public PCInteger _mul_(PCInteger other) {
		return new PCInteger(this.getLiteralValue() * other.getLiteralValue());
	}

	public PCInteger _div_(PCInteger other) {
		return new PCInteger(this.getLiteralValue() / other.getLiteralValue());
	}

	public PCInteger _mod_(PCInteger other) {
		return new PCInteger(this.getLiteralValue() % other.getLiteralValue());
	}

	public PCBoolean _equal_(PCInteger other) {
		return new PCBoolean(this.getLiteralValue() == other.getLiteralValue());
	}

	public PCBoolean _notEqual_(PCInteger other) {
		return this._equal_(other)._not_();
	}

	public PCBoolean _less_(PCInteger other) {
		return new PCBoolean(this.getLiteralValue() < other.getLiteralValue());
	}

	public PCBoolean _greater_(PCInteger other) {
		return new PCBoolean(this.getLiteralValue() > other.getLiteralValue());
	}

	public PCBoolean _lessOrEqual_(PCInteger other) {
		return new PCBoolean(this.getLiteralValue() <= other.getLiteralValue());
	}

	public PCBoolean _greaterOrEqual_(PCInteger other) {
		return new PCBoolean(this.getLiteralValue() >= other.getLiteralValue());
	}

	public PCInteger _negate_() {
		return new PCInteger(-this.getLiteralValue());
	}

	@Override
	public List<String> getMethods() {
		String[] methods = { "add", "sub", "mul", "div", "mod", "equal",
				"notEqual", "less", "greater", "lessOrEqual", "greaterOrEqual",
				"negate" };
		return Arrays.asList(methods);
	}

	@Override
	public HashMap<String, String> getHelp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		// TODO Auto-generated method stub
		return null;
	}
}
