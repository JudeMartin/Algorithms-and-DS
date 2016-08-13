package DS.Array;
/* https://leetcode.com/problems/minimum-path-sum/ */
public class MinimumPathSum {
     public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] matrix = new int[m][n];
        
        for(int i=0; i < m; i++){
            for(int j=0; j < n; j++){
                if(i == 0 && j == 0){
                    matrix[i][j] = grid[i][j];
                }
                if(i == 0 && j != 0){
                    matrix[i][j] = grid[i][j] + matrix[i][j-1];
                }
                
                if(i != 0 && j == 0){
                    matrix[i][j] = grid[i][j] + matrix[i-1][j];
                }

                if(i != 0 && j != 0){
                    int a = matrix[i][j-1];
                    int b = matrix[i-1][j];
                    matrix[i][j] = Math.min(a,b) + grid[i][j];
                }
            }
        }
        return matrix[m-1][n-1];
    }
}
