package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

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

	private boolean value;

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
		String result = new String();
		if(this.value) {
			result += "true";
		}
		else {
			result += "false";
		}
		return result;
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
			((GRBoolean) gr)
					.set(((Boolean) this.commandsforGr.get(0).pop())
							.booleanValue());
		}
		this.commandsforGr.get(0).clear();
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		try {
			return ((PCBoolean) toCheckAgainst).getLiteralValue() == this.value;
		} catch (ClassCastException e) {
			return false;
		}
	}

	@Override
	public String getTypeName() {
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
}
