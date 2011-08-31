package de.unisiegen.informatik.bs.alvis.commands;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.unisiegen.informatik.bs.alvis.export.ImageExport;

/**
 * 
 * @author Frank Weiler
 * 
 */
public class ExportToImage extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {
			new ImageExport();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
