class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        Arrays.sort(nums);
        int change = nums[1];
        int count = 0;
        for(int i = n-1; i >= 0; i--){
            nums[i] = change;
            count += 1;
            if(count == 3) break;
        }
        int max = findMax(nums);
        Arrays.sort(nums);
        return max - nums[0];
    }

    public int findMax(int[] nums){
        int max = 0;
        for(int n : nums) max = Math.max(max,n);
        return max;
    }
}
