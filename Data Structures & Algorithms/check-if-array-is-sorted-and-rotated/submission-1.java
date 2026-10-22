class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int r = 1; r < 2*n; r++){
            if(nums[(r-1)%n] <= nums[r%n]) count++;
            else count = 1;
            if(count == n) return true;
        }
        return count == 1;
    }
}

// 3 4 5 1 2 3 4 5 1 2