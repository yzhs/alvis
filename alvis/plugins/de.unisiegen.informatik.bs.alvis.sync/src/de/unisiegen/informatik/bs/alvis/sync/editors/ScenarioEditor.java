package de.unisiegen.informatik.bs.alvis.sync.editors;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisSave;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisScenario;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisSerialize;

public class ScenarioEditor extends EditorPart implements
		PropertyChangeListener, IExportItem {

	private String myInputFilePath;
	private Composite myParent;
	private static IEditorInput myInput;
	
	public ScenarioEditor() {
	}

	public static AlvisScenario scenario;
//	private Composite container;
//	private static IEditorInput myInput;
//	private String myInputFilePath;
	public static List primitivesList, semaphoresList, conditionsList,
			threadsList;
	private boolean dirty = false;
	public static ScenarioEditor edit;

	private void createScenario(Composite parent, IEditorInput input) {
		scenario = new AlvisScenario(parent);

		if (myInput instanceof FileEditorInput) {
			FileEditorInput fileInput = (FileEditorInput) myInput;
			myInputFilePath = fileInput.getPath().toString();
			AlvisSerialize seri = (AlvisSerialize) deserialize(myInputFilePath);
			if (seri != null)
				new AlvisSave(scenario, seri);
		}
		doSave(null);
	}
	
	public Composite createEditor(Composite parent, IEditorInput input) {
		myParent = parent;
		myInput = input;
		
		myParent.setLayout(new FillLayout());
		createScenario(myParent, myInput);
		
		return myParent;
	}
	
	public static Object deserialize(String filename) {
		long filesize = new File(filename).length();
		Object seri = null;
		if (filesize > 7) {// TODO this is not so cool check it (SIMON)

			BufferedInputStream fis = null;
			XStream xstream = new XStream(new DomDriver());

			try {
				fis = new BufferedInputStream(new FileInputStream(filename));

				seri = xstream.fromXML(fis);
				fis.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return seri;
	}

	public void checkDirty() {
		if (!((AlvisSerialize) deserialize(myInputFilePath)).equals(scenario
				.getAdmin().serialize())) {
			setDirty(true);
		}
	}
	
	public void setDirty(boolean dirty) {
		this.dirty = dirty;
//		if (!dirty) {
//			undoAdmin.setActualAsUndirty();
//		}
		firePropertyChange(IEditorPart.PROP_DIRTY);
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getSourceCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRun() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		if (myInputFilePath == null)
			myInputFilePath = ((FileEditorInput) myInput).getPath().toString();
		XStream xstream = new XStream(new DomDriver());
		BufferedOutputStream fos;
		try {
			AlvisSerialize seri = scenario.getAdmin().serialize();
			fos = new BufferedOutputStream(
					new FileOutputStream(myInputFilePath));
			fos.write(xstream.toXML(seri).getBytes());
			fos.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		setDirty(false);
	}
	
	public void clearScenario() {
		MessageBox sure = new MessageBox(scenario.getMyDisplay().getActiveShell(), SWT.ICON_WARNING
				| SWT.YES | SWT.NO);
		sure.setMessage(Messages.ScenarioEditor_resetAll);

		if (sure.open() == SWT.YES) {
			scenario.resetContent();
//			undoAdmin.clearUndos();
//			undoAdmin.clearRedos();
			checkDirty();
		}
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		setPartName(input.getName());
		myInput = input;
		myInputFilePath = ((FileEditorInput) input).getPath().toString();
	}

	@Override
	public boolean isDirty() {
		return dirty;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		
		myParent = new Composite(parent, SWT.NONE);
		createEditor(myParent, myInput);
		edit = this;
	}

	// public void newSemaphore(String name, int count) {
	// AlvisSemaphore s = scenario.addSemaphore(s)
	// }

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
