/*
 * Copyright (c) 2011 Frank Weiler
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import java.util.HashMap;

/**
 * class for returning help content for the algorithm editor
 * 
 * @author Frank Weiler
 * 
 */
public class AlgorithmHelp {

	private HashMap<String, String> help;
	private static AlgorithmHelp instance = null;

	/**
	 * constructor, initializes help and fills it with help-content
	 */
	private AlgorithmHelp() {
		help = new HashMap<String, String>();

		help.put("vertex_color", Messages.vertex_color_explain + "\n"
				+ Messages.vertex_color_example);
		help.put("vertex_distance", Messages.vertex_distance_explain + "\n"
				+ Messages.vertex_distance_example);
		help.put("vertex_parentId", Messages.vertex_parentId_explain + "\n"
				+ Messages.vertex_parentId_example);
		help.put("vertex_adjacents", Messages.vertex_adjacents_explain + "\n"
				+ Messages.vertex_adjacents_example);
		help.put("vertex_edges", Messages.vertex_edges_explain + "\n"
				+ Messages.vertex_edges_example);
		help.put("vertex_equal", Messages.vertex_equal_explain + "\n"
				+ Messages.vertex_equal_example);
		help.put("vertex_notEqual", Messages.vertex_notEqual_explain + "\n"
				+ Messages.vertex_notEqual_example);
		help.put("vertex_connectTo", Messages.vertex_connectTo_explain + "\n"
				+ Messages.vertex_connectTo_example);

		help.put("edge_weight", Messages.edge_weight_explain + "\n"
				+ Messages.edge_weight_example);
		help.put("edge_vertices", Messages.edge_vertices_explain + "\n"
				+ Messages.edge_vertices_example);
		help.put("edge_startVertex", Messages.edge_startVertex_explain + "\n"
				+ Messages.edge_startVertex_example);
		help.put("edge_endVertex", Messages.edge_endVertex_explain + "\n"
				+ Messages.edge_endVertex_example);
		help.put("edge_color", Messages.edge_color_explain + "\n"
				+ Messages.edge_color_example);
		help.put("edge_remove", Messages.edge_remove_explain + "\n"
				+ Messages.edge_remove_example);

		help.put("graph_vertices", Messages.graph_vertices_explain + "\n"
				+ Messages.graph_vertices_example);
		help.put("graph_edges", Messages.graph_edges_explain + "\n"
				+ Messages.graph_edges_example);

		// help.put("vertex_color_explain", Messages.vertex_color_explain);
		// help.put("vertex_color_example", Messages.vertex_color_example);
		// help.put("vertex_distance_example",
		// Messages.vertex_distance_example);
		// help.put("vertex_distance_explain",
		// Messages.vertex_distance_explain);
		// help.put("vertex_parentId_example",
		// Messages.vertex_parentId_example);
		// help.put("vertex_parentId_explain",
		// Messages.vertex_parentId_explain);
		// help.put("vertex_adjacents_example",
		// Messages.vertex_adjacents_example);
		// help.put("vertex_adjacents_explain",
		// Messages.vertex_adjacents_explain);
		// help.put("vertex_edges_example", Messages.vertex_edges_example);
		// help.put("vertex_edges_explain", Messages.vertex_edges_explain);
		// help.put("vertex_equal_example", Messages.vertex_equal_example);
		// help.put("vertex_equal_explain", Messages.vertex_equal_explain);
		// help.put("vertex_notEqual_example",
		// Messages.vertex_notEqual_example);
		// help.put("vertex_notEqual_explain",
		// Messages.vertex_notEqual_explain);
		// help.put("vertex_connectTo_example",
		// Messages.vertex_connectTo_example);
		// help.put("vertex_connectTo_explain",
		// Messages.vertex_connectTo_explain);
		//
		// help.put("edge_weight_example", Messages.edge_weight_example);
		// help.put("edge_weight_explain", Messages.edge_weight_explain);
		// help.put("edge_vertices_example", Messages.edge_vertices_example);
		// help.put("edge_vertices_explain", Messages.edge_vertices_explain);
		// help.put("edge_startVertex_example",
		// Messages.edge_startVertex_example);
		// help.put("edge_startVertex_explain",
		// Messages.edge_startVertex_explain);
		// help.put("edge_endVertex_example", Messages.edge_endVertex_example);
		// help.put("edge_endVertex_explain", Messages.edge_endVertex_explain);
		// help.put("edge_color_example", Messages.edge_color_example);
		// help.put("edge_color_explain", Messages.edge_color_explain);
		// help.put("edge_remove_example", Messages.edge_remove_example);
		// help.put("edge_remove_explain", Messages.edge_remove_explain);
		//
		// help.put("graph_vertices_example", Messages.graph_vertices_example);
		// help.put("graph_vertices_explain", Messages.graph_vertices_explain);
		// help.put("graph_edges_example", Messages.graph_edges_example);
		// help.put("graph_edges_explain", Messages.graph_edges_explain);
	}

	/**
	 * returns hash map filled with help texts for algorithm editor
	 * 
	 * @return hash map filled with help texts for algorithm editor
	 */
	public static HashMap<String, String> getHelp() {
		if (instance == null) {
			instance = new AlgorithmHelp();
		}
		return instance.help;
	}

}
