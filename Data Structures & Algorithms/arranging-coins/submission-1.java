public class Solution {
    public int arrangeCoins(int n) {
        int stair = 0;
        while (n - stair > 0) {
            stair++;
            n -= stair;
        }
        return stair;
    }
}