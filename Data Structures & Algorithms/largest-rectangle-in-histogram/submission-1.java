class Solution {
    public int largestRectangleArea(int[] h) {
        int n = h.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i <= n; i++){
            int ch = i==n ? 0 : h[i];
            //current height > h[tos] then push else pop and calculate area
            while(!stack.isEmpty() && ch < h[stack.peek()]){
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = h[top] * width;
                maxArea = Math.max(area,maxArea);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
