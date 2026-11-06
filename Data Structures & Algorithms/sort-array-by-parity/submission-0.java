class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for(int n : nums){
            if(n%2 == 0) even.add(n);
            else odd.add(n);
        }

        int[] res = new int[odd.size() + even.size()];
        int i = 0;
        
        for(int e : even) res[i++] = e;
        for(int o : odd) res[i++] = o;

        return res;

    }
}