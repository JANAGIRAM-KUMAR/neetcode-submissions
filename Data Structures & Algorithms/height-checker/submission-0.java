class Solution {
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] hei = new int[len];
        for(int i = 0; i < len; i++) hei[i] = heights[i];
        Arrays.sort(heights);
        int cnt = 0;
        for(int i = 0; i < heights.length; i++){
            if(hei[i] != heights[i]) cnt ++;
        }
        return cnt;
    }
}