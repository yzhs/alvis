import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.HashMap;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.vm.AbstractAlgo;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.DPListener;

public class ThreadAlgo implements AbstractAlgo {

	private PCInteger counter;
	private boolean onBreak;
	private BPListener bplisten;
	
	@Override
	public void run() {
		counter = new PCInteger(0);
		this.reachedBreakPoint(1);
		counter = counter.add(new PCInteger(1));
		this.reachedBreakPoint(1);
		counter = counter.add(new PCInteger(1));
		this.reachedBreakPoint(2);
		counter = counter.add(new PCInteger(1));
		counter = counter.add(new PCInteger(1));

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
	public ArrayList<PCObject> getVariableReferences() {
		ArrayList<PCObject> result = new ArrayList<PCObject>();
		result.add(counter);
		return result;
	}

	@Override
	public HashMap<PCObject, String> getParameterTypes() {
		HashMap<PCObject, String> result = new HashMap<PCObject, String>();
		result.put(PCInteger.getNull(), "counter");
		return result;
	}

	@Override
	public void setParameters(ArrayList<PCObject> paras) {
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
	
	@Override
	public void setLock(Lock toLockOn) {
	}
}
