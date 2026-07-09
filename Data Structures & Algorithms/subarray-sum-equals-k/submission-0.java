class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);

        int sum = 0;
        int count = 0;

        for(int n : nums){
            sum += n;
            int d = sum - k;
            count += hm.getOrDefault(d,0);
            hm.put(sum, hm.getOrDefault(sum,0)+1);
        }
        
        return count;
    }
}