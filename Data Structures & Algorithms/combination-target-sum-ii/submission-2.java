class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates,target,0,new ArrayList<>());
        Set<List<Integer>> set = new LinkedHashSet<>(res);
        return new ArrayList<>(set);
    }
    public void backtrack(int[] arr, int target, int index, List<Integer> curr){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = index; i < arr.length; i++){
            if(arr[i] > target) break;
            curr.add(arr[i]);
            backtrack(arr,target-arr[i],i+1,curr);
            curr.remove(curr.size() - 1);
        }
    }
}
