class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        return LCS(s,reversed);
    }

    public int LCS(String s1, String s2){
        int M = s1.length();
        int N = s2.length();

        int[][] dp = new int[M+1][N+1];

        for(int i = 1; i < M+1; i++){
            for(int j = 1; j < N+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        return dp[M][N];
    }
}