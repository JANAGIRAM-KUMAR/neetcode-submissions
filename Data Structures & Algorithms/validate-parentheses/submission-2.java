class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        for(char c : s.toCharArray()){
            if(c == '[' || c == '{' || c == '(') st.push(c);
            else {
                if (!st.isEmpty() && st.peek() == map.get(c)) st.pop();
            }
        }

        return st.isEmpty();
    }
}
