class Solution {
    Queue<Integer> q;
    int[] tickets;
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int seconds = 0;
        for(int i = 0; i < n; i++){
            if(i <= k){
                seconds += Math.min(tickets[i], tickets[k]);
            } else {
                seconds += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return seconds;



    }
}