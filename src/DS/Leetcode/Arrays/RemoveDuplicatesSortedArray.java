/* https://leetcode.com/problems/remove-duplicates-from-sorted-array/ */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; ++j){
            if(nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return ++i;
    }
}
