package de.unisiegen.informatik.bs.alvis.primitive.datatypes;


/**
 * Wrapper Class around java Integer
 * 
 * @author Dominik Dingel
 * 
 */

public class PseudoCodeInteger extends PseudoCodeObject {
	protected static final String TYPENAME = "Integer";

	private int value;

	/**
	 * Create new PCInteger from literal
	 * 
	 * @param literal
	 */
	public PseudoCodeInteger(int literal) {
		value = literal;
	}

	public int getLiteralValue() {
		return value;
	}

	public void setLiteralValue(int value) {
		this.value = value;
	}

	public void setValue(PseudoCodeInteger value) {
		this.value = value.getLiteralValue();
	}
	
	public void addTo(PseudoCodeInteger value) {
		this.value += value.getLiteralValue();
	}

	@Override
	public String toString() {
		return Integer.toString(value);
	}

	@Override
	public PseudoCodeObject set(String memberName, PseudoCodeObject valueToGetFrom) {
		if (memberName.isEmpty()) {
			this.setValue((PseudoCodeInteger) valueToGetFrom);
		}
		if (memberName.equals("+")) {
			this.addTo((PseudoCodeInteger) valueToGetFrom);
			return this;
		}
		return null;
	}

	@Override
	public boolean equals(PseudoCodeObject toCheckAgainst) {
		// TODO Auto-generated method stub
		return false;
	}
}
