/* https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/ */
package DS.Leetcode.Solutions.Easy;

public class TwoSumIISortedArray {
	/* The array is sorted hence use Binary Search method */
	static int[] twoSumSortedAray(int[] numbers, int target) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = numbers.length - 1;
		int[] results = new int[2];
		while (i < j) {
			if (numbers[i] + numbers[j] == target) {
				results[0] = i + 1;
				results[1] = j + 1;
				return results;
			} else if (target < numbers[i] + numbers[j]) {
				j--;
			} else {
				i++;
			}
		}
		return results;
	}
}
