package resources;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeObject;
import de.unisiegen.informatik.bs.alvis.vm.AbstractAlgo;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.DPListener;

public class ThreadAlgo implements AbstractAlgo {

	private PseudoCodeInteger counter;
	private boolean onBreak;
	private BPListener bplisten;

	@Override
	public void run() {
		counter = new PseudoCodeInteger(0);
		this.reachedBreakPoint(1);
		counter = counter.add(new PseudoCodeInteger(1));
		this.reachedBreakPoint(1);
		counter = counter.add(new PseudoCodeInteger(1));
		this.reachedBreakPoint(2);
		counter = counter.add(new PseudoCodeInteger(1));
		counter = counter.add(new PseudoCodeInteger(1));
		this.reachedBreakPoint(3);
	}

	/**
	 * static code
	 * 
	 * @param BPNr
	 *            set breakpoint field, inform breakpoint listener, sleeps
	 *            current thread
	 */
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

	@Override
	public ArrayList<PseudoCodeObject> getVariableReferences() {
		ArrayList<PseudoCodeObject> result = new ArrayList<PseudoCodeObject>();
		result.add(counter);
		return result;
	}

	@Override
	public ArrayList<PseudoCodeObject> getParameterTypes() {
		return null;
	}

	@Override
	public void setParameters(ArrayList<PseudoCodeObject> paras) {
	}

	@Override
	public void addBPListener(BPListener wantToListen) {
		bplisten = wantToListen;
	}

	@Override
	public void addDPListener(DPListener wantToListen) {
	}

	@Override
	public void stopBreak() {
		onBreak = false;
		synchronized (this) {
			this.notify();
		}
	}
}
