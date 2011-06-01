package resources;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.vm.AbstractAlgo;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.DPListener;

public class SecondAlgoMVM implements AbstractAlgo {

	private Lock lock;
	private PCInteger counter;
	private boolean onBreak;
	private BPListener bplisten;

	public SecondAlgoMVM() {

	}

	@Override
	public void run() {
		this.reachedBreakPoint(1);
		lock.lock();
			counter.inc();
		lock.unlock();
		this.reachedBreakPoint(2);
		lock.lock();
			counter.inc();
		lock.unlock();
		this.reachedBreakPoint(3);
		lock.lock();
			counter.inc();
		lock.unlock();
		this.reachedBreakPoint(4);

	}

	@Override
	public ArrayList<PCObject> getVariableReferences() {
		ArrayList<PCObject> tmp = new ArrayList<PCObject>();
		tmp.add(counter);
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
		synchronized (this) {
			onBreak = false;
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
		if (bplisten != null) {
			bplisten.onBreakPoint(BPNr);
		}
		synchronized (this) {
			onBreak = true;
			while (onBreak) {
				try {
					wait(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void setLock(Lock toLockOn) {
		lock = toLockOn;
		
	}
}
