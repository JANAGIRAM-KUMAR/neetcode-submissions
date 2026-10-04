class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int minCost = 0;
        int[] dp = new int[days[n-1]+1];
        int d = 0;
        dp[0] = 0;
        for(int i = 1; i < dp.length; i++){
            if(i == days[d]){
                int d1 = dp[i-1] + costs[0];
                int d7 = dp[max(0,i-7)] + costs[1];
                int d30 = dp[max(0,i-30)] + costs[2];
                dp[i] = min(d1,d7,d30);
                d++;
            } else {
               dp[i] = dp[i-1];
            }
        }

        return dp[days[n-1]];

    }
    public int max(int a, int b){
        return Math.max(a,b);
    }

    public int min(int a, int b, int c){
        int res = Integer.MAX_VALUE;
        res = Math.min(a,Math.min(b,c));
        return res;
    }
}

