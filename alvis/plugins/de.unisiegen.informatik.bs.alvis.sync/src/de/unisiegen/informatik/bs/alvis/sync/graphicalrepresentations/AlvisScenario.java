package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import java.util.ArrayList;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import de.unisiegen.informatik.bs.alvis.sync.editors.ScenarioEditor;
import de.unisiegen.informatik.bs.alvis.sync.newwizards.NewActorWizard;
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
	private ArrayList<AlvisActor> actorsList;
	private AlvisBuffer buffer;
	private AlvisOutput output;
	public static AlvisScenario scenario;
	private ScrolledComposite primitivesScroll, semaphoresScroll,
			conditionsScroll, actorsScroll;
	private AlvisSave admin;

	public AlvisScenario(Composite parent) {
		admin = new AlvisSave();
		primitivesList = new ArrayList<AlvisPrimitive>();
		semaphoresList = new ArrayList<AlvisSemaphore>();
		conditionsList = new ArrayList<AlvisCondition>();
		actorsList = new ArrayList<AlvisActor>();
		buffer = null;
		output = null;
		scenario = this;
		myParent = parent;
		myDisplay = myParent.getDisplay();
		Composite container = new Composite(myParent, SWT.NULL);
		container.setLayout(null);

		Group primitives = new Group(container, SWT.NONE);
		primitives.setBounds(5, 5, 192, 294);
		primitives.setText("Primitives");

		primitivesScroll = new ScrolledComposite(primitives, SWT.BORDER
				| SWT.H_SCROLL | SWT.V_SCROLL);
		primitivesScroll.setBounds(10, 30, 180, 230);
		primitivesScroll.setExpandHorizontal(true);
		primitivesScroll.setExpandVertical(true);
		primitivesScroll.setLayout(new FillLayout(SWT.VERTICAL));

		Button primAdd = new Button(primitives, SWT.NONE);
		primAdd.setBounds(10, 266, 90, 26);
		primAdd.setText("Add");
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
		primDel.setText("Delete");

		Group semaphores = new Group(container, SWT.NONE);
		semaphores.setBounds(202, 5, 194, 294);
		semaphores.setText("Semaphores");

		semaphoresScroll = new ScrolledComposite(semaphores, SWT.BORDER
				| SWT.H_SCROLL | SWT.V_SCROLL);
		semaphoresScroll.setBounds(12, 30, 180, 230);
		semaphoresScroll.setExpandHorizontal(true);
		semaphoresScroll.setExpandVertical(true);

		Button semaAdd = new Button(semaphores, SWT.NONE);
		semaAdd.setText("Add");
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
		semaDel.setText("Delete");
		semaDel.setBounds(108, 266, 82, 26);

		Group conditions = new Group(container, SWT.NONE);
		conditions.setBounds(401, 5, 194, 294);
		conditions.setText("Conditions");

		conditionsScroll = new ScrolledComposite(conditions, SWT.BORDER
				| SWT.H_SCROLL | SWT.V_SCROLL);
		conditionsScroll.setBounds(10, 30, 182, 230);
		conditionsScroll.setExpandHorizontal(true);
		conditionsScroll.setExpandVertical(true);

		Button condAdd = new Button(conditions, SWT.NONE);
		condAdd.setText("Add");
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
		condDel.setText("Delete");
		condDel.setBounds(106, 266, 82, 26);

		Group actors = new Group(container, SWT.NONE);
		actors.setBounds(604, 5, 190, 294);
		actors.setText("Actors");

		actorsScroll = new ScrolledComposite(actors, SWT.BORDER | SWT.H_SCROLL
				| SWT.V_SCROLL);
		actorsScroll.setLocation(10, 30);
		actorsScroll.setSize(178, 230);
		actorsScroll.setExpandHorizontal(true);
		actorsScroll.setExpandVertical(true);

		Button actAdd = new Button(actors, SWT.NONE);
		actAdd.setText("Add");
		actAdd.setBounds(10, 266, 90, 26);
		actAdd.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				NewActorWizard w = new NewActorWizard();
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

		Button actDel = new Button(actors, SWT.NONE);
		actDel.setText("Delete");
		actDel.setBounds(106, 266, 82, 26);

		final Button needBuffer = new Button(container, SWT.CHECK);
		needBuffer.setBounds(15, 322, 164, 23);
		needBuffer.setText("Scenario needs buffer");

		final Button needOutput = new Button(container, SWT.CHECK);
		needOutput.setBounds(15, 350, 169, 23);
		needOutput.setText("Scenario needs output");

		final Group grpBuffer = new Group(container, SWT.NONE);
		grpBuffer.setBounds(202, 305, 198, 244);
		grpBuffer.setText("Buffer");
		grpBuffer.setVisible(false);

		final Group grpOutput = new Group(container, SWT.NONE);
		grpOutput.setText("Output");
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
					AlvisOutput o = new AlvisOutput(scenario, "");
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
		// myDisplay = myParent.getDisplay();
		// GridLayout layout = new GridLayout();
		// myParent.setLayout(layout);
		// layout.numColumns = 2;
		// FillLayout fillSema = new FillLayout(SWT.VERTICAL);
		// FillLayout fillCond = new FillLayout(SWT.VERTICAL);
		// FillLayout fillAct = new FillLayout(SWT.VERTICAL);
		// Group primitives = new Group(container, SWT.NULL);
		// primitives.setText(Messages.ScenarioEditor_Primitives);
		// Group semaphores = new Group(container, SWT.NULL);
		// semaphores.setText(Messages.ScenarioEditor_Semaphores);
		// Group conditions = new Group(container, SWT.NULL);
		// conditions.setText(Messages.ScenarioEditor_Conditions);
		// Group actors = new Group(container, SWT.NULL);
		// actors.setText(Messages.ScenarioEditor_Actors);
		// semaphores.setLayout(fillSema);
		// conditions.setLayout(fillCond);
		// actors.setLayout(fillAct);
		// semaphoresList = new List(semaphores, SWT.MULTI | SWT.V_SCROLL);
		// conditionsList = new List(conditions, SWT.MULTI | SWT.V_SCROLL);
		// actorsList = new List(actors, SWT.MULTI | SWT.V_SCROLL);
		// for (int i = 0; i < 5; i++) {
		// primitivesList.add("                                        ");
		// }
		// for (int i = 0; i < 5; i++) {
		// semaphoresList.add("                                        ");
		// }
		// for (int i = 0; i < 5; i++) {
		// conditionsList.add("                                        ");
		// }
		// for (int i = 0; i < 5; i++) {
		// actorsList.add("                                        ");
		// }
		// Composite primitivesButtons = new Composite(primitives, SWT.NULL);
		// Composite semaphoresButtons = new Composite(semaphores, SWT.NULL);
		// Composite conditionsButtons = new Composite(conditions, SWT.NULL);
		// Composite actorsButtons = new Composite(actors, SWT.NULL);
		// FillLayout fillButtonsPrim = new FillLayout(SWT.HORIZONTAL);
		// FillLayout fillButtonsSema = new FillLayout(SWT.HORIZONTAL);
		// FillLayout fillButtonsCond = new FillLayout(SWT.HORIZONTAL);
		// FillLayout fillButtonsAct = new FillLayout(SWT.HORIZONTAL);
		// primitivesButtons.setLayout(fillButtonsPrim);
		// semaphoresButtons.setLayout(fillButtonsSema);
		// conditionsButtons.setLayout(fillButtonsCond);
		// actorsButtons.setLayout(fillButtonsAct);
		//
		// Button addPrimitive = new Button(semaphoresButtons, SWT.PUSH);
		// addPrimitive.setText(Messages.ScenarioEditor_Add);
		// Button delPrimitive = new Button(semaphoresButtons, SWT.PUSH);
		// delPrimitive.setText(Messages.ScenarioEditor_Delete);
		//
		// Button addSemaphore = new Button(semaphoresButtons, SWT.PUSH);
		// addSemaphore.setText(Messages.ScenarioEditor_Add);
		// Button delSemaphore = new Button(semaphoresButtons, SWT.PUSH);
		// delSemaphore.setText(Messages.ScenarioEditor_Delete);
		//
		// Button addCondition = new Button(conditionsButtons, SWT.PUSH);
		// addCondition.setText(Messages.ScenarioEditor_Add);
		// Button delCondition = new Button(conditionsButtons, SWT.PUSH);
		// delCondition.setText(Messages.ScenarioEditor_Delete);
		//
		// Button addActor = new Button(actorsButtons, SWT.PUSH);
		// addActor.setText(Messages.ScenarioEditor_Add);
		// Button delActor = new Button(actorsButtons, SWT.PUSH);
		// delActor.setText(Messages.ScenarioEditor_Delete);
		//
		// Button hasBuffer = new Button(myParent, SWT.CHECK);
		// hasBuffer.setText(Messages.ScenarioEditor_Buffer);
		//
		// Button hasOutput = new Button(myParent, SWT.CHECK);
		// hasOutput.setText(Messages.ScenarioEditor_Output);
		//
		// addPrimitive.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event e) {
		// NewPrimitiveWizard w = new NewPrimitiveWizard();
		// WizardDialog d = new WizardDialog(Activator.getDefault()
		// .getWorkbench().getActiveWorkbenchWindow().getShell(),
		// w);
		// IWorkbench workbench = Activator.getDefault().getWorkbench();
		// ISelection selection = Activator.getDefault().getWorkbench()
		// .getActiveWorkbenchWindow().getSelectionService()
		// .getSelection();
		// if (selection instanceof IStructuredSelection) {
		// w.init(workbench, (IStructuredSelection) selection);
		// } else {
		// w.init(workbench, null);
		// }
		// d.open();
		// // checkDirty();
		// }
		// });
		// delSemaphore.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event e) {
		// int selected[] = semaphoresList.getSelectionIndices();
		// for (int i = 0; i < selected.length; i++) {
		// semaphoresList.remove(selected[i]);
		// // TODO: Remove semaphore from scenario
		// }
		// }
		// });
		//
		// addSemaphore.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event e) {
		// NewSemaphoreWizard w = new NewSemaphoreWizard();
		// WizardDialog d = new WizardDialog(Activator.getDefault()
		// .getWorkbench().getActiveWorkbenchWindow().getShell(),
		// w);
		// IWorkbench workbench = Activator.getDefault().getWorkbench();
		// ISelection selection = Activator.getDefault().getWorkbench()
		// .getActiveWorkbenchWindow().getSelectionService()
		// .getSelection();
		// if (selection instanceof IStructuredSelection) {
		// w.init(workbench, (IStructuredSelection) selection);
		// } else {
		// w.init(workbench, null);
		// }
		// d.open();
		// // checkDirty();
		// }
		// });
		// delSemaphore.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event e) {
		// int selected[] = semaphoresList.getSelectionIndices();
		// for (int i = 0; i < selected.length; i++) {
		// semaphoresList.remove(selected[i]);
		// // TODO: Remove semaphore from scenario
		// }
		// }
		// });
		//
		// addCondition.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event e) {
		// NewConditionWizard w = new NewConditionWizard();
		// WizardDialog d = new WizardDialog(Activator.getDefault()
		// .getWorkbench().getActiveWorkbenchWindow().getShell(),
		// w);
		// IWorkbench workbench = Activator.getDefault().getWorkbench();
		// ISelection selection = Activator.getDefault().getWorkbench()
		// .getActiveWorkbenchWindow().getSelectionService()
		// .getSelection();
		// if (selection instanceof IStructuredSelection) {
		// w.init(workbench, (IStructuredSelection) selection);
		// } else {
		// w.init(workbench, null);
		// }
		// d.open();
		// }
		// });
		// delCondition.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event e) {
		// int selected[] = conditionsList.getSelectionIndices();
		// for (int i = 0; i < selected.length; i++) {
		// conditionsList.remove(selected[i]);
		// // TODO: Remove condition from scenario
		// }
		// }
		// });
		//
		// delActor.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event e) {
		// int selected[] = actorsList.getSelectionIndices();
		// for (int i = 0; i < selected.length; i++) {
		// actorsList.remove(selected[i]);
		// // TODO: Remove actor from scenario
		// }
		// }
		// });
		// parent.pack();
		// primitivesList.removeAll();
		// semaphoresList.removeAll();
		// conditionsList.removeAll();
		// actorsList.removeAll();
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

	public ArrayList<AlvisActor> getActorsList() {
		return actorsList;
	}

	public void setActorsList(ArrayList<AlvisActor> actorsList) {
		this.actorsList = actorsList;
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

	public ScrolledComposite getActorsScroll() {
		return actorsScroll;
	}

	public void setActorsScroll(ScrolledComposite actorsScroll) {
		this.actorsScroll = actorsScroll;
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
	
	public void addActor(AlvisActor a) {
		actorsList.add(a);
		admin.addActor(a);
		a.getlName().setParent(actorsScroll);
	}
	
	public void removeActor(AlvisActor a) {
		actorsList.remove(a);
		admin.removeActor(a);
		a.getlName().dispose();
	}

	public void resetContent() {
		ScenarioEditor.actorsList.removeAll();
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
