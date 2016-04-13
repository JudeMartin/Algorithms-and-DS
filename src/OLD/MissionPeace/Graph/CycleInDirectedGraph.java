/* find if there is a cycle in a directed graph using DFS*/
package OLD.MissionPeace.Graph;

import java.util.HashSet;
import java.util.Set;

public class CycleInDirectedGraph {

	boolean hasCycle(Graph<Integer> graph) {
		Set<Vertex<Integer>> whiteSet = new HashSet<Vertex<Integer>>(); /* unvisited */
		Set<Vertex<Integer>> greySet = new HashSet<Vertex<Integer>>(); /* visiting */
		Set<Vertex<Integer>> blackSet = new HashSet<Vertex<Integer>>(); /* visited */
		for (Vertex<Integer> vertex : graph.getAllVertices()) {
			whiteSet.add(vertex);
		}

		while (whiteSet.size() > 0) {
			Vertex<Integer> current = whiteSet.iterator().next();
			if (dfs(current, whiteSet, greySet, blackSet)) {
				return true;
			}
		}

		return false;
	}

	boolean dfs(Vertex<Integer> current, Set<Vertex<Integer>> whiteSet,
			Set<Vertex<Integer>> greySet, Set<Vertex<Integer>> blackSet) {

		moveSet(current, whiteSet, greySet);
		for (Vertex<Integer> neighbor : current.getAdjacentVertexes()) {

			if (blackSet.contains(neighbor)) {
				continue;
			}
			if (greySet.contains(neighbor)) {
				return true;
			}

			if (dfs(neighbor, whiteSet, greySet, blackSet)) {
				return true;
			}

		}
		moveSet(current, greySet, blackSet);
		return false;
	}

	void moveSet(Vertex<Integer> vertex, Set<Vertex<Integer>> sourceSet,
			Set<Vertex<Integer>> destinationSet) {
		sourceSet.remove(vertex);
		destinationSet.add(vertex);
	}

	public static void main(String[] args) {
		Graph<Integer> graph = new Graph<Integer>(true); /* true indicates that this is a directed graph */
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);
		graph.addEdge(4, 1);
		graph.addEdge(4, 5);
		graph.addEdge(5, 6);
		graph.addEdge(6, 4);
		CycleInDirectedGraph cdg = new CycleInDirectedGraph();
		System.out.println("Graph contains a cycle: " + cdg.hasCycle(graph));
		
	}
}
/*
 * Algorithm:
 * 1. Initialize 3 Sets - to track the states of the vertices  - a) unvisited b) visiting c) visited
 * 2. Add all the vertices of the graph to the white set
 * 4. Call DFS on each of the vertices and check if there are in visiting
 *      i) move the vertex from white to grey
 *      ii) get the neighbour of the current vertex
 * 		    a) check if the neighbour is in the blackset - hence already visited - continue
 *      	b) check if the neighbour is in the greySet - hence currently visiting - return false 
 *      	c) call DFS on the subsequent neighbour of this neighbour vertex
 * 5. Move current to the black from grey set
 * */
 /*
  * Always move the current vertex from one set to the other
  * Always check from set using the neighbor vertex.
  * move initially to white set, then in DFS move from white to grey, and then before returning false, move from grey to black. 
  * */
