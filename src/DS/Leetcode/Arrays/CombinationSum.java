/* https://leetcode.com/problems/combination-sum/ */
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        combinationSum(result,new ArrayList<Integer>(),candidates,target,0);
        return result;
    }
    public void combinationSum(List<List<Integer>> result, List<Integer> cur, int[] candidates, int target,int start) {
        if (target > 0) {
            for (int i = start;i < candidates.length;i++) { // not using the condition "target >= candidates[i]"
                cur.add(candidates[i]);
                combinationSum(result, cur, candidates, target-candidates[i],i);
                cur.remove(cur.size() - 1);
            }
        }
        if (target == 0) result.add(new ArrayList<Integer>(cur));
    }
}