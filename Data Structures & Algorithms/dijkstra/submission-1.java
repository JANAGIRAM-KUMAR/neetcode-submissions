class Solution {
    public Map<Integer, Integer> shortestPath(
            int n, List<List<Integer>> edges, int src) {

        Map<Integer, Integer> dist = new HashMap<>();

        for (int i = 0; i < n; i++) {
            dist.put(i, Integer.MAX_VALUE);
        }

        dist.put(src, 0);

        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (List<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            int w = edge.get(2);

            graph.get(u).add(new int[]{v, w});
        }

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> a[0] - b[0]);

        pq.add(new int[]{0, src});

        while (!pq.isEmpty()) {

            int[] current = pq.poll();

            int currentDist = current[0];
            int node = current[1];

            // Skip outdated entry
            if (currentDist > dist.get(node)) {
                continue;
            }

            for (int[] edge : graph.get(node)) {

                int neighbour = edge[0];
                int weight = edge[1];

                int newDist = currentDist + weight;

                if (newDist < dist.get(neighbour)) {

                    dist.put(neighbour, newDist);

                    pq.add(new int[]{newDist, neighbour});
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (dist.get(i) == Integer.MAX_VALUE) {
                dist.put(i, -1);
            }
        }

        return dist;
    }
}
