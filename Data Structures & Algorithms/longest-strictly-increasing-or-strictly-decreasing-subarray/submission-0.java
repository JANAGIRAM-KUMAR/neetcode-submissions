class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int li = 1;
        int ld = 1;
        int res = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                li = ld = 1;
            } else if (nums[i] > nums[i-1]){
                li += 1;
                ld = 1;
            } else {
                ld += 1;
                li = 1;
            }
            res = Math.max(li,ld);
        }
        
        

        return res;
        
    }
}