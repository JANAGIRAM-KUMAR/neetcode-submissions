class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int low = 0, high = x;
        int res = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if((long) mid * mid < x){
                res = mid;
                low = mid + 1;
            } else if((long) mid * mid > x){
                high = mid - 1;
            } else return mid;
        }
        return res;
    }
}