class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;
        for(int n : nums){
            if(n < 0) sign *= -1;
            if(n == 0) return 0;
        }
        return sign;
    }
}