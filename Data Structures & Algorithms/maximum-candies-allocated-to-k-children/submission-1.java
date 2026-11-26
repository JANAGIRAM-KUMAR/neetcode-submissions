class Solution {
    public int maximumCandies(int[] candies, long k) {
        int total = 0;
        for(int c : candies) total += c;
        long maxAllowed = (long) Math.floor((double) total/k);
        return (int) maxAllowed;
    }
}
