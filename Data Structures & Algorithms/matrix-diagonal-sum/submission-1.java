class Solution {
    public int diagonalSum(int[][] mat) {
        int total = 0;
        int n = mat.length;
        for(int i = 0; i < n; i++){
            total += mat[i][i];
            total += mat[i][n-1-i];
        }
        return total - (n % 2 != 0 ? mat[n/2][n/2] : 0);
    }
}