class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int currMax = 0;

        int minSum = nums[0];
        int currMin = 0;

        int total = 0;

        for(int n : nums){
            currMax = Math.max(currMax + n, n);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(currMin + n, n);
            minSum = Math.min(minSum, currMin);

            total += n;
        }

        if(maxSum < 0) return maxSum;

        return total-minSum;
    }
}