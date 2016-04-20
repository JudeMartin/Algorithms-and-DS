package DS.EPI;

/**
 * Created by jude on 4/5/16.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TwoSum {
    // @include
    public static boolean hasTwoSum(List<Integer> A, int t) {
        int i = 0, j = A.size() - 1;
        while (i <= j) {
            if (A.get(i) + A.get(j) == t) {
                return true;
            } else if (A.get(i) + A.get(j) < t) {
                ++i;
            } else { // A[i] + A[j] > t.
                --j;
            }
        }
        return false;
    }
    // @exclude

    // n^2 solution.
    public static boolean checkAns(List<Integer> A, int t) {
        for (int i = 0; i < A.size(); ++i) {
            for (int j = i; j < A.size(); ++j) {
                if (A.get(i) + A.get(j) == t) {
                    return true;
                }
            }
        }
        return false;
    }
    /* This code will fail for negative numbers in the array, Hcne the better solution is to use a HashMap */
    public static int[] twoSumWithoutMap(int[] nums, int target) {
        int i = 0,j = nums.length - 1;
        int[] res = new int[2];
        while(i <= nums.length - 1 && j >= 0){
            if(nums[i] + nums[j] == target) {
                res[0] = i;
                res[1] = j;
                Arrays.sort(res);
                return res;
            } else if(nums[i] + nums[j] < target){
                ++i;
            } else {
                --j;
            }
        }
        return res;
    }
    /* input is not sorted  */
    public static int[] twoSum(int[] nums,int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; /* not sure Y */
            if(map.containsKey(complement)){
                return new int[] { map.get(complement),i };
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution in the array given");
    }
    /* Input is sorted order */
    public int[] twoSumSorted(int[] nums, int target) {
        int i = 0,j = nums.length - 1;
        int[] res = new int[2];
        while(i <= j ){
            if(nums[i] + nums[j] == target) {
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            } else if(nums[i] + nums[j] < target){
                ++i;
            } else {
                --j;
            }
        }
        throw new IllegalArgumentException("No such target");
    }

    public static void main(String[] args) {
        Random gen = new Random();
        for (int times = 0; times < 1000; ++times) {
            int n, T;
            if (args.length == 1) {
                n = Integer.parseInt(args[0]);
                T = gen.nextInt(n - 1);
            } else {
                n = gen.nextInt(10000) + 1;
                T = gen.nextInt(n - 1);
            }

            List<Integer> A = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                A.add(gen.nextInt(200000) - 100000);
            }
            Collections.sort(A);
            System.out.println(hasTwoSum(A, T) ? "true" : "false");
            assert(checkAns(A, T) == hasTwoSum(A, T));
        }
        int[] arr = {3,2,4};
        int[] res = twoSum(arr,6);
        System.out.println(Arrays.toString(res));
    }

}