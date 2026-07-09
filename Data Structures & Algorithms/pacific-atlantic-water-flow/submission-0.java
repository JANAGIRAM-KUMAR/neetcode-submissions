class Solution {
    int[] directions = {-1,0,1,0,-1};
    int ROWS, COLS;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        ROWS = heights.length;
        COLS = heights[0].length;
        boolean[][] pocean = new boolean[ROWS][COLS];
        boolean[][] aocean = new boolean[ROWS][COLS];
        for(int c = 0; c < COLS; c++){
            dfs(0,c,pocean,heights);
            dfs(ROWS-1,c,aocean,heights);
        }
        for(int r = 0; r < ROWS; r++){
            dfs(r,0,pocean,heights);
            dfs(r,COLS-1,aocean,heights);
        }

        List<List<Integer>> res = new ArrayList<>();
        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                if(aocean[r][c] && pocean[r][c]){
                    res.add(Arrays.asList(r,c));
                }
            }
        }
        return res;

    }
    public void dfs(int r, int c, boolean[][] ocean, int[][] heights){
        ocean[r][c] = true;
        for(int dir = 0; dir < 4; dir++){
            int nr = r + directions[dir];
            int nc = c + directions[dir+1];
            if(nr >= 0 && nr < ROWS &&
               nc >= 0 && nc < COLS &&
               !ocean[nr][nc] && heights[nr][nc] >= heights[r][c]){
                dfs(nr,nc,ocean,heights);
            }
        }

    }
}
