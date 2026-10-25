class Solution {
    class Pair {
        char c;
        int count;
        public Pair(char c, int count){
            this.c = c;
            this.count = count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Deque<Pair> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek().c == c){
                stack.peek().count++;
                if(stack.peek().count == k) stack.pop();
            }
            else stack.push(new Pair(c,1));
        }

        StringBuilder sb = new StringBuilder();
        for(Pair p : stack){
            for(int i = 0; i < p.count; i++) sb.append(p.c);
        }

        return sb.reverse().toString();
    }
}