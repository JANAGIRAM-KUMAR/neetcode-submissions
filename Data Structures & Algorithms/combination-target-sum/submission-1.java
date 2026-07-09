class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int[] nums;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        this.nums = nums;
        List<Integer> curr = new ArrayList<>();
        backtrack(target,0,curr);
        return res;

    }
    public void backtrack(int target, int index, List<Integer> curr){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = index; i < nums.length; i++){
            if(nums[i] > target) break;
            curr.add(nums[i]);
            backtrack(target - nums[i],i,curr);
            curr.remove(curr.size() - 1);
        }
    }
}
