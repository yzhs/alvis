package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import java.util.ArrayList;

public class AlvisSerialize {
	
	private int globalId;

	private boolean hasOutput;
	private String output;

	private boolean hasBuffer;
	private int bufferCapacity;
	private int bufferLastFilled;

	private String[] primitiveNames;
	private boolean[] primitiveTypes;
	private int[] primitiveIntValues;
	private boolean[] primitiveBooleanValues;

	private String[] actorNames;
	private String[][] actorLines;
	private int[] actorLine;
	private boolean[] actorStatus;

	private String[] semaphoreNames;
	private int[] semaphoreCounter;

	private String[] conditionSemaphoreName;
	private String[] conditionName;
	private int[] conditionWaiting;

	public AlvisSerialize(int globalId, int strategy, AlvisOutput output, AlvisBuffer buf,
			ArrayList<AlvisPrimitive> primitives,
			ArrayList<AlvisActor> actors, ArrayList<AlvisSemaphore> semaphores,
			ArrayList<AlvisCondition> conditions) {
		
		this.globalId = globalId;

		if (output != null) {
			hasOutput = true;
			this.output = output.getOutput();
		} else {
			hasOutput = false;
			output = null;
		}
		if (buf != null) {
			hasBuffer = true;
			this.bufferCapacity = buf.getCapacity();
			this.bufferLastFilled = buf.getLastFilled();
		} else {
			hasBuffer = false;
			bufferCapacity = 0;
			bufferLastFilled = 0;
		}
		
		int primitivesCount = primitives.size();
		primitiveNames = new String[primitivesCount];
		primitiveTypes = new boolean[primitivesCount];
		primitiveIntValues = new int[primitivesCount];
		primitiveBooleanValues = new boolean[primitivesCount];
		for (int i = 0; i < primitivesCount; i++) {
			AlvisPrimitive p = primitives.get(i);
			primitiveNames[i] = p.getName();
			primitiveTypes[i] = p.getType();
			primitiveIntValues[i] = p.getIntValue();
			primitiveBooleanValues[i] = p.getBoolValue();
		}

		int actorsCount = actors.size();
		this.actorNames = new String[actorsCount];
		this.actorLines = new String[actorsCount][];
		this.actorLine = new int[actorsCount];
		this.actorStatus = new boolean[actorsCount];
		for (int i = 0; i < actorsCount; i++) {
			AlvisActor a = actors.get(i);
			this.actorNames[i] = a.getName();
			this.actorLines[i] = a.getLines();
			this.actorLine[i] = a.getCurrentLine();
			this.actorStatus[i] = a.isBlocked();
		}

		int semaphoreCount = semaphores.size();
		this.semaphoreNames = new String[semaphoreCount];
		this.semaphoreCounter = new int[semaphoreCount];
		for (int i = 0; i < semaphoreCount; i++) {
			AlvisSemaphore s = semaphores.get(i);
			this.semaphoreNames[i] = s.getName();
			this.semaphoreCounter[i] = s.getCount();
		}

		int conditionCount = conditions.size();
		this.conditionName = new String[conditionCount];
		this.conditionWaiting = new int[conditionCount];
		this.conditionSemaphoreName = new String[conditionCount];
		for (int i = 0; i < conditionCount; i++) {
			AlvisCondition c = conditions.get(i);
			this.conditionName[i] = c.getName();
			this.conditionWaiting[i] = c.getWaiting();
			this.conditionSemaphoreName[i] = c.getSema();
		}
	}
	
	public int getGlobalId() {
		return globalId;
	}
	
	public void setGlobalId(int value) {
		globalId = value;
	}

	public boolean getHasOutput() {
		return hasOutput;
	}

	public void setHasOutput(boolean value) {
		hasOutput = value;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public boolean getHasBuffer() {
		return hasBuffer;
	}

	public void setHasBuffer(boolean value) {
		hasBuffer = value;
	}

	public int getBufferCapacity() {
		return bufferCapacity;
	}

	public void setBufferCapacity(int value) {
		this.bufferCapacity = value;
	}

	public int getBufferLastFilled() {
		return bufferLastFilled;
	}

	public void setBufferLastFilled(int value) {
		this.bufferLastFilled = value;
	}

	public String[] getPrimitiveNames() {
		return primitiveNames;
	}

	public void setPrimitiveNames(String[] primitiveNames) {
		this.primitiveNames = primitiveNames;
	}

	public boolean[] getPrimitiveTypes() {
		return primitiveTypes;
	}

	public void setPrimitiveTypes(boolean[] primitiveTypes) {
		this.primitiveTypes = primitiveTypes;
	}

	public int[] getPrimitiveIntValues() {
		return primitiveIntValues;
	}

	public void setPrimitiveIntValues(int[] primitiveIntValues) {
		this.primitiveIntValues = primitiveIntValues;
	}

	public boolean[] getPrimitiveBooleanValues() {
		return primitiveBooleanValues;
	}

	public void setPrimitiveBooleanValues(boolean[] primitiveBooleanValues) {
		this.primitiveBooleanValues = primitiveBooleanValues;
	}

	public String[] getActorNames() {
		return actorNames;
	}

	public void setActorNames(String[] actorNames) {
		this.actorNames = actorNames;
	}

	public String[][] getActorLines() {
		return actorLines;
	}

	public void setActorLines(String[][] actorLines) {
		this.actorLines = actorLines;
	}

	public int[] getActorLine() {
		return actorLine;
	}

	public void setActorLine(int[] actorLine) {
		this.actorLine = actorLine;
	}

	public boolean[] getActorStatus() {
		return actorStatus;
	}

	public void setActorStatus(boolean[] actorStatus) {
		this.actorStatus = actorStatus;
	}

	public String[] getSemaphoreNames() {
		return semaphoreNames;
	}

	public void setSemaphoreNames(String[] semaphoreNames) {
		this.semaphoreNames = semaphoreNames;
	}

	public int[] getSemaphoreCounter() {
		return semaphoreCounter;
	}

	public void setSemaphoreCounter(int[] semaphoreCounter) {
		this.semaphoreCounter = semaphoreCounter;
	}

	public String[] getConditionSemaphoreName() {
		return conditionSemaphoreName;
	}

	public void setConditionSemaphoreName(String[] conditionSemaphoreName) {
		this.conditionSemaphoreName = conditionSemaphoreName;
	}

	public String[] getConditionName() {
		return conditionName;
	}

	public void setConditionName(String[] conditionName) {
		this.conditionName = conditionName;
	}

	public int[] getConditionWaiting() {
		return conditionWaiting;
	}

	public void setConditionWaiting(int[] conditionWaiting) {
		this.conditionWaiting = conditionWaiting;
	}

}
