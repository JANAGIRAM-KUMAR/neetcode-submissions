class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length <= 1) return 0;
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        return prefix[nums.length-1]*2;
    }
}


