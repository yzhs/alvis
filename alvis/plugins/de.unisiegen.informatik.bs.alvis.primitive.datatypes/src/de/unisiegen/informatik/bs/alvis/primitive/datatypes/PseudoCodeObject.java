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

public abstract class PseudoCodeObject {

	public final static String TYPENAME = "Datatype";
	public static PseudoCodeObject localInfty;
	public static PseudoCodeObject localNull;

	protected List<GraphicalRepresentation> allGr;

	protected boolean isInBatchRun;
	protected List<Stack<Object>> commandsforGr;

	/**
	 * Constructor
	 */
	public PseudoCodeObject() {
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
	 * Will run commands saved in stacks
	 * have to be override, otherwise nothing will happen
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
	public abstract String toString();

	/**
	 * to avoid namespace Issues (String vs Javastring)
	 * 
	 * @return the used Pseudocode Typename
	 */
	public String getTypeName() {
		try {
			return (String) this.getClass().getField("TYPENAME").get(TYPENAME);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * Generic set-method used for the compiler
	 * 
	 * @param memberName
	 *            to set
	 * @param value
	 *            value to set
	 * @return result of set-method (+) could return summed up value
	 * useful for constructs like v = u.distance + 1;          
	 *  
	 */
	public abstract PseudoCodeObject set(String memberName, PseudoCodeObject value);

	/**
	 * Generic get-method used for the compiler
	 * 
	 * @param memberName
	 *            to get if empty returns itself
	 * @return value
	 */
	public PseudoCodeObject get(String memberName) {
		if (memberName.isEmpty()) {
			return this;
		}
		return null;
	}

	/**
	 * Returns the infty Representation used for the compiler
	 * 
	 * @return Datatype specific infty Representation
	 */
	public PseudoCodeObject getInfty() {
		return localInfty;
	}

	/**
	 * Returns the null Representation used for the compiler
	 * 
	 * @return Datatype specific null Representation
	 */
	public PseudoCodeObject getNull() {
		return localNull;
	}

	/**
	 * Returns the Members used for the compiler
	 * 
	 * will return emtpy map if nothing is there
	 * 
	 * @return a map contains the Membername and the Datatype Reference
	 */
	public Map<String, ? extends PseudoCodeObject> getMembers() {
		Map<String, PseudoCodeObject> result = new HashMap<String, PseudoCodeObject>();
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
	public Map<List<String>, List<PseudoCodeObject>> getMethods() {
		Map<List<String>, List<PseudoCodeObject>> result = new HashMap<List<String>, List<PseudoCodeObject>>();
		return result;
	}
	
	/**
	 * 
	 * @param toCheckAgainst 
	 * @return boolean if the object to checkAgainst is equals the current object
	 */
	public abstract boolean equals(PseudoCodeObject toCheckAgainst);
}
