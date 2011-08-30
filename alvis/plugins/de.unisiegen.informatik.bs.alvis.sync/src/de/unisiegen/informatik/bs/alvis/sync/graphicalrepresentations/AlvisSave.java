package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import java.util.ArrayList;

public class AlvisSave {
	
	private ArrayList<AlvisPrimitive> primitives;
	private ArrayList<AlvisActor> actors;
	private ArrayList<AlvisSemaphore> semaphores;
	private ArrayList<AlvisCondition> conditions;
	private AlvisBuffer buffer;
	private AlvisOutput output;
	private int strategy;
	private int globalId;
	
	public AlvisSave() {
		primitives = new ArrayList<AlvisPrimitive>();
		actors = new ArrayList<AlvisActor>();
		semaphores = new ArrayList<AlvisSemaphore>();
		conditions = new ArrayList<AlvisCondition>();
		buffer = null;
		output = null;
		strategy = 0;
		globalId = 0;
	}
	
	public AlvisSave(AlvisScenario scenario, AlvisSerialize seri) {
		this();
		scenario.setAdmin(this);
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

	public int getStrategy() {
		return strategy;
	}

	public void setStrategy(int strategy) {
		this.strategy = strategy;
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
		AlvisSerialize seri = new AlvisSerialize(globalId, strategy, output, buffer, primitives, actors, semaphores, conditions);
		return seri;
	}

}
