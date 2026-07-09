class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int n = trimmed.length();
        int total = 0;
        for(int i = n-1; i >= 0; i--){
            if(trimmed.charAt(i) == ' '){
                break;
            } else {
                total++;
            }
        }
        return total;
    }
}