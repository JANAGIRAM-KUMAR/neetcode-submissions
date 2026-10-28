class Solution {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        if(n <= 1) return true;
        int cnt = 0;
        for(int i = 0; i < n-1; i++){
            if(nums[i] <= nums[i+1]){
                continue;
            } else {
                cnt++;
            }
        }
        return cnt == 1;
    }
}