class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int n : nums){
            hm.put(n, hm.getOrDefault(n,0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            int val = entry.getValue();
            if(val % 2 != 0) return false;
        }
        return true;
    }
}