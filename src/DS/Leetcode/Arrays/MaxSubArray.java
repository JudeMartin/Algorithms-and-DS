/* https://leetcode.com/problems/maximum-subarray/ */
public class Solution {
    public int maxSubArray(int[] nums) {
        int currentMax  = nums[0], maxSoFar = nums[0];
        for(int i = 1; i < nums.length; ++i) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(currentMax, maxSoFar);
        }
        return maxSoFar;
    }
}
