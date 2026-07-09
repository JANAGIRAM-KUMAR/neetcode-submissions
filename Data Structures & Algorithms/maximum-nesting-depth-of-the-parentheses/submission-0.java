class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int currDepth = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                currDepth += 1;
                maxDepth = Math.max(maxDepth, currDepth);
            } else if ( c == ')'){
                currDepth -= 1;
            }
        }
        return maxDepth;
    }
}