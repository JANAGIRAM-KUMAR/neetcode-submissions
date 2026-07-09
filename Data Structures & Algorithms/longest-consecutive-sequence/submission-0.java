class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int n: nums){
            hs.add(n);
        }
        for(int n: nums){
            int streak = 0, curr = n;
            while(hs.contains(curr)){
                streak++; curr++;
            }
            res = Math.max(res, streak);
        }
        return res;
    }
}
