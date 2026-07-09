class Solution {
        List<String> res = new ArrayList<>();
        Map<String, List<String>> adjList = new HashMap<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        for(List<String> ticket : tickets){
            String from = ticket.get(0);
            String to = ticket.get(1);
            adjList.putIfAbsent(from, new ArrayList<>());
            adjList.get(from).add(to);
        }
        for (List<String> neighbors : adjList.values()) {
            Collections.sort(neighbors);
        }
        dfs("JFK");
        Collections.reverse(res);
        return res;
    }

    public void dfs(String airport){
        while(adjList.containsKey(airport) && !adjList.get(airport).isEmpty()){
            String next = adjList.get(airport).remove(0);
            dfs(next);
        }
        res.add(airport);
    }
}
