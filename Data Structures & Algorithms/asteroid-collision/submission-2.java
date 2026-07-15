class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int a : asteroids){
            if(a > 0){
                st.push(a);
            } 
            if(a < 0){
                int top = st.peek();
                if(top <= Math.abs(a)){
                    st.pop();
                }
            }
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