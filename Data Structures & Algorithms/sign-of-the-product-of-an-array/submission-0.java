class Solution {
    public int arraySign(int[] nums) {
        int prod = 1;
        for(int n : nums){
            prod *= n;
        }
        return signFunc(prod);
    }

    public int signFunc(int x){
        if(x > 0) return 1;
        else if (x < 0) return -1;
        else return 0;
    }
}