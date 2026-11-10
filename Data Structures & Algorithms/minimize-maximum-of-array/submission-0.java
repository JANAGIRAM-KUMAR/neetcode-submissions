class Solution {
    public int minimizeArrayValue(int[] nums) {
        long total = nums[0], ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            total += nums[i];
            ans = Math.max(ans, (total+i)/(i+1));
        }
        return (int) ans;
    }
}