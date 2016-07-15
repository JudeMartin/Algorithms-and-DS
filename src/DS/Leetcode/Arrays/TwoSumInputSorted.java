/* https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/ */
public class Solution {
    public int[] twoSum(int[] num, int target) {
        int[] res = new int[2];
        if (num == null || num.length < 2) return res;
        int left = 0, right = num.length - 1;
        while (left < right) {
            int v = num[left] + num[right];
            if (v > target) {
                --right;
                
            } else if (v < target) {
                ++left;
            } else {
                res[0] = left + 1;
                res[1] = right + 1;
                break;
            }
        }
        return res;
    }
}
