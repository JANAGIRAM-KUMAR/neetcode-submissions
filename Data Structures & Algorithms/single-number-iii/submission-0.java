class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }
        
        long setBit = ans & (long) -ans;
        for(int n : nums){
            if((setBit & n) == 0) res[0] ^= n;
            else res[1] ^= n;
        }

        return res;
    }

    
}