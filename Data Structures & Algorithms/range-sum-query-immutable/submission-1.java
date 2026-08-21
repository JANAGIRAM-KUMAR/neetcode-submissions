class NumArray {
    private int[] pSum;

    public NumArray(int[] nums) {
        int n = nums.length;
        pSum = new int[n+1];
        for(int i = 0; i < n; i++){
            pSum[i+1] = pSum[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return pSum[right+1] - pSum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */