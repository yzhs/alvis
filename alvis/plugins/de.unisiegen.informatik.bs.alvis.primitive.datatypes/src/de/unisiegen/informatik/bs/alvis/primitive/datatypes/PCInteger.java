package de.unisiegen.informatik.bs.alvis.primitive.datatypes;


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
		if(localNull == null) {
			localNull = new PCInteger(Integer.MAX_VALUE-1);
		}
		return localNull;
	}
	
	public static PCInteger getInfty() {
		if(localInfty == null) {
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
	public PCObject set(String memberName, PCObject valueToGetFrom) {
		if (memberName.isEmpty()) {
			this.setValue((PCInteger) valueToGetFrom);
		}
		if (memberName.equals("+")) {
			this.addTo((PCInteger) valueToGetFrom);
			return this;
		}
		return null;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		try {
			return ((PCInteger)toCheckAgainst).getLiteralValue() == this.value;
		} catch (ClassCastException e) {
			return false;
		}
	}

	@Override
	public String getTypeName() {
		return PCInteger.TYPENAME;
	}

	public PCInteger add(PCInteger other) {
		return new PCInteger(this.getLiteralValue() + other.getLiteralValue());
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
}
