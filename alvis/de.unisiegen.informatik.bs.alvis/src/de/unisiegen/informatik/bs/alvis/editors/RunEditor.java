package de.unisiegen.informatik.bs.alvis.editors;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.Run;
import de.unisiegen.informatik.bs.alvis.commands.RunCompile;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IRunPreferences;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.tools.IO;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;

import org.eclipse.osgi.util.NLS;

/**
 * Editor to edit the run preferences Note: This class has been made with
 * (google)WindowBuilder Eclipse Plugin
 * 
 * @author simon
 */
public class RunEditor extends EditorPart implements IExportItem {
	public RunEditor() {
	}

	private Run myRun;
	private String myInputFilePath;
	private Boolean myDirty;
	private Text myAlgorithmFile;
	private Text myExampleFile;
	private Composite composite_1;
	private ExpandBar expandBar;
	private ExpandItem xpndtmExample;
	private Group grpExampleFile;
	private ExpandItem xpndtmRun;
	private Group grpStartTheRun;
	private ExpandItem xpndtmAlgorithm;
	private Group grpAlgorithmFile;

	@Override
	public void doSave(final IProgressMonitor monitor) {
		myRun.setAlgorithmFile(myAlgorithmFile.getText());
		myRun.setExampleFile(myExampleFile.getText());
		XStream xstream = new XStream(new DomDriver());
		BufferedOutputStream fos;
		try {
			fos = new BufferedOutputStream(
					new FileOutputStream(myInputFilePath));
			fos.write(xstream.toXML(myRun).getBytes());
			fos.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		checkDirty();
	}

	/**
	 * isSaveAsAllowed? Currently not!
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	/**
	 * Save the Graph as... Currently not allowed
	 */
	@Override
	public void doSaveAs() {
	}

	/**
	 * Initial Method.
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		setPartName(input.getName());
		FileEditorInput fileInput = (FileEditorInput) input;
		myInputFilePath = fileInput.getPath().toString();
		myRun = loadRun();
		checkDirty();
	}

	@Override
	public boolean isDirty() {
		return myDirty;
	}

	/**
	 * Loads the run at myInputFilePath
	 * 
	 * @return deserialized Run
	 */
	private Run loadRun() {
		Run tempRun = null;

		tempRun = (Run) IO.deserialize(myInputFilePath);

		if (tempRun == null)
			tempRun = new Run();
		return tempRun;
	}

	/**
	 * Has something changed?
	 */
	private void checkDirty() {
		if (!loadRun().equals(myRun)) {
			setDirty(true);
		} else
			setDirty(false);
	}

	/**
	 * Sets the current state of dirty firesPropertyChange
	 * 
	 * @param b
	 *            the state of dirty
	 */
	private void setDirty(boolean b) {
		this.myDirty = b;
		firePropertyChange(PROP_DIRTY);
	}

	// TODO diese Arraylist wird durch den button Preferences mit datentypen für
	// die VM gefüllt. nachschauen, was damit passieren kann.
	private ArrayList<PCObject> pseudoCodeObjects;

	private EStartPoint myStartPoint = EStartPoint.RAND;
	private EDecisionPoint myDecisionPoint = EDecisionPoint.RAND;
	private EBreakPoint myBreakPoint = EBreakPoint.STOP;

	private boolean myLimitSteps = true;

	@Override
	public void createPartControl(Composite parent) {

		composite_1 = new Composite(parent, SWT.NONE);
		composite_1
				.setFont(SWTResourceManager.getFont("Calibri", 10, SWT.BOLD)); //$NON-NLS-1$
		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));

		expandBar = new ExpandBar(composite_1, SWT.NONE);
		expandBar
				.setFont(SWTResourceManager.getFont("Calibri", 10, SWT.NORMAL)); //$NON-NLS-1$
		expandBar.setSpacing(10);
		expandBar
				.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		expandBar.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		xpndtmAlgorithm = new ExpandItem(expandBar, SWT.NONE);
		xpndtmAlgorithm.setExpanded(true);
		xpndtmAlgorithm.setText(Messages.RunEditor_2);

