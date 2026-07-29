class Solution {
    int[] weights;
    int days;
    public int shipWithinDays(int[] weights, int days) {
        this.weights = weights;
        this.days = days;
        int l = 0, r = 0;
        for(int w : weights){
            r += w;
            l = Math.max(l,w);
        }
        int res = r;

        while(l <= r){
            int m = l + (r-l)/2;

            if(canShip(m)){
                res = Math.min(res, m);
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res;
    }

    public boolean canShip(int capacity){
        int ships = 1;
        int currCap = capacity;
        for(int w : weights){
            if(currCap - w < 0){
                ships += 1;
                currCap = capacity;
            }
            currCap -= w;
        }
        return ships <= days;
    }
}