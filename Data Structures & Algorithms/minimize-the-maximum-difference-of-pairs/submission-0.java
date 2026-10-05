class Solution {
    public int minimizeMax(int[] nums, int p) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0;
        int r = nums[n-1] - nums[0];
        int ans = 0;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(getMaxPairs(nums,mid) >= p){
                ans = mid;
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return ans;
    }

    public int getMaxPairs(int[] nums, int maxVal){
        int n = nums.length;
        if(n < 2) return 0;

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1];
            if(nums[i-1]-nums[i-2] <= maxVal){
                dp[i] = Math.max(dp[i], dp[i-2]+1);
            }
        }

        return dp[n];
    }

    
}


