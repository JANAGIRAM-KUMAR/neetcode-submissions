class Solution {
    public void wiggleSort(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            if(i%2 == 1 && nums[i] < nums[i-1]) swap(nums,i,i-1);
            else if(i%2 == 0 && nums[i] > nums[i-1]) swap(nums,i,i-1);
        }          
    }
    public void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}





// 1 2 3 4 5 6
// 1 6 2 5 3 4

// 3 5 6 6 6 8
// 3 8 5 8 6 6