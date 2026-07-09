class Solution {
    public int findDuplicate(int[] nums) {
        int fastPtr = 0, slowPtr = 0;
        while(true){
            slowPtr = nums[slowPtr];
            fastPtr = nums[nums[fastPtr]];
            if(fastPtr == slowPtr) break;
        }
        int temp = 0;
        while(true){
            temp = nums[temp];
            slowPtr = nums[slowPtr];
            if(temp == slowPtr) return temp;
        }
    }
}
