import java.util.HashMap;
import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.*;
import de.unisiegen.informatik.bs.alvis.vm.*;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.*;
import java.util.concurrent.locks.Lock;

public class Algorithm implements AbstractAlgo {
	private Lock lock;
	private boolean onBreak;
	private BPListener bplisten;

	private PCGraph G;
	private PCVertex s;
	private PCVertex v;

	public Algorithm() {
	}

	public void run() {
		for (PCVertex v : G.getVertices()) {
			v.set("color", new PCString("white"));
        	v.set("distance", PCInteger.getInfty());
        	v.set("pi", PCVertex.getNull());
        }
        s.set("color", new PCString("yellow"));
        reachedBreakPoint(6);
        s.set("distance", new PCInteger(0));
        PCQueue Q = new PCQueue();
        Q.enqueue(s);
        while ((Q.isEmpty().not()).getLiteralValue()) {
        	PCVertex u = null;
            u = (PCVertex) Q.dequeue();
            for (PCVertex v : u.getAdjacents()) {
            	if (v.get("color").equals(new PCString("white"))) {
            		v.set("color", new PCString("yellow"));
                    reachedBreakPoint(14);
                    v.set("distance",((PCInteger) (u.get("distance"))).add(new PCInteger(1)));
                    v.set("pi", u);
                    Q.enqueue(v);
                 }
            }
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
					wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void insertBreakpoint(int lin) {
	} // for testing purposes only

	public ArrayList<PCObject> getVariableReferences() {
		return null;
	}

	public ArrayList<PCObject> getParameterTypes() {
		return null;
	}

	public void setParameters(ArrayList<PCObject> params) {
		this.G = (PCGraph) params.get(0);
		this.s = (PCVertex) params.get(1);
	}

	@Override
	public void addBPListener(BPListener wantToListen) {
		bplisten = wantToListen;
	}

	public void addDPListener(DPListener wantToListen) {
	}

	@Override
	public void stopBreak() {
		onBreak = false;
		synchronized (this) {
			this.notify();
		}
	}

	public void setLock(Lock toLockOn) {
		lock = toLockOn;
	}

}