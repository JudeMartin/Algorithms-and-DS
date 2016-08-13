package DS.Array;
/* https://leetcode.com/problems/remove-element/ */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; ++j){
            if(nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
