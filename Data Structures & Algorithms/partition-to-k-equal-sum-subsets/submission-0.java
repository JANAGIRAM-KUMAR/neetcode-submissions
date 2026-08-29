class Solution {
    int totalSum;
    int eqSum;
    int[] partition;
    public boolean canPartitionKSubsets(int[] nums, int k) {
        totalSum = Arrays.stream(nums).sum();
        if(totalSum % k != 0) return false;
        eqSum = totalSum / k;
        partition = new int[k];
        return dfs(0,nums,k);
    }

    public boolean dfs(int idx, int[] nums, int k){
        if(idx == nums.length){
            return true;
        }

        for(int i = 0; i < k; i++){
            if(partition[i] + nums[idx] <= eqSum){
                partition[i] += nums[idx];
                if(dfs(idx+1,nums,k)) return true;
                partition[i] -= nums[idx];
            }
            if(partition[i] == 0) break;
        }
        return false;
    }
}