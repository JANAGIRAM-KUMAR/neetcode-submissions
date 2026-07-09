class Solution {
    private TrieNode root;
    private class TrieNode {
        TrieNode[] children;
        boolean isWord;

        public TrieNode() {
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }
    public Solution () {
        root = new TrieNode();
    }
    public void insert(String word){
        TrieNode curr = root;
        for(char c : word.toCharArray()){
            int index = c - 'a';
            if(curr.children[index] == null){
                TrieNode node = new TrieNode();
                curr.children[index] = node;
                curr = node;
            } else {
                curr = curr.children[index];
            }
        }
        curr.isWord = true;
    }
    public List<String> findWords(char[][] board, String[] words) {
        int m = board.length;
        int n = board[0].length;
        for(String word: words){
            insert(word);
        }
        List<String> res = new ArrayList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dfs(board,i,j,root,new StringBuilder(),res);
            }
        }
        return res;
    }
    private void dfs(char[][] board,int row,int col,TrieNode node,StringBuilder sb,List<String> res){
        int m = board.length;
        int n = board[0].length;

        if(row < 0 || col < 0 || row >= m || col >= n) return;
        if(board[row][col] == '#') return;
        char c = board[row][col];
        if(node.children[c - 'a'] == null) return;
        node = node.children[c - 'a'];

        sb.append(c);
        if(node.isWord){
            res.add(sb.toString());
            node.isWord = false;
        }
        board[row][col] = '#';
        
        dfs(board,row,col+1,node,sb,res);
        dfs(board,row-1,col,node,sb,res);
        dfs(board,row,col-1,node,sb,res);
        dfs(board,row+1,col,node,sb,res);

        board[row][col] = c;
        sb.deleteCharAt(sb.length() - 1);
    }
}
