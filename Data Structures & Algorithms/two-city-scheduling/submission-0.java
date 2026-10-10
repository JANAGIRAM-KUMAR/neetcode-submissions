class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length/2;
        Arrays.sort(costs, (r1,r2) -> Integer.compare(r1[0]-r1[1], r2[0]-r2[1]));

        int totalCost = 0;
        for(int i = 0; i < n; i++){
            totalCost += costs[i][0];
        }
        for(int i = n; i < 2*n; i++){
            totalCost += costs[i][1];
        }

        return totalCost;
    }
}

