class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];
        int n = words.length;
        for(String word : words){
            int len = word.length();
            for(int i = 0; i < len; i++){
                char c = word.charAt(i);
                count[c-'a']++;
            }
        }
        for(int i = 0; i < 26; i++){
            if(count[i] == 0) continue;
            else {
                if(count[i] % n != 0) return false;
            }
        }
        return true;
    }
}