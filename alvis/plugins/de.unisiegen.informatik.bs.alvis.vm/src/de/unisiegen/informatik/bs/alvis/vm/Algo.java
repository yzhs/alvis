package de.unisiegen.informatik.bs.alvis.vm;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.vm.AbstractAlgo;

public class Algo implements AbstractAlgo {

	
	private BPListener bplisten;
	@SuppressWarnings("unused")
	private DPListener dplisten;
	private boolean onBreak;

	/**
	 * dynamic code
	 */
	@Override
	public ArrayList<PCObject> getVariableReferences() {
		return null;
	}

	/**
	 * dynamic code
	 */
	@Override
	public ArrayList<PCObject> getParameterTypes() {
		return null;
	}

	/**
	 * dynamic code
	 */
	@Override
	public void setParameters(ArrayList<PCObject> paras) {
	}

	/**
	 * static code
	 */
	@Override
	public void addBPListener(BPListener wantToListen) {
		bplisten = wantToListen;
	}

	/**
	 * static code
	 */
	@Override
	public void addDPListener(DPListener wantToListen) {
		dplisten = wantToListen;
	}

	/**
	 * static code
	 * 
	 * @param BPNr
	 *            set breakpoint field, inform breakpoint listener, sleeps
	 *            current thread
	 */
	@SuppressWarnings("unused")
	private void reachedBreakPoint(int BPNr) {
		onBreak = true;
		if (bplisten != null) {
			bplisten.onBreakPoint(BPNr);
		}
		synchronized (this) {
			while (onBreak) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * dynamic code
	 */
	@Override
	public void run() {
	}

	/**
	 * static code
	 */
	@Override
	public void stopBreak() {
		onBreak = false;
	}

	@Override
	public void setLock(Lock toLockOn) {
	}
}
