class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num,0) + 1);
            ls.add(num);
        }

        Collections.sort(ls, (a,b) -> {
            int fA = hm.get(a);
            int fB = hm.get(b);
            if(fA != fB) return Integer.compare(fA,fB);
            return Integer.compare(b,a);
        });

        for(int i = 0; i < n; i++){
            res[i] = ls.get(i);
        }
        
        return res;

    }
}