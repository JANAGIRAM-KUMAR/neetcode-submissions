class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len = cleaned.length();
        int l = 0, r = len - 1;
        while(l < r){
            if(cleaned.charAt(l) != cleaned.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
