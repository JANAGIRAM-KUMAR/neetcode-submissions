class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,-1);
        for(int i = 0; i < n; i++){
            sum += nums[i];
            int re = sum % k;
            if(re < 0) re += k;
            if(map.containsKey(re)){
                if((i - map.get(re)) > 1) return true;
            } else {
                map.put(re,i);
            }       
        }
        return false;
    }
}

// 23 25 31 35 42
// 7 11 17 19 42

