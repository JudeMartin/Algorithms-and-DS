package DS.Array;
/* https://leetcode.com/problems/search-a-2d-matrix/ */
public class SearchMatrix1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m * n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == matrix[mid / n][mid % n]) {
                return true;
            } else if (target < matrix[mid / n][mid % n]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        
        }
        return false;
    }
}
