package DS.Array;
/* https://leetcode.com/problems/unique-paths/ */
public class UniquePath1 {
    public int uniquePaths(int m, int n) {
    int[][] resMatrix = new int[m][n];
    for(int i = 0; i < m;i++){
        for(int j = 0; j < n;j++){
            if (i == 0 || j == 0){
                resMatrix[i][j] = 1;
            } else if( n != 0 && m != 0) {
                 resMatrix[i][j] = resMatrix[i-1][j] + resMatrix[i][j-1];       
            }
        } 
    }
    return resMatrix[m-1][n-1];     
    }
}
