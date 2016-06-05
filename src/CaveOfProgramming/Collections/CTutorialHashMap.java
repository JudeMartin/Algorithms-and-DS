package CaveOfProgramming.Collections;

import java.util.HashMap;
import java.util.Map;

public class CTutorialHashMap {
	public static void main(String[] args) {

		/* declaring a map with implementation with a HashMap */
		Map<Integer, String> map = new HashMap<>();

		/* adding elements to a HashMap */
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(2, "Two");
		map.put(3, "Three");

		System.out.println(map.get(7));

		/* iterating through a Map using entry set */
		/* Map.Entry<>  : entrySet() */
		/* getKey(), getValue() */
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key-> " + entry.getKey() + ", Value-> "
					+ entry.getValue());

		}
	}
}
