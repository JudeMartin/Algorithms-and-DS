package Leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumDSDesign {
	private Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	/* Idea is to retrieve the index's */
	/* we always delete the values we have from the target */
	/* this way the acutal values are not stored but their diff with the target */
	boolean find(int target) {
		for (Integer i : map.keySet()) {
			int value = target - i;
			if (map.containsKey(value)) {
				return true;
			}
		}
		return false;
	}

	void add(int num) {
		if (map.containsKey(num)) {
			map.put(num, map.get(num) + 1);
		} else {
			map.put(num, 1);
		}
	}

	public static void main(String[] args) {
		TwoSumDSDesign ds = new TwoSumDSDesign();
		ds.add(1);
		ds.add(3);
		ds.add(3);
		ds.add(2);
		boolean rres = ds.find(4);
		System.out.println(rres);
	}
}

// / * add(1); add(3); add(5); find(4) -> true find(7) -> false

