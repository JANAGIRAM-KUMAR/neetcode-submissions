class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int INF = 2147483647;

        Queue<int[]> q = new LinkedList<>();
        int[] directions = {-1,0,1,0,-1};

        for(int r = 0; r < rows; r++)
            for(int c = 0; c < cols; c++)
                if(grid[r][c] == 0)
                    q.offer(new int[] {r,c});
        
        int distance = 0;
        while(!q.isEmpty()){
            distance++;
            int l = q.size();
            for(int i = 0; i < l; i++){
                int[] curr = q.poll();
                int currRow = curr[0];
                int currCol = curr[1];
                
                for(int d = 0; d < 4; d++){
                    int nextRow = currRow + directions[d];
                    int nextCol = currCol + directions[d+1];

                    if(nextRow >= 0 && nextRow < rows &&
                        nextCol >= 0 && nextCol < cols &&
                        grid[nextRow][nextCol] == INF){
                        grid[nextRow][nextCol] = distance;
                        q.offer(new int[] {nextRow,nextCol});
                    }
                }
            }
        }           
    }
}
