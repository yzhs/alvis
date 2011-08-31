import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.HashMap;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.vm.AbstractAlgo;
import de.unisiegen.informatik.bs.alvis.vm.KillThreadException;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.DPListener;

public class FirstAlgoMVM implements AbstractAlgo {

	private int localbp;
	private Lock lock;
	private PCInteger counter;
	private boolean onBreak;
	private boolean toKill = false;
	private BPListener bplisten;

	public FirstAlgoMVM() {
	}

	@Override
	public void run() {
		try {
			this.reachedBreakPoint(0);
			lock.lock();
			counter.inc();
			lock.unlock();

			this.reachedBreakPoint(2);
			if (toKill)
				throw new KillThreadException();

			lock.lock();
			counter.inc();
			lock.unlock();

			this.reachedBreakPoint(3);
			if (toKill)
				throw new KillThreadException();
		} catch (KillThreadException e) {
			return;
		}
	}

	@Override
	public ArrayList<PCObject> getVariableReferences() {
		ArrayList<PCObject> tmp = new ArrayList<PCObject>();
		tmp.add(counter);
		return tmp;
	}

	@Override
	public Map<String, PCObject> getParameterTypes() {
		return null;
	}

	@Override
	public void setParameters(Map<String, PCObject> paras) {
		counter = (PCInteger) paras.get("C");
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
		localbp = BPNr;
		Thread thr = new Thread(new Runnable() {
			public void run() {
				if (bplisten != null) {
					bplisten.onBreakPoint(localbp);
				}
			}
		});
		thr.start();
		
		synchronized (this) {
			onBreak = true;
			do {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} while(onBreak);
		}
	}

	@Override
	public void setLock(Lock toLockOn) {
		lock = toLockOn;
	}

	@Override
	public void kill() {
		toKill = true;
		bplisten = null;
		stopBreak();
	}
}
