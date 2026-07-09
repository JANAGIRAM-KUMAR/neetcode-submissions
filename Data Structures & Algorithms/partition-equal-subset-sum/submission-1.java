class Solution {
    public boolean canPartition(int[] nums) {

        int totalSum = Arrays.stream(nums).sum();
        if(totalSum % 2 != 0) return false;
        int target = totalSum/2;

        boolean[] dp = new boolean[target+1];
        dp[0] = true;
        for(int n : nums){
            for(int s = target; s >= n; s--){
                dp[s] = dp[s] || dp[s-n];
            }
        }
        return dp[target];
    }
}
