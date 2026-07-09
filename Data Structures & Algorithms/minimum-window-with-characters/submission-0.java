class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";
        Map<Character,Integer> t_count = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();

        for(char c : t.toCharArray()){
            t_count.put(c,t_count.getOrDefault(c,0) + 1);
        }

        int have = 0, need = t_count.size();
        int[] res = {-1,-1};
        int resLen = Integer.MAX_VALUE;
        int wl = 0;
        for(int wr = 0; wr < s.length(); wr++){
            char c = s.charAt(wr);
            window.put(c,window.getOrDefault(c,0) + 1);
            
            if(t_count.containsKey(c) && window.get(c).equals(t_count.get(c))) have++;
            while(have == need){
                if(wr - wl + 1 < resLen){
                resLen = wr - wl + 1;
                res[0] = wl;
                res[1] = wr;}
            
            char lc = s.charAt(wl);
            window.put(lc, window.get(lc) - 1);
            if(t_count.containsKey(lc) && window.get(lc) < t_count.get(lc)) have--;
            wl++;
        }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);

    }
}
