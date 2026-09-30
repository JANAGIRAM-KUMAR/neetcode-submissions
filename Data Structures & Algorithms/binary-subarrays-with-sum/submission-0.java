class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal) - atmost(nums,goal-1);
    }

    public int atmost(int[] nums, int goal) {
        if(goal < 0) return 0;
        int n = nums.length;
        int l = 0;
        int cnt = 0;
        int sum = 0;
        for(int r = 0; r < n; r++){
            sum += nums[r];
            while(sum > goal){
                sum -= nums[l];
                l++;
            }
            cnt += r-l+1;
        }
        return cnt;
    }
}