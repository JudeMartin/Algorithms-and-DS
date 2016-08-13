package DS.Array;

import java.util.HashMap;
import java.util.Map;

/* https://leetcode.com/problems/two-sum/ */
public class TwoSum {
	public int[] twoSum(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<>();
		int[] res = new int[2];
		for(int i = 0; i< nums.length; ++i) {
		   if(map.containsKey(nums[i])) {
		     res[0] = map.get(nums[i]);
                     res[1] = i;
		   } else {
                     map.put(target - nums[i], i);
	           }		
		}
	  return res;		
	}
}
