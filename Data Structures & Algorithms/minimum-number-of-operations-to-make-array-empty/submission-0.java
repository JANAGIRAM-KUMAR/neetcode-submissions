class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int n : nums){
            hm.put(n, hm.getOrDefault(n,0) + 1);
        }
        int count = 0;
        for(int freq : hm.values()){
            if(freq == 1) return -1;
            count += (freq+2)/3;
        }
        return count;
    }
}