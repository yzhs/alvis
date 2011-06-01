package resources;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.vm.AbstractAlgo;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.DPListener;

public class FirstAlgoMVM implements AbstractAlgo {

	private Object lock;
	private PCInteger counter;
	private boolean onBreak;
	private BPListener bplisten;

	public FirstAlgoMVM() {
	}

	@Override
	public void run() {
		synchronized (lock) {
			counter.inc();
		}
		this.reachedBreakPoint(2);
		synchronized (lock) {
			counter.inc();
		}
		this.reachedBreakPoint(3);
		synchronized (lock) {
			counter.inc();
		}
		this.reachedBreakPoint(4);
		synchronized (lock) {
			counter.inc();
		}
		this.reachedBreakPoint(5);
	}

	@Override
	public ArrayList<PCObject> getVariableReferences() {
		ArrayList<PCObject> tmp = new ArrayList<PCObject>();
		tmp.add(counter);
		System.out.println(tmp.size());
		return tmp;
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
	public void setLock(Object toLockOn) {
		lock = toLockOn;
		
	}
}
