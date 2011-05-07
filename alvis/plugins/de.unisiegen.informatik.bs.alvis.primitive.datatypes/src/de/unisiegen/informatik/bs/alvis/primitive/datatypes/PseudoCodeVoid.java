package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PseudoCodeVoid extends Datatype {
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
	public Datatype set(String memberName, Datatype value) {
		// Nothing to set
		return null;
	}

	@Override
	public Datatype get(String memberName) {
		// Nothing to get
		return null;
	}

	@Override
	public Map<String, ? extends Datatype> getMembers() {
		// no members, so return empty Map
		Map<String, Datatype> result = new HashMap<String, Datatype>();
		return result;
	}

	@Override
	public Map<List<String>, List<Datatype>> getMethods() {
		// no methods, so return empty Map
		Map<List<String>, List<Datatype>> result = new HashMap<List<String>, List<Datatype>>();
		return result;
	}

	@Override
	public boolean equals(Datatype toCheckAgainst) {
		// TODO Auto-generated method stub
		return false;
	}

}
