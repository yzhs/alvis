/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.primitive.datatypes;


/**
 * @author Dominik Dingel
 * 
 */

public class PseudoCodeString extends Datatype {
	protected static final String TYPENAME = "String";

	private String value;

	/**
	 * 
	 * @param literal to create String from
	 */
	public PseudoCodeString(String literal) {
		value = literal;
	}

	/**
	 * 
	 * @return literal String
	 */
	public String getLiteralValue() {
		return value;
	}

	/**
	 * 
	 * @param value set literal from String
	 */
	public void setLiteralValue(String value) {
		this.value = value;
	}

	/**
	 * 
	 * @param value set from another PC String
	 */
	public void setValue(PseudoCodeString value) {
		this.value = value.getLiteralValue();
	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public Datatype set(String memberName, Datatype value) {
		if (memberName.isEmpty()) {
			this.setValue((PseudoCodeString) value);
		}
		return null;
	}

	@Override
	public boolean equals(Datatype toCheckAgainst) {
		if(((PseudoCodeString) toCheckAgainst).value.equals(value)) {
			return true;
		}
		return false;
	}

}
