package de.unisiegen.informatik.bs.alvis.io.dialogs;

public class AskMeAgain {
	private boolean ask;
	public AskMeAgain(boolean ask) {
		this.setAsk(ask);
	}
	public void setAsk(boolean ask) {
		this.ask = ask;
	}
	public boolean getAsk() {
		return ask;
	}	
	public String toString() {
		if(ask)
			return "true";
		else 
			return "false";
	}
}
