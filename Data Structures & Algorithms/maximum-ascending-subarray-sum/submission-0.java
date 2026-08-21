class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] < nums[i]) sum += nums[i-1];
            else sum = 0;


            if(i == nums.length - 1) sum += nums[i];
        }

        

        return sum;

    }
}