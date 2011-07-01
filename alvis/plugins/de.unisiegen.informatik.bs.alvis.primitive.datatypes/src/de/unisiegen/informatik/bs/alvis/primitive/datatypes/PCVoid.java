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

	@Override
	public String getTypeName() {
		return PCVoid.TYPENAME;
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		// Nothing to set
		return null;
	}

	@Override
	public PCObject get(String memberName) {
		// Nothing to get
		return null;
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
