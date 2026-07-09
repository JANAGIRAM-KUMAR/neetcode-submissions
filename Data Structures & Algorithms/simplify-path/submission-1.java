class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        String[] components = path.split("/");
        for(String c : components){
            if(c.isEmpty() || c.equals(".")) continue;
            if(c.equals("..")){if(!stack.isEmpty())stack.pop();}
            else{stack.push(c);}
        }
        return "/" + String.join("/",stack);
    }
}