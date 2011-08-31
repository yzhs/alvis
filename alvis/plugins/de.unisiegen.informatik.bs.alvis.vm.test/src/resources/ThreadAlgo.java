import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.HashMap;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.vm.AbstractAlgo;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.DPListener;

public class ThreadAlgo implements AbstractAlgo {

	private int localbp;
	private PCInteger counter;
	private boolean onBreak;
	private BPListener bplisten;
	
	@Override
	public void run() {
		this.reachedBreakPoint(0);
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
	public ArrayList<PCObject> getVariableReferences() {
		ArrayList<PCObject> result = new ArrayList<PCObject>();
		result.add(counter);
		return result;
	}
	@Override
	public Map<String, PCObject> getParameterTypes() {
		HashMap<String, PCObject> result = new HashMap<String, PCObject>();
		result.put("counter", PCInteger.getNull());
		return result;
	}

	@Override
	public void setParameters(Map<String, PCObject> paras) {
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
	
	@Override
	public void kill() {
	}
}
