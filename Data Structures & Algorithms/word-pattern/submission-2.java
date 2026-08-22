class Solution {
    public boolean wordPattern(String pattern, String s) {

        
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] words = s.split(" ");

        if(pattern.length() != words.length) return false;
        for(int i = 0; i < pattern.length(); i++){
            char p = pattern.charAt(i);
            String word = words[i];

            if(map.containsKey(p)){
                if(!map.get(p).equals(word)) return false;
            } else {
                if(set.contains(word)) return false;

                map.put(p,word);
                set.add(word);
            }


        }

        
        return true;
    }
}