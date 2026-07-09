class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        List<Integer> curr = new ArrayList<>();
        backTrack(0,curr);
        return res;

    }
    public void backTrack(int index, List<Integer> curr){
        if(index == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        backTrack(index+1,curr);
        curr.remove(curr.size() - 1);
        backTrack(index+1,curr);
    }
}
