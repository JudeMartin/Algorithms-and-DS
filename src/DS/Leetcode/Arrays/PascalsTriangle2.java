/* https://leetcode.com/problems/pascals-triangle-ii/ */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] rowList = new Integer[rowIndex+1];
        rowList[0] = 1;
        for(int i=1; i<rowList.length;i++) {
            rowList[i] = (int)((long)rowList[i-1]*(rowIndex-(i-1))/(i));
        }
        return Arrays.asList(rowList);
    }
}
/* https://discuss.leetcode.com/topic/33175/my-clean-o-k-java-solution */
