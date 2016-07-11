/* https://leetcode.com/problems/4sum/ */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // set for checking duplicate quadruplet
        Set<List<Integer>> preResult = new HashSet<List<Integer>>();
        if (nums.length < 4) return result;
        // the two pointers
        int low = 0, high = 0;

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i+1; j < nums.length - 2; j++) {
                low = j+1;
                high = nums.length - 1;
                // while the two pointers do not meet
                while (low < high) {
                    if (nums[i]+nums[j]+nums[low]+nums[high] == target) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[low]);
                        list.add(nums[high]);
                        // add the solution to the set first
                        preResult.add(list);
                        // check for the next combination
                        low++;
                        high--;
                    }
                    else if (nums[i]+nums[j]+nums[low]+nums[high] > target) {
                        high--;
                    }
                    else {
                        low++;
                    }
                }
            }
        }
        // copy the elements in the set into the list for final answer
        for (List<Integer> ls:preResult) {
            result.add(ls);
        }
        return result;
    }
}
