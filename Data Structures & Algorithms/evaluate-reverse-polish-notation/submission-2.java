class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            switch(s.charAt(0)){
                case '+':
                    int sum = stack.pop() + stack.pop();
                    stack.push(sum);
                    break;
                case '*': 
                    int mul = stack.pop() * stack.pop();
                    stack.push(mul);
                    break;
                case '/': 
                    int dr = stack.pop();
                    int nr = stack.pop();
                    stack.push(nr/dr);
                    break;
                default:
                    if(s.charAt(0) == '-' && s.length() == 1){
                        int r = stack.pop();
                        int l = stack.pop();
                        stack.push(l-r);
                    } else {
                        stack.push(Integer.parseInt(s));
                    }
                    break;
            }
        }
        return stack.peek();
    }
}

// class Solution {
//     public int evalRPN(String[] tokens) {
//         Stack<Integer> stack = new Stack<>();
        
//         for (String s : tokens) {
//             if (s.equals("+")) {
//                 stack.push(stack.pop() + stack.pop());
//             } else if (s.equals("-")) {
//                 int b = stack.pop();
//                 int a = stack.pop();
//                 stack.push(a - b);
//             } else if (s.equals("*")) {
//                 stack.push(stack.pop() * stack.pop());
//             } else if (s.equals("/")) {
//                 int b = stack.pop();
//                 int a = stack.pop();
//                 stack.push(a / b);
//             } else {
//                 stack.push(Integer.parseInt(s)); // Safe for negative numbers
//             }
//         }
        
//         return stack.pop();
//     }
// }

