class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        for(int n : nums){
            if(n > res) res = n;
        }
        int currMin = 1, currMax = 1;
        for(int n : nums){
            int temp = n * currMax;
            currMax = Math.max(n * currMax, Math.max(n * currMin, n));
            currMin = Math.min(temp, Math.min(n * currMin, n));
            res = Math.max(res, currMax);
        }
        return res;
    }
}
