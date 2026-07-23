class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : text.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0) + 1);
        }

        Map<Character, Integer> balloon = new HashMap<>();
        for(char c : "balloon".toCharArray()){
            balloon.put(c, balloon.getOrDefault(c,0) + 1);
        }

        int cnt = text.length();
        for(char c : balloon.keySet()){
            cnt = Math.min(cnt, hm.getOrDefault(c,0)/balloon.get(c));
        }
        return cnt;
    }
}