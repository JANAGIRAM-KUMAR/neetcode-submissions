class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int[] res = new int[2];
        int num = 0;
        for(int n : nums){
            if(hs.contains(n)){
                res[0] = n;
                num = n;
            }
            hs.add(n);
        }

        res[1] = num + 1;

        return res;

    }
}