/**
 * <small>
 * <p><i>Copyright (C) 2005 Torsten Juergeleit, 
 * All rights reserved. </i></p>
 * 
 * <p>USE OF THIS CONTENT IS GOVERNED BY THE TERMS AND CONDITIONS OF THIS
 * AGREEMENT AND/OR THE TERMS AND CONDITIONS OF LICENSE AGREEMENTS OR NOTICES
 * INDICATED OR REFERENCED BELOW. BY USING THE CONTENT, YOU AGREE THAT YOUR USE
 * OF THE CONTENT IS GOVERNED BY THIS AGREEMENT AND/OR THE TERMS AND CONDITIONS
 * OF ANY APPLICABLE LICENSE AGREEMENTS OR NOTICES INDICATED OR REFERENCED
 * BELOW. IF YOU DO NOT AGREE TO THE TERMS AND CONDITIONS OF THIS AGREEMENT AND
 * THE TERMS AND CONDITIONS OF ANY APPLICABLE LICENSE AGREEMENTS OR NOTICES
 * INDICATED OR REFERENCED BELOW, THEN YOU MAY NOT USE THE CONTENT.</p>
 * 
 * <p>This Content is Copyright (C) 2005 Torsten Juergeleit, 
 * and is provided to you under the terms and conditions of the Common Public 
 * License Version 1.0 ("CPL"). A copy of the CPL is provided with this Content 
 * and is also available at 
 *     <a href="http://www.eclipse.org/legal/cpl-v10.html">
 *         http://www.eclipse.org/legal/cpl-v10.html </a>.
 * 
 * For purposes of the CPL, "Program" will mean the Content.</p>
 * 
 * <p>Content includes, but is not limited to, source code, object code,
 * documentation and any other files in this distribution.</p>
 * 
 * </small>
 */
package de.unisiegen.informatik.bs.alvis.editors;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget;
import org.eclipse.jdt.debug.core.JDIDebugModel;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Adapter to create breakpoints.
 */
public class AlvisLineBreakpointAdapter implements IToggleBreakpointsTarget {
	/** {@inheritDoc} */
	public void toggleLineBreakpoints(IWorkbenchPart part, ISelection selection)
			throws CoreException {
		IEditorPart editorPart = getEditorPart(part);
		if (editorPart != null) {
			IResource resource = (IResource) editorPart.getEditorInput()
					.getAdapter(IResource.class);
			ITextSelection textSelection = (ITextSelection) selection;
			int lineNumber = textSelection.getStartLine();
			IBreakpoint[] breakpoints = DebugPlugin.getDefault()
					.getBreakpointManager().getBreakpoints();
			for (int i = 0; i < breakpoints.length; i++) {
				IBreakpoint breakpoint = breakpoints[i];
				if (resource.equals(breakpoint.getMarker().getResource())) {
					if (((ILineBreakpoint) breakpoint).getLineNumber() == (lineNumber + 1)) {
						AlgorithmEditor sym = (AlgorithmEditor) editorPart;
						String lineText = sym.getTextWidget().getLine(
								lineNumber);
						if (lineText.endsWith(";")) {
							String newLine = lineText.substring(0,
									lineText.length() - 1);
							newLine = newLine.concat(new String(","));
							int chars = 0;
							for (int n = 0; n <= sym.getTextWidget()
									.getLineCount(); n++) {
								if (lineText.equals(sym.getTextWidget()
										.getLine(n)))
									break;
								chars += sym.getTextWidget().getLine(n)
										.length() + 1;
							}
							sym.getTextWidget().replaceTextRange(chars,
									newLine.length(), newLine);
							// remove
							breakpoint.delete();
							return; // done with toggle -- removed it
						}
					}
				}
			}

			AlgorithmEditor sym = (AlgorithmEditor) editorPart;
			String lineText = sym.getTextWidget().getLine(lineNumber);
			if (lineText.endsWith(",")) {
				String newLine = lineText.substring(0, lineText.length() - 1);
				newLine = newLine.concat(new String(";"));
				int chars = 0;
				for (int n = 0; n <= sym.getTextWidget().getLineCount(); n++) {
					if (lineText.equals(sym.getTextWidget().getLine(n)))
						break;
					chars += sym.getTextWidget().getLine(n).length() + 1;
				}
				sym.getTextWidget().replaceTextRange(chars, newLine.length(),
						newLine);

				// didn't remove one, so we must be adding one
				// create line breakpoint
				JDIDebugModel.createStratumBreakpoint(resource, "G",
						resource.getName(), null, null, lineNumber + 1, -1, -1,
						0, true, null);
			}
		}
	}

	/** {@inheritDoc} */
	public boolean canToggleLineBreakpoints(IWorkbenchPart part,
			ISelection selection) {
		return getEditorPart(part) != null;
	}

	/**
	 * Convert an adaptable to an edit part
	 * 
	 * @param adaptableObject
	 *            the adaptable
	 * @return the editor
	 */
	public static IEditorPart getEditorPart(Object adaptableObject) {
		if (adaptableObject instanceof IEditorPart) {
			IEditorPart editorPart = (IEditorPart) adaptableObject;
			IResource resource = (IResource) editorPart.getEditorInput()
					.getAdapter(IResource.class);
			if (resource != null) {
				String extension = resource.getFileExtension();
				if (extension != null && extension.equals("algo")) {
					return editorPart;
				}
			}
		}
		return null;
	}

	// TODO Add method breakpoints and watchpoints!
	/** {@inheritDoc} */
	public void toggleMethodBreakpoints(IWorkbenchPart part,
			ISelection selection) throws CoreException {
		// method breakpoints are not currently supported
	}

	/** {@inheritDoc} */
	public boolean canToggleMethodBreakpoints(IWorkbenchPart part,
			ISelection selection) {
		// method breakpoints are not currently supported
		return false;
	}

	/** {@inheritDoc} */
	public void toggleWatchpoints(IWorkbenchPart part, ISelection selection)
			throws CoreException {
		// watchpoints are not currently supported
	}

	/** {@inheritDoc} */
	public boolean canToggleWatchpoints(IWorkbenchPart part,
			ISelection selection) {
		// watchpoints are not currently supported
		return false;
	}
}