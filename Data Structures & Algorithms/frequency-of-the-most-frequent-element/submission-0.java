class Solution {
    public int maxFrequency(int[] nums, int k) {
        int l = 0;
        int currSum = 0;
        int maxFreq = 0;

        int n = nums.length;
        Arrays.sort(nums);
        for(int r = 0; r < n; r++){
            currSum += nums[r];
            while(nums[r] * (r-l+1) > currSum + k){
                currSum -= nums[l];
                l++;
            }
            maxFreq = Math.max(maxFreq,r-l+1);
        }
        return maxFreq;
    }
}

