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
/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package de.unisiegen.informatik.bs.alvis.editors;


import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.source.IVerticalRulerInfo;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.texteditor.AbstractRulerActionDelegate;
import org.eclipse.ui.texteditor.ITextEditor;

/**
 * Create ruler breakpoint toggle actions
 */
public class ManageBreakpointRulerActionDelegate extends AbstractRulerActionDelegate {

	private ManageBreakpointRulerAction targetAction;
	private IEditorPart activeEditor;
	
	/** {@inheritDoc} */
	protected IAction createAction(ITextEditor editor, IVerticalRulerInfo rulerInfo) {
		targetAction = new ManageBreakpointRulerAction(rulerInfo, editor);
		return targetAction;
	}

	/** {@inheritDoc} */
	public void setActiveEditor(IAction callerAction, IEditorPart targetEditor) {
		if (activeEditor != null) {
			if (targetAction != null) {
				targetAction.dispose();
				targetAction = null;
			}
		}
		activeEditor = targetEditor;
		super.setActiveEditor(callerAction, targetEditor);
	}
	
	/** {@inheritDoc} */
	public void mouseDoubleClick(MouseEvent e) {
		targetAction.run();
	}
}