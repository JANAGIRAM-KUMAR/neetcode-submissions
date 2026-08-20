class Solution {
    public int appendCharacters(String s, String t) {
        int count = 0;
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            if(l < t.length() && s.charAt(r) == t.charAt(l)){
                l += 1;
            }
        }
        count = t.length() - l;
        return count;
    }
}