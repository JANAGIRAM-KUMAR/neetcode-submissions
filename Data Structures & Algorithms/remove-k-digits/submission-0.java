class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : num.toCharArray()){
            while(!stack.isEmpty() && stack.peek() > c && k > 0){
                k--;
                stack.pop();
            }
            stack.push(c);
        }

        while(!stack.isEmpty() && k > 0){
            k--; stack.pop();
        }

        StringBuffer sb = new StringBuffer();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();

        int st = 0;
        while(st < sb.length() - 1 && sb.charAt(st) == '0') st++;

        String res = sb.substring(st);
        return res.equals("") ? "0" : res ;
    }
}
