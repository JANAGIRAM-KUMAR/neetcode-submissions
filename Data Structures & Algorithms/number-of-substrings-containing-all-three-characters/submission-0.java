class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0),1);
        int l = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int r = 1; r < n; r++){
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c,0)+1);
            if(map.size() == 3){
                char lc = s.charAt(l);
                count += (n-r);
                map.put(lc, map.get(c)-1);

                if(map.get(lc) == 0) map.remove(lc);
                l++;
            }
        }
        return count;
    }
}
