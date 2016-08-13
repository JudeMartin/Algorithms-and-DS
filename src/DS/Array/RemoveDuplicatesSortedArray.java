package DS.Array;
/* https://leetcode.com/problems/remove-duplicates-from-sorted-array/ */
public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
         int i = 0;
      for(int n : nums) {
          if( i < 1 || n > nums[i - 1]) {
              nums[i++] = n;
          }
      }
      return i;
    }
}
