package de.unisiegen.informatik.bs.alvis.virtualmachine;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.datatypes.Datatype;
import de.unisiegen.informatik.bs.alvis.datatypes.SortableCollection;

public class VirtualMachine {

	private static VirtualMachine instance = new VirtualMachine();

	public static VirtualMachine getInstance() {
		return instance;
	}

	private ArrayList<State> states;
	private ArrayList<Integer> bpCounter;
	private ArrayList<Integer> dpCounter;
	private int bpIndex;
	private int dpIndex;
	private ArrayList<Datatype> parameters;
	private AbstractAlgo algoToRun;
	private BPListener bplisten;
	private DPListener dplisten;
	private int stateIndex;

	private VirtualMachine() {
		states = new ArrayList<State>();
		bpIndex = 0;
		dpIndex = 0;
		stateIndex = 0;
		bpCounter = new ArrayList<Integer>();
		dpCounter = new ArrayList<Integer>();
		parameters = new ArrayList<Datatype>();
		bplisten = null;
		dplisten = null;
	}

	/**
	 * reset all states
	 */
	public void resetState() {
		bpCounter.clear();
		dpCounter.clear();
		bpIndex = 0;
		dpIndex = 0;
	}

	public void recoverFromBP() {
		synchronized (algoToRun) {
			algoToRun.onBreak = false;
			algoToRun.notify();
		}
	}

	/**
	 * let the vm start and run the Algorithm every breakpoint will pause 1 sec.
	 * one decisionpoints will nothing happen, so the order highly depends on
	 * the current memory layout
	 */
	public void startAutoRun() {
		// TODO think about advanced thread security
		if (algoToRun != null && algoToRun.isAlive()) {
			return;
		}
		// here should happen magically the classloader stuff
		algoToRun = new Algo(parameters);
		// ////
		algoToRun.addBPListener(new BPListener() {
			public void onBreakPoint(int BPNr) {
				try {
					// TODO configurable Time for breakpoint sleep, currently 2
					// sec.
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (algoToRun) {
					algoToRun.onBreak = false;
					algoToRun.notify();
				}
			}
		});
		algoToRun.addDPListener(new DPListener() {
			public void onDecisionPoint(int DPNr, SortableCollection toSort) {
			}
		});
		algoToRun.start();
	}

	/**
	 * let the algo run, every breakpoint will be a new state created
	 */
	public void startDefaultRun() {
		states.add(new State(null, bpIndex, dpIndex, false));
		stateIndex = 0;
		algoToRun = new Algo(parameters);
		algoToRun.addBPListener(new BPListener() {
			public void onBreakPoint(int BPNr) {
				// this is a new Breakpoint
				if (bpIndex < BPNr) {
					bpCounter.add(new Integer(1));
					bpIndex++;
				}

				// revisiting the actual Breakpoint (inner loop)
				// or traveling through nested loops
				else {
					bpIndex = BPNr;
					int tmp = bpCounter.get(bpIndex - 1).intValue();
					tmp++;
					bpCounter.set(bpIndex - 1, new Integer(tmp));
				}
				states.add(new State(null, bpIndex, dpIndex, false));
				stateIndex++;

				if (bplisten != null) {
					bplisten.onBreakPoint(BPNr);
				}
			}
		});
		algoToRun.addDPListener(new DPListener() {
			public void onDecisionPoint(int DPNr, SortableCollection toSort) {
				if (dplisten != null) {
					dplisten.onDecisionPoint(DPNr, toSort);
				}
			}
		});
		algoToRun.start();
	}

	public void stepForward() {
		if (algoToRun.isAlive()) {
			synchronized (algoToRun) {
				algoToRun.onBreak = false;
				algoToRun.notify();
			}
		}
	}

	// TODO create needed stepbackwards method
	// restart algo, disable all Breakpoints till:
	// we passed the latest point on our way
	public void stepBackward() {
		// if i'm 1, the next status would be zero, the beginning state every
		// other value would also be totally useless
		if (stateIndex > 1) {
			this.resetState();
			algoToRun = new Algo(parameters);
			algoToRun.addBPListener(new BPListener() {
				// saving the state where we want to end
				int curSI = stateIndex - 1;

				public void onBreakPoint(int BPNr) {
					// this is a new Breakpoint
					if (bpIndex < BPNr) {
						bpCounter.add(new Integer(1));
						bpIndex++;
					}
					// revisiting the actual Breakpoint (inner loop)
					// or traveling through nested loops
					else {
						bpIndex = BPNr;
						int tmp = bpCounter.get(bpIndex - 1).intValue();
						tmp++;
						bpCounter.set(bpIndex - 1, new Integer(tmp));
					}
					states.add(new State(null, bpIndex, dpIndex, false));
					stateIndex++;
					// we reached our goal
					if (stateIndex == curSI) {
						// overwrite breakpoint listener to restore previous
						// behaviour
						algoToRun.addBPListener(new BPListener() {
							public void onBreakPoint(int BPNr) {
								// this is a new Breakpoint
								if (bpIndex < BPNr) {
									bpCounter.add(new Integer(1));
									bpIndex++;
								}
								// revisiting the actual Breakpoint (inner loop)
								// or traveling through nested loops
								else {
									bpIndex = BPNr;
									int tmp = bpCounter.get(bpIndex - 1)
											.intValue();
									tmp++;
									bpCounter
											.set(bpIndex - 1, new Integer(tmp));
								}
								states.add(new State(null, bpIndex, dpIndex,
										false));
								stateIndex++;
								if(bplisten != null) {
									bplisten.onBreakPoint(BPNr);
								}
							}
						});
					} else {
						synchronized (algoToRun) {
							algoToRun.onBreak = false;
							algoToRun.notify();
						}
					}
				}
			});

			algoToRun.addDPListener(new DPListener() {
				public void onDecisionPoint(int DPNr, SortableCollection toSort) {
					if (dplisten != null) {
						dplisten.onDecisionPoint(DPNr, toSort);
					}
				}
			});
			stateIndex = 0;
			this.states.clear();
			algoToRun.start();
		} else {
			this.startDefaultRun();
		}
	}

	public boolean isDone() {
		return !algoToRun.isAlive();
	}

	/**
	 * only usable if thread is in breakpoint, otherwise will wait, till it is
	 * 
	 * @return Reference on all Variables
	 */
	public ArrayList<Datatype> getRunningRef() {
		while (!algoToRun.onBreak) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return this.algoToRun.getRunningRef();
	}

	public void addDPListener(DPListener dplisten) {
		this.dplisten = dplisten;
	}

	public void addBPListener(BPListener bplisten) {
		this.bplisten = bplisten;
	}

	public void addParameter(Datatype para) {
		parameters.add(para);
	}

	public void removeOldParameters() {
		this.parameters.clear();
	}

	public void waitForAlgo() {
		try {
			algoToRun.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
