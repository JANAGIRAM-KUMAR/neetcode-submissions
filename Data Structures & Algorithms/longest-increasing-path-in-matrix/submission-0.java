class Solution {
    int[][] memo;
    int[][] matrix;
    int rows, cols;
    
    public int longestIncreasingPath(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        this.rows = rows;
        this.cols = cols;
        

        memo = new int[rows][cols];
        this.matrix = matrix;

        int longestVal = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                longestVal = Math.max(longestVal,dfs(i,j));
            }
        }

        return longestVal;
        
    }

    public int dfs(int row, int col){
        if(memo[row][col] != 0) return memo[row][col];
        int[] dirs = {-1,0,1,0,-1};
        for(int d = 0; d < dirs.length - 1; d++){
            int nR = row + dirs[d];
            int nC = col + dirs[d+1];

            if(nR >= 0 && nR < rows && nC >= 0 && nC < cols && matrix[nR][nC] > matrix[row][col]){
                memo[row][col] = Math.max(memo[row][col], dfs(nR,nC));
            }
        }
        return ++memo[row][col];
    }
}
