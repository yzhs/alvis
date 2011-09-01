package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

public class PCScenario extends PCObject {

	private static final String TYPENAME = "Scenario";

	private ArrayList<PCThread> threads;
	private ArrayList<PCThread> threadsRunnable;
	private ArrayList<PCThread> threadsBlocked;

	private Random rndGen;

	private int currentThread;

	private int strategy;

	private boolean deadlocked;

	public PCScenario() {
		threads = new ArrayList<PCThread>();
		threadsRunnable = new ArrayList<PCThread>();
		threadsBlocked = new ArrayList<PCThread>();
		rndGen = new Random(new Date().getTime());
		currentThread = 0;
		deadlocked = false;
	}

	public PCScenario(ArrayList<GraphicalRepresentationThread> threads,
			ArrayList<GraphicalRepresentationBuffer> buffer,
			ArrayList<GraphicalRepresentationCondition> conditions,
			ArrayList<GraphicalRepresentationSemaphore> semaphores) {

	}

	public static String getTypename() {
		return TYPENAME;
	}

	public ArrayList<PCThread> getThreads() {
		return threads;
	}

	public void setThreads(ArrayList<PCThread> threads) {
		this.threads = threads;
	}

	public ArrayList<PCThread> getThreadsRunnable() {
		return threadsRunnable;
	}

	public void setThreadsRunnable(ArrayList<PCThread> threadsRunnable) {
		this.threadsRunnable = threadsRunnable;
	}

	public ArrayList<PCThread> getThreadsBlocked() {
		return threadsBlocked;
	}

	public void setThreadsBlocked(ArrayList<PCThread> threadsBlocked) {
		this.threadsBlocked = threadsBlocked;
	}

	public Random getRndGen() {
		return rndGen;
	}

	public void setRndGen(Random rndGen) {
		this.rndGen = rndGen;
	}

	public int getCurrentThread() {
		return currentThread;
	}

	public void setCurrentThread(int currentThread) {
		this.currentThread = currentThread;
	}

	public int getStrategy() {
		return strategy;
	}

	public void setStrategy(int strategy) {
		this.strategy = strategy;
	}

	public boolean isDeadlocked() {
		return deadlocked;
	}

	public void setDeadlocked(boolean deadlocked) {
		this.deadlocked = deadlocked;
	}

	public void addThread(PCThread a) {
		threads.add(a);
		threadsRunnable.add(a);
	}

	public void doGlobalStep() {
		deadlocked = true;
		int i, j = 0;
		switch (strategy) {
		case 0: // Random
			PCThread[] running = new PCThread[threads.size()];
			for (i = 0; i < running.length; i++) {
				PCThread a = threads.get(i);
				if (!a.isBlocked()) {
					running[j++] = a;
				}
				if (j > 0) {
					running[rndGen.nextInt(j)].step();
					deadlocked = false;
				}
			}
			break;

		case 1: // Round Robin
			// Check if a former blocked thread can run now
			for (PCThread a : threadsBlocked) {
				if (!a.isBlocked()) {
					threadsBlocked.remove(a);
					threadsRunnable.add(a);
				}
			}
			// Check if a former runnable thread is blocked now
			for (PCThread a : threadsRunnable) {
				if (a.isBlocked()) {
					threadsRunnable.remove(a);
					threadsBlocked.add(a);
				}
			}
			// Get first runnable thread, do step and move to end of list
			if (!threadsRunnable.isEmpty()) {
				PCThread a = threadsRunnable.get(0);
				threadsRunnable.remove(0);
				a.step();
				threadsRunnable.add(a);
				deadlocked = false;
			}
			break;

		case 2: // FIFO
			for (i = 0; i < threads.size(); i++) {
				j = (currentThread + 1) % threads.size();
				PCThread a = threads.get(j);
				if (!a.isBlocked()) {
					a.step();
					deadlocked = false;
					break;
				}
			}
			currentThread = j;
			break;

		case 3: // Prio
			for (i = 0; i < threads.size(); i++) {
				PCThread a = threads.get(i);
				if (!a.isBlocked()) {
					a.step();
					deadlocked = false;
					break;
				}
			}
			break;

		case 4: // rev. Prio
			for (i = threads.size() - 1; i >= 0; i--) {
				PCThread a = threads.get(i);
				if (!a.isBlocked()) {
					a.step();
					deadlocked = false;
					break;
				}
			}
			break;
		}
		if (deadlocked) {

		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getMembers() {
		String[] members = { "threads", "semaphores", "conditions", "buffer",
				"primitives" };
		return Arrays.asList(members);
	}

}
