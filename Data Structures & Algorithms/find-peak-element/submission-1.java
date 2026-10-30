class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int peak = 0;
        while(l < r){
            int m = l + (r-l)/2;
            if(nums[m] > nums[m-1] && nums[m] > nums[m+1] && m > 0 && m < n-1 ) return m;
            else if(m < n-1 && nums[m] < nums[m+1]) l = m + 1;
            else if(m > 0 && nums[m] < nums[m-1]) r = m - 1;
        }
        return -1;
    }
}

// 1 2 3 4 5
//