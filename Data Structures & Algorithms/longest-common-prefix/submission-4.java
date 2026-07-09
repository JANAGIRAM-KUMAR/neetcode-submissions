class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        for(int c = 0; c < strs[0].length(); c++){
            for(int s = 1; s < n; s++){
                if(strs[s].length() <= c || strs[s].charAt(c) != strs[0].charAt(c)) return strs[0].substring(0,c);
            }
        }
        return strs[0];
    }
}