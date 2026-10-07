class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        char[][] res = new char[n][m];
        
        for(char[] row : res){
            Arrays.fill(row,'.');
        }

        for(int i = 0; i < m; i++){
            int lowest = n-1;
            for(int j = n-1; j >= 0; j--){
                if(boxGrid[i][j] == '*'){
                    res[j][m-i-1] = '*';
                    lowest = j-1;
                } else if(boxGrid[i][j] == '#'){
                    res[lowest][m-i-1] = '#';
                    lowest--;
                }
            }
        }

        return res;
    }
}