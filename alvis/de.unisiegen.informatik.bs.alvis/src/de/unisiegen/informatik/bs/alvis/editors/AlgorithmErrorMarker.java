/**
 *
 */
package de.unisiegen.informatik.bs.alvis.editors;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.texteditor.MarkerUtilities;

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
		MarkerUtilities.setLineNumber(map, 5);
		// document will be used to get the offset of the Error eg.
		document.getLength();
		MarkerUtilities.setMessage(map, "Test Error Message");
		map.put(IMarker.LOCATION, file.getFullPath().toString());
		Integer charStart = 0;
		if (charStart != null)
			map.put(IMarker.CHAR_START, charStart);
		Integer charEnd = 50;
		if (charEnd != null)
			map.put(IMarker.CHAR_END, charEnd);

		map.put(IMarker.SEVERITY, new Integer(IMarker.SEVERITY_ERROR));

		try {
			MarkerUtilities.createMarker(file, map, ERROR_MARKER_ID);
		} catch (CoreException ee) {
			// same like deleting, not critical
		}
	}

}
