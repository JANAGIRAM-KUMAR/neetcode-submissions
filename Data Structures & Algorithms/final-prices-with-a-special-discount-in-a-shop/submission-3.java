class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[prices.length];
        for(int i = prices.length-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() > prices[i]) st.pop();
            if(!st.isEmpty()) res[i] = st.peek(); 
            st.push(prices[i]);
        }
        
        for(int i = 0; i < prices.length; i++){
            prices[i] = prices[i] - res[i];
        }
        return prices;
    }
}

 
