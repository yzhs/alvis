package de.unisiegen.informatik.bs.alvis;

import java.io.Serializable;
import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeObject;

/**
 * A Run object contains informations about which Algorithm should be run on
 * which Example. For each tupel (Algo,Example) is one instance of Run needed.
 * Stored are only references to the files containing Algo and Example
 * @author simon
 *
 */
public class Run implements Serializable {

	private String algorithmFile = "";
	private String exampleFile = "";
	/**
	 * Run information tupel
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
		return true;
	}
	
}
