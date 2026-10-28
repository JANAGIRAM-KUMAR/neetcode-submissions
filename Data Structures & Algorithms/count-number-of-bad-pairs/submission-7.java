class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long pairs = (n*(n-1))/2L;
        long goodPair = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            int curr = nums[i] - i;
            if(hm.containsKey(curr)) goodPair += hm.get(curr);
            hm.put(curr, hm.getOrDefault(curr,0)+1);
        }
        return pairs - goodPair;
    }
}
