class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int maxArea = 0; 
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    int area = dfs(grid,i,j,visited);
                    maxArea = Math.max(maxArea, area);
                } 
            }
        }
        return maxArea;
    }
    public int dfs(int[][] grid, int row, int col, boolean[][] visited){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || visited[row][col] || grid[row][col] == 0) return 0;
        visited[row][col] = true;
        return 1 + dfs(grid,row - 1,col,visited) + dfs(grid,row,col + 1,visited) + dfs(grid,row + 1,col,visited) + dfs(grid,row,col - 1,visited);
    }
}
