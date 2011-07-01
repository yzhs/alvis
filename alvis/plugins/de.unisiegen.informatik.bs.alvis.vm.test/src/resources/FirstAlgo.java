// package resources;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.HashMap;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.vm.AbstractAlgo;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.DPListener;

public class FirstAlgo implements AbstractAlgo {
	public FirstAlgo() {
	}
	
	@Override
	public void run() {
	}

	@Override
	public ArrayList<PCObject> getVariableReferences() {
		return null;
	}

	@Override
	public HashMap<PCObject, String> getParameterTypes() {
		return null;
	}

	@Override
	public void setParameters(ArrayList<PCObject> paras) {
	}

	@Override
	public void addBPListener(BPListener wantToListen) {
	}

	@Override
	public void addDPListener(DPListener wantToListen) {
	}

	@Override
	public void stopBreak() {
	}
	
	@Override
	public void setLock(Lock toLockOn) {
	}
}
