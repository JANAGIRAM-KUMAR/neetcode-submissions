class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        int n = words.length;
        for(String word : words){
            int len = word.length();
            for(int i = 0; i < len; i++){
                char c = word.charAt(i);
                map.put(c, map.getOrDefault(c,0)+1);
            }
        }


        for(Map.Entry<Character, Integer> e : map.entrySet()){
            int val = e.getValue();
            if(val % n != 0) return false;
        }

        return true;
    }
}