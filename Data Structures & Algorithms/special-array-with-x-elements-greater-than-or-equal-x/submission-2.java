class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;

        int l = 1, r = n;
        while(l <= r){
            int mid = l + (r-l)/2;
            int cnt = 0;
            for(int num : nums){
                if(num >= mid) cnt++;
            }
            if(cnt == mid) return mid;
            else if(cnt > mid) l = mid+1;
            else r=mid-1;
        }

        return -1;
    }
}