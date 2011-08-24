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

import de.uni_siegen.informatik.bs.alvic.*;
import de.unisiegen.informatik.bs.alvis.compiler.CompilerAccess;
import de.unisiegen.informatik.bs.alvis.io.logger.Logger;

/**
 * This class is for marking the given Document and File with Errors that occurs
 * parsing the document.
 * 
 * @author Eduard Boos
 */
public class AlgorithmErrorMarker {
	private IFile file;
	private IDocument document;
	public static final String ERROR_MARKER_ID = "de.unisiegen.informatik.bs.alvis.markers.AlgorithmErrorMarker"; //$NON-NLS-1$

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
	 * Mark the errors in the file/document. This method will parse the document
	 * text for errors. First delete all markers and then repaint the errors
	 * again.
	 */
	public void markErrors() {
		/* delete old errorMarkers */
		try {
			file.deleteMarkers(ERROR_MARKER_ID, false, IResource.DEPTH_ZERO);
		} catch (CoreException e) {
			Logger.getInstance().log("Editor->AlgorithmErrorMarker", Logger.ERROR, "Error marking caused an CoreException: \n"+ e.getLocalizedMessage()); //$NON-NLS-1$ //$NON-NLS-2$
		}
		/* remark all errorMarkers */
		Map<String, Object> map = new HashMap<String, Object>();
		List<RecognitionException> errors = CompilerAccess.getDefault().getExceptions();
		for(RecognitionException error : errors) {
			String errorMessage;
			System.err.println(error.toString());
			if (error instanceof TypeException)
				errorMessage = error.toString();
			else if (error instanceof MismatchedTreeNodeException) {
				// This case should not happen. If control flow gets here
				// something is wrong with the compiler.
				MismatchedTreeNodeException re = (MismatchedTreeNodeException)error;
				error.printStackTrace();
				errorMessage = "MismatchedTreeNode at " + re.line + ":" + re.charPositionInLine + ": " + error;
			} else if (error instanceof NoViableAltException) {
				NoViableAltException re = (NoViableAltException)error;
				errorMessage = "No alternative given at " + re.line + ":" + re.charPositionInLine;
			} else {
				System.out.println("UNKNOWN ERROR at " + error.line + ":" + error.charPositionInLine + ": " + error);
				continue;
			}

			TypeException re = null;
			if (error instanceof TypeException) {
				re = (TypeException) error;
			}

			MarkerUtilities.setLineNumber(map, error.line);
			MarkerUtilities.setMessage(map, errorMessage);
			// map.put(IMarker.MESSAGE, errorMessage);
			int lineOffset;
			try {
				lineOffset = document.getLineOffset(error.line - 1);
			} catch (BadLocationException e1) {
				continue;
			}

			MarkerUtilities.setLineNumber(map, error.line - 1);
			MarkerUtilities.setCharStart(map, lineOffset
					+ error.charPositionInLine);
			MarkerUtilities.setCharEnd(map, lineOffset
					+ (null != re ? re.endCharPositionInLine : 0) + 1);
			map.put(IMarker.SEVERITY, new Integer(IMarker.SEVERITY_ERROR));
			map.put(IMarker.LOCATION, file.getFullPath().toString());
			try {
				MarkerUtilities.createMarker(file, map, ERROR_MARKER_ID);
			} catch (CoreException e) {
				Logger.getInstance().log("Editor->AlgorithmErrorMarker", Logger.ERROR, "Error marking caused an CoreException: \n"+ e.getLocalizedMessage()); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}
	}

}
