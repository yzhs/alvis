package resources;
import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.vm.AbstractAlgo;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.DPListener;

public class FirstAlgoMVM implements AbstractAlgo {

	private PCInteger counter;
	private boolean onBreak;
	private BPListener bplisten;
	
	public FirstAlgoMVM() {
		this.reachedBreakPoint(1);
		counter = counter.add(new PCInteger(1));
		this.reachedBreakPoint(2);
		counter = counter.add(new PCInteger(1));
		this.reachedBreakPoint(3);
		counter = counter.add(new PCInteger(1));
		this.reachedBreakPoint(4);
		counter = counter.add(new PCInteger(1));
		this.reachedBreakPoint(5);
	}
	
	@Override
	public void run() {
	}

	@Override
	public ArrayList<PCObject> getVariableReferences() {
		return null;
	}

	@Override
	public ArrayList<PCObject> getParameterTypes() {
		return new ArrayList<PCObject>();
	}

	@Override
	public void setParameters(ArrayList<PCObject> paras) {
		counter = (PCInteger) paras.get(0);
	}

	@Override
	public void addBPListener(BPListener wantToListen) {
	}

	@Override
	public void addDPListener(DPListener wantToListen) {
	}

	@Override
	public void stopBreak() {
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
}
