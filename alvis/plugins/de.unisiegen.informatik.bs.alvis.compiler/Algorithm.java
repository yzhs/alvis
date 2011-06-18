import java.util.HashMap;
import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.*;
import de.unisiegen.informatik.bs.alvis.vm.*;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.*;
import java.util.concurrent.locks.Lock;

public class Algorithm implements AbstractAlgo {
	private Lock lock;
	
    private PCGraph G;
    private PCVertex s;

    public Algorithm() {

    }

    public void run() {
        for (PCVertex v : G.getVertices())
            {
                v.set("color", new PCString("white"));
                v.set("distance", PCInteger.getInfty());
                v.set("pi", PCVertex.getNull());
            }
        s.set("color", new PCString("grey"));
        insertBreakpoint(7);
        s.set("distance", new PCInteger(0));
        PCQueue Q = new PCQueue();
        Q.enqueue(s);
        while ((Q.isEmpty().not()).getLiteralValue())
            {
                PCVertex u = new PCVertex();
                u = (PCVertex) Q.dequeue();
                for (PCVertex v : u.getAdjacents())
                    if (v.get("color").equals(new PCString("white")))
                        {
                            v.set("color", new PCString("grey"));
                            insertBreakpoint(17);
                            v.set("distance",((PCInteger) (u.get("distance"))).add(new PCInteger(1)));
                            v.set("pi", u);
                            Q.enqueue(v);
                        }
            }
    }

    private void insertBreakpoint(int lin) {} // for testing purposes only

    public ArrayList<PCObject> getVariableReferences() {return null;}
    public ArrayList<PCObject> getParameterTypes() {return null;}
    public void setParameters(ArrayList<PCObject> params) {
        this.G = (PCGraph) params.get(0);
        this.s = (PCVertex) params.get(1);	
    }
    public void addBPListener(BPListener wantToListen) {}
    public void addDPListener(DPListener wantToListen) {}
    public void stopBreak() {}
    
    public void setLock(Lock toLockOn) {
    	lock = toLockOn;
    }
    
}