package de.unisiegen.informatik.bs.alvis.vm;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeObject;

public abstract class AbstractAlgo extends Thread {
	protected BPListener bplisten;
	protected DPListener dplisten;
	public boolean onBreak;
	
	public static ArrayList<PseudoCodeObject> getStartParameters() {
		return null;
	}
	
	public void addBPListener(BPListener wantToListen) {
		bplisten = wantToListen;
	}

	public void addDPListener(DPListener wantToListen) {
		dplisten = wantToListen;
	}

	protected void reachedBreakPoint(int BPNr) {
		onBreak = true;
		bplisten.onBreakPoint(BPNr);

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

	abstract public ArrayList<PseudoCodeObject> getRunningRef();

	abstract public void run();

}
