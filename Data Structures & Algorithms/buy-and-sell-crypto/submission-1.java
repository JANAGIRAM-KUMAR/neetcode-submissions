class Solution {
    public int maxProfit(int[] prices) {
        // int l = 0, r = 1;
        // int profit = 0;
        // while(r < prices.length){
        //     if(prices[l] < prices[r]){
        //         profit = Math.max(profit, prices[r] - prices[l]);
        //     } else {
        //         l = r;
        //     }
        //     r++;
        // }
        // return profit;
        int profit = 0;
        int buy = prices[0];
        for(int sell: prices){
            profit = Math.max(profit, sell - buy);
            buy = Math.min(buy,sell);
        }
        return profit;
    }
}
