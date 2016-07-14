/* https://leetcode.com/problems/next-permutation/ */
public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }
        int i;
        for (i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                for (int j = nums.length - 1; j > i - 1; j--) {
                    if (nums[i - 1] < nums[j]) {
                        swap(nums, i - 1, j);
                        break;
                    }
                }
                sortDescToAsc(nums, i, nums.length);
                break;
            }
        }
        if (i == 0) {
            sortDescToAsc(nums, 0, nums.length);
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void sortDescToAsc(int[] nums, int start, int end) {
        int i = start, j = end - 1, temp;
        while (i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
