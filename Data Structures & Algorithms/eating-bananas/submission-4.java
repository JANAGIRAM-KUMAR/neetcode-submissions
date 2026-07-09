class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        //int r = Arrays.stream(piles).max().getAsInt();
        int r = 0;
        for(int p : piles){
            r = Math.max(p,r);
        }
        int res = r;
        while(l <= r){
            int m = (l+r)/2;
            long total = 0;
            for(int p : piles){
                total += (int) Math.ceil((double) p/m);
            }
            if(total <= h){
                res = m; // the result
                r = m - 1; // try smaller speed
            } else {
                l = m + 1; // try larger speed
            }
        }
    return res;
    }
}
