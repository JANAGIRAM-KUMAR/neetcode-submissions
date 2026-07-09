class Solution {
    public int maxCrossingSum(int[] nums, int left, int right, int mid){
        int ls = Integer.MIN_VALUE;
        int total = 0;
        for(int i = mid; i >= left; i--){
            total += nums[i];
            ls = Math.max(ls,total);
        }
        int rs = Integer.MIN_VALUE;
        total = 0;
        for(int i = mid+1; i <= right; i++){
            total += nums[i];
            rs = Math.max(rs,total);
        }
        return ls + rs;
    }
    public int subArraySum(int[] nums, int left, int right){
        if(left == right){
            return nums[left];
        }
        int mid = left + (right - left) / 2;
        int leftmax = subArraySum(nums,left,mid);
        int rightmax = subArraySum(nums,mid+1,right);
        int crossmax = maxCrossingSum(nums,left,right,mid);
        return Math.max(Math.max(leftmax,rightmax),crossmax);
    }
    public int maxSubArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        return subArraySum(nums,left,right);
    }
}
