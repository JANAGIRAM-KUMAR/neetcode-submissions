class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n)) continue;
            set.add(n);
        }

        for(int i = 1; i <= len; i++){
            if(!set.contains(i)) res.add(i);
        }

        return res;
    }
}