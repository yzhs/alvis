package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PseudoCodeVoid extends PseudoCodeObject {
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
		return PseudoCodeVoid.TYPENAME;
	}

	@Override
	public PseudoCodeObject set(String memberName, PseudoCodeObject value) {
		// Nothing to set
		return null;
	}

	@Override
	public PseudoCodeObject get(String memberName) {
		// Nothing to get
		return null;
	}

	@Override
	public Map<String, ? extends PseudoCodeObject> getMembers() {
		// no members, so return empty Map
		Map<String, PseudoCodeObject> result = new HashMap<String, PseudoCodeObject>();
		return result;
	}

	@Override
	public Map<List<String>, List<PseudoCodeObject>> getMethods() {
		// no methods, so return empty Map
		Map<List<String>, List<PseudoCodeObject>> result = new HashMap<List<String>, List<PseudoCodeObject>>();
		return result;
	}

	@Override
	public boolean equals(PseudoCodeObject toCheckAgainst) {
		try {
			@SuppressWarnings("unused")
			PseudoCodeVoid x = (PseudoCodeVoid) toCheckAgainst;
			return true;
		} catch (ClassCastException e) {
			return false;
		}
	}

}
