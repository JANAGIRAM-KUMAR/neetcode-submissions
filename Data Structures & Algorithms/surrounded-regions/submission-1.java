class Solution {
    int ROWS, COLS;
    char[][] board;
    public void solve(char[][] board) {
        ROWS = board.length;
        COLS = board[0].length;
        this.board = board;

        for(int r = 0; r < ROWS; r++){
            dfs(r,0);
            dfs(r,COLS-1);
        }
        for(int c = 0; c < COLS; c++){
            dfs(0,c);
            dfs(ROWS-1,c);
        }

        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                if(board[r][c] == 'O') board[r][c] = 'X';
                else if(board[r][c] == '.') board[r][c] = 'O';
            }
        }

    }
    public void dfs(int row, int col){
        if(row < 0 || row >= ROWS || col < 0 || col >= COLS || board[row][col] != 'O') return;
        board[row][col] = '.';
        int[] dir = {-1,0,1,0,-1};
        for(int i = 0; i < 4; i++){
            int nr = row + dir[i];
            int nc = col + dir[i+1];
            dfs(nr,nc);
        }
    }
}
