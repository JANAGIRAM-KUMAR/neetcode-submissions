class Solution {
    Boolean[][] memo;
    int textLen;
    int patternLen;
    String text;
    String pattern;
    public boolean isMatch(String s, String p) {
        textLen = s.length();
        patternLen = p.length();

        text = s;
        pattern = p;

        memo = new Boolean[textLen+1][patternLen+1];

        return matchHelper(0,0);
    }

    public boolean matchHelper(int textIndex, int patternIndex){
        if(patternIndex >= patternLen) return textIndex == textLen;
        if(memo[textIndex][patternIndex] != null) return memo[textIndex][patternIndex];

        boolean isMatch = false;
        if(patternIndex + 1 < patternLen && pattern.charAt(patternIndex + 1) == '*'){
            isMatch = matchHelper(textIndex, patternIndex + 2);

            if(!isMatch && textIndex < textLen){
                char textChar = text.charAt(textIndex);
                char patternChar = pattern.charAt(patternIndex);

                if(textChar == patternChar || patternChar == '.'){
                    isMatch = matchHelper(textIndex + 1, patternIndex);
                }
            }
        } else {
            if(textIndex < textLen){
                char textChar = text.charAt(textIndex);
                char patternChar = pattern.charAt(patternIndex);

                if(textChar == patternChar || patternChar == '.'){
                    isMatch = matchHelper(textIndex + 1, patternIndex + 1);
                }
            }
        }
        memo[textIndex][patternIndex] = isMatch;
        return isMatch;
    }
}
