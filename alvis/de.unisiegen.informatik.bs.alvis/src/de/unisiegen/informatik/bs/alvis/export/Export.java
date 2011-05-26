package de.unisiegen.informatik.bs.alvis.export;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;

public class Export {

	private ArrayList<IExportItem> exportItems;
	
	public Export(){
		exportItems = new ArrayList<IExportItem>();
	}
	
	public void register(IExportItem item) {
		exportItems.add(item);
	}

	public ArrayList<IExportItem> getExportItems() {
		return exportItems;
	}
	
}
