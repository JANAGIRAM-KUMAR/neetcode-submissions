class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int a : asteroids){
            while(a < 0 && !st.isEmpty() && st.peek() > 0){
                int diff = a + st.peek();
                if(diff < 0) st.pop();
                else if(diff > 0) a = 0;
                else{
                    a = 0; st.pop();
                }
            }
            if(a!=0) st.push(a);
        }

        int size = st.size();
        int[] res = new int[size];
        int i = 0;
        for(int a : st){
            res[i++] = a;
        }
        return res;
    }
}