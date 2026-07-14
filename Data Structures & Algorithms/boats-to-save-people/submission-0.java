class Solution {
    public int numRescueBoats(int[] people, int limit) {
        float res = 0;
        for(int p : people){
            res += p;
        }
        res = res / limit;
        return (int) Math.ceil(res);
    }
}