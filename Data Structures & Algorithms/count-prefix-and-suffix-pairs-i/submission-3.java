class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length; j++){
                if(isPrefixAndSuffix(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isPrefixAndSuffix(String str1, String str2){
        if(str1.length() > str2.length()) return false;
        int su = str2.length() - str1.length();
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i + su)){
                return false;
            }
        }
        return true;
    }
}