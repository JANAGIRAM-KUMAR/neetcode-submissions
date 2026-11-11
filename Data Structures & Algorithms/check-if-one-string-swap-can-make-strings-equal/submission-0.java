class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        if(s1.length() != s2.length()) return false;
        
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(char c : s1.toCharArray()) count1[c-'a']++;
        for(char c : s2.toCharArray()) count2[c-'a']++;

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                count1[s1.charAt(i)-'a']--;
                count2[s2.charAt(i)-'a']--;
            }
        }

        int change = 0;

        for(int i = 0; i < 26; i++){
            if(count1[i] != count2[i]){
                return false;
            } else {
                change += count1[i];
            }
        }

        return change <= 2;


    }
}



