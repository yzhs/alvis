/**
 * Error Marker Class to mark error in an AlgorithmEditor
 */
package de.unisiegen.informatik.bs.alvis.editors;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.MismatchedTreeNodeException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.texteditor.MarkerUtilities;

import de.unisiegen.informatik.bs.alvis.compiler.CompilerAccess;

/**
 * This class is for marking the given Document and File with Errors that occurs parsing the document.
 * @author Eduard Boos
 * 
 */
public class AlgorithmErrorMarker {
	private IFile file;
	private IDocument document;
	public static final String ERROR_MARKER_ID = "de.unisiegen.informatik.bs.alvis.markers.AlgorithmErrorMarker";

	/**
	 * 
	 * @param file
	 *            the IFile to mark
	 * @param document
	 *            the IDocument to mark
	 */
	public AlgorithmErrorMarker(IFile file, IDocument document) {
		this.file = file;
		this.document = document;
	}

	/**
	 * mark the errors in the file/document, this method will parse the document
	 * text for errors. First delete all markers and then repaint the errors
	 * again.
	 */
	public void markErrors() {
		/** delete old errorMarkers */
		try {
			file.deleteMarkers(ERROR_MARKER_ID, false, IResource.DEPTH_ZERO);
		} catch (CoreException e) {
			// not critical, will be deleted next time called
		}
		/** remark all errorMarkers */
		// test mark the current Document, from start to position 50
		// TODO implement method when Compiler front-end is created

		Map<String, Object> map = new HashMap<String, Object>();
		List<Exception> errors = CompilerAccess.getDefault().getExceptions();
		for(Exception error:errors)
		{
			RecognitionException recognitionException = new RecognitionException();
			String errorMessage = "";
			if(error instanceof MismatchedTreeNodeException)
			{
				//TODO specific Exception Stuff here like, Error Message
				recognitionException = (MismatchedTreeNodeException) error;
				System.out.println(error);
				errorMessage = "MismatchedTreeNode at " + recognitionException.line + ":" + recognitionException.charPositionInLine;
			}
			else if(error instanceof NoViableAltException)
			{
				//TODO specific Exception Stuff here like, Error Message
				recognitionException = (NoViableAltException) error;
		 		errorMessage = "No alternative given at " + (recognitionException.line) + ":" + recognitionException.charPositionInLine;
				
			}
			else if(error instanceof RecognitionException)
			{
				recognitionException = (RecognitionException) error;
			}
			else
			{
				System.out.println("NEW ERROR" +error);
				continue;
			}
			MarkerUtilities.setLineNumber(map,recognitionException.line);
			MarkerUtilities.setMessage(map, errorMessage);
//			map.put(IMarker.MESSAGE, errorMessage);
			int offset = -1;
			try {
				 offset = document.getLineOffset(recognitionException.line-1) + recognitionException.charPositionInLine;
			} catch (BadLocationException e1) {
				continue;
			}
			MarkerUtilities.setLineNumber(map, recognitionException.line-1);
			MarkerUtilities.setCharStart(map, offset);
			MarkerUtilities.setCharEnd(map, offset+1);
			map.put(IMarker.SEVERITY, new Integer(IMarker.SEVERITY_ERROR));
			map.put(IMarker.LOCATION, file.getFullPath().toString());
			try {
				MarkerUtilities.createMarker(file, map, ERROR_MARKER_ID);
			} catch (CoreException e) {
				//ignore Error
			}
			
		}
		
	}

}
