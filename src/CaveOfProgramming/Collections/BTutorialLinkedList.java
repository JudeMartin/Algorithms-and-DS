package CaveOfProgramming.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BTutorialLinkedList {
	public static void main(String[] args) {
		List<Integer> arraylist = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		doTimings("ArrayList",arraylist);
		doTimings("LinkedList",linkedList);
	}

	private static void doTimings(String type, List<Integer> list) {
		/* add at the end, hence speeds don't matter -> almost similar */  
		for(int i = 0; i < 1E5; i++){
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		/* adding at the beginning of the list, LinkedList is faster */ 
		for(int i = 0; i < 1E5; i++){
			list.add(0,i);
		}
		long stop = System.currentTimeMillis();
		System.out.println("Current Time taken: " + (stop - start) + " ms for " + type);
	}
}
/* all the list have the common list methods */