class Solution {
    public String largestGoodInteger(String num) {
        for(char c = '9'; c >= '0'; c--){
            String curr = ""+c+c+c;
            if(num.contains(curr)) return curr;
        }
        return "";
        
    }
}