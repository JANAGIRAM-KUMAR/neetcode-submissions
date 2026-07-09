class Solution {
    Set<Integer> cols = new HashSet<>();
    Set<Integer> posDiag = new HashSet<>();
    Set<Integer> negDiag = new HashSet<>();
    List<List<String>> res = new ArrayList<>();
    int size;
    public List<List<String>> solveNQueens(int n) {
        this.size = n;
        backtrack(0, new ArrayList<>());
        return res;
    }
    public void backtrack(int row, List<String> curr){
        if(row == size){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int col = 0; col < size; col++){
            if(!cols.contains(col)&&!posDiag.contains(row+col)&&!negDiag.contains(row-col)){
                cols.add(col);
                posDiag.add(row + col);
                negDiag.add(row - col);

                char[] rowArray = new char[size];
                Arrays.fill(rowArray, '.');
                rowArray[col] = 'Q';
                curr.add(new String(rowArray));

                backtrack(row + 1, curr);

                curr.remove(curr.size() - 1);
                cols.remove(col);
                posDiag.remove(row + col);
                negDiag.remove(row - col);
            }
        }
    }
}
