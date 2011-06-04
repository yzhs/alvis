package de.unisiegen.informatik.bs.alvis;

import java.io.Serializable;

import de.unisiegen.informatik.bs.alvis.editors.EBreakPoint;
import de.unisiegen.informatik.bs.alvis.editors.EDecisionPoint;
import de.unisiegen.informatik.bs.alvis.editors.EStartPoint;

/**
 * A Run object contains informations about which Algorithm should be run on
 * which Example. For each tupel (Algo,Example) is one instance of Run needed.
 * Stored are only references to the files containing Algo and Example
 * @author simon
 *
 */
public class Run implements Serializable {

	/**
	 * Generated Serial ID
	 */
	private static final long serialVersionUID = 4861607093496803650L;
	
	/**
	 * data
	 */
	private String algorithmFile = "";
	private String exampleFile = "";

	private EBreakPoint onBreakPoint = EBreakPoint.STOP;
	private EStartPoint onStartPoint = EStartPoint.RAND;
	private EDecisionPoint onDecisionPoint = EDecisionPoint.RAND;
	
	private boolean limitSteps = true;
	
	/**
	 * Run information
	 * @param algorithmFile
	 * @param exampleFile
	 */
	public Run(String algorithmFile, String exampleFile) {
		this.algorithmFile = algorithmFile;
		this.exampleFile = exampleFile;
	}

	public Run() {
	}

	/**
	 * @return the algorithmFile
	 */
	public String getAlgorithmFile() {
		return algorithmFile;
	}

	/**
	 * @param algorithmFile the algorithmFile to set
	 */
	public void setAlgorithmFile(String algorithmFile) {
		this.algorithmFile = algorithmFile;
	}

	/**
	 * @return the exampleFile
	 */
	public String getExampleFile() {
		return exampleFile;
	}

	/**
	 * @param exampleFile the exampleFile to set
	 */
	public void setExampleFile(String exampleFile) {
		this.exampleFile = exampleFile;
	}
	
	/**
	 * Checks equality
	 * @param toCompare
	 * @return
	 */
	public boolean equals(Run toCompare) {
		if(!this.getAlgorithmFile().equals(toCompare.getAlgorithmFile())) 
			return false;
		if(!this.getExampleFile().equals(toCompare.getExampleFile()))
			return false;
		if(!this.getOnBreakPoint().equals(toCompare.getOnBreakPoint()))
			return false;		
		if(!this.getOnDecisionPoint().equals(toCompare.getOnDecisionPoint()))
			return false;
		if(!this.getOnStartPoint().equals(toCompare.getOnStartPoint()))
			return false;
		if(this.isLimitSteps()!=toCompare.isLimitSteps())
			return false;
		return true;
	}

	/**
	 * @param onDecisionPoint the onDecisionPoint to set
	 */
	public void setOnDecisionPoint(EDecisionPoint myDecisionPoint) {
		this.onDecisionPoint = myDecisionPoint;
	}

	/**
	 * @return the onDecisionPoint
	 */
	public EDecisionPoint getOnDecisionPoint() {
		return onDecisionPoint;
	}

	/**
	 * @param onStartPoint the onStartPoint to set
	 */
	public void setOnStartPoint(EStartPoint myStartPoint) {
		this.onStartPoint = myStartPoint;
	}

	/**
	 * @return the onStartPoint
	 */
	public EStartPoint getOnStartPoint() {
		return onStartPoint;
	}

	/**
	 * @param onBreakPoint the onBreakPoint to set
	 */
	public void setOnBreakPoint(EBreakPoint myBreakPoint) {
		this.onBreakPoint = myBreakPoint;
	}

	/**
	 * @return the onBreakPoint
	 */
	public EBreakPoint getOnBreakPoint() {
		return onBreakPoint;
	}

	/**
	 * @param limitSteps the limitSteps to set
	 */
	public void setLimitSteps(boolean limitSteps) {
		this.limitSteps = limitSteps;
	}

	/**
	 * @return the limitSteps
	 */
	public boolean isLimitSteps() {
		return limitSteps;
	}
	
}
