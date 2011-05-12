package de.unisiegen.informatik.bs.alvis.primitive.datatypes;


/**
 * Wrapper Class around java Integer
 * 
 * @author Dominik Dingel
 * 
 */

public class PseudoCodeInteger extends PseudoCodeObject {
	protected static final String TYPENAME = "Integer";
	
	protected static PseudoCodeInteger localNull;
	protected static PseudoCodeInteger localInfty;
	
	private int value;

	public static PseudoCodeInteger getNull() {
		if(localNull == null) {
			localNull = new PseudoCodeInteger(Integer.MAX_VALUE-1);
		}
		return localNull;
	}
	
	public static PseudoCodeInteger getInfty() {
		if(localInfty == null) {
			localInfty = new PseudoCodeInteger(Integer.MAX_VALUE);
		}
		return localInfty;
	}
	
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
		try {
			return ((PseudoCodeInteger)toCheckAgainst).getLiteralValue() == this.value;
		} catch (ClassCastException e) {
			return false;
		}
	}

	@Override
	public String getTypeName() {
		return PseudoCodeInteger.TYPENAME;
	}

	public PseudoCodeInteger add(PseudoCodeInteger other) {
		return new PseudoCodeInteger(this.getLiteralValue() + other.getLiteralValue());
	}

	public PseudoCodeInteger sub(PseudoCodeInteger other) {
		return new PseudoCodeInteger(this.getLiteralValue() - other.getLiteralValue());
	}

	public PseudoCodeInteger mul(PseudoCodeInteger other) {
		return new PseudoCodeInteger(this.getLiteralValue() * other.getLiteralValue());
	}

	public PseudoCodeInteger div(PseudoCodeInteger other) {
		return new PseudoCodeInteger(this.getLiteralValue() / other.getLiteralValue());
	}

	public PseudoCodeInteger mod(PseudoCodeInteger other) {
		return new PseudoCodeInteger(this.getLiteralValue() % other.getLiteralValue());
	}

	public PseudoCodeBoolean equal(PseudoCodeInteger other) {
		return new PseudoCodeBoolean(this.getLiteralValue() == other.getLiteralValue());
	}

	public PseudoCodeBoolean notEqual(PseudoCodeInteger other) {
		return this.equal(other).not();
	}

	public PseudoCodeBoolean less(PseudoCodeInteger other) {
		return new PseudoCodeBoolean(this.getLiteralValue() < other.getLiteralValue());
	}

	public PseudoCodeBoolean greater(PseudoCodeInteger other) {
		return new PseudoCodeBoolean(this.getLiteralValue() > other.getLiteralValue());
	}

	public PseudoCodeBoolean lessOrEqual(PseudoCodeInteger other) {
		return new PseudoCodeBoolean(this.getLiteralValue() <= other.getLiteralValue());
	}

	public PseudoCodeBoolean greaterOrEqual(PseudoCodeInteger other) {
		return new PseudoCodeBoolean(this.getLiteralValue() >= other.getLiteralValue());
	}

	public PseudoCodeInteger negate() {
		return new PseudoCodeInteger(-this.getLiteralValue());
	}
}
