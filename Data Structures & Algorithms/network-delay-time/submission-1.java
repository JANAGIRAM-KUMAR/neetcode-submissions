class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] graph = new int[n][n];
        int[] distances = new int[n];

        int INFINITY = 1 << 30;
        Arrays.fill(distances,INFINITY);
        for(int[] r : graph){
            Arrays.fill(r,INFINITY);
        }

        for(int[] t : times){
            int src = t[0] - 1;
            int dst = t[1] - 1;
            int wt = t[2];
            graph[src][dst] = wt;
        }

        distances[k - 1] = 0;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++){
            int minNode = -1;
            for(int j = 0; j < n; j++){
                if(!visited[j] && (minNode == -1 || distances[minNode] > distances[j])){
                    minNode = j;
                }
            }
            visited[minNode] = true;
            for(int j = 0; j < n; j++){
                if (graph[minNode][j] != INFINITY)
                    distances[j] = Math.min(distances[j], distances[minNode] + graph[minNode][j]);
            }
        }
        int maxDistance = 0;
        for(int d : distances){
            maxDistance = Math.max(maxDistance,d);
        }
        return maxDistance == INFINITY ? -1 : maxDistance;
    }
}
