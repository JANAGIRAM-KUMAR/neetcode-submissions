class Solution {
    public boolean isPerfectSquare(int num) {
        long n = sqrt(num);
        return n*n == num;
    }

    public long sqrt(int num){
        long s = 0;
        long e = num;
        while(s <= e){
            long m = s + (e-s) / 2;
            if(m * m == num) return m;
            else if(m * m < num){
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return 0;
    }
}