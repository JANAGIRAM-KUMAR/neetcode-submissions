class Solution {
    public int maximumCandies(int[] candies, long k) {
        int n = candies.length;
        int max = 0;
        for(int c : candies) max = Math.max(c,max);
        int l = 0, h = max;
        while(l < h){
            int mid = (l+h+1)/2;
            long portions = 0;
            for(int c : candies) portions += c/mid;
            if(portions >= k) l = mid;
            else h = mid - 1;
        }
        return l;
        

        
    }
}
