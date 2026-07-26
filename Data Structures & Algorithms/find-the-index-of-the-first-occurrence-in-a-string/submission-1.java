class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();

        for(int i = 0; i < h - n + 1; i++){
            int j = 0;
            while(j < n){ 
                if(haystack.charAt(i+j) != needle.charAt(j)) break;
                j++;
            }
            if(j == n) return i;
        }
        return -1;
    }
}