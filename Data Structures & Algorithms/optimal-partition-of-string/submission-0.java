class Solution {
    public int partitionString(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0) + 1);
        }

        int maxVal = 0;
        for(Map.Entry<Character, Integer> e : hm.entrySet()){
            int val = e.getValue();
            maxVal = Math.max(maxVal, val);
        }

        return maxVal;
    }
}
