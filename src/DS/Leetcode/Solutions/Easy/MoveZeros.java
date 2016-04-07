/* https://leetcode.com/problems/move-zeroes/ */
package DS.Leetcode.Solutions.Easy;

public class MoveZeros {
	public void moveZeroes(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[count++] = nums[i];
			}
		}
		if (count > 0) {
			while (count < nums.length) {
				nums[count++] = 0;
			}

		}
	}
}
