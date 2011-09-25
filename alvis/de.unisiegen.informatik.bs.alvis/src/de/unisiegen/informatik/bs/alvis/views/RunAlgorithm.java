package de.unisiegen.informatik.bs.alvis.views;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.PartPane;
import org.eclipse.ui.internal.PartSite;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ViewPart;

import de.uni_siegen.informatik.bs.alvic.TLexer;
import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.editors.AlgorithmEditor;
import de.unisiegen.informatik.bs.alvis.tools.IO;

/**
 * package de.unisiegen.informatik.bs.alvis.views;
 * 
 * import java.beans.PropertyChangeEvent;
 * 
 * /**
 * 
 * @author simon
 * 
 */
public class RunAlgorithm extends ViewPart implements PropertyChangeListener {

	public static final String ID = "de.unisiegen.informatik.bs.alvis.views.run.algorithm";
	public static StyledText text;
	public static AlgorithmContainer myAlgorithm;

	/**
	 * 
	 */
	public RunAlgorithm() {
		myAlgorithm = new AlgorithmContainer();
		Activator.getDefault().setActiveRunAlgorithm(this);
	}

	@Override
	public void createPartControl(Composite parent) {

		/** Getting IFile */

		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		IPath p = new Path(Activator.getDefault().getActiveRun()
				.getAlgorithmFile());
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IFile iFile = (IFile) workspaceRoot.findMember(p);

		/** ENDOF Getting IFile */
		IEditorDescriptor editorDescriptor = PlatformUI.getWorkbench()
				.getEditorRegistry().getDefaultEditor(iFile.getName());
		
		
		String extension = Activator.getDefault().getActiveRun()
				.getAlgorithmFile();
		extension = extension.split("\\.")[extension.split("\\.").length - 1];
		// If the algorithm is of type "java", we don't provide a algorithm view
		// TODO: @Second Alvis group: Find a way to display an algorithm, if a java-Algorithm is given.
		if (!extension.equals("java"))
			try {
				/** open Editor with received File */
				IEditorPart editor = page.openEditor(
						new FileEditorInput(iFile), editorDescriptor.getId());

				/** get StyledText from Widget if it's an AlgorithmEditor */
				if (editor.getClass().getSimpleName().equals("AlgorithmEditor")) {
					AlgorithmEditor algorithmEditor = (AlgorithmEditor) editor;
					RowLayout rowLayout = new RowLayout();
					rowLayout.type = SWT.VERTICAL;
					parent.setLayout(new GridLayout(1, false));

					text = new StyledText(parent, SWT.MULTI | SWT.BORDER
							| SWT.V_SCROLL | SWT.H_SCROLL);
					StyledText editorText = algorithmEditor.getTextWidget();

					/** start copy styled Text */
					text.setText(editorText.getText());
					text.setStyleRanges(editorText.getStyleRanges());
					/** ENDOF copy styled Text */

					/** close Editor */
					PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage().closeEditor(editor, false);
					/** minimize Editor Area */

					text.setParent(parent);
					text.setEditable(false);
					text.setFont(new Font(null, "Courier New", 12, SWT.NORMAL));
					text.setBackground(new Color(null, 255, 255, 255));

					Activator.getDefault().getAlgorithmContainer()
							.addPropertyChangeListener(this);

					GridData gridData = new GridData();
					gridData.horizontalAlignment = SWT.FILL;
					gridData.verticalAlignment = SWT.FILL;
					gridData.grabExcessHorizontalSpace = true;
					gridData.grabExcessVerticalSpace = true;
					text.setLayoutData(gridData);

				}
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		// TODO correct this please , it's just temporary nothing better
		// found
		/*PartPane currentEditorPartPane = */((PartSite) PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor()
				.getSite()).getPane().getStack().setMinimized(true);
//		currentEditorPartPane.getStack().setMinimized(true);
	}

	@Override
	public void setFocus() {
	}

	@Override
	public void propertyChange(final PropertyChangeEvent event) {
		final Color orange = new Color(null, 240, 200, 120);
		final Color yellow = new Color(null, 255, 255, 150);
		try {
			if (event.getPropertyName().equals("ADD_BP"))
				text.getDisplay().syncExec(new Runnable() {
					public void run() {
						if (text.getLineCount() > (Integer) event.getNewValue())
							text.setLineBackground(
									(Integer) event.getNewValue(), 1, orange);
					}
				});
			if (event.getPropertyName().equals("ADD_DP"))
				text.getDisplay().syncExec(new Runnable() {
					public void run() {
						if (text.getLineCount() > (Integer) event.getNewValue())
							text.setLineBackground(
									(Integer) event.getNewValue(), 1, yellow);
					}
				});

			if (event.getPropertyName().equals("REMOVE_LINE"))
				text.getDisplay().syncExec(new Runnable() {
					public void run() {
						if (text.getLineCount() > (Integer) event.getNewValue())
							text.setLineBackground(
									(Integer) event.getOldValue(), 1, null);
					}
				});

			if (event.getPropertyName().equals("REMOVE_LINE_ALL")) {
				text.getDisplay().syncExec(new Runnable() {
					public void run() {
						for (int i = 0; i < text.getLineCount(); i++)
							text.setLineBackground(i, 1, null);
					}
				});

			}
		} catch (IllegalArgumentException e) {
			// The line to highlight did not exist.
			// We do not do anything
		}
		// System.out.println(event.getPropertyName());
		// System.out.println(event.getNewValue());
		// System.out.println(event.getOldValue());
	}
	
	public StyledText getStyledText(){
		return RunAlgorithm.text;
	}

}
