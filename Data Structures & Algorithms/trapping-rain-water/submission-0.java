class Solution {
    public int trap(int[] h) {
        int n = h.length;
        if(h == null || n == 0){
            return 0;
        }
        int l = 0, r = n-1;
        int lm = h[0], rm = h[n-1];
        int res = 0;
        while(l<r){
            if(lm < rm){
                l++;
                lm = Math.max(lm, h[l]);
                res += lm - h[l];
            } else {
                r--;
                rm = Math.max(rm, h[r]);
                res += rm - h[r];
            }
        }
        return res;
    }
}
