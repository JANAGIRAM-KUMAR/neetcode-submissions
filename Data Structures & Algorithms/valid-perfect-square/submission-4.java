class Solution {
    public boolean isPerfectSquare(int num) {
        int n = sqrt(num);
        return n*n == num;
    }

    public int sqrt(int num){
        int s = 0;
        int e = num;
        int res = 0;
        while(s <= e){
            int m = s + (e-s) / 2;
            if(m * m == num) return m;
            else if(m * m < num){
                res = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return res;
    }
}