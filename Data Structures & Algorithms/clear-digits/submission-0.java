class Solution {
    public String clearDigits(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && Character.isDigit(c)){
                st.pop();
            }
            else st.push(c);
        }

        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }

        return sb.reverse().toString();
    }
}
