package CaveOfProgramming.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DTutorialMap {
	public static void main(String[] args) {
		Map<Integer,String> hashMap = new HashMap<>();
		Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer,String> treeMap = new TreeMap<>();
		
		System.out.println("********   Hash Map Implementation   ********");
		testMap(hashMap);
		System.out.println("********   Linked Hash Map Implementation <Insertion Ordering>  ********");
		testMap(linkedHashMap);
		System.out.println("********   Tree Map Implementation <Sorted Order>  ********");
		testMap(treeMap);
	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "Nine");
		map.put(0, "Zero");
		map.put(5, "Five");
		map.put(7, "Seven");
		map.put(6, "Six");
		map.put(2, "Two");
		
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			System.out.println("Key-> " + entry.getKey() + ", Value-> " + entry.getValue());
		}
	}
}
