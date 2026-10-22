class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int count = 0;
        for(String word : words){
            if(word.indexOf(pref) == 0) count++;
        }
        return count;
    }
}