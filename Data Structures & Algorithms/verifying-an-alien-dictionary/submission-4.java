class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i < 26; i++){
            hm.put(order.charAt(i),i);
        }
        for(int i = 0; i < words.length - 1; i++){
            String a = words[i], b = words[i+1];
            int j = 0;
            for(; j < a.length(); j++){
                if(j == b.length()) return false;
                if(a.charAt(j) != b.charAt(j)){
                    if(hm.get(a.charAt(j)) > hm.get(b.charAt(j))) return false;
                    break;
                }
            }
        }
        return true;
    }
}