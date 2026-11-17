class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        while(k > 0){
            int[] min = findMin(nums);
            int val = min[0];
            int idx = min[1];
            nums[idx] = val * multiplier;
            k--;
        }

        return nums;
    }

    public int[] findMin(int[] nums){
        int n = nums.length;
        int minVal = nums[0];
        int idx = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] < minVal){
                minVal = nums[i];
                idx = i;
            }
        }

        return new int[] {minVal, idx};
    }
}