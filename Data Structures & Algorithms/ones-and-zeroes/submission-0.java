class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[][][] dp = new int[len+1][m+1][n+1];

        for(int i = 1; i <= len; i++){
            int[] z_o = count(strs[i-1]);
            int zeros = z_o[0];
            int ones = z_o[1];

            for(int j = 0; j <= m; j++){
                for(int k = 0; k <= n; k++){
                    dp[i][j][k] = dp[i-1][j][k];

                    if(j >= zeros && k >= ones){
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i-1][j-zeros][k-ones]+1);
                    }
                }
            }
        }

        return dp[len][m][n];
    }

    public int[] count(String s){
        int[] res = new int[2];
        for(char c : s.toCharArray()){
            if(c == '0') res[0]++;
            else res[1]++;
        }
        return res;
    }
}