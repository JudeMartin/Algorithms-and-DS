package DS.Array;

import java.util.Arrays;

/* https://leetcode.com/problems/search-for-a-range/ */
public class SearchForRange {
    public int[] searchRange(int[] nums, int target) {
        int idx = Arrays.binarySearch(nums, target);
        if (idx < 0) {
            return new int[]{-1, -1};
        }
        int left = idx - 1, right = idx + 1;
        while (left >= 0 && nums[left] == nums[idx])
            left--;
        while (right < nums.length && nums[right] == nums[idx])
            right++;
        return new int[]{left + 1, right - 1};
    }
}
