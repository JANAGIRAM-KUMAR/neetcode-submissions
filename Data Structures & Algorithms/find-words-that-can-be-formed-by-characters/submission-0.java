class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : chars.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        int n = words.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int temp = 0;
            int wLen = words[i].length();
            String word = words[i];
            Map<Character, Integer> tempHm = new HashMap<>(hm);
            for(int j = 0; j < wLen; j++){
                char c = word.charAt(j);
                if(tempHm.getOrDefault(c,0) > 0){
                    temp++;
                    tempHm.put(c, tempHm.get(c) - 1);
                }
                if(temp == wLen) count += wLen;
            }

        }

        return count;
    }
}