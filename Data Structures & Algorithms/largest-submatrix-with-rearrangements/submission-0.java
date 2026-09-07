class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] heights = new int[n];
        int ans = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 1) heights[j]++;
                else heights[j] = 0;
            }
            Arrays.sort(heights);
            for(int j = 0; j < n; j++){
                int h = heights[n-1-j];
                int w = j+1;
                ans = Math.max(ans, h * w);
            }
        }

        return ans;
        
    }   
}