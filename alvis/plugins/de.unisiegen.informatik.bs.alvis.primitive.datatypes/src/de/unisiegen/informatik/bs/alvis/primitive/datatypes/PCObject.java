/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author Dominik Dingel
 * @description the Datatype superclass, containing the compiler needed
 *              interfaces and the graphical Representation logic
 * 
 */

public abstract class PCObject {

	public final static String TYPENAME = "Object";
	protected static PCObject localInfty;
	protected static PCObject localNull;

	protected List<GraphicalRepresentation> allGr;

	protected boolean isInBatchRun;
	protected List<Stack<Object>> commandsforGr;
	
	/**
	 * if not initialized will set localNull and localInfty
	 * @return null object
	 */
	public static PCObject getNull() {
		// will be from PCObject always be null
		return localNull; 
	}
	
	/**
	 * if not initialized will set localInfty and localNull
	 * @return null object
	 */
	public static PCObject getInfty() {
		// will be from PCObject always be null
		return localInfty;
	}
	
	
	/**
	 * Constructor
	 */
	public PCObject() {
		allGr = new ArrayList<GraphicalRepresentation>();
		isInBatchRun = false;
	}

	/**
	 * Enable/Disable the batch Modification every Change on the
	 * GraphicalRepresentation will be delayed and only the last one will be
	 * really executed
	 * 
	 * @param setBatchModification
	 */
	public void batchModification(boolean setBatchModification) {
		// leaving batch mode, run all delayed commands
		if (isInBatchRun == true && setBatchModification == false) {
			runDelayedCommands();
		}
		isInBatchRun = setBatchModification;
	}

	/**
	 * Will run commands saved in stacks have to be override, otherwise nothing
	 * will happen
	 */
	protected void runDelayedCommands() {
		// do nothing
	}

	/**
	 * Remove specific GraphicalRepresentation of the Datatype
	 * 
	 * @param gr
	 */
	public void removeGraphicalRepresentation(GraphicalRepresentation gr) {
		allGr.remove(gr);
	}

	/**
	 * Add specific GraphicalRepresentation of the Datatype
	 * 
	 * @param gr
	 */
	public void addGraphicalRepresentation(GraphicalRepresentation gr) {
		allGr.add(gr);
		updateGR(gr);
	}

	/**
	 * Will update graphical representation after maybe adding it to the pc object
	 * 
	 */
	protected void updateGR(GraphicalRepresentation gr) {
		// do nothing
	}
	
	/**
	 * String representation for the Console
	 * 
	 * if not specified other, will return toString
	 * 
	 * @return String
	 */
	public String toConsole() {
		return this.toString();
	}

	/**
	 * String representation for e.g. the debugger
	 * 
	 * @return String
	 */
	@Override
	public abstract String toString();

	/**
	 * to avoid namespace Issues (String vs Javastring)
	 * 
	 * @return the used Pseudocode Typename
	 */
	public abstract String getTypeName();
	
	/**
	 * Generic set-method used for the compiler
	 * 
	 * @param memberName
	 *            to set
	 * @param value
	 *            value to set
	 * @return result of set-method (+) could return summed up value useful for
	 *         constructs like v = u.distance + 1;
	 * 
	 */
	public abstract PCObject set(String memberName,
			PCObject value);

	/**
	 * Generic get-method used for the compiler
	 * 
	 * @param memberName
	 *            to get if empty returns itself
	 * @return value
	 */
	public PCObject get(String memberName) {
		if (memberName.isEmpty()) {
			return this;
		}
		return null;
	}
	
	/**
	 * Returns the Members used for the compiler
	 * 
	 * will return emtpy map if nothing is there
	 * 
	 * @return a map contains the Membername and the Datatype Reference
	 */
	public Map<String, ? extends PCObject> getMembers() {
		Map<String, PCObject> result = new HashMap<String, PCObject>();
		return result;
	}

	/**
	 * Returns the Methods used for the compiler
	 * 
	 * will return emtpy map if nothing is there
	 * 
	 * @return a map contains two Lists: -first List is the the Methodname and
	 *         implementation Name - second List with Datatypes the first
	 *         datatype is ALWAYS the return Datatype, can be Void, everything
	 *         else will be parameters
	 */
	// TODO change return value
	public Map<List<String>, List<PCObject>> getMethods() {
		Map<List<String>, List<PCObject>> result = new HashMap<List<String>, List<PCObject>>();
		return result;
	}

	/**
	 * 
	 * @param toCheckAgainst
	 * @return boolean if the object to checkAgainst is equals the current
	 *         object
	 */
	public abstract boolean equals(PCObject toCheckAgainst);
}
