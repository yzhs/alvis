package de.unisiegen.informatik.bs.alvis.vm;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeObject;
import de.unisiegen.informatik.bs.alvis.vm.AbstractAlgo;

public class Algo implements AbstractAlgo {

	// TODO remove @suppress Warnings
	// TODO: uncomment following code, check dependencies, maybe create own
	// plugin?
	// // running Variables
	// private PseudoCodeVertex v;
	// private PseudoCodeQueue Q;
	// private PseudoCodeVertex u;
	//
	// // Parameters
	// private PseudoCodeGraph G;
	// private PseudoCodeVertex s;
	//
	// public Algo(ArrayList<Datatype> parameters) {
	// bplisten = null;
	// dplisten = null;
	// onBreak = false;
	// G = (PseudoCodeGraph) parameters.get(0);
	// s = (PseudoCodeVertex) parameters.get(1);
	// v = null;
	// Q = new PseudoCodeQueue();
	// u = null;
	// }
	//
	// public ArrayList<Datatype> getRunningRef() {
	// ArrayList<Datatype> result = new ArrayList<Datatype>();
	// result.add(G);
	// result.add(s);
	// result.add(v);
	// result.add(Q);
	// result.add(u);
	// return result;
	// }
	//
	// @SuppressWarnings("unchecked")
	// public void run() {
	// for (PseudoCodeVertex v__tmp : ((PseudoCodeList<PseudoCodeVertex>) G
	// .get("vertices"))) {
	// v = v__tmp;
	// v.set("color", new PseudoCodeString("white"));
	// v.set("distance", PseudoCodeInteger.localInfty);
	// v.set("pi", PseudoCodeVertex.localNull);
	// }
	// s.set("color", new PseudoCodeString("grey"));
	//
	// // TODO set reached BreakPoint to matching line number
	// this.reachedBreakPoint(1);
	// s.set("distance", new PseudoCodeInteger(0));
	// Q.enqueue(s);
	// while (!Q.isEmpty()) {
	// u = (PseudoCodeVertex) Q.dequeue();
	// dplisten.onDecisionPoint(0, (SortableCollection) u.getAdjacents());
	// for (PseudoCodeVertex v__tmp : ((PseudoCodeList<PseudoCodeVertex>) u
	// .get("adj"))) {
	// v = v__tmp;
	// if (v.get("color").equals(new PseudoCodeString("white"))) {
	// v.set("color", new PseudoCodeString("grey"));
	// // TODO set reached BreakPoint to matching line number
	// this.reachedBreakPoint(2);
	// v.set("distance", (u.get("distance").set("+",
	// new PseudoCodeInteger(1))));
	// v.set("pi", u);
	// Q.enqueue(v);
	// }
	// }
	// }
	// }

	private BPListener bplisten;
	@SuppressWarnings("unused")
	private DPListener dplisten;
	private boolean onBreak;

	/**
	 * dynamic code
	 */
	@Override
	public ArrayList<PseudoCodeObject> getVariableReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * dynamic code
	 */
	@Override
	public ArrayList<PseudoCodeObject> getParameterTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * dynamic code
	 */
	@Override
	public void setParameters(ArrayList<PseudoCodeObject> paras) {
		// TODO Auto-generated method stub

	}

	/**
	 * static code
	 */
	@Override
	public void addBPListener(BPListener wantToListen) {
		bplisten = wantToListen;
	}

	/**
	 * static code
	 */
	@Override
	public void addDPListener(DPListener wantToListen) {
		dplisten = wantToListen;
	}

	/**
	 * static code
	 * 
	 * @param BPNr
	 *            set breakpoint field, inform breakpoint listener, sleeps
	 *            current thread
	 */
	@SuppressWarnings("unused")
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

	/**
	 * dynamic code
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
	}

	/**
	 * static code
	 */
	@Override
	public void stopBreak() {
		onBreak = false;
	}
}
