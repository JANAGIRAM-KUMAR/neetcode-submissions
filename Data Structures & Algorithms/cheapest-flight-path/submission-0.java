class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int INFINITY = 1 << 30;

        int[] distances = new int[n];
        int[] prevDistances = new int[n];

        Arrays.fill(distances, INFINITY);
        distances[src] = 0;

        for(int i = 0; i < k+1; i++){
            System.arraycopy(distances,0,prevDistances,0,n);
            for(int[] flight: flights){
                int from = flight[0];
                int to = flight[1];
                int price = flight[2];

                distances[to] = Math.min(distances[to],prevDistances[from]+price);
            }
        }
        return distances[dst] == INFINITY ? -1 : distances[dst];
    }
}
