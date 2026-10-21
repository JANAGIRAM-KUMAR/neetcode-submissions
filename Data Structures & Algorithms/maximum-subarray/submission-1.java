class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;

        for(int n : nums){
            currSum = Math.max(currSum + n, n);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
