class Solution {
    public boolean findMatch(char[][] board,String word,int x,int y,int wIdx){
        int n = board.length;
        int m = board[0].length;
        int wLen = word.length();
        if(wIdx == wLen) return true;
        if(x<0 || y<0 || x>=n || y>=m) return false;
        if(board[x][y] == word.charAt(wIdx)){
            char temp = board[x][y];
            board[x][y] = '#';
            boolean res =   findMatch(board,word,x,y-1,wIdx+1) ||
                            findMatch(board,word,x+1,y,wIdx+1) ||
                            findMatch(board,word,x,y+1,wIdx+1) ||
                            findMatch(board,word,x-1,y,wIdx+1);
            board[x][y] = temp;
            return res;
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        int wLen = word.length();
        if(wLen > n * m) return false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == word.charAt(0))
                    if(findMatch(board,word,i,j,0))
                        return true;
            }
        }
        return false;
    }
}
