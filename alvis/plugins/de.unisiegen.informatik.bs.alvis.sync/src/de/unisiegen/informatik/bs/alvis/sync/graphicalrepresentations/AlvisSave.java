package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import java.util.ArrayList;

public class AlvisSave {

	private ArrayList<AlvisPrimitive> primitives;
	private ArrayList<AlvisActor> actors;
	private ArrayList<AlvisSemaphore> semaphores;
	private ArrayList<AlvisCondition> conditions;
	private AlvisBuffer buffer;
	private AlvisOutput output;
	private int globalId;

	public AlvisSave() {
		primitives = new ArrayList<AlvisPrimitive>();
		actors = new ArrayList<AlvisActor>();
		semaphores = new ArrayList<AlvisSemaphore>();
		conditions = new ArrayList<AlvisCondition>();
		buffer = null;
		output = null;
		globalId = 0;
	}

	public AlvisSave(AlvisScenario scenario, AlvisSerialize seri) {
		this();
		scenario.setAdmin(this);
		globalId = seri.getGlobalId();

		int primitivesCount = seri.getPrimitiveNames().length;
		for (int i = 0; i < primitivesCount; i++) {
			if (seri.getPrimitiveTypes()[i]) {
				// int
				AlvisPrimitive p = new AlvisPrimitive(scenario,
						seri.getPrimitiveNames()[i],
						seri.getPrimitiveIntValues()[i],
						seri.getPrimitiveIds()[i]);
				primitives.add(p);
			} else {
				// boolean
				AlvisPrimitive p = new AlvisPrimitive(scenario,
						seri.getPrimitiveNames()[i],
						seri.getPrimitiveBooleanValues()[i],
						seri.getPrimitiveIds()[i]);
				primitives.add(p);
			}
		}
		scenario.setPrimitivesList(primitives);

		int semaphoresCount = seri.getSemaphoreNames().length;
		for (int i = 0; i < semaphoresCount; i++) {
			AlvisSemaphore s = new AlvisSemaphore(scenario,
					seri.getSemaphoreNames()[i], seri.getSemaphoreCounter()[i],
					seri.getSemaphoreIds()[i]);
			semaphores.add(s);
		}
		scenario.setSemaphoresList(semaphores);

		int conditionsCount = seri.getConditionName().length;
		for (int i = 0; i < conditionsCount; i++) {
			AlvisCondition c = new AlvisCondition(scenario,
					seri.getConditionName()[i], seri.getConditionIds()[i]);
			c.setSemaName(seri.getConditionSemaphoreName()[i]);
			c.setWaiting(seri.getConditionWaiting()[i]);
			conditions.add(c);
		}
		scenario.setConditionsList(conditions);

		int actorsCount = seri.getActorNames().length;
		for (int i = 0; i < actorsCount; i++) {
			AlvisActor a = new AlvisActor(scenario, seri.getActorNames()[i],
					seri.getActorStatus()[i], seri.getActorIds()[i]);
			actors.add(a);
		}
		scenario.setActorsList(actors);

		if (seri.getHasBuffer()) {
			AlvisBuffer b = new AlvisBuffer(scenario, seri.getBufferCapacity(),
					seri.getBufferId());
			scenario.setBuffer(b);
			for (int i = 0; i < seri.getBufferLastFilled(); i++) {
				b.setFull();
			}
			b.setLastFilled(seri.getBufferLastFilled());
		} else {
			scenario.setBuffer(null);
		}

		if (seri.getHasOutput()) {
			AlvisOutput o = new AlvisOutput(scenario, seri.getOutput(),
					seri.getOutputId());
			scenario.setOutput(o);
		} else {
			scenario.setOutput(null);
		}

	}

	public int requestId() {
		return ++globalId;
	}

	public int getGlobalId() {
		return globalId + 1;
	}

	public ArrayList<AlvisPrimitive> getPrimitives() {
		return primitives;
	}

	public void setPrimitives(ArrayList<AlvisPrimitive> primitives) {
		this.primitives = primitives;
	}

	public ArrayList<AlvisActor> getActors() {
		return actors;
	}

	public void setActors(ArrayList<AlvisActor> actors) {
		this.actors = actors;
	}

	public ArrayList<AlvisSemaphore> getSemaphores() {
		return semaphores;
	}

	public void setSemaphores(ArrayList<AlvisSemaphore> semaphores) {
		this.semaphores = semaphores;
	}

	public ArrayList<AlvisCondition> getConditions() {
		return conditions;
	}

	public void setConditions(ArrayList<AlvisCondition> conditions) {
		this.conditions = conditions;
	}

	public AlvisBuffer getBuffer() {
		return buffer;
	}

	public void setBuffer(AlvisBuffer buffer) {
		this.buffer = buffer;
	}

	public AlvisOutput getOutput() {
		return output;
	}

	public void setOutput(AlvisOutput output) {
		this.output = output;
	}

	public void addPrimitive(AlvisPrimitive p) {
		primitives.add(p);
	}

	public void removePrimitive(AlvisPrimitive p) {
		primitives.remove(p);
	}

	public void addActor(AlvisActor a) {
		actors.add(a);
	}

	public void removeActor(AlvisActor a) {
		actors.remove(a);
	}

	public void addBuffer(AlvisBuffer b) {
		buffer = b;
	}

	public void removeBuffer() {
		buffer = null;
	}

	public void addOutput(AlvisOutput o) {
		output = o;
	}

	public void removeOutput() {
		output = null;
	}

	public void addCondition(AlvisCondition c) {
		conditions.add(c);
	}

	public void removeCondition(AlvisCondition c) {
		conditions.remove(c);
	}

	public void addSemaphore(AlvisSemaphore s) {
		semaphores.add(s);
	}

	public void removeSemaphore(AlvisSemaphore s) {
		semaphores.remove(s);
	}

	public AlvisSerialize serialize() {
		AlvisSerialize seri = new AlvisSerialize(globalId, output, buffer,
				primitives, actors, semaphores, conditions);
		return seri;
	}

}
