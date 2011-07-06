/**
 * 
 */
package org.xtext.example.mydsl1.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.xtext.ui.editor.XtextEditor;

/**
 * @author Eduard Boos
 *
 */
public class AlgorithmEditor extends XtextEditor {

	public AlgorithmEditor()
	{
		super();
//		getTextWidge().setFont(new Font(null, "Courier New", 14, SWT.NORMAL));
	}
	public StyledText getTextWidge()
	{
		return getSourceViewer().getTextWidget();
	}
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		super.doSave(progressMonitor);
	}
	public void setFontSize(int size)
	{
		getTextWidge().setFont(new Font(null, "Courier New", 20, SWT.NORMAL));
	}

}
