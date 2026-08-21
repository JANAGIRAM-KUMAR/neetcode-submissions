class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int n = grid.length;
        int[] res = new int[2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(set.contains(grid[i][j])){
                    res[0] = grid[i][j];
                    continue;
                }
                set.add(grid[i][j]);
            }
        }

        for(int i = 1; i <= n*n; i++){
            if(!set.contains(i)){
                res[1] = i;
                break;
            }
        }

        return res;
    }
}