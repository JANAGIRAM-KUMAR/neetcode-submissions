class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        return Math.max(robRange(1,n-1,nums), robRange(0,n-2,nums));
    }
    public int robRange(int start, int end, int[] nums){
        int rob1 = 0, rob2 = 0;
        for(int i = start; i <= end; i++){
            int newRob = Math.max(rob2, rob1 + nums[i]);
            rob1 = rob2;
            rob2 = newRob;
        }
        return rob2;
    }
}
