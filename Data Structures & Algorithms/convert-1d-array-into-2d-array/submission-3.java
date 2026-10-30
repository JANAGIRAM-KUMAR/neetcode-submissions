class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length) return new int[][]{};
        int[][] res = new int[m][n];
        
        int row = 0;
        int count = 0;
        for(int i = 0; i < original.length; i++){
            if(count == n){
                row++;
                count = 0;
            }
            res[row][i % n] = original[i];
            count++;
        }
        return res;
    }
}
