class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> set = new HashSet();
        for(String d : dictionary){
            set.add(d);
        }
        int n = s.length();
        int[] dp = new int[n+1];
        for(int i = 1; i <= n; i++){
            dp[i] = dp[i-1] + 1;
            for(int j = 0; j < i; j++){
                String ss = s.substring(j,i);
                if(set.contains(ss)){
                    dp[i] = Math.min(dp[i],dp[j]);
                }
            }
        }

        return dp[n];
    }
}