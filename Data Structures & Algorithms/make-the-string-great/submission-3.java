class Solution {
    public String makeGood(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && (Character.isUpperCase(c) && stack.peek() == Character.toLowerCase(c) || Character.isLowerCase(c) && stack.peek() == Character.toUpperCase(c))){
                stack.pop();
            }
            else stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
