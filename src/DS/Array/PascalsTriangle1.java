package DS.Array;

import java.util.LinkedList;
import java.util.List;

/* https://leetcode.com/problems/pascals-triangle/ */
public class PascalsTriangle1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new LinkedList<List<Integer>>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new LinkedList<Integer>();
            long curr = 1;  // the first one = C(n, 0) = 1
            row.add((int) curr);
            for (int j = 1; j <= i; ++j) {
                curr = curr * (i - j + 1) / j;
                row.add((int) curr);
            }
            pascal.add(row);
        }
    return pascal;
    }
}
/* https://discuss.leetcode.com/topic/47393/1-ms-java-solution-according-to-the-math-definition */
