/*
 * Copyright (c) 2011 Dominik Dingel
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dominik Dingel
 * @description the Datatype superclass, containing the compiler needed
 *              interfaces and the graphical Representation logic
 * 
 */

public abstract class PCObject {

	protected final static String TYPENAME = "Object";
	protected static PCObject localInfty;
	protected static PCObject localNull;

	protected List<GraphicalRepresentation> allGr = new ArrayList<GraphicalRepresentation>();

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
	public static String getTypeName() {
		return TYPENAME;
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
	 * 
	 * @param toCheckAgainst
	 * @return boolean if the object to checkAgainst is equals the current
	 *         object
	 */
	public abstract boolean _equals_(PCObject toCheckAgainst);
	
	public static boolean isGenericType() {
		return false;
	}
}
