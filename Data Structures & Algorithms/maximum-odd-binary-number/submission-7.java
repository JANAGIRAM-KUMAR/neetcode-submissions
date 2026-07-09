class Solution {
    public String maximumOddBinaryNumber(String s) {
        int zeros = 0;
        int ones = 0;
        for(char c : s.toCharArray()){
            if(c == '1') ones++;
            else zeros++;
        }
        String res = "";
        for(int i = 0; i < ones - 1; i++)
            res += "1";
        for(int i = 0; i < zeros; i++)
            res += "0";
        res += "1";
        return res;
    }
}