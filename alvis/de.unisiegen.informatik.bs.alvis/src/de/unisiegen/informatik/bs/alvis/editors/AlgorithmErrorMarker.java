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
	@SuppressWarnings("unused")
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
			if(error instanceof MismatchedTreeNodeException)
			{
				//TODO specific Exception Stuff here like, Error Message
				recognitionException = (MismatchedTreeNodeException) error;
			}
			else if(error instanceof NoViableAltException)
			{
				//TODO specific Exception Stuff here like, Error Message
				recognitionException = (NoViableAltException) error;
			}
			else if(error instanceof RecognitionException)
			{
				recognitionException = (RecognitionException) error;
			}
			else
			{
				System.out.println(recognitionException.getClass().getSimpleName());
				System.out.println("Line: " + recognitionException.line + " Offeset: " + recognitionException.charPositionInLine);
				continue;
			}
			MarkerUtilities.setLineNumber(map,recognitionException.line);
			MarkerUtilities.setMessage(map, recognitionException.getLocalizedMessage());
			System.out.println(recognitionException.c + " / " + recognitionException.charPositionInLine);
			MarkerUtilities.setCharStart(map, recognitionException.c);
			MarkerUtilities.setCharEnd(map, (recognitionException.charPositionInLine+1));
			map.put(IMarker.SEVERITY, new Integer(IMarker.SEVERITY_ERROR));
			map.put(IMarker.LOCATION, file.getFullPath().toString());
			try {
				MarkerUtilities.createMarker(file, map, ERROR_MARKER_ID);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
//		MarkerUtilities.setLineNumber(map, 5);
//		// document will be used to get the offset of the Error eg.
//		document.getLength();
//		MarkerUtilities.setMessage(map, "Test Error Message");
//		map.put(IMarker.LOCATION, file.getFullPath().toString());
//		Integer charStart = 0;
//		if (charStart != null)
//			map.put(IMarker.CHAR_START, charStart);
//		Integer charEnd = 50;
//		if (charEnd != null)
//			map.put(IMarker.CHAR_END, charEnd);
//
//		map.put(IMarker.SEVERITY, new Integer(IMarker.SEVERITY_ERROR));
//
//		try {
//			MarkerUtilities.createMarker(file, map, ERROR_MARKER_ID);
//		} catch (CoreException ee) {
//			// same like deleting, not critical
//		}
	}

}
