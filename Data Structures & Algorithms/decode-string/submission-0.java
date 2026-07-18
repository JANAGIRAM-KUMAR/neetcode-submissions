class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder res = new StringBuilder();
        int k = 0;


        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                k = k * 10 + (c -'0');
            } else if(c == '['){
                stringStack.push(res.toString());
                numStack.push(k);
                res = new StringBuilder();
                k = 0;
            } else if(c == ']'){
                String tmp = res.toString();
                res = new StringBuilder(stringStack.pop());
                int cnt = numStack.pop();
                for(int i = 0; i < cnt; i++){
                    res.append(tmp);
                }
            }  else {
                res.append(c);     
            }
        }
        return res.toString();
    }
}