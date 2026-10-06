class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        long curr = 0;
        long total = 0;
        for(int[] c : customers){
            int arrival = c[0];
            int prep = c[1];
            curr = Math.max(curr,arrival) + prep;
            total += curr - arrival;
        }
        return (double) total/n;
    }
}