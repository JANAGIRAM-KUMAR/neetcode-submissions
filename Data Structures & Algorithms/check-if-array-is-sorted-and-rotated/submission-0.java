class Solution {
    public boolean check(int[] nums) {
        int cnt = 0, N = nums.length;
        for(int i = 0; i < N; i++){
            if(nums[i] > nums[(i+1) % N] && ++cnt > 1) return false;
        }
        return true;
    }
}