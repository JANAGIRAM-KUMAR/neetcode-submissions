class Solution {
    public int minCost(String c, int[] neededTime) {
        int n = c.length();
        int max = 0, cost = 0;
        for(int i = 0; i < n ; i++){
            if(i==0 || c.charAt(i) != c.charAt(i-1)) max = 0;
            cost += Math.min(max, neededTime[i]);
            max = Math.max(max, neededTime[i]);
        }
        return cost;
    }
}
