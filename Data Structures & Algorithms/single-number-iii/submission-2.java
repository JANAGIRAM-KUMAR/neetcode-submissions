class Solution {
    public int[] singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }
        
        long setBit = ans & (long) -ans;
        int a = 0, b = 0;
        for(int n : nums){
            if((setBit & n) == 0) a ^= n;
            else b ^= n;
        }

        return new int[]{a,b};
    }

    
}