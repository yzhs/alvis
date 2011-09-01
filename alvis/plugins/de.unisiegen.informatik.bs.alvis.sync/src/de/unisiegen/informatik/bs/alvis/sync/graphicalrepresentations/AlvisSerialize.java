package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import java.util.ArrayList;

public class AlvisSerialize {

	private int globalId;

	private int outputId;
	private boolean hasOutput;
	private String output;

	private int bufferId;
	private boolean hasBuffer;
	private int bufferCapacity;
	private int bufferLastFilled;

	private int[] primitiveIds;
	private String[] primitiveNames;
	private boolean[] primitiveTypes;
	private int[] primitiveIntValues;
	private boolean[] primitiveBooleanValues;

	private int[] threadIds;
	private String[] threadNames;
	private boolean[] threadStatus;

	private int[] semaphoreIds;
	private String[] semaphoreNames;
	private int[] semaphoreCounter;

	private int[] conditionIds;
	private String[] conditionSemaphoreName;
	private String[] conditionName;
	private int[] conditionWaiting;

	public AlvisSerialize(int globalId, AlvisOutput output, AlvisBuffer buf,
			ArrayList<AlvisPrimitive> primitives, ArrayList<AlvisThread> threads,
			ArrayList<AlvisSemaphore> semaphores,
			ArrayList<AlvisCondition> conditions) {

		this.globalId = globalId;

		if (output != null) {
			hasOutput = true;
			outputId = output.getId();
			this.output = output.getCurrent();
		} else {
			hasOutput = false;
			output = null;
			outputId = 0;
		}
		if (buf != null) {
			hasBuffer = true;
			bufferId = buf.getId();
			this.bufferCapacity = buf.getCapacity();
			this.bufferLastFilled = buf.getLastFilled();
		} else {
			hasBuffer = false;
			bufferCapacity = 0;
			bufferLastFilled = 0;
			bufferId = 0;
		}

		int primitivesCount = primitives.size();
		primitiveIds = new int[primitivesCount];
		primitiveNames = new String[primitivesCount];
		primitiveTypes = new boolean[primitivesCount];
		primitiveIntValues = new int[primitivesCount];
		primitiveBooleanValues = new boolean[primitivesCount];
		for (int i = 0; i < primitivesCount; i++) {
			AlvisPrimitive p = primitives.get(i);
			primitiveIds[i] = p.getId();
			primitiveNames[i] = p.getName();
			primitiveTypes[i] = p.getType();
			primitiveIntValues[i] = p.getIntValue();
			primitiveBooleanValues[i] = p.getBoolValue();
		}

		int threadsCount = threads.size();
		threadIds = new int[threadsCount];
		this.threadNames = new String[threadsCount];
		this.threadStatus = new boolean[threadsCount];
		for (int i = 0; i < threadsCount; i++) {
			AlvisThread a = threads.get(i);
			threadIds[i] = a.getId();
			this.threadNames[i] = a.getName();
			this.threadStatus[i] = a.isBlocked();
		}

		int semaphoreCount = semaphores.size();
		semaphoreIds = new int[semaphoreCount];
		this.semaphoreNames = new String[semaphoreCount];
		this.semaphoreCounter = new int[semaphoreCount];
		for (int i = 0; i < semaphoreCount; i++) {
			AlvisSemaphore s = semaphores.get(i);
			semaphoreIds[i] = s.getId();
			this.semaphoreNames[i] = s.getName();
			this.semaphoreCounter[i] = s.getCount();
		}

		int conditionCount = conditions.size();
		conditionIds = new int[conditionCount];
		this.conditionName = new String[conditionCount];
		this.conditionWaiting = new int[conditionCount];
		this.conditionSemaphoreName = new String[conditionCount];
		for (int i = 0; i < conditionCount; i++) {
			AlvisCondition c = conditions.get(i);
			conditionIds[i] = c.getId();
			this.conditionName[i] = c.getName();
			this.conditionWaiting[i] = c.getWaiting();
			this.conditionSemaphoreName[i] = c.getSema().getName();
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

	public String[] getThreadNames() {
		return threadNames;
	}

	public void setThreadNames(String[] threadNames) {
		this.threadNames = threadNames;
	}

	public boolean[] getThreadStatus() {
		return threadStatus;
	}

	public void setThreadStatus(boolean[] threadStatus) {
		this.threadStatus = threadStatus;
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

	public int getOutputId() {
		return outputId;
	}

	public void setOutputId(int outputId) {
		this.outputId = outputId;
	}

	public int getBufferId() {
		return bufferId;
	}

	public void setBufferId(int bufferId) {
		this.bufferId = bufferId;
	}

	public int[] getPrimitiveIds() {
		return primitiveIds;
	}

	public void setPrimitiveIds(int[] primitiveIds) {
		this.primitiveIds = primitiveIds;
	}

	public int[] getThreadIds() {
		return threadIds;
	}

	public void setThreadIds(int[] threadIds) {
		this.threadIds = threadIds;
	}

	public int[] getSemaphoreIds() {
		return semaphoreIds;
	}

	public void setSemaphoreIds(int[] semaphoreIds) {
		this.semaphoreIds = semaphoreIds;
	}

	public int[] getConditionIds() {
		return conditionIds;
	}

	public void setConditionIds(int[] conditionIds) {
		this.conditionIds = conditionIds;
	}

}
