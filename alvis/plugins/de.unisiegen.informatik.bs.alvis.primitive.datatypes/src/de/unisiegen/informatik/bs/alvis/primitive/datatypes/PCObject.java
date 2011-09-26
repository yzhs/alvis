/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * @author Dominik Dingel
 * @description the Datatype superclass, containing the compiler needed
 *              interfaces and the graphical Representation logic
 * 
 */

public abstract class PCObject {

	public static String TYPENAME = "Object";
	protected static PCObject localInfty;
	protected static PCObject localNull;
	protected List<GraphicalRepresentation> allGr = new ArrayList<GraphicalRepresentation>();
	protected boolean isInBatchRun;
	protected List<Stack<Object>> commandsforGr;
	
	
	/**
	 * if not initialized will set localNull and localInfty
	 * 
	 * @return null object
	 */
	public static PCObject getNull() {
		// will be from PCObject always be null
		return localNull;
	}

	/**
	 * if not initialized will set localInfty and localNull
	 * 
	 * @return null object
	 */
	public static PCObject getInfty() {
		// will be from PCObject always be null
		return localInfty;
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
	 * Will update graphical representation after maybe adding it to the pc
	 * object
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
	public String getTypeName() {
		String className = "";
		try {
			className = (String) this.getClass().getField("TYPENAME").get(this);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return className;
	}

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
	public abstract PCObject set(String memberName, PCObject value);

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
	 * Returns the Members used for the compiler.
	 * 
	 * Will return empty list if nothing is there.
	 * 
	 * @return a list that contains the member names
	 */
	public List<String> getMembers() {
		return new ArrayList<String>();
	}

	/**
	 * Returns the Methods used for the compiler.
	 * 
	 * Will return empty list if nothing is there.
	 * 
	 * @return a list that contains the method names
	 */
	public List<String> getMethods() {
		return new ArrayList<String>();
	}
	/**
	 * @author Eduard Boos
	 * 
	 * @return
	 */

	/**
	 * 
	 * @param toCheckAgainst
	 * @return boolean if the object to checkAgainst is equals the current
	 *         object
	 */
	public abstract boolean equals(PCObject toCheckAgainst);

	public static boolean isGenericType() {
		return false;
	}

	/**
	 * Returns hash map filled with help texts for algorithm editor. Must be
	 * implemented in sub classes.
	 * 
	 * @return hash map filled with help texts for algorithm editor
	 */
	public abstract HashMap<String, String> getHelp();
}
