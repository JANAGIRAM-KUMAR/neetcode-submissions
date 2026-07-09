class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i), c2 = t.charAt(i);
            if(hm.containsKey(c1)){
                if(hm.get(c1) != c2) return false;
            } else {
                if(set.contains(c2)) return false;
                hm.put(c1,c2);
                set.add(c2);
            }
        }
        return true;
    }
}