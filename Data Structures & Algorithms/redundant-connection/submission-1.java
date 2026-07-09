class Solution {
    int[] par;
    public int[] findRedundantConnection(int[][] edges) {
        par = new int[edges.length + 1];
        for(int i = 0; i <= edges.length; i++) par[i] = i;
        for(int[] e : edges){
            if(find(e[0]) == find(e[1])) return e;
            else union(e[0],e[1]);
        }
        return edges[0];
    }
    public int find(int x){
        if(par[x] != x) par[x] = find(par[x]);
        return par[x];
    }
    public void union(int x, int y){
        par[find(y)] = find(x);
    }
}
