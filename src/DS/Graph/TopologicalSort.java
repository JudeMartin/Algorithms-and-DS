package DS.Graph;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class TopologicalSort<T> {

	/* Add to set if not visited */
	/* Add to the Stack if no children and already visited */

	public Deque<Vertex<T>> topSort(Graph<T> graph) {
		Set<Vertex<T>> visited = new HashSet<Vertex<T>>();
		Deque<Vertex<T>> stack = new ArrayDeque<Vertex<T>>();

		for (Vertex<T> vertex : graph.getAllVertices()) {
			if (visited.contains(vertex)) {
				continue;
			}
			
			topSortUtil(stack,graph,visited);
			
		}

		return stack;
	}

	public void topSortUtil(Deque<Vertex<T>> stack,Graph<T> graph,Set<Vertex<T>> visited) {

	}

	public static void main(String[] args) {

	}

}
/*
 * 
 * Idea is to use a stack for the sorted elements and a set for the vertices
 * with the method offerFirst
 */
