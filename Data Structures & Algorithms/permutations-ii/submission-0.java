class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int[] nums;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        this.nums = nums;
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

        Set<Integer> set = new HashSet<>();

        for(int i = index; i < nums.length; i++){
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
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

