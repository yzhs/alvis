package de.unisiegen.informatik.bs.alvis.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.FileEditorInput;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.tools.IO;
import de.unisiegen.informatik.bs.alvis.virtualmachine.Run;

@SuppressWarnings("restriction")
public class RunCompile extends AbstractHandler{

	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		// Before the magic we have to save everything.
		Workbench.
		getInstance().
		getActiveWorkbenchWindow().
		getActivePage().
		saveAllEditors(true);
		
		IEditorInput input = null;
		
		
		try {
			// What to run? get the input

			input = 
				Workbench.
				getInstance().
				getActiveWorkbenchWindow().
				getActivePage().
				getActiveEditor().
				getEditorInput();
		}
		catch(NullPointerException e) {
			
		}

		Run seri = null;
		
		// Check if the input is a FileEditorInput
		if(input != null & input instanceof FileEditorInput) {
			// cast to FileEditorInput
			FileEditorInput fileInput = (FileEditorInput) input;
			// If the user has choosen a graph to run...
			if(fileInput.getFile().getFileExtension().equals("run")) {
				// get the path in system
				String systemPath =
					fileInput.getPath().toString();
				seri = (Run)IO.deserialize(systemPath);	
			}
			else {
				seri = getUsersRun();
			}
			
		} else {
			seri = getUsersRun();
		}


		
		if(seri != null) {
			Activator.getDefault().setActiveRun(seri);
			new SwitchToRunPerspective().execute(event);
		} else {
			return null;
		}
		
		return null;
	}
	
	private Run getUsersRun() {
		
		Run seri = new Run();
		while(seri.getAlgorithmFile().equals("") | seri.getExampleFile().equals("")) {
			ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
					new WorkbenchLabelProvider(), 
					new BaseWorkbenchContentProvider());
			dialog.setTitle("Select the elements from the run.");
			dialog.setMessage("Select a .algo file or a .graph file or both by using the crlt key.");
			dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
			dialog.open();
			
			if(dialog.getResult() != null) {
				String result = "";
					for(Object o : dialog.getResult()) {
						result = o.toString();
					if(result.startsWith("L") & result.endsWith("graph")) {
						result = result.substring(2); // cut the first two chars
						seri.setExampleFile(result);
					}
					if(result.startsWith("L") & result.endsWith("algo")) {
						result = result.substring(2); // cut the first two chars
						seri.setAlgorithmFile(result);
					}
				}
			}
			if(dialog.getReturnCode() == 1) // the user clicked cancel
				return null;
		}
		
		return seri;
	}

}
