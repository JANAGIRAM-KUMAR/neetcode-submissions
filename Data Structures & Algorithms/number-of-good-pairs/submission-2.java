class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        int res = 0;
        for(int n : nums){
            res += hm.getOrDefault(n,0);
            hm.put(n, hm.getOrDefault(n,0) + 1);
        }

        return res;
    }
}