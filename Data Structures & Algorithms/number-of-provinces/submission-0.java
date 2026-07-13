class Solution {
    boolean[] visited;
    int n;
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        this.n = n;
        visited = new boolean[n];
        int prov = 0;

        for(int c = 0; c < n; c++){
            if(!visited[c]){
                dfs(isConnected, c);
                prov += 1;
            }
        }
        return prov;
    }
    
    public void dfs(int[][] isConnected,int city){
        visited[city] = true;
        for(int nei = 0; nei < n; nei++){
            if(isConnected[city][nei] == 1 && !visited[nei]){
                dfs(isConnected, nei);
            }
        }
    }
}