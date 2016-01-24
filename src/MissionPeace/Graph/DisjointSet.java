package MissionPeace.Graph;

import java.util.HashMap;
import java.util.Map;

public class DisjointSet {
	Map<Long,Node> map = new HashMap<Long,Node>();
	class Node {
		int data;
		int rank;
		Node parent;

	}

	void makeSet(long id) {

	}

	void union(long id1, long id2) {

	}

	long findSet(long data) {
		return 0;
	}
	Node findSet(Node node){
		return node;
	}
	
	public static void main(String[] args) {

	}
}
/* Disjoint DataStructure: Supports three operations:
 * 		1) makeSet - create a set with single elements 
 * 			a) make n sets each with one vertex for the all the given elements
 *      2) union - combines two set's 
 *      	a) if the rank of both the parents are same them after union increment the rank by one.
 *          b) if the ranks are different then the new rank will the highest rank among the 2 parents  
 *      3) findSet - returns the parent in the hierarchy 
 * 
 * */
 