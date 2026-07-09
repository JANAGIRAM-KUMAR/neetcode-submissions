class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s : operations){
            if(!st.isEmpty() && s.equals("C")){
                st.pop();
            } else if (!st.isEmpty() && s.equals("D")){
                int peek = st.peek();
                st.push(2*peek);
            } else if (s.equals("+")){
                int num1 = st.pop();
                int newNum = num1 + st.peek();
                st.push(num1);
                st.push(newNum);
            } else {
                st.push(Integer.parseInt(s));
            }
        }

        int sum = 0;
        for(int s : st)
            sum += s;

        return sum;
    }
}