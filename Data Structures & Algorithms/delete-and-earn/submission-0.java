class Solution {
    public int deleteAndEarn(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        int max = Integer.MIN_VALUE;
        for(int n : nums) max = Math.max(max,n);
        int[] dp = new int[max+1];
        for(int n : nums) dp[n] += n ;

        int p2 = 0;
        int p1 = dp[0];
        for(int i = 1; i <= max; i++){
            int curr = Math.max(p1, p2+dp[i]);
            p2 = p1;
            p1 = curr;
        }
        return p1;
    }
}


  