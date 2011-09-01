package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import java.util.ArrayList;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;

import de.unisiegen.informatik.bs.alvis.sync.Activator;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationScenario;
import de.unisiegen.informatik.bs.alvis.sync.dialogs.DeleteConditionDialog;
import de.unisiegen.informatik.bs.alvis.sync.dialogs.DeletePrimitiveDialog;
import de.unisiegen.informatik.bs.alvis.sync.dialogs.DeleteSemaphoreDialog;
import de.unisiegen.informatik.bs.alvis.sync.dialogs.DeleteThreadDialog;
import de.unisiegen.informatik.bs.alvis.sync.editors.ScenarioEditor;
import de.unisiegen.informatik.bs.alvis.sync.newwizards.NewThreadWizard;
import de.unisiegen.informatik.bs.alvis.sync.newwizards.NewBufferWizard;
import de.unisiegen.informatik.bs.alvis.sync.newwizards.NewConditionWizard;
import de.unisiegen.informatik.bs.alvis.sync.newwizards.NewPrimitiveWizard;
import de.unisiegen.informatik.bs.alvis.sync.newwizards.NewSemaphoreWizard;

import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.ui.IWorkbench;

public class AlvisScenario implements GraphicalRepresentationScenario, Listener {

	private Composite myParent;
	private Display myDisplay;
	private ArrayList<AlvisPrimitive> primitivesList;
	private ArrayList<AlvisSemaphore> semaphoresList;
	private ArrayList<AlvisCondition> conditionsList;
	private ArrayList<AlvisThread> threadsList;
	private AlvisBuffer buffer;
	private AlvisOutput output;
	public static AlvisScenario scenario;
	private ScrolledComposite primitivesScroll, semaphoresScroll,
			conditionsScroll, threadsScroll;
	private AlvisSave admin;

	public AlvisScenario(Composite parent) {
		admin = new AlvisSave();
		primitivesList = new ArrayList<AlvisPrimitive>();
		semaphoresList = new ArrayList<AlvisSemaphore>();
		conditionsList = new ArrayList<AlvisCondition>();
		threadsList = new ArrayList<AlvisThread>();
		buffer = null;
		output = null;
		scenario = this;
		myParent = parent;
		myDisplay = myParent.getDisplay();
		Composite container = new Composite(myParent, SWT.NULL);
		container.setLayout(null);

		Group primitives = new Group(container, SWT.NONE);
		primitives.setBounds(5, 5, 192, 294);
		primitives.setText(Messages.AlvisScenario_primitives);

		primitivesScroll = new ScrolledComposite(primitives, SWT.BORDER
				| SWT.H_SCROLL | SWT.V_SCROLL);
		primitivesScroll.setBounds(10, 30, 180, 230);
		primitivesScroll.setExpandHorizontal(true);
		primitivesScroll.setExpandVertical(true);
		primitivesScroll.setLayout(new FillLayout(SWT.VERTICAL));

		Button primAdd = new Button(primitives, SWT.NONE);
		primAdd.setBounds(10, 266, 90, 26);
		primAdd.setText(Messages.AlvisScenario_add);
		primAdd.addListener(SWT.Selection, new Listener() {
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
				ScenarioEditor.edit.checkDirty();
			}
		});

