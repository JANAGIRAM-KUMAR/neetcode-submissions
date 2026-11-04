class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        int maxLen = -1;
        int i = 0;
        for(char c : s.toCharArray()){
            if(!hm.containsKey(c)){
                hm.put(c,i++);
            } else {
                maxLen = Math.max(maxLen, i - hm.get(c) - 1);
                i++;
            }
        }

        return maxLen;
    }
}