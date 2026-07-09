class Solution {
    public int swimInWater(int[][] grid) {
        int N = grid.length;
        boolean[][] visited = new boolean[N][N];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        int[][] directions = {
            {0, 1}, {0, -1}, {1, 0}, {-1, 0}
        };

        minHeap.offer(new int[]{grid[0][0], 0, 0});
        visited[0][0] = true;

        while (!minHeap.isEmpty()){
            int[] curr = minHeap.poll();
            int t = curr[0], r = curr[1], c = curr[2];
            if(r == N-1 && c == N-1){
                return t;
            }

            for(int[] d : directions){
                int nR = r + d[0], nC = c + d[1];
                if(nR >= 0 && nC >= 0 && nR < N && nC < N && !visited[nR][nC]){
                    visited[nR][nC] = true;
                    minHeap.offer(new int[]{
                        Math.max(t, grid[nR][nC]), nR, nC
                    });
                }
            }

        }
        return N * N;

    }
}
