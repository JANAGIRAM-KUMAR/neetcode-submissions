class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        Map<Integer, Integer> hm = new HashMap<>();
        for(int num : nums) hm.put(num, hm.getOrDefault(num,0)+1);

        int[] fd = findDom(hm,n);
        int dom = fd[0];
        int totalDomCount = fd[1];

        hm.clear();
        int split = -1;
        for(int i = 0; i < n-1; i++){
            int curr = nums.get(i);
            hm.put(curr, hm.getOrDefault(curr,0)+1);

            int ldc = hm.getOrDefault(dom,0);
            int ls = i+1;

            int rdc = totalDomCount - ldc;
            int rs = n - ls;

            if(ldc > ls/2 && rdc > rs/2){
                split = i;
                break;
            }
        }

        return split;
        
    }

    public int[] findDom(Map<Integer, Integer> hm, int n) {
        int dom = 0;
        int count = 0;
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (e.getValue() > (n / 2)){
                dom = e.getKey();
                count = e.getValue();
            }
        }
        return new int[]{dom, count};
    }
}