/* https://leetcode.com/problems/rotate-image/ */
public class Solution {
     public void rotate(int[][] matrix) {
	int n = matrix.length;
	int ilimit = (n + 1) / 2;
	int jlimit = n / 2;

	for (int i = 0; i < ilimit; i++)
		for (int j = 0; j < jlimit; j++) {
			int tmp = matrix[i][j];
			matrix[i][j] = matrix[n - j - 1][i];
			matrix[n - j - 1][i] = matrix[n - 1 - i][n - 1 - j];
			matrix[n - 1 - i][n - 1 - j] = matrix[j][n - i - 1];
			matrix[j][n - i - 1] = tmp;
		}
     }	
}
/* https://discuss.leetcode.com/topic/36766/very-easy-and-concise-java-solution-with-detailed-explaination */
