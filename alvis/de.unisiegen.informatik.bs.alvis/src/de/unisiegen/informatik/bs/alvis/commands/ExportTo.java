package de.unisiegen.informatik.bs.alvis.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.itextpdf.text.DocumentException;

import de.unisiegen.informatik.bs.alvis.export.PdfExport;

public class ExportTo extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			PdfExport pdf = new PdfExport();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return null;
	}

}
