class Solution {
    public int minimizeMax(int[] nums, int p) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0;
        int r = nums[n-1] - nums[0];
        while(l < r){
            int mid = l + (r-l)/2;
            if(getMaxPairs(nums,mid) >= p){
                r = mid;
            } else {
                l = mid+1;
            }
        }
        return l;
    }

    public int getMaxPairs(int[] nums, int maxVal){
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n-1; i++){
            if(nums[i+1]-nums[i] <= maxVal){
                count++;
                i++;
            }
        }
        return count;
    }

    
}


