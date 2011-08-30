package de.unisiegen.informatik.bs.alvis.sync.undo;

import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisScenario;

public interface AlvisScenarioUndo {
	
	public void execute(AlvisScenario scenario);
	
	public AlvisScenarioUndo invert();
	
	public boolean willBeDirty();
	
	public void setWillBeDirty(boolean dirty);

}
