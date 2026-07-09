class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int freshCount = 0;

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(grid[r][c] == 1) freshCount++;
                else if(grid[r][c] == 2) q.offer(new int[]{r,c});
            }
        }

        int[] directions = {-1,0,1,0,-1};

        for(int m = 0; !q.isEmpty() && freshCount > 0; m++){
            int l = q.size();
            for(int i = 0; i < l; i++){
                int[] curr = q.poll();
                int currRow = curr[0];
                int currCol = curr[1];

                for(int d = 0; d < 4; d++){
                    int nextRow = currRow + directions[d];
                    int nextCol = currCol + directions[d+1];

                    if(nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < cols && grid[nextRow][nextCol] == 1){
                        grid[nextRow][nextCol] = 2;
                        q.offer(new int[]{nextRow,nextCol});
                        freshCount--;

                        if(freshCount == 0) return m + 1;
                    }  
                }
            }
        }
        return freshCount > 0 ? -1 : 0;
    }
}
