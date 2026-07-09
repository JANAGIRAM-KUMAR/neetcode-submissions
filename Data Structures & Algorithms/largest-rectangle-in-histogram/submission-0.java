class Solution {
    public int largestRectangleArea(int[] h) {
        int n = h.length;
        if(n == 0) return 0;

        int[] left = new int[n];
        int[] right = new int[n];
        int maxArea = 0;
        left[0] = -1;
        right[n-1] = n;

        for(int i = 1; i < n; i++){
            int prev = i-1;
            while(prev >= 0 && h[prev] >= h[i]){
                prev = left[prev];
            }
            left[i] = prev;
        }
        for(int i = n-2; i >= 0; i--){
            int prev = i+1;
            while(prev < n && h[prev] >= h[i]){
                prev = right[prev];
            }
            right[i] = prev;
        }
        for(int i = 0; i < n; i++){
            int width = right[i] - left[i] -1;
            maxArea = Math.max(maxArea, width*h[i]);
        }
        return maxArea;

    }
}
