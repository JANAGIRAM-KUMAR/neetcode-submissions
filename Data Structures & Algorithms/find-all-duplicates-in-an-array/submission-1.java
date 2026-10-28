class Solution {
    public int[] findDuplicates(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        for(int n : nums){
            if(hm.get(n) > 1) set.add(n);
        }

        
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
