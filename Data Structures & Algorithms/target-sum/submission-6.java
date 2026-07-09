class Solution {
    public int findTargetSumWays (int[] nums, int target){
        int total = 0;
        for(int num : nums){
            total += num;
        }
        if((total + target) % 2 != 0) return 0;
        if(Math.abs(target) > total) return 0;

        int subsetSum = (total + target) / 2;
        if(subsetSum < 0) return 0;
        int[] dp = new int[subsetSum + 1];
        dp[0] = 1;
        for(int num : nums){
            for(int s = subsetSum; s >= num; s--){
                dp[s] += dp[s - num];
            }
        }
        return dp[subsetSum];
    }
}