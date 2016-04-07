/* https://leetcode.com/problems/two-sum/ */
package DS.Leetcode.Solutions.Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {
		int[] results = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				results[0] = index + 1;
				results[1] = i + 1;
			} else {
				map.put(target - numbers[i], i);
			}

		}
		return results;
	}

	public static void main(String[] args) {
		int[] numbers = { 25, 3, 9, 11, 20 };
		int target = 14;
		int[] results = twoSum(numbers, target);
		for (int i : results) {
			System.out.println(i);
		}
	}
}
