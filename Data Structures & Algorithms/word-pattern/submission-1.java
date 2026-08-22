class Solution {
    public boolean wordPattern(String pattern, String s) {

        
        Map<Character, String> hm = new HashMap<>();
        String[] words = s.split(" ");

        if(pattern.length() != words.length) return false;
        for(int i = 0; i < pattern.length(); i++){
            char p = pattern.charAt(i);
            hm.put(p,words[i]);
        }

        for(int i = 0; i < pattern.length(); i++){
            char p = pattern.charAt(i);
            if(!hm.get(p).equals(words[i])) return false;
        }

        return true;
        
    }
}