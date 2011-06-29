package de.unisiegen.informatik.bs.alvis.commands;

import java.io.IOException;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.FileEditorInput;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.Run;
import de.unisiegen.informatik.bs.alvis.compiler.CompilerAccess;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.tools.IO;

public class RunCompile extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// NOTE: event is null when executing from run editor.
		
		// Save all Editors
		PlatformUI.getWorkbench().
		getActiveWorkbenchWindow().
		getActivePage().
		saveAllEditors(true);
		
		new CloseRunPerspective().execute(event);
		
		// Instantiate IEditorInput
		IEditorInput input = null;
		
		// Hier sind alle Datentypen
		for(PCObject obj : Activator.getDefault().getAllDatatypes()) {
//			System.out.println(obj.getClass());
//			System.out.println(obj.getTypeName());
//			System.out.println(obj.toString());
//			System.out.println();
		}
		
		try {
			// What to run? get the input (filepath)
			input = 
				PlatformUI.
				getWorkbench().
				getActiveWorkbenchWindow().
				getActivePage().
				getActiveEditor().
				getEditorInput();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}

		//Instantiate a new Run object
		Run seri = null;
		
		/*
		 * GET THE RUN OBJECT
		 */
		// Check if the input is a FileEditorInput
		if(input != null & input instanceof FileEditorInput) {
			// cast to FileEditorInput
			FileEditorInput fileInput = (FileEditorInput) input;
			// If the user has choosen a graph to run...
			if(fileInput.getFile().getFileExtension().equals("run")) { //$NON-NLS-1$
				// get the path in system
				String systemPath =
					fileInput.getPath().toString();
				// and deserialize the saved run to seri
				seri = (Run)IO.deserialize(systemPath);	
			}
			else {
				// ask for run settings
				seri = getPreferencesByDialog();
			}
			
		} else {
			// ask for run settings
			seri = getPreferencesByDialog();
		}

		// END OF GET THE RUN OBJECT
		
		if(seri != null) {

			// GET THE ALGORITHM AS STRING
			try {
				// Translate the PseudoCode and get name of the translated file without extension.
				String fileNameOfTheAlgorithm = CompilerAccess.compileThisDummy("keinString", null); //$NON-NLS-1$
				// Get the path where the translated files are saved to.
				String pathToTheAlgorithm = CompilerAccess.getAlgorithmPath();
				
//				System.out.println("Filename: " + fileNameOfTheAlgorithm);
//				System.out.println("Path: " + pathToTheAlgorithm);

				// Register Algorithm to VM
				if(Activator.getDefault().setJavaAlgorithmToVM(
						pathToTheAlgorithm, 
						fileNameOfTheAlgorithm)) {
					Activator.getDefault().setActiveRun(seri);
					// Then activate command SwitchToRunPerspective
					new SwitchToRunPerspective().execute(event);
				}
				else {
					System.out.println("Fehler"); //$NON-NLS-1$
					//TODO FEHLER AUSGEBEN MIT WINDOWS
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			return null;
		}
		
		return null;
	}

	private Run getPreferencesByDialog() {

		Run seri = new Run();
		while (seri.getAlgorithmFile().equals("") | seri.getExampleFile().equals("")) { //$NON-NLS-1$ //$NON-NLS-2$
			ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
					PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getShell(), new WorkbenchLabelProvider(),
					new BaseWorkbenchContentProvider());
			dialog.setTitle(Messages.RunCompile_7);
			dialog.setMessage(Messages.RunCompile_8);
			dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
			dialog.open();

			if (dialog.getResult() != null) {
				String result = ""; //$NON-NLS-1$
				for (Object o : dialog.getResult()) {
					result = o.toString();
					if (result.startsWith("L") & result.endsWith("graph")) { //$NON-NLS-1$ //$NON-NLS-2$
						result = result.substring(2); // cut the first two chars
						seri.setExampleFile(result);
					}
					if (result.startsWith("L") & result.endsWith("algo")) { //$NON-NLS-1$ //$NON-NLS-2$
						result = result.substring(2); // cut the first two chars
						seri.setAlgorithmFile(result);
					}
				}
			}
			if (dialog.getReturnCode() == 1) // the user clicked cancel
				return null;
		}

		return seri;
	}

}
