class Solution {
    public int maximumCandies(int[] candies, long k) {
        int total = 0;
        for(int c : candies) total += c;
        int maxAllowed = (int) Math.floor((double) total/k);
        return maxAllowed;
    }
}
