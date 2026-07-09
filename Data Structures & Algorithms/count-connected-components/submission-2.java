class Solution {
    List<Integer>[] adjacencyList;
    boolean[] visited;
    public int countComponents(int n, int[][] edges) {
        adjacencyList = new List[n];
        visited = new boolean[n];
        Arrays.setAll(adjacencyList, index -> new ArrayList<>());

        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];
            adjacencyList[b].add(a);
            adjacencyList[a].add(b);
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            count += dfs(i);
        }
        return count;
    }
    public int dfs(int currentNode){
        if(visited[currentNode]) return 0;
        visited[currentNode] = true;
        for(int n : adjacencyList[currentNode]) dfs(n);
        return 1;
    }
}
