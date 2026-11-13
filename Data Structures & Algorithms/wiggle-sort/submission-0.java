class Solution {
    public void wiggleSort(int[] n) {
        int len = n.length;
        int[] nums = n.clone();
        Arrays.sort(nums);
        
        int l = 0, r = len-1;
        int i = 0;
        while(l < r){
            n[i++] = nums[l];
            n[i++] = nums[r];
            l++;
            r--;
        }
    }
}


// 1 2 3 4 5 6
// 1 6 2 5 3 4

// 3 5 6 6 6 8
// 3 8 5 8 6 6