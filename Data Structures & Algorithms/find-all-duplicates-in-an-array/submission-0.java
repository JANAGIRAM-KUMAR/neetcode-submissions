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

        int[] res = new int[set.size()];
        int i = 0;
        for(int n : set){
            res[i++] = n;
        }
        return res;
    }
}
