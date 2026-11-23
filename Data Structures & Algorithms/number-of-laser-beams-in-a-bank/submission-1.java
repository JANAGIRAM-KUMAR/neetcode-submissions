class Solution {
    public int numberOfBeams(String[] bank) {
        int r = bank.length;
        int c = bank[0].length();
        if(r==1) return 0;
        int[][] cells = new int[r][c];
        int maxBeam = 0;
        int init = 0;
        for(int i = 0; i < r; i++){
            int ones = 0;
            for(int j = 0; j < c; j++){
                if(bank[i].charAt(j) == '1') ones++;
                cells[i][j] = bank[i].charAt(j) == '1' ? 1 : 0;
            }

            if(ones > 0){
                maxBeam += init * ones;
                init = ones;
            }    
        }

        return maxBeam;

        



    }
}


