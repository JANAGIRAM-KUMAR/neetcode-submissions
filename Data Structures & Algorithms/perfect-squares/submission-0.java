class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,n);
        dp[0] = 0;

        for(int t = 1; t <= n; t++){
            for(int s = 1; s*s <= t; s++){
                dp[t] = Math.min(dp[t], 1 + dp[t-s*s]);
            }
        }
        return dp[n];
    }
}