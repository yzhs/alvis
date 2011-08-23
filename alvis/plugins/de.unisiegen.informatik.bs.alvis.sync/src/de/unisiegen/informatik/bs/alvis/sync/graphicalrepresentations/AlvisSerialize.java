package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCActor;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCBuffer;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCCondition;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCSemaphore;

public class AlvisSerialize {

	private int strategy;
	private String output;
	private boolean[] buffer;

	private String[] actorNames;
	private String[][] actorLines;
	private int[] actorLine;
	private boolean[] actorStep;
	private boolean[] actorStatus;

	private String[] semaphoreNames;
	private int[] semaphoreCounter;

	private String[] conditionSemaphoreName;
	private String[] conditionName;
	private int[] conditionWaiting;

	public AlvisSerialize(int strategy, String output, PCBuffer buf,
			ArrayList<PCActor> actors, ArrayList<PCSemaphore> semaphores,
			ArrayList<PCCondition> conditions) {
		this.strategy = strategy;
		this.output = output;
		
		this.buffer = new boolean[buf.getCapacity()];
		int used = buf.getUsage().size();
		for (int i = 0; i < buffer.length; i++) {
			buffer[i]=  (i < used ? true : false); 
		}
		
		int actorsCount = actors.size();
		this.actorNames = new String[actorsCount];
		this.actorLines = new String[actorsCount][];
		this.actorLine = new int[actorsCount];
		this.actorStep = new boolean[actorsCount];
		this.actorStatus = new boolean[actorsCount];
		for (int i = 0; i < actorsCount; i++) {
			PCActor a = actors.get(i);
			this.actorNames[i] = a.getName();
			this.actorLines[i] = a.getLines();
			this.actorLine[i] = a.getLine();
			this.actorStep[i] = a.isDoStep();
			this.actorStatus[i] = a.isBlocked();
		}
		
		int semaphoreCount = semaphores.size();
		this.semaphoreNames = new String[semaphoreCount];
		this.semaphoreCounter = new int[semaphoreCount];
		for (int i = 0; i < semaphoreCount; i++) {
			PCSemaphore s = semaphores.get(i);
			this.semaphoreNames[i] = s.getName();
			this.semaphoreCounter[i] = s.getCounter();
		}
		
		int conditionCount = conditions.size();
		this.conditionName = new String[conditionCount];
		this.conditionWaiting = new int[conditionCount];
		this.conditionSemaphoreName = new String[conditionCount];
		for (int i = 0; i < conditionCount; i++) {
			PCCondition c = conditions.get(i);
			this.conditionName[i] = c.getName();
			this.conditionWaiting[i] = c.getWaiting();
			this.conditionSemaphoreName[i] = c.getSema().getName();
		}
	}

	public int getStrategy() {
		return strategy;
	}

	public void setStrategy(int strategy) {
		this.strategy = strategy;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public boolean[] getBuffer() {
		return buffer;
	}

	public void setBuffer(boolean[] buffer) {
		this.buffer = buffer;
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

	public boolean[] getActorStep() {
		return actorStep;
	}

	public void setActorStep(boolean[] actorStep) {
		this.actorStep = actorStep;
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
