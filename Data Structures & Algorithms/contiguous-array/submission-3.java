class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length <= 1) return 0;
        int running_sum = 0;
        int maxLen = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i = 0; i < nums.length; i++){
            running_sum += nums[i] == 0 ? -1 : 1;
            if(hm.containsKey(running_sum)){
                maxLen = Math.max(maxLen, i - hm.get(running_sum));
            } else {
                hm.put(running_sum,i);
            }
        }

        return maxLen;
        
    }
}


