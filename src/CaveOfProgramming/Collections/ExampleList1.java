package CaveOfProgramming.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExampleList1 {
	
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
	}
	private static void doTimings(String typeOfList, List<Integer> list){
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
	}
}
