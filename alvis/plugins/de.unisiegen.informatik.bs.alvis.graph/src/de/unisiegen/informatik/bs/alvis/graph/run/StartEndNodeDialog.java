/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.graph.run;

import java.io.File;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;


/**
 * @author simon
 *
 */
public class StartEndNodeDialog extends Dialog {

	protected StartEndNodeDialog(Shell parentShell) {
		super(parentShell);
	       Composite composite = (Composite) super.createDialogArea(parentShell);
	       Button but = new Button(composite,0);
	       but.setText("Hallo ich bin James");
		System.out.println("Dialog!");
	}

	protected void SaySomething() {
		System.out.println("Hey!");
	}
	

	private FieldEditorPreferencePage page;
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		  
		Button but = new Button(composite,0);
		but.setText("Hallo ich bin James");
		page = new FieldEditorPreferencePage(FieldEditorPreferencePage.GRID) {
			protected void createFieldEditors() {
				// TODO Methode um die Start und endknoten zu setzten
			}
		};
		
		page.createControl(composite);
		Control pageControl = page.getControl();
		pageControl.setLayoutData(new GridData(GridData.FILL_BOTH));
		return pageControl;
	}
	
	public int open() {
		super.open();
		return 0;
		
	}

}
