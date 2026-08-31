class Solution {
    Set<Integer> cols = new HashSet<>();
    Set<Integer> posDiag = new HashSet<>();
    Set<Integer> negDiag = new HashSet<>();
    int count;
    int size;
    public int totalNQueens(int n) {
        this.size = n;
        this.count = 0;

        backtrack(0);
        return count;

    }

    public void backtrack(int row){
        if(row == size){
            count += 1;
            return;
        }

        for(int col = 0; col < size; col++){
            if(!cols.contains(col) && !posDiag.contains(row+col) && !negDiag.contains(row-col)){
                cols.add(col);
                posDiag.add(row+col);
                negDiag.add(row-col);

                backtrack(row+1);

                cols.remove(col);
                posDiag.remove(row+col);
                negDiag.remove(row-col);

            }
        }
    }
}