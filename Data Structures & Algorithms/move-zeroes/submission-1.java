class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int idx = 0;
        for(int n : nums){
            if(n != 0){
                res[idx++] = n;
            }
        }
        idx = 0;
        for(int n : res){
            nums[idx] = res[idx];
            idx++;
        }
    }
}