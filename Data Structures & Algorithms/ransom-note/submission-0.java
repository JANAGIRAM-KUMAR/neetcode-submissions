class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : magazine.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0) + 1);
        }

        for(char c : ransomNote.toCharArray()){
            if(!hm.containsKey(c)) return false;
            if(hm.containsKey(c) && hm.get(c) > 0){
                hm.put(c,hm.get(c) - 1);
            }
            if(hm.get(c) == 0) hm.remove(c);
        }

        return true;
    }
}