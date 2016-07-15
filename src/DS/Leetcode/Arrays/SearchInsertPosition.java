/* https://leetcode.com/problems/search-insert-position/ */
public class Solution {
    public int searchInsert(int[] nums, int target) {
     int low = 0, high = nums.length - 1;
        // Invariant: the desired index is between [low, high+1]
        while (low <= high) {
            int mid = low + (high-low) / 2;

            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
        // (2) From the invariant, we know that the index is between [low, high+1], so low <= high+1. Follwing from (1), now we know low == high+1.
        // (3) Following from (2), the index is between [low, high+1] = [low, low], which means that low is the desired index
        //     Therefore, we return low as the answer. You can also return high+1 as the result, since low == high+1
    }
}
