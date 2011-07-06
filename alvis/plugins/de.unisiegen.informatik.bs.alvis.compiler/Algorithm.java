import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.*;
import de.unisiegen.informatik.bs.alvis.vm.*;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.*;
import java.util.concurrent.locks.Lock;

public class Algorithm implements AbstractAlgo {
	private Lock lock;
	private boolean onBreak;
	private boolean onDecision;
	private BPListener bplisten;
	private DPListener dplisten;

	private PCGraph G;
	private PCVertex s;
	private PCVertex v;

	public Algorithm() {
	}
	
	/**
	 * static code
	 * 
	 * @param BPNr
	 *            set breakpoint field, inform breakpoint listener, sleeps
	 *            current thread
	 */
	private SortableCollection reachedDecisionPoint(int DPNr,PCObject from ,SortableCollection toSort) {
		if(toSort.size() <= 1) {
			return toSort;
		}
		toSort.sort();
		dplisten.onDecisionPoint(DPNr, from, toSort);
		return toSort;
	}

	public void run() {
		SortableCollection<PCVertex> vertices = reachedDecisionPoint(1, G, G.getVertices());
		for (PCVertex v : vertices) {
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
            SortableCollection<PCVertex> adjacents = reachedDecisionPoint(12, u, u.getAdjacents());
            for (PCVertex v : adjacents) {
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

	public List<PCObject> getVariableReferences() {
		return null;
	}

	public Map<PCObject, String> getParameterTypes() {
		HashMap<PCObject, String> result = new HashMap<PCObject, String>();
		result.put(PCGraph.getNull(), "G");
		result.put(PCVertex.getNull(), "s");
		return result;
	}

	public void setParameters(List<PCObject> paras) {
		this.G = (PCGraph) paras.get(0);
		this.s = (PCVertex) paras.get(1);
	}

	@Override
	public void addBPListener(BPListener wantToListen) {
		bplisten = wantToListen;
	}

	public void addDPListener(DPListener wantToListen) {
		dplisten = wantToListen;
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