		Button primDel = new Button(primitives, SWT.NONE);
		primDel.setBounds(106, 266, 82, 26);
		primDel.setText(Messages.AlvisScenario_delete);
		primDel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				ApplicationWindow window = new DeletePrimitiveDialog(null);
			    window.setBlockOnOpen(true);
			    window.open();
			}
		});

		Group semaphores = new Group(container, SWT.NONE);
		semaphores.setBounds(202, 5, 194, 294);
		semaphores.setText(Messages.AlvisScenario_semaphores);

		semaphoresScroll = new ScrolledComposite(semaphores, SWT.BORDER
				| SWT.H_SCROLL | SWT.V_SCROLL);
		semaphoresScroll.setBounds(12, 30, 180, 230);
		semaphoresScroll.setExpandHorizontal(true);
		semaphoresScroll.setExpandVertical(true);

		Button semaAdd = new Button(semaphores, SWT.NONE);
		semaAdd.setText(Messages.AlvisScenario_delete);
		semaAdd.setBounds(12, 266, 90, 26);
		semaAdd.addListener(SWT.Selection, new Listener() {
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
				ScenarioEditor.edit.checkDirty();
			}
		});

		Button semaDel = new Button(semaphores, SWT.NONE);
		semaDel.setText(Messages.AlvisScenario_delete);
		semaDel.setBounds(108, 266, 82, 26);
		semaDel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				ApplicationWindow window = new DeleteSemaphoreDialog(null);
			    window.setBlockOnOpen(true);
			    window.open();
			}
		});

		Group conditions = new Group(container, SWT.NONE);
		conditions.setBounds(401, 5, 194, 294);
		conditions.setText(Messages.AlvisScenario_conditions);

		conditionsScroll = new ScrolledComposite(conditions, SWT.BORDER
				| SWT.H_SCROLL | SWT.V_SCROLL);
		conditionsScroll.setBounds(10, 30, 182, 230);
		conditionsScroll.setExpandHorizontal(true);
		conditionsScroll.setExpandVertical(true);

		Button condAdd = new Button(conditions, SWT.NONE);
		condAdd.setText(Messages.AlvisScenario_add);
		condAdd.setBounds(10, 266, 90, 26);
		condAdd.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				NewConditionWizard w = new NewConditionWizard();
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
				ScenarioEditor.edit.checkDirty();
			}
		});

		Button condDel = new Button(conditions, SWT.NONE);
		condDel.setText(Messages.AlvisScenario_delete);
		condDel.setBounds(106, 266, 82, 26);
		condDel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				ApplicationWindow window = new DeleteConditionDialog(null);
			    window.setBlockOnOpen(true);
			    window.open();
			}
		});

		Group threads = new Group(container, SWT.NONE);
		threads.setBounds(604, 5, 190, 294);
		threads.setText(Messages.AlvisScenario_threads);

		threadsScroll = new ScrolledComposite(threads, SWT.BORDER | SWT.H_SCROLL
				| SWT.V_SCROLL);
		threadsScroll.setLocation(10, 30);
		threadsScroll.setSize(178, 230);
		threadsScroll.setExpandHorizontal(true);
		threadsScroll.setExpandVertical(true);

		Button threadAdd = new Button(threads, SWT.NONE);
		threadAdd.setText(Messages.AlvisScenario_add);
		threadAdd.setBounds(10, 266, 90, 26);
		threadAdd.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				NewThreadWizard w = new NewThreadWizard();
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
				ScenarioEditor.edit.checkDirty();
			}
		});

		Button threadDel = new Button(threads, SWT.NONE);
		threadDel.setText(Messages.AlvisScenario_add);
		threadDel.setBounds(106, 266, 82, 26);
		threadDel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				ApplicationWindow window = new DeleteThreadDialog(null);
			    window.setBlockOnOpen(true);
			    window.open();
			}
		});

		final Button needBuffer = new Button(container, SWT.CHECK);
		needBuffer.setBounds(15, 322, 164, 23);
		needBuffer.setText(Messages.AlvisScenario_needBuffer);

		final Button needOutput = new Button(container, SWT.CHECK);
		needOutput.setBounds(15, 350, 169, 23);
		needOutput.setText(Messages.AlvisScenario_needOutput);

		final Group grpBuffer = new Group(container, SWT.NONE);
		grpBuffer.setBounds(202, 305, 198, 244);
		grpBuffer.setText(Messages.AlvisScenario_buffer);
		grpBuffer.setVisible(false);

		final Group grpOutput = new Group(container, SWT.NONE);
		grpOutput.setText(Messages.AlvisScenario_output);
		grpOutput.setBounds(411, 305, 184, 244);
		grpOutput.setVisible(false);

		needBuffer.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if (needBuffer.getSelection()) {
					NewBufferWizard w = new NewBufferWizard();
					WizardDialog d = new WizardDialog(Activator.getDefault()
							.getWorkbench().getActiveWorkbenchWindow()
							.getShell(), w);
					IWorkbench workbench = Activator.getDefault()
							.getWorkbench();
					ISelection selection = Activator.getDefault()
							.getWorkbench().getActiveWorkbenchWindow()
							.getSelectionService().getSelection();
					if (selection instanceof IStructuredSelection) {
						w.init(workbench, (IStructuredSelection) selection);
					} else {
						w.init(workbench, null);
					}
					d.open();
				} else {
					setBuffer(null);
					admin.setBuffer(null);
				}
				ScenarioEditor.edit.checkDirty();
				grpBuffer.setVisible(needBuffer.getSelection());
			}
		});

		needOutput.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if (needOutput.getSelection()) {
					AlvisOutput o = new AlvisOutput(scenario, ""); //$NON-NLS-1$
					setOutput(o);
					admin.setOutput(o);
				} else {
					setOutput(null);
					admin.setOutput(null);
				}
				ScenarioEditor.edit.checkDirty();
				grpOutput.setVisible(needOutput.getSelection());
			}
		});
	}

	public AlvisSave getAdmin() {
		return admin;
	}

	public void setAdmin(AlvisSave admin) {
		this.admin = admin;
	}

	public ArrayList<AlvisPrimitive> getPrimitivesList() {
		return primitivesList;
	}

	public void setPrimitivesList(ArrayList<AlvisPrimitive> primitivesList) {
		this.primitivesList = primitivesList;
	}

	public ArrayList<AlvisSemaphore> getSemaphoresList() {
		return semaphoresList;
	}

	public void setSemaphoresList(ArrayList<AlvisSemaphore> semaphoresList) {
		this.semaphoresList = semaphoresList;
	}

	public ArrayList<AlvisCondition> getConditionsList() {
		return conditionsList;
	}

	public void setConditionsList(ArrayList<AlvisCondition> conditionsList) {
		this.conditionsList = conditionsList;
	}

	public ArrayList<AlvisThread> getThreadsList() {
		return threadsList;
	}

	public void setThreadsList(ArrayList<AlvisThread> threadsList) {
		this.threadsList = threadsList;
	}

	public Display getMyDisplay() {
		return myDisplay;
	}

	public void setMyDisplay(Display myDisplay) {
		this.myDisplay = myDisplay;
	}

	public ScrolledComposite getPrimitivesScroll() {
		return primitivesScroll;
	}

	public void setPrimitivesScroll(ScrolledComposite primitivesScroll) {
		this.primitivesScroll = primitivesScroll;
	}

	public ScrolledComposite getSemaphoresScroll() {
		return semaphoresScroll;
	}

	public void setSemaphoresScroll(ScrolledComposite semaphoresScroll) {
		this.semaphoresScroll = semaphoresScroll;
	}

	public ScrolledComposite getConditionsScroll() {
		return conditionsScroll;
	}

	public void setConditionsScroll(ScrolledComposite conditionsScroll) {
		this.conditionsScroll = conditionsScroll;
	}

	public ScrolledComposite getThreadsScroll() {
		return threadsScroll;
	}

	public void setThreadsScroll(ScrolledComposite threadsScroll) {
		this.threadsScroll = threadsScroll;
	}

	public AlvisBuffer getBuffer() {
		return buffer;
	}

	public void setBuffer(AlvisBuffer buffer) {
		this.buffer = buffer;
	}

	public AlvisOutput getOutput() {
		return output;
	}

	public void setOutput(AlvisOutput output) {
		this.output = output;
	}
	
	public void addPrimitive(AlvisPrimitive p) {
		primitivesList.add(p);
		admin.addPrimitive(p);
		p.getLabel().setParent(primitivesScroll);
	}
	
	public void removePrimitive(AlvisPrimitive p) {
		primitivesList.remove(p);
		admin.removePrimitive(p);
		p.getLabel().dispose();
	}
	
	public void addSemaphore(AlvisSemaphore s) {
		semaphoresList.add(s);
		admin.addSemaphore(s);
		s.getLabel().setParent(semaphoresScroll);
	}
	
	public void removeSemaphore(AlvisSemaphore s) {
		semaphoresList.remove(s);
		admin.removeSemaphore(s);
		s.getLabel().dispose();
	}
	
	public void addCondition(AlvisCondition c) {
		conditionsList.add(c);
		admin.addCondition(c);
		c.getLabel().setParent(conditionsScroll);
	}
	
	public void removeCondition(AlvisCondition c) {
		conditionsList.remove(c);
		admin.removeCondition(c);
		c.getLabel().dispose();
	}
	
	public void addThread(AlvisThread a) {
		threadsList.add(a);
		admin.addThread(a);
		a.getlName().setParent(threadsScroll);
	}
	
	public void removeThread(AlvisThread a) {
		threadsList.remove(a);
		admin.removeThread(a);
		a.getlName().dispose();
	}

	public void resetContent() {
		ScenarioEditor.threadsList.removeAll();
		ScenarioEditor.semaphoresList.removeAll();
		ScenarioEditor.conditionsList.removeAll();
		ScenarioEditor.primitivesList.removeAll();
		admin = new AlvisSave();
	}

	@Override
	public void handleEvent(Event event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void hasVariables() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hasBuffer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hasOutput() {
		// TODO Auto-generated method stub

	}
}
