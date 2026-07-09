class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeros = 0;
        int prod = 1;
        for(int n: nums){
            if(n != 0){
                prod *= n;
            }
            else {
                zeros++;
            }
        }
        if (zeros > 1){
            return new int[nums.length];
        }
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(zeros > 0){
                res[i] = (nums[i] == 0) ? prod : 0;
            }
            else{
                res[i] = prod/nums[i];
            }
        }
        return res;
    }
}  
