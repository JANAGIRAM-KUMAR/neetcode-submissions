class Solution {
    public int minCostConnectPoints(int[][] points) {
        int INF = Integer.MAX_VALUE;
        int n = points.length;
        int[][] graph = new int[n][n];

        for(int i = 0; i < n; ++i){
            int x1 = points[i][0];
            int y1 = points[i][1];
            for(int j = i + 1; j < n; ++j){
                int x2 = points[j][0];
                int y2 = points[j][1];

                int distance = Math.abs(x2 - x1) + Math.abs(y2 - y1);
                graph[i][j] = distance;
                graph[j][i] = distance;
            }
        }

        boolean[] visited = new boolean[n];
        int[] minDistance = new int [n];

        Arrays.fill(minDistance, INF);
        minDistance[0] = 0;

        int totalCost = 0;

        for(int i = 0; i < n; ++i){     
            int minIndex = -1;
            for(int k = 0; k < n; ++k){
                if(!visited[k] && (minIndex == -1 || minDistance[k] < minDistance[minIndex])){
                    minIndex = k;
                }
            }

            visited[minIndex] = true;
            totalCost += minDistance[minIndex];

            for(int k = 0; k < n; ++k){
                if(!visited[k]){
                    minDistance[k] = Math.min(minDistance[k], graph[minIndex][k]);
                }
            }
        }

        return totalCost;

    }
}
