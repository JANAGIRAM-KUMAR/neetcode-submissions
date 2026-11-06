class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length()%2 != 0) return false;
        int open = 0, close = 0;
        for(int i = 0; i < s.length(); i++){
            if(locked.charAt(i) == '0'){
                open--;
                close++;
            } else if(s.charAt(i) == '('){
                open++;
                close++;
            } else {
                open--;
                close--;
            }
            //if(close < 0) return false;
            open = Math.max(open,0);
        }

        return open == 0;


    }
}
