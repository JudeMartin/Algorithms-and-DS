package DS.Array;
/* https://leetcode.com/problems/spiral-matrix-ii/ */
public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] ret = new int[n][n];
	int left = 0, top = 0;
	int right = n - 1, down = n - 1;
	int count = 1;
	while (left <= right && top <= down) {
		for (int j = left; j <= right; j ++) {
			ret[top][j] = count++;
		}
		top++;
		for (int i = top; i <= down; i ++) {
			ret[i][right] = count++;
		}
		right--;
		for (int j = right; j >= left; j --) {
			ret[down][j] = count++;
		}
		down--;
		for (int i = down; i >= top; i --) {
			ret[i][left] = count++;
		}
		left++;
	}
	return ret;
    }
}
