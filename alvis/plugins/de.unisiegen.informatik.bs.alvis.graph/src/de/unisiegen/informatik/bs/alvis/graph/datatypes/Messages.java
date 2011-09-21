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

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.unisiegen.informatik.bs.alvis.graph.datatypes.messages"; //$NON-NLS-1$

	public static String vertex_color_example;
	public static String vertex_color_explain;
	public static String vertex_distance_example;
	public static String vertex_distance_explain;
	public static String vertex_parentId_example;
	public static String vertex_parentId_explain;
	public static String vertex_adjacents_example;
	public static String vertex_adjacents_explain;
	public static String vertex_edges_example;
	public static String vertex_edges_explain;
	public static String vertex_equal_example;
	public static String vertex_equal_explain;
	public static String vertex_notEqual_example;
	public static String vertex_notEqual_explain;
	public static String vertex_connectTo_example;
	public static String vertex_connectTo_explain;

	public static String edge_weight_example;
	public static String edge_weight_explain;
	public static String edge_vertices_example;
	public static String edge_vertices_explain;
	public static String edge_startVertex_example;
	public static String edge_startVertex_explain;
	public static String edge_endVertex_example;
	public static String edge_endVertex_explain;
	public static String edge_color_example;
	public static String edge_color_explain;
	public static String edge_remove_example;
	public static String edge_remove_explain;

	public static String graph_vertices_example;
	public static String graph_vertices_explain;
	public static String graph_edges_example;
	public static String graph_edges_explain;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
