class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> hm = new HashMap<>();
        hm.put(']','[');
        hm.put('}','{');
        hm.put(')','('); // this concept is called as close to open

        for(char c : arr){
            if(hm.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == hm.get(c)){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
