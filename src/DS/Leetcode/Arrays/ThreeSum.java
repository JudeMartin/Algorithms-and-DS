/* https://leetcode.com/problems/3sum/ */
public class Solution {
public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            Arrays.sort(nums);
            for (int j = 0; j <= nums.length - 3; j++) {
                if (j > 0 && nums[j] == nums[j - 1]) continue;
                int m = j + 1;
                int n = nums.length - 1;
                while (m < n) {
                    if (m > j + 1 && nums[m] == nums[m - 1]) {
                        m++;
                        continue;
                    }
                    if (n < nums.length - 1 && nums[n] == nums[n + 1]) {
                        n--;
                        continue;
                    }
                    int sum = nums[j] + nums[m] + nums[n];
                    if (sum == 0) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[j]);
                        list.add(nums[m]);
                        list.add(nums[n]);
                        res.add(list);
                        m++;
                        n--;
                    } else if (sum > 0) {
                        n--;
                    } else {
                        m++;
                    }
                }
            }
            return res;
        }
}

