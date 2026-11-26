class Solution {
    public int minimumLength(String s) {
        int[] count = new int[26];
        for(char c : s.toCharArray()) count[c-'a']++;
        int len = 0;
        for(int i = 0; i < 26; i++){
            if(count[i] != 0 && count[i]%2==0) len += 2;
            else if (count[i] != 0 && count[i]%2==1) len += 1;
        }
        return len;
    }
}
