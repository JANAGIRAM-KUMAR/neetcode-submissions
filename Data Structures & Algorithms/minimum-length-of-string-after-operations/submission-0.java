class Solution {
    public int minimumLength(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()) hm.put(c,hm.getOrDefault(c,0)+1);
        int len = 0;
        for(Map.Entry<Character, Integer> e : hm.entrySet()){
            int val = e.getValue();
            if(val % 2 == 0) len += 2;
            else len += 1;
        }

        return len;

    }
}
