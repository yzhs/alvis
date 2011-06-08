import java.util.HashMap;
import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.*;
import de.unisiegen.informatik.bs.alvis.vm.*;

public class Algorithm implements AbstractAlgo {
    private PCGraph G;
    private PCVertex s;

    public Algorithm(PCGraph G, PCVertex s) {
        this.G = G;
        this.s = s;
    }

    public void run() {
        for (PCVertex v : G.getVertices())
            {
                v.set("color", new PCString("white"));
                v.set("distance", PCInteger.localInfty);
                v.set("pi", PCVertex.localNull);
            }
        s.set("color", new PCString("grey"));
        insertBreakpoint(7);
        s.set("distance", new PCInteger(0));
        PCQueue Q = new PCQueue();
        Q.enqueue(s);
        while ((Q.isEmpty().not()).getLiteralValue())
            {
                PCVertex u = new PCVertex();
                u = Q.dequeue();
                for (PCVertex v : u.getAdjacents())
                    if ((v.getColor().equal(new PCString("white"))).getLiteralValue())
                        {
                            v.set("color", new PCString("grey"));
                            insertBreakpoint(17);
                            v.set("distance", u.getDistance().add(new PCInteger(1)));
                            v.set("pi", u);
                            Q.enqueue(v);
                        }
            }
    }

    private void insertBreakpoint(int lin) {} // for testing purposes only

    public ArrayList<PCObject> getVariableReferences() {return null;}
    public ArrayList<PCObject> getParameterTypes() {return null;}
    public void setParameters(ArrayList<PCObject> params) {}
    public void addBPListener(BPListener wantToListen) {}
    public void addDPListener(DPListener wantToListen) {}
    public void stopBreak() {}
}