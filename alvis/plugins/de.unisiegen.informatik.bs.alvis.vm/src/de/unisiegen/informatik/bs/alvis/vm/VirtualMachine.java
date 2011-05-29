package de.unisiegen.informatik.bs.alvis.vm;

import java.util.ArrayList;
import java.util.HashMap;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

/**
 * 
 * @author Dominik Dingel manages the algo and is responsible for the run
 * 
 *         take care, could be multiple times run (singleton pattern works not
 *         that fine with multiple classloaders)
 *         
 *         TODO DP Points
 * 
 */

public class VirtualMachine {

	// singleton pattern
	private static VirtualMachine instance = new VirtualMachine();

	// containg algos and threads
	private HashMap<String, AlgoThread> algos;

	/**
	 * @return local Virtual Machine instance
	 */
	public static VirtualMachine getInstance() {
		return instance;
	}

	/**
	 * private Method to create virtual Machine instance
	 */
	private VirtualMachine() {
		algos = new HashMap<String, AlgoThread>();
	}

	/**
	 * Thread State access
	 * 
	 * @param key
	 *            of algo to identify
	 * @return thread status
	 */
	public Thread.State getThreadState(String key) {
		return algos.get(key).getCurrentThreadState();
	}
	
	/**
	 * Is any Thread currently running
	 * @return
	 */
	public boolean runningThreads() {
		boolean result = false;
		for(AlgoThread algo : algos.values()) {
			result = algo.isAlive() || result;
		}
		return result;
	}

	/**
	 * Method to get needed Parametertypes
	 * 
	 * @param key
	 * @return PCObject ArrayList to determine the types, for editor and view
	 */
	public ArrayList<PCObject> getParametersTypesAlgo(String key) {
		return algos.get(key).getParameterTypes();
	}

	/**
	 * Adds a new Algo to the VM, would also replace a currently existing one
	 * 
	 * @param key
	 * @param fileName
	 * @return boolean with success
	 */
	public boolean addAlgoToVM(String key, String fileName) {
		AlgoThread tmp;
		try {
			tmp = new AlgoThread(fileName);
		} catch (ClassNotFoundException e) {
			// TODO possible case for the logger?
			//e.printStackTrace();
			return false;
		}
		algos.put(key, tmp);
		return true;
	}

	/**
	 * Adding a BPListener to a specified algo
	 * 
	 * @param algo
	 * @param listener
	 */
	public void addBPListener(String algo, BPListener listener) {
		algos.get(algo).addBPListener(listener);
	}

	/**
	 * Adding a BPListener to all loaded algos
	 * 
	 * @param listener
	 */
	public void addBPListener(BPListener listener) {
		for (AlgoThread algo : algos.values()) {
			algo.addBPListener(listener);
		}
	}

	/**
	 * Remove listener from algo
	 * 
	 * @param algo
	 * @param listener
	 */
	public void removeBPListener(String algo, BPListener listener) {
		algos.get(algo).removeBPListener(listener);
	}

	/**
	 * Remove alll listener of a given string including the string itself
	 * 
	 * @param algo
	 */
	public void removeAllBPListener(String algo) {
		algos.get(algo).removeBPListeners();
	}

	/**
	 * Remove this listener from all algos
	 * 
	 * @param listener
	 */
	public void removeAllBPListener(BPListener listener) {
		for (AlgoThread algo : algos.values()) {
			algo.removeBPListener(listener);
		}
	}

	/**
	 * Removes all listener from all algos
	 */
	public void removeAllBPListener() {
		for (AlgoThread algo : algos.values()) {
			algo.removeBPListeners();
		}
	}

	/**
	 * adds a parameter to an algo, the references can also point to the same
	 * object to realise mutliple algos connected to one resource
	 * 
	 * @param key
	 * @param para
	 */
	public void setParameter(String key, ArrayList<PCObject> para) {
		algos.get(key).setParameters(para);
	}

	/**
	 * deletes a parameter set of an algo
	 * 
	 * @param key
	 */
	public void deleteParameter(String key) {
		algos.get(key).deleteParamters();
	}

	/**
	 * start all algos
	 */
	public void startAlgos() {
		for (AlgoThread algo : algos.values()) {
			algo.startAlgo();
		}
	}

	/**
	 * will wait for all algos
	 */
	public void waitForAlgos() {
		for (AlgoThread algo : algos.values()) {
			algo.waitAlgoFinished();
		}
	}

	/**
	 * stop all algos threads, is done by recreating threads, so invalidating
	 * holding thread references
	 */
	public void stopAlgos() {
		for (AlgoThread algo : algos.values()) {
			algo.startAlgo();
		}
	}

	/**
	 * let all algos step one step forward, even threads not in breakpoints will
	 * be called, they should be do nothing in that case
	 */
	public void stepAlgoForward() {
		for (AlgoThread algo : algos.values()) {
			algo.stepForward();
		}
	}

	/**
	 * let the with key specified algo step one step forward
	 * 
	 * @param key
	 *            of algo
	 */
	public void stepAlgoForward(String key) {
		algos.get(key).stepForward();
	}

	/**
	 * returns References from Thread, identified from key
	 * 
	 * @param key
	 * @return
	 */
	public ArrayList<PCObject> getRunningReferences(String key) {
		return algos.get(key).returnReferences();
	}

	/**
	 * From all Threads the references
	 * 
	 * @return a ArrayList of all ArrayLists containing the specific PC Objects
	 */
	public ArrayList<ArrayList<PCObject>> getRunningReferences() {
		ArrayList<ArrayList<PCObject>> result = new ArrayList<ArrayList<PCObject>>();
		for (AlgoThread algo : algos.values()) {
			result.add(algo.returnReferences());
		}
		return result;
	}

	/**
	 * let the algo step backwards, only useful in single thread environment
	 * 
	 * @param key
	 */
	public void stepAlgoBackward(String key) {
		algos.get(key).stepBackward();
	}

	/**
	 * lets wait for breakpoints, will wait till every! thread reached a breakpoint
	 */
	public void waitForBreakPoint() {
		for(AlgoThread algo : algos.values()) {
			if(algo.isAlive()) {
				algo.waitForBreakpoint();
			}
		}
	}
	
	/**
	 * removes all refernces to algos and threads, to clean up
	 */
	public void clear() {
		algos.clear();
	}

}
