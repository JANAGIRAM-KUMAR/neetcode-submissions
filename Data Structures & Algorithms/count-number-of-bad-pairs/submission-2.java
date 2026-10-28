class Solution {
    public long countBadPairs(int[] nums) {
        long badPairs = 0;
        if(nums.length <= 0) return 0;
        for(int i = 0; i < nums.length -1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]-i == nums[j]-j){
                    continue;
                } else {
                    badPairs++;
                }
            }
        }

        return badPairs;
    }
}
