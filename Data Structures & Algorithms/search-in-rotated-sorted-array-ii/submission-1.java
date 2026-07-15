class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            int m = l + (r-l)/2;
            if(nums[m] == target) return true;

            if(nums[m] < target){
                if(nums[l] <= target && target < nums[m]){
                    r = m -1;
                } else {
                    l = m+1;
                }
            } else if(nums[m] > target){
                if(nums[m] <= target && target < nums[r]){
                    r = m -1;
                } else {
                    l = m+1;
                }
            } else {
                l++;
            }
        }
        return false;
    }
}