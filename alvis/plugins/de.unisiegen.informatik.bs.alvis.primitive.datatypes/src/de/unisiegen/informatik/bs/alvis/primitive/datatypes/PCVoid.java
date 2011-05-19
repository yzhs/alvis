package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
	public Map<String, ? extends PCObject> getMembers() {
		// no members, so return empty Map
		Map<String, PCObject> result = new HashMap<String, PCObject>();
		return result;
	}

	@Override
	public Map<List<String>, List<PCObject>> getMethods() {
		// no methods, so return empty Map
		Map<List<String>, List<PCObject>> result = new HashMap<List<String>, List<PCObject>>();
		return result;
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
