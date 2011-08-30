package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

public class PCScenario extends PCObject {
	
	private static final String TYPENAME = "Scenario";

	private ArrayList<PCActor> actors;
	private ArrayList<PCActor> actorsRunnable;
	private ArrayList<PCActor> actorsBlocked;

	private Random rndGen;

	private int currentActor;

	private int strategy;

	private boolean deadlocked;

	public PCScenario() {
		actors = new ArrayList<PCActor>();
		actorsRunnable = new ArrayList<PCActor>();
		actorsBlocked = new ArrayList<PCActor>();
		rndGen = new Random(new Date().getTime());
		currentActor = 0;
		deadlocked = false;
	}

	public PCScenario(ArrayList<GraphicalRepresentationActor> actors,
			ArrayList<GraphicalRepresentationBuffer> buffer,
			ArrayList<GraphicalRepresentationCondition> conditions,
			ArrayList<GraphicalRepresentationSemaphore> semaphores,
			ArrayList<GraphicalRepresentationOutput> output) {
		
	}

	public ArrayList<PCActor> getActors() {
		return actors;
	}

	public void setActors(ArrayList<PCActor> actors) {
		this.actors = actors;
	}

	public ArrayList<PCActor> getActorsRunnable() {
		return actorsRunnable;
	}

	public void setActorsRunnable(ArrayList<PCActor> actorsRunnable) {
		this.actorsRunnable = actorsRunnable;
	}

	public ArrayList<PCActor> getActorsBlocked() {
		return actorsBlocked;
	}

	public void setActorsBlocked(ArrayList<PCActor> actorsBlocked) {
		this.actorsBlocked = actorsBlocked;
	}

	public Random getRndGen() {
		return rndGen;
	}

	public void setRndGen(Random rndGen) {
		this.rndGen = rndGen;
	}

	public int getCurrentActor() {
		return currentActor;
	}

	public void setCurrentActor(int currentActor) {
		this.currentActor = currentActor;
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

	public void addActor(PCActor a) {
		actors.add(a);
		actorsRunnable.add(a);
	}

	public void doGlobalStep() {
		deadlocked = true;
		int i, j = 0;
		switch (strategy) {
		case 0: // Random
			PCActor[] running = new PCActor[actors.size()];
			for (i = 0; i < running.length; i++) {
				PCActor a = actors.get(i);
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
			// Check if a former blocked actor can run now
			for (PCActor a : actorsBlocked) {
				if (!a.isBlocked()) {
					actorsBlocked.remove(a);
					actorsRunnable.add(a);
				}
			}
			// Check if a former runnable actor is blocked now
			for (PCActor a : actorsRunnable) {
				if (a.isBlocked()) {
					actorsRunnable.remove(a);
					actorsBlocked.add(a);
				}
			}
			// Get first runnable actor, do step and move to end of list
			if (!actorsRunnable.isEmpty()) {
				PCActor a = actorsRunnable.get(0);
				actorsRunnable.remove(0);
				a.step();
				actorsRunnable.add(a);
				deadlocked = false;
			}
			break;

		case 2: // FIFO
			for (i = 0; i < actors.size(); i++) {
				j = (currentActor + 1) % actors.size();
				PCActor a = actors.get(j);
				if (!a.isBlocked()) {
					a.step();
					deadlocked = false;
					break;
				}
			}
			currentActor = j;
			break;

		case 3: // Prio
			for (i = 0; i < actors.size(); i++) {
				PCActor a = actors.get(i);
				if (!a.isBlocked()) {
					a.step();
					deadlocked = false;
					break;
				}
			}
			break;

		case 4: // rev. Prio
			for (i = actors.size() - 1; i >= 0; i--) {
				PCActor a = actors.get(i);
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

}
