
class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int target = (int) (totalSum % p);
        
        if (target == 0) {
            return 0;
        }
        
        HashMap<Integer, Integer> modMap = new HashMap<>();
        modMap.put(0, -1);
        
        long currentPrefixSum = 0;
        int minLength = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            currentPrefixSum += nums[i];
            int currentMod = (int) (currentPrefixSum % p);
            
            int neededMod = (currentMod - target + p) % p;
            
            if (modMap.containsKey(neededMod)) {
                minLength = Math.min(minLength, i - modMap.get(neededMod));
            }
            
            modMap.put(currentMod, i);
        }
        
        return minLength == nums.length ? -1 : minLength;
    }
}
