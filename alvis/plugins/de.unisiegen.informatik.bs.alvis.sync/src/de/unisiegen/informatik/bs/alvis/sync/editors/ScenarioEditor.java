package de.unisiegen.informatik.bs.alvis.sync.editors;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.core.runtime.IProgressMonitor;
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
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;
import de.unisiegen.informatik.bs.alvis.sync.Activator;
import de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations.AlvisScenario;
import de.unisiegen.informatik.bs.alvis.sync.newwizards.NewSemaphoreWizard;

public class ScenarioEditor extends EditorPart implements
		PropertyChangeListener, IExportItem {

	public AlvisScenario scenario;
	private Composite container;
	private static IEditorInput myInput;
	private String myInputFilePath;
	private boolean dirty;

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
		// TODO Auto-generated method stub

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

		final List primitivesList = new List(primitives, SWT.MULTI
				| SWT.V_SCROLL);
		final List semaphoresList = new List(semaphores, SWT.MULTI
				| SWT.V_SCROLL);
		final List conditionsList = new List(conditions, SWT.MULTI
				| SWT.V_SCROLL);
		final List actorsList = new List(actors, SWT.MULTI | SWT.V_SCROLL);
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

		addSemaphore.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				NewSemaphoreWizard w = new NewSemaphoreWizard();
				WizardDialog d = new WizardDialog(Activator.getDefault()
						.getWorkbench().getActiveWorkbenchWindow().getShell(),
						w);
				d.open();
			}
		});
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
