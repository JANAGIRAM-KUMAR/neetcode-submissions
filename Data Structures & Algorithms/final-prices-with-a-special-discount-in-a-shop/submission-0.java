class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        if(n <= 1) return prices;
        int p1 = prices[0];
        int p2 = prices[1];
        int newPrice = p1;
        if(p2 <= p1) newPrice = p1 - p2;
        prices[0] = newPrice;
        return prices;



    }
}