		grpAlgorithmFile = new Group(expandBar, SWT.NONE);
		xpndtmAlgorithm.setControl(grpAlgorithmFile);
		grpAlgorithmFile.setText(Messages.RunEditor_3);
		grpAlgorithmFile.setLayout(new GridLayout(3, false));
		myAlgorithmFile = new Text(grpAlgorithmFile, SWT.NONE);
		myAlgorithmFile.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 1, 1));
		myAlgorithmFile.setToolTipText(Messages.RunEditor_4);

		Button btnselectAlgorithmFile = new Button(grpAlgorithmFile, SWT.NONE);
		btnselectAlgorithmFile.setToolTipText(Messages.RunEditor_5);
		btnselectAlgorithmFile.setText(Messages.RunEditor_6);

		Button btnOpenEditorAlgorithm = new Button(grpAlgorithmFile, SWT.NONE);
		btnOpenEditorAlgorithm.setToolTipText(Messages.RunEditor_btnOpenEditorAlgorithm_toolTipText);
		btnOpenEditorAlgorithm.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (myAlgorithmFile.getText().equals(""))
					return;
				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
				File file = new File("/" + myAlgorithmFile.getText());
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				IPath location = Path.fromOSString(file.getAbsolutePath());
				IFile iFile = workspace.getRoot().getFile(location);
				// end of getting IFile
				IEditorDescriptor desc = PlatformUI.getWorkbench()
						.getEditorRegistry().getDefaultEditor(file.getName());
				try {
					System.out.println(iFile.getFullPath());
					IEditorPart editor = page.openEditor(new FileEditorInput(
							iFile), desc.getId());
				} catch (PartInitException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnOpenEditorAlgorithm.setImage(ImageCache
				.getImage("icons/runeditor/box_open.png")); //$NON-NLS-1$
		btnselectAlgorithmFile.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
						PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getShell(), new WorkbenchLabelProvider(),
						new BaseWorkbenchContentProvider());
				dialog.setTitle(Messages.RunEditor_7);
				dialog.setMessage(Messages.RunEditor_8);
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				dialog.open();
				if (dialog.getResult() != null) {
					String result = ""; //$NON-NLS-1$
					for (Object o : dialog.getResult())
						result = o.toString();
					if (result.startsWith("L") & result.endsWith("algo")) { //$NON-NLS-1$ //$NON-NLS-2$
						result = result.substring(2); // cut the first two chars
						myAlgorithmFile.setText(result);
						setDirty(true);
					}
				}
			}
		});

		myAlgorithmFile.addVerifyListener(new VerifyListener() {
			@Override
			public void verifyText(VerifyEvent e) {
				if (myAlgorithmFile.getText() != "") {
					myRun.setAlgorithmFile(myAlgorithmFile.getText());
					checkDirty();
				}

			}
		});
		xpndtmAlgorithm.setHeight(xpndtmAlgorithm.getControl().computeSize(
				SWT.DEFAULT, SWT.DEFAULT).y);

		xpndtmExample = new ExpandItem(expandBar, SWT.NONE);
		xpndtmExample.setExpanded(true);
		xpndtmExample.setText(Messages.RunEditor_12);

		grpExampleFile = new Group(expandBar, SWT.SHADOW_OUT);
		grpExampleFile.setText(Messages.RunEditor_13);
		xpndtmExample.setControl(grpExampleFile);
		grpExampleFile.setLayout(new GridLayout(3, false));
		myExampleFile = new Text(grpExampleFile, SWT.NONE);
		myExampleFile.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 1, 1));
		myExampleFile.setToolTipText(Messages.RunEditor_14);

		Button btnSelectExampleFile = new Button(grpExampleFile, SWT.NONE);
		btnSelectExampleFile.setToolTipText(Messages.RunEditor_15);
		btnSelectExampleFile.setText(Messages.RunEditor_16);

		Button btnOpenExample = new Button(grpExampleFile, SWT.NONE);
		btnOpenExample.setToolTipText(Messages.RunEditor_btnOpenExample_toolTipText);
		btnOpenExample.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if (myExampleFile.getText().equals(""))
					return;

				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
				File file = new File("/" + myExampleFile.getText());
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				IPath location = Path.fromOSString(file.getAbsolutePath());
				IFile iFile = workspace.getRoot().getFile(location);
				// end of getting IFile
				IEditorDescriptor desc = PlatformUI.getWorkbench()
						.getEditorRegistry().getDefaultEditor(file.getName());
				try {
					System.out.println(iFile.getFullPath());
					IEditorPart editor = page.openEditor(new FileEditorInput(
							iFile), desc.getId());
				} catch (PartInitException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnOpenExample.setImage(ImageCache
				.getImage("icons/runeditor/box_open.png")); //$NON-NLS-1$
		btnSelectExampleFile.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
						PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getShell(), new WorkbenchLabelProvider(),
						new BaseWorkbenchContentProvider());
				dialog.setTitle(Messages.RunEditor_17);
				dialog.setMessage(NLS.bind(Messages.RunEditor_18, Activator.getDefault().getFileExtensionsAsCommaSeparatedList()));
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				dialog.open();
				if (dialog.getResult() != null) {
					String result = ""; //$NON-NLS-1$
					for (Object o : dialog.getResult())
						result = o.toString();
					if (result.startsWith("L") & result.endsWith("graph")) { //$NON-NLS-1$ //$NON-NLS-2$
						result = result.substring(2); // cut the first two chars
						myExampleFile.setText(result);
						setDirty(true);
					}
				}
			}
		});

		myExampleFile.addVerifyListener(new VerifyListener() {
			@Override
			public void verifyText(VerifyEvent e) {
				if (myExampleFile.getText() != "") {
					myRun.setExampleFile(myExampleFile.getText());
					checkDirty();
				}
			}
		});
		xpndtmExample.setHeight(xpndtmExample.getControl().computeSize(
				SWT.DEFAULT, SWT.DEFAULT).y);

		xpndtmRun = new ExpandItem(expandBar, SWT.NONE);
		xpndtmRun.setExpanded(true);
		xpndtmRun.setText(Messages.RunEditor_22);

		grpStartTheRun = new Group(expandBar, SWT.NONE);
		grpStartTheRun.setText(Messages.RunEditor_23);
		xpndtmRun.setControl(grpStartTheRun);
		grpStartTheRun.setLayout(new FillLayout(SWT.HORIZONTAL));

		Button run = new Button(grpStartTheRun, SWT.CENTER);
		run.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		run.setToolTipText(Messages.RunEditor_24);
		run.setImage(ImageCache.getImage("icons/extension/ext_run.png")); //$NON-NLS-1$
		run.setFont(SWTResourceManager.getFont("Calibri", 14, SWT.NORMAL)); //$NON-NLS-1$
		run.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				try {
					// Compile the PCode in the algorithm file and set the run
					// as activeRun in the activator
					new RunCompile().execute(null);
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
			}
		});
		xpndtmRun.setHeight(xpndtmRun.getControl().computeSize(SWT.DEFAULT,
				SWT.DEFAULT).y);

		ExpandItem xpndtmSettings = new ExpandItem(expandBar, SWT.NONE);
		xpndtmSettings.setExpanded(true);
		xpndtmSettings.setText(Messages.RunEditor_27);

		TabFolder tabFolder = new TabFolder(expandBar, SWT.NONE);
		xpndtmSettings.setControl(tabFolder);

		TabItem tbtmRun = new TabItem(tabFolder, SWT.NONE);
		tbtmRun.setText(Messages.RunEditor_28);

		Group grpRun = new Group(tabFolder, SWT.NONE);
		tbtmRun.setControl(grpRun);
		grpRun.setText(Messages.RunEditor_29);

		/*
		 * This section asks the plugins for parameters to add to the run.
		 */
		pseudoCodeObjects = new ArrayList<PCObject>();
		grpRun.setLayout(new GridLayout(3, false));

		Label lblNewLabel = new Label(grpRun, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 3, 1));
		lblNewLabel
				.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD)); //$NON-NLS-1$
		lblNewLabel.setText(Messages.RunEditor_31);

		Button btn_startpoint_rand = new Button(grpRun, SWT.RADIO);
		btn_startpoint_rand.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO STARTPOINT_RAND
				myStartPoint = EStartPoint.RAND;
				myRun.setOnStartPoint(myStartPoint);
				checkDirty();
			}
		});
		btn_startpoint_rand.setFont(SWTResourceManager.getFont(
				"Segoe UI", 9, SWT.BOLD)); //$NON-NLS-1$
		btn_startpoint_rand.setText(Messages.RunEditor_33);

		Label lblLetThe_1 = new Label(grpRun, SWT.NONE);
		lblLetThe_1.setText(Messages.RunEditor_34);
		new Label(grpRun, SWT.NONE);

		Button btn_startpoint_decide = new Button(grpRun, SWT.RADIO);
		btn_startpoint_decide.setFont(SWTResourceManager.getFont(
				Messages.RunEditor_35, 9, SWT.BOLD));
		btn_startpoint_decide.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO STARTPOINT_DECIDE
				myStartPoint = EStartPoint.DECIDE;
				myRun.setOnStartPoint(myStartPoint);
				checkDirty();
			}
		});
		btn_startpoint_decide.setText(Messages.RunEditor_36);

		Label lblSetThe = new Label(grpRun, SWT.NONE);
		lblSetThe.setText(Messages.RunEditor_37);
		new Label(grpRun, SWT.NONE);

		TabItem tbtmDecisionPoint = new TabItem(tabFolder, SWT.NONE);
		tbtmDecisionPoint.setText(Messages.RunEditor_44);

		Group grpDecisionPointSettings = new Group(tabFolder, SWT.NONE);
		tbtmDecisionPoint.setControl(grpDecisionPointSettings);
		grpDecisionPointSettings.setText(Messages.RunEditor_45);
		grpDecisionPointSettings.setLayout(new GridLayout(2, false));

		Label lblHowDoYou = new Label(grpDecisionPointSettings, SWT.NONE);
		lblHowDoYou
				.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD)); //$NON-NLS-1$
		lblHowDoYou.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 2, 1));
		lblHowDoYou.setText(Messages.RunEditor_47);

		Button btn_decisionpoint_rand = new Button(grpDecisionPointSettings,
				SWT.RADIO);
		btn_decisionpoint_rand.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO DECISIONPOINT_RAND
				myDecisionPoint = EDecisionPoint.RAND;
				myRun.setOnDecisionPoint(myDecisionPoint);
				checkDirty();
			}
		});
		btn_decisionpoint_rand.setFont(SWTResourceManager.getFont(
				"Segoe UI", 9, SWT.BOLD)); //$NON-NLS-1$
		btn_decisionpoint_rand.setToolTipText(Messages.RunEditor_49);
		btn_decisionpoint_rand.setText(Messages.RunEditor_50);

		Label lblLetThe = new Label(grpDecisionPointSettings, SWT.NONE);
		lblLetThe.setText(Messages.RunEditor_51);

		Button btn_decisionpoint_once = new Button(grpDecisionPointSettings,
				SWT.RADIO);
		btn_decisionpoint_once.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO DECISIONPOINT_ONCE
				myDecisionPoint = EDecisionPoint.ONCE;
				myRun.setOnDecisionPoint(myDecisionPoint);
				checkDirty();
			}
		});
		btn_decisionpoint_once.setFont(SWTResourceManager.getFont(
				"Segoe UI", 9, SWT.BOLD)); //$NON-NLS-1$
		btn_decisionpoint_once.setToolTipText(Messages.RunEditor_53);
		btn_decisionpoint_once.setText(Messages.RunEditor_54);

		Label lblChooseAn = new Label(grpDecisionPointSettings, SWT.NONE);
		lblChooseAn.setText(Messages.RunEditor_55);

		Button btn_decisionpoint_always = new Button(grpDecisionPointSettings,
				SWT.RADIO);
		btn_decisionpoint_always.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO DECISIONPOINT_ALWAYS
				myDecisionPoint = EDecisionPoint.ALWAYS;
				myRun.setOnDecisionPoint(myDecisionPoint);
				checkDirty();
			}
		});
		btn_decisionpoint_always.setFont(SWTResourceManager.getFont(
				"Segoe UI", 9, SWT.BOLD)); //$NON-NLS-1$
		btn_decisionpoint_always.setToolTipText(Messages.RunEditor_57);
		btn_decisionpoint_always.setText(Messages.RunEditor_58);

		Label lblDecideWhat = new Label(grpDecisionPointSettings, SWT.NONE);
		lblDecideWhat.setText(Messages.RunEditor_59);

		TabItem tbtmBreakPoint = new TabItem(tabFolder, SWT.NONE);
		tbtmBreakPoint.setText(Messages.RunEditor_60);

		Group grpBreakPoint = new Group(tabFolder, SWT.NONE);
		tbtmBreakPoint.setControl(grpBreakPoint);
		grpBreakPoint.setText(Messages.RunEditor_61);
		grpBreakPoint.setLayout(new GridLayout(2, false));

		Label lblWhatShallHappen = new Label(grpBreakPoint, SWT.NONE);
		lblWhatShallHappen.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
				false, false, 2, 1));
		lblWhatShallHappen.setFont(SWTResourceManager.getFont(
				"Segoe UI", 9, SWT.BOLD)); //$NON-NLS-1$
		lblWhatShallHappen.setText(Messages.RunEditor_63);

		Button btn_breakpoint_stop = new Button(grpBreakPoint, SWT.RADIO);
		btn_breakpoint_stop.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO BREAKPOINT_STOP
				myBreakPoint = EBreakPoint.STOP;
				myRun.setOnBreakPoint(myBreakPoint);
				checkDirty();
			}
		});
		btn_breakpoint_stop.setFont(SWTResourceManager.getFont(
				Messages.RunEditor_64, 9, SWT.BOLD));
		btn_breakpoint_stop.setText(Messages.RunEditor_65);

		Label lblStopOnEvery = new Label(grpBreakPoint, SWT.NONE);
		lblStopOnEvery.setText(Messages.RunEditor_66);

		Button btn_breakpoint_run = new Button(grpBreakPoint, SWT.RADIO);
		btn_breakpoint_run.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO BREAKPOINT_RUN
				myBreakPoint = EBreakPoint.RUN;
				myRun.setOnBreakPoint(myBreakPoint);
				checkDirty();
			}
		});
		btn_breakpoint_run.setFont(SWTResourceManager.getFont(
				"Segoe UI", 9, SWT.BOLD)); //$NON-NLS-1$
		btn_breakpoint_run.setText(Messages.RunEditor_68);

		Label lblThroughEvery = new Label(grpBreakPoint, SWT.NONE);
		lblThroughEvery.setText(Messages.RunEditor_69);

		TabItem tbtmSecurity = new TabItem(tabFolder, SWT.NONE);
		tbtmSecurity.setText(Messages.RunEditor_70);

		Group grpSecurity = new Group(tabFolder, SWT.NONE);
		grpSecurity.setText(Messages.RunEditor_71);
		tbtmSecurity.setControl(grpSecurity);
		grpSecurity.setLayout(new GridLayout(2, false));

		Label lblIfTheAlgorithm = new Label(grpSecurity, SWT.NONE);
		lblIfTheAlgorithm.setFont(SWTResourceManager.getFont(
				"Segoe UI", 9, SWT.BOLD)); //$NON-NLS-1$
		lblIfTheAlgorithm.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
				false, false, 2, 1));
		lblIfTheAlgorithm.setText(Messages.RunEditor_73);

		Button btnLimitTo = new Button(grpSecurity, SWT.CHECK);
		btnLimitTo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Limit of Steps
				myLimitSteps = !myLimitSteps;
				myRun.setLimitSteps(myLimitSteps);
				checkDirty();
			}
		});
		btnLimitTo.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD)); //$NON-NLS-1$
		btnLimitTo.setText(Messages.RunEditor_75);

		Label lblStepsIn = new Label(grpSecurity, SWT.NONE);
		lblStepsIn.setText(Messages.RunEditor_76);
		xpndtmSettings.setHeight(140);

		ExpandItem xpndtmInformations = new ExpandItem(expandBar, SWT.NONE);
		xpndtmInformations.setText(Messages.RunEditor_77);

		Group grpI = new Group(expandBar, SWT.NONE);
		grpI.setText(Messages.RunEditor_78);
		xpndtmInformations.setControl(grpI);
		grpI.setLayout(new FillLayout(SWT.HORIZONTAL));

		Label label = new Label(grpI, SWT.HORIZONTAL);
		label.setText(Messages.RunEditor_79 + Messages.RunEditor_80
				+ Messages.RunEditor_81 + Messages.RunEditor_82
				+ Messages.RunEditor_83 + Messages.RunEditor_84);
		label.setFont(SWTResourceManager.getFont("Calibri", 9, SWT.NORMAL)); //$NON-NLS-1$
		xpndtmInformations.setHeight(xpndtmInformations.getControl()
				.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);

		/*
		 * INITIAL ALL FIELDS
		 */
		if (myRun.getAlgorithmFile() != null)
			myAlgorithmFile.setText(myRun.getAlgorithmFile());
		if (myRun.getExampleFile() != null)
			myExampleFile.setText(myRun.getExampleFile());

		if (myRun.getOnStartPoint().equals(EStartPoint.RAND)) {
			btn_startpoint_rand.setSelection(true);
			myStartPoint = EStartPoint.RAND;
		}
		if (myRun.getOnStartPoint().equals(EStartPoint.DECIDE)) {
			btn_startpoint_decide.setSelection(true);
			myStartPoint = EStartPoint.DECIDE;
		}
		if (myRun.getOnDecisionPoint().equals(EDecisionPoint.RAND)) {
			btn_decisionpoint_rand.setSelection(true);
			myDecisionPoint = EDecisionPoint.RAND;
		}
		if (myRun.getOnDecisionPoint().equals(EDecisionPoint.ONCE)) {
			btn_decisionpoint_once.setSelection(true);
			myDecisionPoint = EDecisionPoint.ONCE;
		}
		if (myRun.getOnDecisionPoint().equals(EDecisionPoint.ALWAYS)) {
			btn_decisionpoint_always.setSelection(true);
			myDecisionPoint = EDecisionPoint.ALWAYS;
		}
		if (myRun.getOnBreakPoint().equals(EBreakPoint.STOP)) {
			btn_breakpoint_stop.setSelection(true);
			myBreakPoint = EBreakPoint.STOP;
		}
		if (myRun.getOnBreakPoint().equals(EBreakPoint.RUN)) {
			btn_breakpoint_run.setSelection(true);
			myBreakPoint = EBreakPoint.RUN;
		}
		if (myRun.isLimitSteps() == true) {
			btnLimitTo.setSelection(true);
			myLimitSteps = true;
		} else {
			btnLimitTo.setSelection(false);
			myLimitSteps = false;
		}
	}

	@Override
	public void setFocus() {

	}

	@Override
	public Image getImage() {
		Image screenshot;
		int width = Activator.getDefault().getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor()
				.getEditorSite().getShell().getSize().x;
		int height = Activator.getDefault().getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor()
				.getEditorSite().getShell().getSize().y;
		GC gc = new GC(Activator.getDefault().getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor()
				.getEditorSite().getShell());
		gc.drawText("Created by Alvis", 5, 5);
		gc.drawRectangle(new Rectangle(0, 0, width - 1, height - 1));
		screenshot = new Image(Display.getCurrent(), width, height);
		gc.copyArea(screenshot, 0, 0);

		gc.dispose();
		Activator.getDefault().getWorkbench().getActiveWorkbenchWindow()
				.getShell().redraw();

		return screenshot;
	}

	@Override
	public boolean isRun() {
		return false;
	}

	@Override
	public StyledText getSourceCode() {
		return null;
	}
}
