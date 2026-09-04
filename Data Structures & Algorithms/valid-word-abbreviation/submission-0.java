class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int wLen = word.length();
        int aLen = abbr.length();

        int i, j, x;
        i = j = x = 0;

        while(i < wLen && j < aLen){
            char currChar = abbr.charAt(j);
            if(Character.isDigit(currChar)){
                if(currChar == '0' && x == 0){
                    return false;
                }
                x = x * 10 + (currChar - '0');
            } else {
                i += x;
                x = 0;
                if(i >= wLen || word.charAt(i) != abbr.charAt(j)){
                    return false;
                }
                i++;
            }
            j++;
        }

        return (i + x == wLen) && (j == aLen);

    }
}