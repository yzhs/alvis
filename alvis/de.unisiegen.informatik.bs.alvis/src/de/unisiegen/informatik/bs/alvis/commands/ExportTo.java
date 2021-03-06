package de.unisiegen.informatik.bs.alvis.commands;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.itextpdf.text.DocumentException;

import de.unisiegen.informatik.bs.alvis.export.PdfExport;

/**
 * 
 * @author Frank Weiler
 *
 */
public class ExportTo extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// IWorkbenchPart component = PlatformUI.getWorkbench()
		// .getActiveWorkbenchWindow().getActivePage().getActivePart();
		// System.out.println(component);

		try {
			new PdfExport();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
