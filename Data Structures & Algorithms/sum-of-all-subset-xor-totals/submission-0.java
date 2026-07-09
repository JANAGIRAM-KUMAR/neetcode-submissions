class Solution {
    public int subsetXORSum(int[] nums) {
        int total = 0;
        for(int n : nums){
            total |= n;
        }
        return total << (nums.length - 1);
    }
}