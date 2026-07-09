class Solution {
    public int[] twoSum(int[] n, int target) {
        int len = n.length;
        int l = 0, r = len - 1;
        while(l < r){
            int sum = n[l] + n[r];
            if(sum > target){
                r--;
            } else if ( sum < target){
                l++;
            } else {
                return new int[]{ l+1, r+1};
            }
        }
        return new int[]{};
    }
}
