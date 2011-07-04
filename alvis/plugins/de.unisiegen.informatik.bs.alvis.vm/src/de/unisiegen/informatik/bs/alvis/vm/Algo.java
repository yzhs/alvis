package de.unisiegen.informatik.bs.alvis.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.HashMap;

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
	public List<PCObject> getVariableReferences() {
		return null;
	}

	/**
	 * dynamic code
	 */
	@Override
	public Map<PCObject, String> getParameterTypes() {
		return null;
	}

	/**
	 * dynamic code
	 */
	@Override
	public void setParameters(List<PCObject> paras) {
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
