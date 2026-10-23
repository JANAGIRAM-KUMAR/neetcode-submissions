class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() > prices[i]) st.pop();
            if(!st.isEmpty()) res[i] = st.peek(); 
            st.push(prices[i]);
        }
        
        for(int i = 0; i < n; i++){
            prices[i] = prices[i] - res[i];
        }
        return prices;
    }
}

 
