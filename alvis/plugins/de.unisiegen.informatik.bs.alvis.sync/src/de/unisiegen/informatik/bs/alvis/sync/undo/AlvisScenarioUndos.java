package de.unisiegen.informatik.bs.alvis.sync.undo;

import java.util.Stack;

import de.unisiegen.informatik.bs.alvis.sync.editors.ScenarioEditor;

public class AlvisScenarioUndos {
	
	private Stack<AlvisScenarioUndo> undos;
	private Stack<AlvisScenarioUndo> redos;
	private ScenarioEditor editor;
	
	public AlvisScenarioUndos(ScenarioEditor editor) {
		this.editor = editor;
		undos = new Stack<AlvisScenarioUndo>();
		redos = new Stack<AlvisScenarioUndo>();
	}
	
	public void undo() {
		if (undos.isEmpty()) {
			return;
		}
		AlvisScenarioUndo undo = undos.pop();
		undo.execute(editor.scenario);
		redos.push(undo.invert());
		editor.setDirty(undo.willBeDirty());
	}
	
	public void redo() {
		if (redos.isEmpty()) {
			return;
		}
		AlvisScenarioUndo redo = redos.pop();
		redo.execute(editor.scenario);
		undos.push(redo.invert());
		editor.setDirty(redo.willBeDirty());
	}
	
	public void clearUndos() {
		undos.clear();
	}
	
	public void clearRedos() {
		redos.clear();
	}
	
	public void setActualAsUndirty() {
		if (undos.isEmpty())
			return;

		for (AlvisScenarioUndo undo : undos) {
			undo.setWillBeDirty(true);
		}
		for (AlvisScenarioUndo undo : redos) {
			undo.setWillBeDirty(true);
		}
		undos.peek().setWillBeDirty(false);

	}

}
