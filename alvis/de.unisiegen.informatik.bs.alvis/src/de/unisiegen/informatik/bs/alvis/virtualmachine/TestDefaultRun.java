package de.unisiegen.informatik.bs.alvis.virtualmachine;

import java.util.ArrayList;
import java.util.Iterator;

import de.unisiegen.informatik.bs.alvis.datatypes.Edge;
import de.unisiegen.informatik.bs.alvis.datatypes.Graph;
import de.unisiegen.informatik.bs.alvis.datatypes.Vertex;

public class TestDefaultRun {
	private String[] vertexLabels = { "A", "B", "C", "D", "E", "F", "G", "H",
			"I" };
	private String[] edgeLabels = { "A-B", "A-E", "A-D", "B-F", "E-D", "D-C",
			"D-G", "D-H", "G-I", "G-F" };
	private ArrayList<Vertex> vertices;
	private ArrayList<Edge> edges;
	Graph testGraph;

	public TestDefaultRun() {
		vertices = new ArrayList<Vertex>();
		edges = new ArrayList<Edge>();
	}

	private Vertex findVertex(String toFind) {
		Vertex tmp;
		Iterator<Vertex> it = vertices.iterator();
		while (it.hasNext()) {
			tmp = it.next();
			if (tmp.getLabel().equals(toFind)) {
				return tmp;
			}
		}
		return null;
	}

	private void createFromTestData() {

		Vertex vtmp1;
		for (int i = 0; i < 9; i++) {
			vtmp1 = new Vertex();
			vtmp1.setLabel(vertexLabels[i]);
			vertices.add(vtmp1);
		}

		Vertex vtmp2;
		Edge etmp;

		for (int i = 0; i < edgeLabels.length; i++) {
			vtmp1 = findVertex("" + edgeLabels[i].charAt(0));
			vtmp2 = findVertex("" + edgeLabels[i].charAt(2));
			etmp = new Edge(vtmp1, vtmp2);
			edges.add(etmp);

		}

		testGraph = new Graph(vertices, edges);
	}

	public static void main(String[] args) {
		TestDefaultRun run = new TestDefaultRun();
		run.createFromTestData();
		
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addParameter(run.testGraph);
		vm.addParameter(run.findVertex("A"));
		vm.startDefaultRun();
		while (!vm.isDone()) {
			System.out.println(vm.getRunningRef().get(2));
			vm.stepForward();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		vm.removeOldParameters();
		run = new TestDefaultRun();
		run.createFromTestData();
		vm.addParameter(run.testGraph);
		vm.addParameter(run.findVertex("A"));
		vm.stepBackward();
		vm.removeOldParameters();
		run = new TestDefaultRun();
		run.createFromTestData();
		vm.addParameter(run.testGraph);
		vm.addParameter(run.findVertex("A"));
		vm.stepBackward();
		
		System.out.println(vm.getRunningRef().get(2));
		System.out.println("done");
	}
}
