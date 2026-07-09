class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int[] nums;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.nums = nums;
        List<Integer> curr = new ArrayList<>();
        backtrack(curr,0);
        Set<List<Integer>> set = new LinkedHashSet<>();
        for(List<Integer> r : res){
            List<Integer> temp = new ArrayList<>(r);
            Collections.sort(temp);
            set.add(temp);
        }
        List<List<Integer>> dup = new ArrayList<>(set);
        return dup;
        
    }
    public void backtrack(List<Integer> curr, int index){
        if(index == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        backtrack(curr,index+1);
        curr.remove(curr.size() - 1);
        backtrack(curr,index+1);
    }

}
