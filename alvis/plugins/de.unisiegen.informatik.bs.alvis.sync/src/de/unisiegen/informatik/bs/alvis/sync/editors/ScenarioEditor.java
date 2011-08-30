package de.unisiegen.informatik.bs.alvis.sync.editors;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;
import de.unisiegen.informatik.bs.alvis.sync.Activator;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisScenario;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisSemaphore;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisSerialize;
import de.unisiegen.informatik.bs.alvis.sync.newwizards.NewPrimitiveWizard;
import de.unisiegen.informatik.bs.alvis.sync.newwizards.NewSemaphoreWizard;

public class ScenarioEditor extends EditorPart implements
		PropertyChangeListener, IExportItem {

	public AlvisScenario scenario;
	private Composite container;
	private static IEditorInput myInput;
	private String myInputFilePath;
	private boolean dirty;
	public static List primitivesList, semaphoresList, conditionsList, actorsList;

	private static ArrayList semaphores;

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

	public void setDirty(boolean dirty) {
		this.dirty = dirty;
		if (!dirty) {
			// undoAdmin.setActualAsUndirty();
		}
		firePropertyChange(IEditorPart.PROP_DIRTY);

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

		container = new Composite(parent, SWT.NULL);

		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;

		FillLayout fill = new FillLayout();
		Group primitives = new Group(container, SWT.NULL);
		primitives.setText(Messages.ScenarioEditor_Primitives);
		Group semaphores = new Group(container, SWT.NULL);
		semaphores.setText(Messages.ScenarioEditor_Semaphores);
		Group conditions = new Group(container, SWT.NULL);
		conditions.setText(Messages.ScenarioEditor_Conditions);
		Group actors = new Group(container, SWT.NULL);
		actors.setText(Messages.ScenarioEditor_Actors);
		primitives.setLayout(fill);
		semaphores.setLayout(fill);
		conditions.setLayout(fill);
		actors.setLayout(fill);
		fill.type = SWT.VERTICAL;

		primitivesList = new List(primitives, SWT.MULTI | SWT.V_SCROLL);
		semaphoresList = new List(semaphores, SWT.MULTI | SWT.V_SCROLL);
		conditionsList = new List(conditions, SWT.MULTI | SWT.V_SCROLL);
		actorsList = new List(actors, SWT.MULTI | SWT.V_SCROLL);
		for (int i = 0; i < 5; i++) {
			primitivesList.add("                                        ");
		}
		for (int i = 0; i < 5; i++) {
			semaphoresList.add("                                        ");
		}
		for (int i = 0; i < 5; i++) {
			conditionsList.add("                                        ");
		}
		for (int i = 0; i < 5; i++) {
			actorsList.add("                                        ");
		}

		Composite primitivesButtons = new Composite(primitives, SWT.NULL);
		Composite semaphoresButtons = new Composite(semaphores, SWT.NULL);
		Composite conditionsButtons = new Composite(conditions, SWT.NULL);
		Composite actorsButtons = new Composite(actors, SWT.NULL);
		FillLayout fillButtons = new FillLayout();
		primitivesButtons.setLayout(fillButtons);
		semaphoresButtons.setLayout(fillButtons);
		conditionsButtons.setLayout(fillButtons);
		actorsButtons.setLayout(fillButtons);
		fillButtons.type = SWT.HORIZONTAL;

		Button addPrimitive = new Button(primitivesButtons, SWT.PUSH);
		addPrimitive.setText(Messages.ScenarioEditor_Add);
		Button delPrimitive = new Button(primitivesButtons, SWT.PUSH);
		delPrimitive.setText(Messages.ScenarioEditor_Delete);

		Button addSemaphore = new Button(semaphoresButtons, SWT.PUSH);
		addSemaphore.setText(Messages.ScenarioEditor_Add);
		Button delSemaphore = new Button(semaphoresButtons, SWT.PUSH);
		delSemaphore.setText(Messages.ScenarioEditor_Delete);

		Button addCondition = new Button(conditionsButtons, SWT.PUSH);
		addCondition.setText(Messages.ScenarioEditor_Add);
		Button delCondition = new Button(conditionsButtons, SWT.PUSH);
		delCondition.setText(Messages.ScenarioEditor_Delete);

		Button addActor = new Button(actorsButtons, SWT.PUSH);
		addActor.setText(Messages.ScenarioEditor_Add);
		Button delActor = new Button(actorsButtons, SWT.PUSH);
		delActor.setText(Messages.ScenarioEditor_Delete);

		Button hasBuffer = new Button(container, SWT.CHECK);
		hasBuffer.setText(Messages.ScenarioEditor_Buffer);

		Button hasOutput = new Button(container, SWT.CHECK);
		hasOutput.setText(Messages.ScenarioEditor_Output);

		addPrimitive.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				NewPrimitiveWizard w = new NewPrimitiveWizard();
				WizardDialog d = new WizardDialog(Activator.getDefault()
						.getWorkbench().getActiveWorkbenchWindow().getShell(),
						w);
				IWorkbench workbench = Activator.getDefault().getWorkbench();
				ISelection selection = Activator.getDefault().getWorkbench()
						.getActiveWorkbenchWindow().getSelectionService()
						.getSelection();
				if (selection instanceof IStructuredSelection) {
					w.init(workbench, (IStructuredSelection) selection);
				} else {
					w.init(workbench, null);
				}
				d.open();
			}
		});
		delPrimitive.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				int selected[] = primitivesList.getSelectionIndices();
				for (int i = 0; i < selected.length; i++) {
					primitivesList.remove(selected[i]);
					// TODO: Remove primitives from scenario
				}

			}
		});

		addSemaphore.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				NewSemaphoreWizard w = new NewSemaphoreWizard();
				WizardDialog d = new WizardDialog(Activator.getDefault()
						.getWorkbench().getActiveWorkbenchWindow().getShell(),
						w);
				IWorkbench workbench = Activator.getDefault().getWorkbench();
				ISelection selection = Activator.getDefault().getWorkbench()
						.getActiveWorkbenchWindow().getSelectionService()
						.getSelection();
				if (selection instanceof IStructuredSelection) {
					w.init(workbench, (IStructuredSelection) selection);
				} else {
					w.init(workbench, null);
				}
				d.open();
			}
		});
		delSemaphore.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				int selected[] = semaphoresList.getSelectionIndices();
				for (int i = 0; i < selected.length; i++) {
					semaphoresList.remove(selected[i]);
					// TODO: Remove semaphore from scenario
				}
			}
		});

		delCondition.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				int selected[] = conditionsList.getSelectionIndices();
				for (int i = 0; i < selected.length; i++) {
					conditionsList.remove(selected[i]);
					// TODO: Remove condition from scenario
				}
			}
		});

		delActor.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				int selected[] = actorsList.getSelectionIndices();
				for (int i = 0; i < selected.length; i++) {
					actorsList.remove(selected[i]);
					// TODO: Remove actor from scenario
				}
			}
		});
		parent.pack();
		primitivesList.removeAll();
		semaphoresList.removeAll();
		conditionsList.removeAll();
		actorsList.removeAll();
	}

//	public void newSemaphore(String name, int count) {
//		AlvisSemaphore s = scenario.addSemaphore(s)
//	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
