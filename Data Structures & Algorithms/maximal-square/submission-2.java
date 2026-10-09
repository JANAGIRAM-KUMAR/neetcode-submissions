class Solution {
    public int maximalSquare(char[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;

        int[][] dp = new int[M+1][N+1];
        int sq = Integer.MIN_VALUE;
        for(int i = 1; i <= M; i++){
            for(int j = 1; j <= N; j++){
                if(matrix[i-1][j-1] == '1'){
                    dp[i][j] = min(dp[i][j-1],dp[i-1][j], dp[i-1][j-1]) + 1;
                    sq = Math.max(sq, dp[i][j]);
                }
            }
        }

        return sq*sq;
    }

    public int min(int a, int b, int c){
        if(a<b && a<c){
            return a;
        } else if(b<c){
            return b;
        }
        return c;
    }
}