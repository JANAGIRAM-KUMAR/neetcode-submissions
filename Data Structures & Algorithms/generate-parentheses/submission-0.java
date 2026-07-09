class Solution {
    List<String> res = new ArrayList<>();
    int pairs;
    public List<String> generateParenthesis(int n) {
        this.pairs = n;
        backtrack(0,0,"");
        return res;
    }
    public void backtrack(int open, int close, String curr){
        if(open > pairs || close > pairs || open < close) return;
        if(open == pairs && close == pairs){
            res.add(curr);
            return;
        }
        backtrack(open + 1, close, curr+"(");
        backtrack(open, close + 1, curr+")");
    }
}
