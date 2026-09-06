class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int currMin = 1, currMax = 1;
        for(int n : nums){
            int temp = n * currMax;
            currMax = Math.max(temp, Math.max(n * currMin, n));
            currMin = Math.min(temp, Math.min(n * currMin, n));
            res = Math.max(res, currMax);
        }
        return res;
    }
}
