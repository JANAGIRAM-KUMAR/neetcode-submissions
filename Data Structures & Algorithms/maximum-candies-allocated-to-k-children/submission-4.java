class Solution {
    public int maximumCandies(int[] candies, long k) {
        long total = 0;
        for(int c : candies) total += c;
        if(total < k) return 0;
        if(total == k) return 1;
        long high = total / k; 
        long low = 1;
        long res = 0;
        while(low <= high){
            int mid = (int) (low + (high - low)/2);
            long val = solve(candies, mid);
            if(val >= k){
                res = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return (int) res;

    }

    public long solve(int[] candies, int val){
        long res = 0;
        for(int i = 0; i < candies.length; i++){
            res += candies[i]/val;
        }
        return res;
    }
}
