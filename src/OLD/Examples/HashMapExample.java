package OLD.Examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		hashMapOperations();
	}

	private static void hashMapOperations() {
		Map<String, Integer> map = generateHashMap();
		printHashMapKeys(map);
		printHashMapValues(map);
		printHashMapKeyAndValues(map);
		toStringHashMap(map);
		containsinHashMap(map);

	}

	private static void containsinHashMap(Map<String, Integer> map) {
		System.out
				.println("**********************************************************************");
		System.out.println("******************* Check for specific key,value"
				+ " *********************");
		System.out
				.println("**********************************************************************");
		System.out.println(map.containsKey("Jude"));
		System.out.println(map.containsValue(134));
	}

	private static void toStringHashMap(Map<String, Integer> map) {
		System.out
				.println("******************************************************************");
		System.out
				.println("******************* Prints the map in one go *********************");
		System.out
				.println("******************************************************************");
		System.out.println(map.toString());
	}

	private static Map<String, Integer> generateHashMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Jude", 1343);
		map.put("Martin", 451);
		map.put("Aubrey", 541);
		map.put("Anish", 31);
		map.put("Rahul", 21);
		map.put("JM", 11);
		return map;
	}

	private static void printHashMapKeys(Map<String, Integer> map) {
		System.out
				.println("*********************************************************");
		System.out
				.println("******************* Prints the Keys *********************");
		System.out
				.println("*********************************************************");

		Iterator<String> itrKeys = map.keySet().iterator();
		while (itrKeys.hasNext()) {
			System.out.println(itrKeys.next());
		}
	}

	private static void printHashMapValues(Map<String, Integer> map) {
		System.out
				.println("*********************************************************");
		System.out
				.println("******************* Prints the Values *******************");
		System.out
				.println("*********************************************************");
		Iterator<String> itrValues = map.keySet().iterator();
		while (itrValues.hasNext()) {
			String key = itrValues.next();
			System.out.println(map.get(key));
		}
	}

	private static void printHashMapKeyAndValues(Map<String, Integer> map) {
		System.out
				.println("****************************************************************");
		System.out
				.println("******************* Prints the Keys & Values *******************");
		System.out
				.println("****************************************************************");
		Iterator<String> keyValues = map.keySet().iterator();
		while (keyValues.hasNext()) {
			String key = keyValues.next();
			Integer value = map.get(key);
			System.out.println("Key -> " + key + ", Value -> " + value);
		}
	}
}
