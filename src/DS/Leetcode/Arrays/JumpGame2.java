/* https://leetcode.com/problems/jump-game-ii/ */
public class Solution {
    public int jump(int[] nums) {
    int max = 0, next = 0, count = 0; 
    int len = nums.length;
    for (int i = 0; i < len; i++) {
        if (i > max) {
            max = next; //only when i > max, need to update max
            count++; //keep record of the num of jumps
        } 
        next = Math.max(next, i + nums[i]);  //the next farthest possible position
    }
    return count;
    }
}
