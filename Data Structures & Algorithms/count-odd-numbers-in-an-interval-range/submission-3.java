class Solution {
    public int countOdds(int low, int high) {
        int len = high - low + 1;
        int c = len / 2;
        if(len % 2 == 1 && low % 2 == 1) c++;
        return c;
    }
}