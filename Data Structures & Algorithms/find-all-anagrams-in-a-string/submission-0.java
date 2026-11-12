class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> countMap = new HashMap<>();
        int len = p.length();
        for(char c : p.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        List<Integer> res = new ArrayList<>();
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            countMap.put(c, countMap.getOrDefault(c,0)+1);
            if(r - l + 1 > len){
                char lc = s.charAt(l);
                countMap.put(lc, countMap.get(lc)-1);
                if(countMap.get(lc) <= 0) countMap.remove(lc);
                l++;
            }

            if(r-l+1 == len && map.equals(countMap)) res.add(l);
        }

        return res;


    }
}
