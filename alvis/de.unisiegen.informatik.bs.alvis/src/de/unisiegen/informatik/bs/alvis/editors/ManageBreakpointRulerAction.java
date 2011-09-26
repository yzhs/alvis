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

import de.unisiegen.informatik.bs.alvis.editors.AlvisLineBreakpointAdapter;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.text.source.IVerticalRulerInfo;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;

/**
 * Toggle breakpoints action
 */
public class ManageBreakpointRulerAction extends Action {	
	
	private IVerticalRulerInfo fRuler;
	private ITextEditor fTextEditor;
	private AlvisLineBreakpointAdapter fAlvisLineBreakpointAdapter = new AlvisLineBreakpointAdapter();

	/**
	 * Create the action
	 * @param ruler the ruler
	 * @param editor the editor
	 */
	public ManageBreakpointRulerAction(IVerticalRulerInfo ruler, ITextEditor editor) {
		super();
		fRuler= ruler;
		fTextEditor= editor;
	}
	
	/**
	 * Disposes this action
	 */
	public void dispose() {
		fTextEditor = null;
		fRuler = null;
	}
		
	/**
	 * Returns this action's vertical ruler info.
	 *
	 * @return this action's vertical ruler
	 */
	protected IVerticalRulerInfo getVerticalRulerInfo() {
		return fRuler;
	}
	
	/**
	 * Returns this action's editor.
	 *
	 * @return this action's editor
	 */
	protected ITextEditor getTextEditor() {
		return fTextEditor;
	}
	
	/**
	 * Returns the <code>IDocument</code> of the editor's input.
	 *
	 * @return the document of the editor's input
	 */
	protected IDocument getDocument() {
		IDocumentProvider provider= fTextEditor.getDocumentProvider();
		return provider.getDocument(fTextEditor.getEditorInput());
	}
	
	/** {@inheritDoc} */
	public void run() {
		try {
			IDocument document = getDocument();
			int lineNumber= getVerticalRulerInfo().getLineOfLastMouseButtonActivity();
			if (lineNumber >= document.getNumberOfLines()) {
				return;
			}
			try {
				IRegion line= document.getLineInformation(lineNumber);
				ITextSelection selection = new TextSelection(document, line.getOffset(), line.getLength());
				fAlvisLineBreakpointAdapter.toggleLineBreakpoints(fTextEditor, selection);
			} catch (BadLocationException e) {
				//likely document is folded so you cannot get the line information of the folded line
			}
			
		} catch (CoreException e) {
			// TODO ERROR DIALOG
		}
	}		
	
}