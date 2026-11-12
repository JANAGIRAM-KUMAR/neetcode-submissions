class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // Map<Character, Integer> map = new HashMap<>();
        // Map<Character, Integer> countMap = new HashMap<>();

        int[] map = new int[26];
        int[] countMap = new int[26];
        int len = p.length();
        for(char c : p.toCharArray()){
            //map.put(c, map.getOrDefault(c,0)+1);
            map[c-'a']++;
        }
        List<Integer> res = new ArrayList<>();
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            //countMap.put(c, countMap.getOrDefault(c,0)+1);
            countMap[c-'a']++;
            if(r - l + 1 > len){
                char lc = s.charAt(l);
                //countMap.put(lc, countMap.get(lc)-1);
                countMap[lc-'a']--;
                //if(countMap.get(lc) <= 0) countMap.remove(lc);
                if(countMap[lc-'a'] <= 0) countMap[lc-'a'] = 0;
                l++;
            }

            if(r-l+1 == len && Arrays.equals(map,countMap)) res.add(l);
        }

        return res;


    }
}
