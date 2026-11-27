class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        Map<Character, Integer> oddMap = new HashMap<>();
        for(char c : s.toCharArray()) hm.put(c, hm.getOrDefault(c,0)+1);

        int len = 0;
        int odd = 0;
        for(Map.Entry<Character, Integer> e : hm.entrySet()){
            char key = e.getKey();
            int val = e.getValue();
            if(val % 2 == 0) len += val;
            else{
                len += val - 1;
                odd++;
            }
        }

        if(odd > 0) len += 1;

        return len;



        

        
    }
}