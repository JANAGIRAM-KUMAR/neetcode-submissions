class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        backtrack(nums,target,0, new ArrayList<>());
        return res;

    }
    public void backtrack(int[] nums, int target, int index, List<Integer> curr){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = index; i < nums.length; i++){
            if(nums[i] > target) break;
            curr.add(nums[i]);
            backtrack(nums, target - nums[i],i,curr);
            curr.remove(curr.size() - 1);
        }
    }
}
