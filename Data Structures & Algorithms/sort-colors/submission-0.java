class Solution {
    public void sortColors(int[] nums) {
        int mid = 1;
        int i = 0, j = 0;
        int k = nums.length - 1;
        while (j <= k){
            if(nums[j] < mid){
                swap(i,j,nums);
                i++; j++;
            } else if(nums[j] > mid){
                swap(j,k,nums);
                k--;
            } else {
                j++;
            }
        }
    }

    public void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}