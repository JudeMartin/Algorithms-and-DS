package DS.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* https://leetcode.com/problems/combination-sum-ii/ */
public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	Arrays.sort(candidates);
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	combinationSum(candidates, target, result, new ArrayList<Integer>(), 0);
	return result;
}

    void combinationSum(int[] candidates, int target, List<List<Integer>> result, List<Integer> current, int index) {
        if(target > 0) {
            for(int i=index; i < candidates.length; i++) {
                if(i == index || candidates[i] != candidates[i - 1]) {
                    current.add(candidates[i]);
                    combinationSum(candidates, target - candidates[i], result, current, i + 1);
                    current.remove(current.size() - 1);
                }
            }
        } else if(target == 0) {
            result.add(new ArrayList<Integer>(current));
        }
    }
}
