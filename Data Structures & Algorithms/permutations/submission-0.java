class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int[] nums;
    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        List<Integer> curr = new ArrayList<>();
        backtrack(0);
        return res;
    }

    public void backtrack(int index){
        if(index == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int n : nums) temp.add(n);
            res.add(temp);
            return;
        }
        for(int i = index; i < nums.length; i++){
            swap(nums,index,i);
            backtrack(index+1);
            swap(nums,index,i);
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
