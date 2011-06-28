/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.views;

import java.util.ArrayList;

import org.antlr.runtime.RecognitionException;

/**
 * @author simon
 * This Class saves all nessesary information about the algorithm text
 * This are the text itself, the token to highlight, the token for content assist,
 * the token for auto-complete
 */
public class AlgorithmContainer extends ObservedObject {
	
	private String algorithm = "";
	// The Tokens to highlight
	private ArrayList<String> highlightTokens	= new ArrayList<String>();
	// The Tokens for brackets
	private ArrayList<String[]> assistTokens 	= new ArrayList<String[]>();
	// The Tokens for autocompletion
	private ArrayList<String> completeTokens 	= new ArrayList<String>();
	// The tokens for warning
	private ArrayList<RecognitionException> warningLines = new ArrayList<RecognitionException>();
	// The token for errors
	private ArrayList<RecognitionException> errorLines	= new ArrayList<RecognitionException>();
	// The currently highlited lines
	private ArrayList<Integer> currentLines = new ArrayList<Integer>();
	
	
	
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
		firePropertyChange("CHANGE_ALGORITHM", null, algorithm);
	}
	public void newAlgorithm(String algorithm) {
		this.algorithm = algorithm;
		firePropertyChange("NEW_ALGORITHM", null, algorithm);
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setHighlightTokens(ArrayList<String> highlightTokens) {
		this.highlightTokens = highlightTokens;
		firePropertyChange("SET_HIGHLIGHT", null, highlightTokens);
	}

	public ArrayList<String> getHighlightTokens() {
		return highlightTokens;
	}
	
	public void addHighlightToken(String obj) {
		if (!this.getHighlightTokens().contains(obj)) {
			this.getHighlightTokens().add(obj);
		}
		firePropertyChange("ADD_HIGHLIGHT_TOKEN", null, obj);
	}

	public void removeHighlightToken(String obj) {
		this.getHighlightTokens().remove(obj);
		firePropertyChange("REMOVE_HIGHLIGHT_TOKEN", obj, null);
	}

	public void setAssistTokens(ArrayList<String[]> assistTokens) {
		this.assistTokens = assistTokens;
		firePropertyChange("SET_ASSIST", null, assistTokens);
	}

	public ArrayList<String[]> getAssistTokens() {
		return assistTokens;
	}

	public void addAssistToken(String[] obj) {
		if (!this.getAssistTokens().contains(obj)) {
			this.getAssistTokens().add(obj);
		}
		firePropertyChange("ADD_ASSIST_TOKEN", null, obj);
	}

	public void removeAssistToken(String[] obj) {
		this.getAssistTokens().remove(obj);
		firePropertyChange("REMOVE_ASSIST_TOKEN", obj, null);
	}
	
	public void setCompleteTokens(ArrayList<String> completeTokens) {
		this.completeTokens = completeTokens;
	}

	public ArrayList<String> getCompleteTokens() {
		return completeTokens;
	}
	
	public void addCompleteToken(String obj) {
		if (!this.getCompleteTokens().contains(obj)) {
			this.getCompleteTokens().add(obj);
		}
		firePropertyChange("ADD_COMPLETE_TOKEN", null, obj);
	}

	public void removeCompleteToken(String obj) {
		this.getCompleteTokens().remove(obj);
		firePropertyChange("REMOVE_COMPLETE_TOKEN", obj, null);
	}

	public void setWarningLines(ArrayList<RecognitionException> warningLines) {
		this.warningLines = warningLines;
	}

	public ArrayList<RecognitionException> getWarningLines() {
		return warningLines;
	}

	public void setErrorLines(ArrayList<RecognitionException> errorLines) {
		this.errorLines = errorLines;
	}

	public ArrayList<RecognitionException> getErrorLines() {
		return errorLines;
	}
	public void addCurrentLine(int number) {
		firePropertyChange("ADD_LINE", null, number);
		this.currentLines.add(number);
	}
	public void removeCurrentLine(int number) {
		firePropertyChange("REMOVE_LINE", number, null);
		this.currentLines.remove((Integer)number);
	}
	public void removeAllCurrentLine() {
		firePropertyChange("REMOVE_LINE_ALL", null, null);
		this.currentLines.clear();
	}
}
