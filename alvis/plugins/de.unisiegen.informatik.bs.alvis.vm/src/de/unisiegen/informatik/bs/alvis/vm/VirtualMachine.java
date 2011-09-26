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

package de.unisiegen.informatik.bs.alvis.vm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//import de.unisiegen.informatik.bs.alvis.io.logger.Logger;
import de.unisiegen.informatik.bs.alvis.io.logger.Logger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

/**
 * 
 * @author Dominik Dingel manages the algo and is responsible for the run
 * 
 *         take care, could be multiple times run (singleton pattern works not
 *         that fine with multiple classloaders)
 * 
 */

public class VirtualMachine {

	// shared object across all threads to sync run
	private Lock lock = new ReentrantLock();

	// singleton pattern
	private static VirtualMachine instance = new VirtualMachine();

	// containing algos and threads
	private HashMap<String, AlgoThread> algos;

	/**
	 * @return local Virtual Machine instance
	 */
	public static VirtualMachine getInstance() {
		return instance;
	}

	// Decision Points only for all Algos
	private DPListener dpListen;

	/**
	 * Inform listener about DecisionPoint, only if AlgoThread can't handle it
	 * by it self
	 * 
	 * @param toListen
	 */
	public void addDPListener(DPListener toListen) {
		dpListen = toListen;
		for (AlgoThread alg : algos.values()) {
			alg.addDPListener(dpListen);
		}
	}

	/**
	 * remove the registered DPListener
	 */
	public void removeDPListener() {
		dpListen = null;
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
		if (algos.size() == 0)
			return Thread.State.TERMINATED;
		return algos.get(key).getCurrentThreadState();
	}

	/**
	 * Is any Thread currently running
	 * 
	 * @return true if any Algo is still Running, otherwise false 
	 */
	public boolean runningThreads() {
		boolean result = false;
		for (AlgoThread algo : algos.values()) {
			result = algo.isAlive() || result;
		}
		return result;
	}

	/**
	 * Method to get needed Parametertypes
	 * 
	 * @param key
	 * @return Map containg the Parameters with String for the identifier and
	 *         PCObject as argument
	 */
	public Map<String, PCObject> getParametersTypesAlgo(String key) {
		return algos.get(key).getParameterTypes();
	}

	/**
	 * Adds a new Algo to the VM, would also replace a currently existing one
	 * 
	 * @param key
	 * @param pathToFile
	 * @param fileName
	 * @throws ClassNotFoundException
	 */
	public void addAlgoToVM(String key, String pathToFile, String fileName,
			TreeSet<String> dynamicallyReferencedPackagesNeededToCompile)
			throws ClassNotFoundException {

		Logger.getInstance().log(
				"de.~.alvis.vm",
				Logger.DEBUG,
				"addAlgoToVM with params:" + "\n Key: " + key
						+ "\n pathToFile: " + pathToFile + "\n fileName: "
						+ fileName + "\n datatypesToAddToClasspath: "
						+ dynamicallyReferencedPackagesNeededToCompile);

		AlgoThread tmp;
		tmp = new AlgoThread(pathToFile, fileName, lock,
				dynamicallyReferencedPackagesNeededToCompile);
		algos.put(key, tmp);
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
	 * Remove listener from algo
	 * 
	 * @param listener
	 */
	public void removeBPListener(BPListener listener) {
		for(AlgoThread algo : algos.values()) {
			algo.removeBPListener(listener);
		}
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
	public void setParameter(String key, Map<String, PCObject> para) {
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
			// we start this algo till we run in the first breakpoint, so that
			// there is all the time only one algo running
			algo.startAlgo();
			// this.waitForBreakPoint();
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
			algo.stopAlgo();
		}
		HashMap<String, AlgoThread> tempAlgos = new HashMap<String, AlgoThread>();
		for(String key : algos.keySet()) {
			try {
				tempAlgos.put(key,new AlgoThread(algos.get(key)));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		algos = tempAlgos;
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
	public List<PCObject> getRunningReferences(String key) {
		return algos.get(key).returnReferences();
	}

	/**
	 * From all Threads the references
	 * 
	 * @return a ArrayList of all ArrayLists containing the specific PC Objects
	 */
	public List<List<PCObject>> getRunningReferences() {
		List<List<PCObject>> result = new ArrayList<List<PCObject>>();
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
	 * lets wait for breakpoints, will wait till every! thread reached a
	 * breakpoint waiting only for Thread.State.TIMED_WAITING
	 * 
	 */
	public void waitForBreakPoint() {
		boolean everyoneDone = true;
		for (AlgoThread algo : algos.values()) {
			algo.waitForBreakpoint();
			everyoneDone = everyoneDone
					&& (algo.getCurrentThreadState().equals(
							Thread.State.TIMED_WAITING)
							|| algo.getCurrentThreadState().equals(
									Thread.State.TERMINATED) || algo
							.getCurrentThreadState().equals(
									Thread.State.WAITING));
		}
		if (everyoneDone == false) {
			waitForBreakPoint();
		}
	}

	/**
	 * removes all references to algos and threads, to clean up
	 */
	public void clear() {
		for (AlgoThread algo : algos.values()) {
			algo.stopAlgo();
		}
		algos.clear();
	}

}